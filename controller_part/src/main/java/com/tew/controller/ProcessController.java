package com.tew.controller;


import com.tew.api.CommonResult;
import com.tew.api.MyLog;
import com.tew.service.ProcessInfoService;
import com.tew.util.JwtTokenUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@CrossOrigin
@Controller
@Api(tags = "ProcessController", description = "进度信息")
@RequestMapping("/process")
public class ProcessController {

    @Autowired
    private ProcessInfoService processInfoService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @MyLog(operation = "显示进度",database = "per_check")
    @ApiOperation(value = "显示进度")
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult ShowCheck(HttpServletRequest httpServletRequest){
        String authHeader = httpServletRequest.getHeader(this.tokenHeader);
        String authToken = authHeader.substring(this.tokenHead.length()+1);// The part after "Bearer "
        String username = jwtTokenUtil.getUserNameFromToken(authToken);
        return CommonResult.success(processInfoService.select(username));
    }
}
