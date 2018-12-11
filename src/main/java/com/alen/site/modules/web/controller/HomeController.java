package com.alen.site.modules.home.controller;


import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Alen
 *
 * 页面控制器
 */
@Api("网站首页和关于页面")
@Controller
public class HomeController {

    @ApiIgnore
    @GetMapping(value = {"", "/index"})
    public String index() {
        return "site/index";
    }


    @ApiIgnore
    @GetMapping(value = {"/about", "/about/index"})
    public String getAbout(HttpServletRequest request){
        request.setAttribute("active","about");
        return "site/about";
    }

    @ApiIgnore
    @GetMapping(value = {"/blog", "/blog/index"})
    public String blogIndex(HttpServletRequest request){
        request.setAttribute("active","blog");
        return "site/blog";
    }

    @ApiIgnore
    @GetMapping(value = {"/resume", "/resume/index"})
    public String resumeIndex(HttpServletRequest request){
        request.setAttribute("active","resume");
        return "site/resume";
    }
}
