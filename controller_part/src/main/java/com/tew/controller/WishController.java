package com.tew.controller;


import com.tew.api.CommonResult;
import com.tew.api.MyLog;
import com.tew.dto.WishDTO;
import com.tew.pojo.Wish;
import com.tew.service.WishinService;
import com.tew.service.WwishService;
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
@Api(tags = "WishController", description = "志愿信息")
@RequestMapping("/wish")
public class WishController {
    @Autowired
    private WwishService wwishService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @MyLog(operation = "录入志愿",database = "wish_info")
    @ApiOperation(value = "录入志愿")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody WishDTO wishDTO){
        return CommonResult.success(wwishService.insertWish(wishDTO));
    }

    @MyLog(operation = "删除志愿",database = "wish_info")
    @ApiOperation(value = "删除志愿")
    @RequestMapping(value = "/delete/{themeid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult delete(@PathVariable Short themeid, HttpServletRequest httpServletRequest){
        String authHeader = httpServletRequest.getHeader(this.tokenHeader);
        String authToken = authHeader.substring(this.tokenHead.length()+1);// The part after "Bearer "
        String username = jwtTokenUtil.getUserNameFromToken(authToken);
        return CommonResult.success(wwishService.deleteWish(username,themeid));
    }

    @MyLog(operation = "更新志愿",database = "wish_info")
    @ApiOperation(value = "更新志愿")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody WishDTO wishDTO){
        return CommonResult.success(wwishService.updateWish(wishDTO));
    }

    @MyLog(operation = "显示志愿",database = "wish_info")
    @ApiOperation(value = "显示志愿")
    @RequestMapping(value = "/show/{themeid}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult show(@PathVariable Short themeid, HttpServletRequest httpServletRequest){
        String authHeader = httpServletRequest.getHeader(this.tokenHeader);
        String authToken = authHeader.substring(this.tokenHead.length()+1);// The part after "Bearer "
        String username = jwtTokenUtil.getUserNameFromToken(authToken);
        return CommonResult.success(wwishService.ShowWish(username,themeid));
    }
}
