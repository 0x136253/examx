package com.tew.service.Impl;

import com.tew.pojo.Check;
import com.tew.pojo.CheckExample;
import com.tew.service.ProcessInService;
import com.tew.service.ProcessInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("processInfoService")
public class ProcessInfoServiceImpl implements ProcessInfoService {
    @Autowired
    private ProcessInService processInService;

    @Override
    public Check select(String icnumber) {
        return processInService.select(icnumber);
    }

    @Override
    public int updateByExample(Check record, CheckExample example) {
        return processInService.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKey(Check record) {
        return processInService.updateByPrimaryKey(record);
    }
}
