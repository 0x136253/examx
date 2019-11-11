package com.tew.controller;


import cn.afterturn.easypoi.cache.manager.POICacheManager;
import cn.afterturn.easypoi.excel.ExcelXorHtmlUtil;
import cn.afterturn.easypoi.excel.entity.ExcelToHtmlParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.tew.api.CommonResult;
import com.tew.api.MyLog;
import com.tew.component.ExcelParser;
import com.tew.pojo.FileInfo;
import com.tew.pojo.PersonExample;
import com.tew.pojo.ResBas;
import com.tew.service.FileService;
import com.tew.service.PersonDAO;
import com.tew.service.ResService;
import com.tew.util.JwtTokenUtil;
import com.tew.util.Upload;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;


@CrossOrigin
@RestController
@Api(tags = "FileController", description = "文件上传")
@RequestMapping("/file")
public class FileController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PersonDAO personDAO;
    @Autowired
    private ResService resService;
    @Autowired
    private ExcelParser excelParser;
    @Autowired
    private Upload upload;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Autowired
    private FileService fileService;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Value("${file.photopath}")
    private String photopath;


   // @MyLog(operation = "上传照片",database = "null")
    @PostMapping(value = "/photo/upload")
    @ApiOperation(value = "上传照片")
    public CommonResult update(MultipartFile file,HttpServletRequest request) throws IOException {
        try {
            if (file.isEmpty()) {
                return CommonResult.success("文件为空");
            }
            // 获取文件名
            String fileName = file.getOriginalFilename();
            // 获取文件的后缀名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            // 设置文件存储路径
            fileName = UUID.randomUUID() + suffixName; // 新文件名
            String filePath = photopath; // 上传后的路径
            String path = filePath + fileName;
            File dest = new File(path);
            // 检测是否存在目录
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();// 新建文件夹
            }
            file.transferTo(dest);// 文件写入

            String authHeader = request.getHeader(this.tokenHeader);
            String authToken = authHeader.substring(this.tokenHead.length()+1);// The part after "Bearer "
            String username = jwtTokenUtil.getUserNameFromToken(authToken);

            PersonExample personExample = new PersonExample();
            personExample.createCriteria().andIcNumberEqualTo(username);
            String id= personDAO.selectByExample(personExample).get(0).getId();

            ResBas resBas = resService.selectByPrimaryKey_Bas(id);

            resBas.setUrl(fileName);
            resService.updateByPrimaryKeySelective_Bas(resBas);

            return CommonResult.success(fileName);
        } catch (IllegalStateException e) {
            return CommonResult.failed();
        } catch (IOException e) {
            return CommonResult.failed();
        }
    }

    //@MyLog(operation = "显示照片",database = "res_bas")
    @GetMapping("/photo/show")
    @ApiOperation(value = "显示照片")
    public CommonResult downloadFile(HttpServletRequest request,HttpServletResponse response) {
        String authHeader = request.getHeader(this.tokenHeader);
        String authToken = authHeader.substring(this.tokenHead.length()+1);// The part after "Bearer "
        String username = jwtTokenUtil.getUserNameFromToken(authToken);

        PersonExample personExample = new PersonExample();
        personExample.createCriteria().andIcNumberEqualTo(username);
        String id= personDAO.selectByExample(personExample).get(0).getId();

        ResBas resBas = resService.selectByPrimaryKey_Bas(id);

        String fileName=resBas.getUrl();

        byte[] imageContent ;
        if (fileName != null) {
            //设置文件路径
            File file = new File(photopath+fileName);
            FileInputStream is = null;
            try {
                is = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            if (file.exists()) {
                try {
                    queryPic(is,request,response);
                    return CommonResult.success("success");
                } catch (Exception e) {
                    return CommonResult.failed();
                }
            }
        }
       return CommonResult.failed("下载失败");
    }

    public void queryPic(FileInputStream fileInputStream,HttpServletRequest request, HttpServletResponse response) throws IOException{
        if (fileInputStream != null){
		    response.setContentType("image/jpeg");
		    FileInputStream is =fileInputStream;
		    if (is != null){
		 	    int i = is.available(); // 得到文件大小  
				byte data[] = new byte[i];
				is.read(data); // 读数据  
				is.close();
				response.setContentType("image/jpeg"); // 设置返回的文件类型  
				OutputStream toClient = response.getOutputStream(); // 得到向客户端输出二进制数据的对象  
				toClient.write(data); // 输出数据  
				toClient.close();
		 }
		}
    }


    /**
     * 处理Excel解析的方法
     * @param file 前台上传的文件对象
     * @return
     */
    @PostMapping(value = "/examper/excelparser")
    @ApiOperation(value = "上传考场信息")
    public CommonResult Excel(@RequestParam String description, HttpServletRequest request, @RequestParam("file")MultipartFile file)throws Exception
    {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        String originName = file.getOriginalFilename();
        String fileName1 =UUID.randomUUID().toString();// 设置文件名，根据业务需要替换成要下载的文件名
        String fileName;
        try {
            //上传目录地址
            String uploadDir = photopath;
            String realPath=uploadDir;//
            File dir = new File(realPath);
            if(!dir.exists()){
                dir.mkdir();
            }
            //调用上传方法
            fileName=upload.executeUpload1(uploadDir, file,fileName1);
        //    uploadDir=uploadDir.substring(0,uploadDir.length()-1);
            dataMap.put("fileName",fileName);
            dataMap.put("dir",uploadDir);
        }catch (Exception e)
        {
            //打印错误堆栈信息
            e.printStackTrace();
            return CommonResult.success(dataMap,"解析失败");
        }
       // excelParser.ParserForExamper(fileName);
        FileInfo fileInfo= new FileInfo();
        fileInfo.setUrl(photopath);
        fileInfo.setFilename(fileName1+".xlsx");
        fileInfo.setDescription(description);
        fileService.insertSelective(fileInfo);
        return CommonResult.success(dataMap,"解析成功");
    }

    @GetMapping("/get07")
    public void toHtmlOf07Base(@RequestParam String url,HttpServletResponse response) throws IOException, InvalidFormatException {
        ExcelToHtmlParams params = new ExcelToHtmlParams(WorkbookFactory.create(POICacheManager.getFile(url)));
        response.getOutputStream().write(ExcelXorHtmlUtil.excelToHtml(params).getBytes());
        response.setContentType("text/html");
    }
}
