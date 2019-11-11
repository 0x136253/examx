package com.tew.controller;


import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.tew.component.PdfReportView;
import com.tew.dto.*;
//import com.tew.util.JasperHelper;
import com.tew.pojo.*;
import com.tew.service.*;
import com.tew.util.Download;
import com.tew.util.JwtTokenUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.List;

@CrossOrigin
@Controller
@Api(tags = "DownloadController", description = "文件下载")
@RequestMapping("/download")
public class DownloadController {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PersonDAO personDAO;
    @Autowired
    private ResService resService;
    @Autowired
    private ExpermissService expermissService;
    @Autowired
    private GetPostInService getPostInService;
    @Autowired
    private CheckDAO checkDAO;
    @Autowired
    private WishinService wishinService;
    @Autowired
    private SchoolDirService schoolDirService;
    @Autowired
    private Download download;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Value("${file.photopath}")
    private String photopath;
    private String tempauth;

    @PostMapping(value = "/exam")
    @ApiOperation(value = "下载准考证")
    public ModelAndView downloadRequisitionPDF2(final ModelMap model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String authHeader = request.getHeader(this.tokenHeader);
        if(authHeader==null){
            authHeader=tempauth;
        }
        else
        {
            tempauth=authHeader;
        }
        System.out.println("header of downlaod: "+authHeader);
        String authToken = authHeader.substring(this.tokenHead.length()+1);// The part after "Bearer "
        String username = jwtTokenUtil.getUserNameFromToken(authToken);

        PersonExample personExample = new PersonExample();
        personExample.createCriteria().andIcNumberEqualTo(username);
        Person person=personDAO.selectByExample(personExample).get(0);
        String id= person.getId();

        ResBas resBas = resService.selectByPrimaryKey_Bas(id);
        String fileName=resBas.getUrl();

        Extest extest = expermissService.selectByPrimaryKey(resBas.getId());
        Map<String, Object> map = new HashMap<>();
        map.put("NAME", person.getName());
        map.put("SEX", person.getSex());
        map.put("IC_NUMBER", person.getIcNumber());
        map.put("CLAZZ", extest.getClazz());
        map.put("ADDRESS", extest.getAddress());
        map.put("ATTENDNUM", extest.getAttendnum());
        map.put("TIME", extest.getTime());
        map.put("NUM",new BigDecimal(extest.getNum()));
        map.put("DESCRIPTION",extest.getDescription());
        map.put("image",getImage(photopath+fileName));
      //  List<Map<String,Object>> dataList = new ArrayList<>();
        Collection dataList = new ArrayList<>();
        dataList.add(map);
        map.put("users", new JRMapCollectionDataSource(dataList));
        return new ModelAndView(new PdfReportView("/report/examper.jasper", "professors"),map);
    }

    private BufferedImage getImage(String imagePath){
        System.out.println(imagePath);
        File file = new File(imagePath);
        BufferedImage img = null;
        try{
            img = ImageIO.read(file);
        }catch(IOException e){
            e.printStackTrace();
        }
        Image image = img;
        // Create the buffered image.
        BufferedImage bufferedImage = new BufferedImage(
                image.getWidth(null), image.getHeight(null),
                BufferedImage.TYPE_INT_RGB);
        // Copy image to buffered image.
        Graphics g = bufferedImage.createGraphics();
        // Clear background and paint the image.
        g.setColor(Color.white);
        g.fillRect(0, 0, image.getWidth(null),
                image.getHeight(null));
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return bufferedImage;

    }


    @PostMapping(value = "/score/{themeid}")
    @ApiOperation(value = "下载成绩录入模板")
    public void ExportExcelScore(@PathVariable short themeid, HttpServletResponse httpServletResponse){
        CheckExample checkExample = new CheckExample();
        checkExample.createCriteria().andThemeidEqualTo(themeid);
        List<Check> checkList = checkDAO.selectByExample(checkExample);
        List<ExcelForScoreDTO> excelForScoreDTOList = new ArrayList<>();
        for(Check item:checkList){
            ExcelForScoreDTO excelForScoreDTO = new ExcelForScoreDTO();
            PersonExample personExample = new PersonExample();
            personExample.createCriteria().andIdEqualTo(item.getId());
            Person person = personDAO.selectByExample(personExample).get(0);
            if (person == null){
                continue;
            }
            excelForScoreDTO.setId(person.getIcNumber());
            excelForScoreDTO.setName(person.getName());
            excelForScoreDTO.setSex(person.getSex());
            excelForScoreDTOList.add(excelForScoreDTO);
        }
        Download.defaultExport(excelForScoreDTOList,ExcelForScoreDTO.class,"test.xls",httpServletResponse,new ExportParams());
    }

    @PostMapping(value = "/scoreset/{themeid}")
    @ApiOperation(value = "下载入围成绩设置模板")
    public void ExportExcelScoreSet(@PathVariable short themeid, HttpServletResponse httpServletResponse){
        List<Job> jobList = getPostInService.ShowJobByThemeID(themeid);
        List<ExcelForJobDTO> excelForJobDTOList = new ArrayList<>();
        for(Job item:jobList){
            ExcelForJobDTO excelForJobDTO = new ExcelForJobDTO();
            excelForJobDTO.setClazz(item.getClazz());
            excelForJobDTO.setNum(item.getNum());
            excelForJobDTO.setPost(item.getPost());
            excelForJobDTO.setSchoolin(item.getSchoolin());
            excelForJobDTOList.add(excelForJobDTO);
        }
        Download.defaultExport(excelForJobDTOList,ExcelForJobDTO.class,"test2.xls",httpServletResponse,new ExportParams());
    }

    @PostMapping(value = "/classset")
    @ApiOperation(value = "下载考场录入模板")
    public void ExportExcelScoreSet(HttpServletResponse httpServletResponse){
        Download.defaultExport(new ArrayList<ExcelForExamperDTO>(),ExcelForExamperDTO.class,"test3.xls",httpServletResponse,new ExportParams());
    }


    @PostMapping(value = "/baodao/{themeid}")
    @ApiOperation(value = "报道录入模板")
    public void ExportExcelbaodao(@PathVariable short themeid, HttpServletResponse httpServletResponse){
        WishExample wishExample = new WishExample();
        wishExample.createCriteria().andThemeidEqualTo(themeid);
        List<Wish> wishList = wishinService.selectByExample(wishExample);
        List<ExcelForbaodaoDTO> excelForbaodaoDTOList = new ArrayList<>();
        for(Wish item:wishList){
            ExcelForbaodaoDTO excelForbaodaoDTO = new ExcelForbaodaoDTO();
            PersonExample personExample = new PersonExample();
            personExample.createCriteria().andIdEqualTo(item.getId());
            Person person = personDAO.selectByExample(personExample).get(0);
            School school=schoolDirService.selectByPrimaryKey(item.getSchoolid());
            if (person == null){
                continue;
            }
            excelForbaodaoDTO.setID(person.getIcNumber());
            excelForbaodaoDTO.setName(person.getName());
            excelForbaodaoDTO.setPost(item.getPost());
            excelForbaodaoDTO.setSchool(school.getSchoolName());
            excelForbaodaoDTOList.add(excelForbaodaoDTO);
        }
        Download.defaultExport(excelForbaodaoDTOList,ExcelForbaodaoDTO.class,"test.xls",httpServletResponse,new ExportParams());
    }
}
