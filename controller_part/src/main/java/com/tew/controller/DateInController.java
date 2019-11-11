package com.tew.controller;


import com.tew.api.CommonResult;
import com.tew.api.MyLog;
import com.tew.dto.*;
import com.tew.service.DateInService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Controller
@Api(tags = "DateInController", description = "数据录入")
@RequestMapping("/datein")
public class DateInController {

    @Autowired
    private DateInService dateInService;

    @MyLog(operation = "录入考场信息",database = "file_info,ex_test")
    @ApiOperation(value = "录入考场信息")
    @RequestMapping(value = "/exam", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult datexam(@RequestBody ExaminDTO examinDTO){
        dateInService.dateinexam(examinDTO.getUrl(),examinDTO.getThemeid(),examinDTO.getDescription(),examinDTO.getTime());
        return CommonResult.success("success");
    }

    @MyLog(operation = "录入成绩信息",database = "file_info,per_check")
    @ApiOperation(value = "录入成绩信息")
    @RequestMapping(value = "/score", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult datescore(@RequestBody ScoreinDTO scoreinDTO){
        dateInService.dateinscore(scoreinDTO.getUrl(),scoreinDTO.getThemeid(),scoreinDTO.getClazz());
        return CommonResult.success("success");
    }

    @MyLog(operation = "录入围成绩信息",database = "file_info,inv_job")
    @ApiOperation(value = "录入围成绩信息")
    @RequestMapping(value = "/scoreset", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult datescoreset(@RequestBody ScoreSetinDTO scoreSetinDTO){
        dateInService.dateinscoreset(scoreSetinDTO.getUrl(),scoreSetinDTO.getThemeid(),scoreSetinDTO.getClazz());
        return CommonResult.success("success");
    }

    @MyLog(operation = "录入报道信息",database = "file_info,inv_job")
    @ApiOperation(value = "录入报道信息")
    @RequestMapping(value = "/baodaoin", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult dataincheckg(@RequestBody CheckinDTO checkinDTO){
        dateInService.dataincheckg(checkinDTO.getUrl(),checkinDTO.getThemeid());
        return CommonResult.success("success");
    }

    @MyLog(operation = "录入初审信息",database = "file_info,inv_job")
    @ApiOperation(value = "录入初审信息")
    @RequestMapping(value = "/checknetin", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult datainchecknet(@RequestBody CheckNetinDTO checkNetinDTO){
        dateInService.datainchecknet(checkNetinDTO.getThemeid(),checkNetinDTO.getPassid(),checkNetinDTO.getNotpassid());
        return CommonResult.success("success");
    }
}
