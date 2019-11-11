package com.tew.controller;


import com.tew.api.CommonResult;
import com.tew.api.MyLog;
import com.tew.pojo.School;
import com.tew.pojo.SchoolExample;
import com.tew.service.SchoolService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
@Api(tags = "SchoolController", description = "学校信息")
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @MyLog(operation = "插入学校",database = "sch_info")
    @ApiOperation(value = "插入学校")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult insert(@RequestBody School record){
        return CommonResult.success(schoolService.insertSelective(record));
    }

    @MyLog(operation = "显示学校",database = "sch_info")
    @ApiOperation(value = "显示学校")
    @RequestMapping(value = "/show/{schoolid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult select(@PathVariable Short schoolid){
        return CommonResult.success(schoolService.selectByPrimaryKey(schoolid));
    }

    @MyLog(operation = "显示所有学校",database = "sch_info")
    @ApiOperation(value = "显示所有学校")
    @RequestMapping(value = "/show/all", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult selectall(){
        return CommonResult.success(schoolService.selectall());
    }

    @MyLog(operation = "更新学校",database = "sch_info")
    @ApiOperation(value = "更新学校")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody School record){
        return CommonResult.success(schoolService.updateByPrimaryKeySelective(record));
    }

}
