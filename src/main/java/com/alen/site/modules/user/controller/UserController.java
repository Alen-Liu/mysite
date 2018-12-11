package com.alen.site.modules.user.controller;


import com.alen.site.modules.user.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Api("用户管理")
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

}
