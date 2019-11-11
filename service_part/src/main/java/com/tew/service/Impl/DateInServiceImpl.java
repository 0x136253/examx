package com.tew.service.Impl;


import com.tew.commponent.ExcelParser;
import com.tew.dto.ExcelForExamperDTO;
import com.tew.dto.ExcelForJobDTO;
import com.tew.dto.ExcelForScoreDTO;
import com.tew.dto.ExcelForbaodaoDTO;
import com.tew.pojo.*;
import com.tew.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("dateInService")
public class DateInServiceImpl implements DateInService {

    @Autowired
    private ExcelParser excelParser;
    @Autowired
    private WishDAO wishDAO;
    @Autowired
    private ExtestDAO extestDAO;
    @Autowired
    private PersonDAO personDAO;
    @Autowired
    private CheckDAO checkDAO;
    @Autowired
    private  JobDAO jobDAO;
    @Autowired
    private ProcessInService processInService;
    @Override
    public boolean dateinexam(String url, int themeid,String description, Date time){
        List<ExcelForExamperDTO> excelForExamperDTOList = null;
        try {
            excelForExamperDTOList = excelParser.ParserForExamper(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Extest> extestList1 = new ArrayList<>();
        for(ExcelForExamperDTO item:excelForExamperDTOList){
            int num = item.getNum();
            int xname = item.getXname();
            String address = item.getAddress();
            String clazz = item.getClazz();
            for(int i=1;i<=num;i++){
                Extest temp = new Extest();
                temp.setAddress(address);
                temp.setClazz(clazz);
                temp.setThemeid((short)themeid);
                temp.setDescription(description);
                temp.setNum((short)i);
                temp.setTime(time.toString());
                temp.setAttendnum(xname+""+i);
                extestList1.add(temp);
            }
        }
        WishExample wishExample = new WishExample();
        wishExample.createCriteria().andThemeidEqualTo((short) themeid);
        List<Wish> wishList = wishDAO.selectByExample(wishExample);
        List<Extest> extestList2 = new ArrayList<>();
        for(int i=0;i<wishList.size();i++){
            Extest temp = extestList1.get(i);
            temp.setId(wishList.get(i).getId());
            extestDAO.insertSelective(temp);
        }
        return true;
    }

    public boolean dateinscore(String url,int themeid,String clazz){
        List<ExcelForScoreDTO> excelForScoreDTOList = null;
        try {
            excelForScoreDTOList = excelParser.ParserForScorein(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(ExcelForScoreDTO item:excelForScoreDTOList){
            PersonExample personExample = new PersonExample();
            personExample.createCriteria().andIcNumberEqualTo(item.getId());
            Person person = personDAO.selectByExample(personExample).get(0);
            if(person == null){
                continue;
            }
            CheckExample checkExample = new CheckExample();
            checkExample.createCriteria().andIdEqualTo(person.getId()).andThemeidEqualTo((short)themeid);
            Check check = checkDAO.selectByExample(checkExample).get(0);
            if(check == null){
                continue;
            }
            if(clazz.equals("笔试")){
                check.setWriteExam(item.getScore());
            }
            else if(clazz.equals("面试")){
                check.setInterExam(item.getScore());
            }
            processInService.insert(check);
         //   System.out.println(item);
        }
        return true;
    }

    @Override
    public boolean dateinscoreset(String url, int themeid, String clazz) {
        List<ExcelForJobDTO> excelForJobDTOList= null;
        try{
            excelForJobDTOList=excelParser.Parse(url,ExcelForJobDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(ExcelForJobDTO item:excelForJobDTOList){
            JobExample jobExample = new JobExample();
            jobExample.createCriteria().andThemeidEqualTo((short)themeid).andPostEqualTo(item.getPost()).andClazzEqualTo(item.getClazz());
            Job job = jobDAO.selectByExample(jobExample).get(0);
            if(job==null){
                continue;
            }
            if(clazz.equals("笔试")){
                job.setWriteExam(item.getWriteExam());
            }
            else if(clazz.equals("面试")){
                job.setInterExam(item.getInterExam());
            }
            jobDAO.updateByPrimaryKeySelective(job);
            System.out.println(item);
        }
        return true;
    }

    @Override
    public boolean dataincheckg(String url, int themeid) {
        List<ExcelForbaodaoDTO> excelForbaodaoDTOList= null;
        try{
            excelForbaodaoDTOList=excelParser.Parse(url,ExcelForbaodaoDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(ExcelForbaodaoDTO item:excelForbaodaoDTOList){
            PersonExample personExample = new PersonExample();
            personExample.createCriteria().andIcNumberEqualTo(item.getID());
            Person person = personDAO.selectByExample(personExample).get(0);
            CheckExample checkExample = new CheckExample();
            checkExample.createCriteria().andIdEqualTo(person.getId()).andThemeidEqualTo((short)themeid);
            Check check = checkDAO.selectByExample(checkExample).get(0);
            if(check == null){
                continue;
            }
            if(item.getGone().equals("是")){
                check.setTrialNet((short)1);
            }
            else if(item.getGone().equals("否")){
                check.setTrialNet((short)2);
            }
            checkDAO.updateByPrimaryKey(check);
        }
        return true;
    }

    @Override
    public boolean datainchecknet(int themeid, List<String> idpass,List<String> idnotpass) {
        for(String item:idpass){
            CheckExample checkExample = new CheckExample();
            checkExample.createCriteria().andIdEqualTo(item).andThemeidEqualTo((short)themeid);
            Check check = checkDAO.selectByExample(checkExample).get(0);
            if(check == null){
                continue;
            }
            else{
                check.setTrialNet((short)1);
            }
            checkDAO.updateByPrimaryKey(check);
        }
        for(String item:idnotpass){
            CheckExample checkExample = new CheckExample();
            checkExample.createCriteria().andIdEqualTo(item).andThemeidEqualTo((short)themeid);
            Check check = checkDAO.selectByExample(checkExample).get(0);
            if(check == null){
                continue;
            }
            else{
                check.setTrialNet((short)2);
            }
            checkDAO.updateByPrimaryKey(check);
        }
        return true;
    }
}
