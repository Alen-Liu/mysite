package com.alen.site.modules.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Api("后台首页")
@Controller("adminIndexController")
@RequestMapping(value = "/admin")
public class IndexController {

    @ApiOperation("进入首页")
    @GetMapping(value = {"","/index"})
    public String index(HttpServletRequest request){
        return "admin/index";
    }
}
