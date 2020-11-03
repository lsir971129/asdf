package com.yg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String Hello(Map<String,Object> map){
        map.put("msg","这是我的第一个SSM项目");
        return "hello";
    }
}
