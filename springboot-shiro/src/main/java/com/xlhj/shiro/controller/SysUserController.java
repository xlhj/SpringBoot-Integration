package com.xlhj.shiro.controller;

import com.alibaba.fastjson.JSON;
import com.xlhj.shiro.common.AjaxResult;
import com.xlhj.shiro.entity.SysUser;
import com.xlhj.shiro.service.SysUserService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author: lcj
 * @Date: 2020/10/13 15:31
 * @Description: TODO
 * @Version: 0.0.1
 */
@Controller
@RequestMapping("/user")
public class SysUserController {

    private static Logger logger = LoggerFactory.getLogger(SysUserController.class);

    @Autowired
    private SysUserService userService;

    @GetMapping("/list")
    @RequiresPermissions("system:user:list")
    public String list(ModelMap modelMap) {
        List<SysUser> userList = userService.list(null);
        modelMap.addAttribute("userList", userList);
        modelMap.addAttribute("message", "查询用户信息");
        return "/user/list";
    }

    @GetMapping("/add")
    @RequiresPermissions("system:user:add")
    public String add(ModelMap modelMap) {
        modelMap.addAttribute("message", "新增用户信息");
        return "/user/add";
    }

    @GetMapping("/edit")
    @RequiresPermissions("system:user:edit")
    public String edit(ModelMap modelMap) {
        modelMap.addAttribute("message", "修改用户信息");
        return "/user/edit";
    }
}
