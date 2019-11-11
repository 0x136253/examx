package com.tew.controller;

import com.tew.api.CommonResult;
import com.tew.api.MyLog;
import com.tew.dto.RegisterDTO;
import com.tew.dto.UmsAdminLoginParam;
import com.tew.dto.UpdatepasswordDTO;
import com.tew.pojo.Permiss;
import com.tew.pojo.User;
import com.tew.service.AdminService;
import com.tew.service.PermissDAO;
import com.tew.util.JwtTokenUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台用户管理
 * Created by macro on 2018/4/26.
 */
@CrossOrigin
@Controller
@Api(tags = "UmsAdminController", description = "后台用户管理")
@RequestMapping("/admin")
public class UmsAdminController {
    @Autowired
    private AdminService adminService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Resource
    private PermissDAO permissDAO;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;


    @MyLog(operation = "用户注册",database = "acc_info,acc_permiss")
    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<User> register(@RequestBody RegisterDTO registerDTO) {
        User umsAdmin = adminService.register(registerDTO.user_get(),registerDTO.person_get());
        if (umsAdmin == null) {
            CommonResult.failed();
        }
        return CommonResult.success(umsAdmin);
    }


    @MyLog(operation = "登录",database = "acc_info,acc_permiss")
    @ApiOperation(value = "登录以后返回token")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody UmsAdminLoginParam umsAdminLoginParam, BindingResult result) {
        String token = adminService.login(umsAdminLoginParam.getUsername(), umsAdminLoginParam.getPassword());
        if (token == null) {
            return CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }



    @MyLog(operation = "获取用户所有权限",database = "acc_permiss")
    @ApiOperation("获取用户所有权限（包括+-权限）")
    @RequestMapping(value = "/permission", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Permiss>> getPermissionList( HttpServletRequest httpServletRequest){
        String authHeader = httpServletRequest.getHeader(this.tokenHeader);
        String authToken = authHeader.substring(this.tokenHead.length()+1);// The part after "Bearer "
        String username = jwtTokenUtil.getUserNameFromToken(authToken);
        List<Permiss> permissionList = permissDAO.selectById(adminService.getAdminByUsername(username).getId());
        System.out.println("++"+permissionList.get(0));
        return CommonResult.success(permissionList);
    }

    @MyLog(operation = "更新密码",database = "acc_info")
    @ApiOperation("更新密码")
    @RequestMapping(value = "/update/password",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatepassword(@RequestBody UpdatepasswordDTO updatepasswordDTO){
        adminService.updatepassword(updatepasswordDTO);
        return CommonResult.success("更新成功");
    }

    @MyLog(operation = "注销",database = "null")
    @ApiOperation("注销")
    @RequestMapping(value = "/logout/{username}",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult logout(@PathVariable String  username){
        adminService.logout(username);
        return CommonResult.success("注销成功");
    }
}
