package com.tew.commponent;


import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.tew.dto.ExcelForExamperDTO;
import com.tew.dto.ExcelForJobDTO;
import com.tew.dto.ExcelForScoreDTO;
import com.tew.util.Upload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Component
public class ExcelParser {
    @Autowired
    private Upload upload;
    @Value("${file.photopath}")
    private String photopath;
    public List<ExcelForExamperDTO> ParserForExamper(String fileName)throws Exception{
        ImportParams params = new ImportParams();
        params.setTitleRows(0);
        params.setHeadRows(1);
        List<ExcelForExamperDTO> list=new ArrayList<>();
        list = upload.importExcel(photopath+fileName, 0, 1, ExcelForExamperDTO.class);
     //   System.out.println(new Date().getTime() - start);
      //  System.out.println(list.size());
     //   System.out.println(list);
//        for (int i = 0; i <list.size() ; i++) {
//            list.get(i).setThemeid(themeid);
//            ExcelForExamperDTO layer=new ExcelForExamperDTO();
//            layer.setThemeid(themeid);
//            layer.setAddress(list.get(i).getAddress());
//            layer.setClazz(list.get(i).getClazz());
//            layer.setXname(list.get(i).getXname());
//            layer.setNum(list.get(i).getNum());
//      //      int is_add=layerService.InsertLayer(layer);
//            System.out.println(list.get(i));
//        }
        return list;
    }

    public List<ExcelForScoreDTO> ParserForScorein(String fileName)throws Exception{
        ImportParams params = new ImportParams();
        params.setTitleRows(0);
        params.setHeadRows(1);
        List<ExcelForScoreDTO> list=new ArrayList<>();
        list = upload.importExcel(photopath+fileName, 0, 1, ExcelForScoreDTO.class);
        return list;
    }

    public <T> List<T> Parse(String fileName,Class<T> clazz){
        ImportParams params = new ImportParams();
        params.setTitleRows(0);
        params.setHeadRows(1);
        List<T> list = new ArrayList<>();
        list = upload.importExcel(photopath+fileName, 0, 1,clazz);
        return list;
    }
}
