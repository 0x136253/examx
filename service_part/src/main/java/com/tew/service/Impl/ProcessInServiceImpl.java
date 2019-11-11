package com.tew.service.Impl;


import com.tew.pojo.Check;
import com.tew.pojo.CheckExample;
import com.tew.pojo.Person;
import com.tew.pojo.PersonExample;
import com.tew.service.CheckDAO;
import com.tew.service.PersonDAO;
import com.tew.service.ProcessInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("processInService")
public class ProcessInServiceImpl implements ProcessInService {
    @Autowired
    private CheckDAO checkDAO;
    @Autowired
    private PersonDAO personDAO;

    @Override
    public int delete(String id) {
        checkDAO.deleteByPrimaryKey(id);
        return 0;
    }

    @Override
    public int insert(Check record) {
        Check check = checkDAO.selectByPrimaryKey(record.getId());
        if(check!=null){
            delete(check.getId());
        }
//        if(check.getThemeid()==null){
////            check.setThemeid((short)0);
////        }
        checkDAO.insert(record);
        return 0;
    }

    @Override
    public Check select(String icnumber) {
        PersonExample personExample = new PersonExample();
        personExample.createCriteria().andIcNumberEqualTo(icnumber);
        Person person = personDAO.selectByExample(personExample).get(0);
        String id= person.getId();
        return checkDAO.selectByPrimaryKey(id);
    }

    @Override
    public Check selectByID(String id) {
        return checkDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExample(Check record, CheckExample example) {
        checkDAO.updateByExampleSelective(record,example);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Check record) {
        checkDAO.updateByPrimaryKey(record);
        return 0;
    }
}
