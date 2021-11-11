package com.jackchen.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@EnableAutoConfiguration
public class UserController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Map login(String name,String pwd){
        Map map = new HashMap();
        map.put("status",-1);
        if ("jack".equals(name) && "123".equals(pwd)){
            map.put("status",0);
        }
        return map;
    }

    @RequestMapping("/info")
    @ResponseBody
    public String returnInfo(){
        return new String("ok! 我们的第一个接口");
    }


    @RequestMapping(value = "/info",method = RequestMethod.GET)
    @ResponseBody
    public List returnLogin(String desc) {
        List list = new ArrayList();
        list.add(desc);
        list.add(desc.length() + "");
        return list;
    }

}
