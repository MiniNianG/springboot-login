package edu.sy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    //使用restful声明公共方法完成页面资源的内部转发访问
    @RequestMapping("{uri}")
    public String getPage(@PathVariable String uri){
        return uri;
    }
}
