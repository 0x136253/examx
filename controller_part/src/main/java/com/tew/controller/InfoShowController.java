package com.tew.controller;


import com.tew.api.CommonResult;
import com.tew.api.MyLog;
import com.tew.dto.JobListDTO;
import com.tew.dto.SchoolJobDTO;
import com.tew.service.InfoShowService;
import com.tew.util.JwtTokenUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@CrossOrigin
@Controller
@Api(tags = "InfoShowController", description = "显示用户信息")
@RequestMapping("/show")
public class InfoShowController {
    @Autowired
    private InfoShowService infoShowService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @MyLog(operation = "显示用户信息",database = "per_info")
    @ApiOperation(value = "显示用户信息")
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult showuser(HttpServletRequest httpServletRequest){
        String authHeader = httpServletRequest.getHeader(this.tokenHeader);
        String authToken = authHeader.substring(this.tokenHead.length()+1);// The part after "Bearer "
        String username = jwtTokenUtil.getUserNameFromToken(authToken);
        return  CommonResult.success(infoShowService.showByID(username));
    }

    @MyLog(operation = "显示主题信息",database = "inv_theme")
    @ApiOperation(value = "显示主题信息")
    @RequestMapping(value = "/theme", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult ShowTheme(){
        return CommonResult.success(infoShowService.showTheme());
    }

    @MyLog(operation = "显示所有岗位信息",database = "inv_job")
    @ApiOperation(value = "显示所有岗位信息")
    @RequestMapping(value = "/job/{themeid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult ShowJob(@PathVariable Short themeid){
        return CommonResult.success(infoShowService.showJob(themeid));
    }

    @MyLog(operation = "显示所有岗位/类别信息",database = "inv_job")
    @ApiOperation(value = "显示所有岗位/类别信息")
    @RequestMapping(value = "/jobclazz/{themeid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult ShowJobClazz(@PathVariable Short themeid){
        return CommonResult.success(infoShowService.showJobClazz(themeid));
    }

    @MyLog(operation = "显示学校岗位信息",database = "inv_school")
    @ApiOperation(value = "显示学校岗位信息")
    @RequestMapping(value = "/school", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult ShowSchoolJob(@RequestBody SchoolJobDTO schoolJobDTO){
        return CommonResult.success(infoShowService.showSchoolJob(schoolJobDTO.getThemeid(),schoolJobDTO.getSchoolid()));
    }

    @MyLog(operation = "岗位推荐",database = "inv_job")
    @ApiOperation(value = "岗位推荐")
    @RequestMapping(value = "/job/show", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult ShowJobList(@RequestBody JobListDTO jobListDTO){
        return CommonResult.success(infoShowService.showJobList(jobListDTO.getClazz(),jobListDTO.getPost()));
    }

    @MyLog(operation = "用户信息/志愿审核",database = "inv_job")
    @ApiOperation(value = "用户信息/志愿审核")
    @RequestMapping(value = "/inv_wish/show/{themeid}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult ShowwishList(@PathVariable short themeid){
        return CommonResult.success(infoShowService.showWishNet(themeid));
    }
    @MyLog(operation = "用户信息/志愿审核(仅单个学校)",database = "inv_job")
    @ApiOperation(value = "用户信息/志愿审核(仅单个学校)")
    @RequestMapping(value = "/inv_wish/show/{themeid}/{schoolid}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult ShowwishList(@PathVariable short themeid,@PathVariable short schoolid){
        return CommonResult.success(infoShowService.showWishNet(themeid,schoolid));
    }
}
