package com.tew.controller;


import com.tew.api.CommonResult;
import com.tew.api.MyLog;
import com.tew.dto.ResDTO;
import com.tew.service.ResService;
import com.tew.service.ResinService;
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
@Api(tags = "ResController", description = "简历信息")
@RequestMapping("/res")
public class ResController {

    @Autowired
    private ResinService resinService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;


   // @MyLog(operation = "录入简历",database = "res_bas,res_edu,res_job,res_pra,res_hor")
    @ApiOperation(value = "录入志愿")
    @RequestMapping(value = "/add", method = RequestMethod.POST)

    @ResponseBody
    public CommonResult GetResIn(@RequestBody ResDTO resDTO){
        return CommonResult.success(resinService.GetResIn(resDTO));
    }

  //  @MyLog(operation = "更新简历",database = "res_bas,res_edu,res_job,res_pra,res_hor")
    @ApiOperation(value = "更新简历")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult UpdateRes(@RequestBody ResDTO resDTO){
        return CommonResult.success(resinService.UpdateRes(resDTO));
    }


   // @MyLog(operation = "显示简历",database = "res_bas,res_edu,res_job,res_pra,res_hor")
    @ApiOperation(value = "显示简历")
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult ShowRes(HttpServletRequest httpServletRequest){
        String authHeader = httpServletRequest.getHeader(this.tokenHeader);
        String authToken = authHeader.substring(this.tokenHead.length()+1);// The part after "Bearer "
        String username = jwtTokenUtil.getUserNameFromToken(authToken);
        return CommonResult.success(resinService.ShowRes(username));
    }
}
