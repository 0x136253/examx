package com.tew.service.Impl;

import com.tew.dto.ResDTO;
import com.tew.pojo.*;
import com.tew.service.PersonDAO;
import com.tew.service.ProcessInService;
import com.tew.service.ResService;
import com.tew.service.ResinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResinServiceImpl implements ResinService {
    @Autowired
    private ResService resService;

    @Autowired
    private PersonDAO personDAO;
    @Autowired
    private ProcessInService processInService;
    @Override
    public boolean GetResIn(ResDTO resDTO) {
        ResBas resBas = resDTO.getResBas();
        List<ResEdu> resEduList = resDTO.getResEduList();
        List<ResHor> resHorList = resDTO.getResHorList();
        List<ResPra> resPraList = resDTO.getResPraList();
        List<ResJob> resJobList = resDTO.getResJobList();

        resService.insertSelective_Bas(resBas);
        for(ResEdu item:resEduList){
            item.setIdEdu(null);
            resService.insertSelective_Edu(item);
        }
        for(ResHor item:resHorList){
            item.setIdHor(null);
            resService.insertSelective_Hor(item);
        }
        for(ResPra item:resPraList){
            item.setIdJob(null);
            resService.insertSelective_Pra(item);
        }
        for(ResJob item:resJobList){
            item.setIdJob(null);
            resService.insertSelective_Job(item);
        }
        Check check = processInService.selectByID(resBas.getId());
        check.setTrialRes((short)1);
        processInService.updateByPrimaryKey(check);
        return true;
    }

    @Override
    public boolean UpdateRes(ResDTO resDTO) {
        String id= resDTO.getResBas().getId();
        resService.deleteByPrimaryKey_Bas(id);

        ResEduExample resEduExample = new ResEduExample();
        resEduExample.createCriteria().andIdEqualTo(id);
        List<ResEdu> resEduList = resService.selectByExample_Edu(resEduExample);
        for (ResEdu item:resEduList){
            resService.deleteByPrimaryKey_Edu(item.getIdEdu());
        }

        ResHorExample resHorExample = new ResHorExample();
        resHorExample.createCriteria().andIdEqualTo(id);
        List<ResHor> resHorList = resService.selectByExample_Hor(resHorExample);
        for (ResHor item:resHorList){
            resService.deleteByPrimaryKey_Hor(item.getIdHor());
        }

        ResPraExample resPraExample = new ResPraExample();
        resPraExample.createCriteria().andIdEqualTo(id);
        List<ResPra> resPraList = resService.selectByExample_Pra(resPraExample);
        for (ResPra item:resPraList){
            resService.deleteByPrimaryKey_Pra(item.getIdJob());
        }

        ResJobExample resJobExample = new ResJobExample();
        resJobExample.createCriteria().andIdEqualTo(id);
        List<ResJob> resJobList = resService.selectByExample_Job(resJobExample);

        for (ResJob item:resJobList){
            resService.deleteByPrimaryKey_Job(item.getIdJob());
        }
        System.out.println("ok");
        ResBas resBas = resDTO.getResBas();
        resEduList = resDTO.getResEduList();
        resHorList = resDTO.getResHorList();
        resPraList = resDTO.getResPraList();
        resJobList = resDTO.getResJobList();

        resService.insertSelective_Bas(resBas);
        for(ResEdu item:resEduList){
            item.setIdEdu(null);
            resService.insertSelective_Edu(item);
        }
        for(ResHor item:resHorList){
            item.setIdHor(null);
            resService.insertSelective_Hor(item);
        }
        for(ResPra item:resPraList){
            item.setIdJob(null);
            resService.insertSelective_Pra(item);
        }
        for(ResJob item:resJobList){
            item.setIdJob(null);
            resService.insertSelective_Job(item);
        }
        Check check = processInService.selectByID(resBas.getId());
        check.setTrialRes((short)1);
        processInService.updateByPrimaryKey(check);
        return true;
    }

    @Override
    public ResDTO ShowRes(String IcNumber) {
        PersonExample personExample = new PersonExample();
        personExample.createCriteria().andIcNumberEqualTo(IcNumber);
        String id= personDAO.selectByExample(personExample).get(0).getId();

        ResBas resBas = resService.selectByPrimaryKey_Bas(id);

        ResEduExample resEduExample = new ResEduExample();
        resEduExample.createCriteria().andIdEqualTo(id);
        List<ResEdu> resEduList = resService.selectByExample_Edu(resEduExample);

        ResHorExample resHorExample = new ResHorExample();
        resHorExample.createCriteria().andIdEqualTo(id);
        List<ResHor> resHorList = resService.selectByExample_Hor(resHorExample);

        ResPraExample resPraExample = new ResPraExample();
        resPraExample.createCriteria().andIdEqualTo(id);
        List<ResPra> resPraList = resService.selectByExample_Pra(resPraExample);

        ResJobExample resJobExample = new ResJobExample();
        resJobExample.createCriteria().andIdEqualTo(id);
        List<ResJob> resJobList = resService.selectByExample_Job(resJobExample);

        ResDTO resDTO = new ResDTO(resBas,resEduList,resHorList,resJobList,resPraList);
        return resDTO;
    }


    public boolean DeleteRes(String id){
        resService.deleteByPrimaryKey_Bas(id);

        ResEduExample resEduExample = new ResEduExample();
        resEduExample.createCriteria().andIdEqualTo(id);
        List<ResEdu> resEduList = resService.selectByExample_Edu(resEduExample);
        for (ResEdu item:resEduList){
            resService.deleteByPrimaryKey_Edu(item.getIdEdu());
        }

        ResHorExample resHorExample = new ResHorExample();
        resHorExample.createCriteria().andIdEqualTo(id);
        List<ResHor> resHorList = resService.selectByExample_Hor(resHorExample);
        for (ResHor item:resHorList){
            resService.deleteByPrimaryKey_Edu(item.getIdHor());
        }

        ResPraExample resPraExample = new ResPraExample();
        resPraExample.createCriteria().andIdEqualTo(id);
        List<ResPra> resPraList = resService.selectByExample_Pra(resPraExample);
        for (ResPra item:resPraList){
            resService.deleteByPrimaryKey_Edu(item.getIdJob());
        }

        ResJobExample resJobExample = new ResJobExample();
        resJobExample.createCriteria().andIdEqualTo(id);
        List<ResJob> resJobList = resService.selectByExample_Job(resJobExample);

        for (ResJob item:resJobList){
            resService.deleteByPrimaryKey_Edu(item.getIdJob());
        }
        System.out.println("ok");
        return true;
    }
}
