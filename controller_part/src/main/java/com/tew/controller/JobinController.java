package com.tew.controller;


import com.tew.api.CommonResult;
import com.tew.api.MyLog;
import com.tew.dto.SchoolJobIDDTO;
import com.tew.dto.SchoolJobListDTO;
import com.tew.dto.ThemeDTO;
import com.tew.pojo.SchoolJob;
import com.tew.service.JobinService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@Controller
@Api(tags = "JobinController", description = "录入工作信息")
@RequestMapping("/job")
public class JobinController {

    @Autowired
    private JobinService jobinService;

    @MyLog(operation = "录入主题",database = "inv_theme")
    @ApiOperation(value = "录入主题")
    @RequestMapping(value = "/theme", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult GetThemeIn(@RequestBody ThemeDTO theme){
        return CommonResult.success(jobinService.GetThemeIn(theme.Theme_get()));
    }

    @MyLog(operation = "录入学校工作",database = "inv_school")
    @ApiOperation(value = "录入学校工作")
    @RequestMapping(value = "/school", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult GetJobIn(@RequestBody SchoolJobListDTO schoolJobListDTO){
        return CommonResult.success(jobinService.GetJobIn(schoolJobListDTO));
    }

    @MyLog(operation = "显示审核通过job(包含全部)",database = "inv_school")
    @ApiOperation(value = "显示审核通过job(包含全部)")
    @RequestMapping(value = "/passschool/{themeid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult ShowJobenable(@PathVariable Short themeid){
        return CommonResult.success(jobinService.ShowJobenable(themeid));
    }
    @MyLog(operation = "显示审核未通过job(包含全部)",database = "inv_school")
    @ApiOperation(value = "显示审核未通过job(包含全部)")
    @RequestMapping(value = "/notpassschool/{themeid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult ShowJobnotpass(@PathVariable Short themeid){
        return CommonResult.success(jobinService.ShowJobnotPass(themeid));
    }

    @MyLog(operation = "显示还没有审核job(包含全部)",database = "inv_school")
    @ApiOperation(value = "显示还没有审核job(包含全部)")
    @RequestMapping(value = "/notcheckschool/{themeid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult ShowJobdisable(@PathVariable Short themeid){
        return CommonResult.success(jobinService.ShowJobdisable(themeid));
    }

    @MyLog(operation = "显示审核通过job(仅所选学校)",database = "inv_school")
    @ApiOperation(value = "显示审核通过job(仅所选学校)")
    @RequestMapping(value = "/passschool/{themeid}/{schoolid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult ShowJobenableschool(@PathVariable Short themeid,@PathVariable Short schoolid){
        return CommonResult.success(jobinService.ShowJobenableSchool(themeid,schoolid));
    }
    @MyLog(operation = "显示审核未通过job(仅所选学校)",database = "inv_school")
    @ApiOperation(value = "显示审核未通过job(仅所选学校)")
    @RequestMapping(value = "/notpassschool/{themeid}/{schoolid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult ShowJobnotpassschool(@PathVariable Short themeid,@PathVariable Short schoolid){
        return CommonResult.success(jobinService.ShowJobnotPassSchool(themeid,schoolid));
    }

    @MyLog(operation = "显示还没有审核job(仅所选学校)",database = "inv_school")
    @ApiOperation(value = "显示还没有审核job(仅所选学校)")
    @RequestMapping(value = "/notcheckschool/{themeid}/{schoolid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult ShowJobdisableschool(@PathVariable Short themeid,@PathVariable Short schoolid){
        return CommonResult.success(jobinService.ShowJobdisableSchool(themeid,schoolid));
    }
    @MyLog(operation = "审核学校",database = "inv_job")
    @ApiOperation(value = "审核学校(注意包含的id为学校中每个岗位的id(schoolTheJobid,可通过上述函数查到)，不是学校id)")
    @RequestMapping(value = "/setschool", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult SetJobenable(@RequestBody SchoolJobIDDTO schoolJobID){
//        List<Short> schoolTheJobid =schoolJobID.getList();
//        for(Short item:schoolTheJobid){
//            System.out.println(item);
//        }
        return CommonResult.success(jobinService.SetJobenable(schoolJobID.getPassllist(),schoolJobID.getNotpasslist()));
    }
}
