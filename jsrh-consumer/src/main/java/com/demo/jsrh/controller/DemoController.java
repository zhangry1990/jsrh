package com.demo.jsrh.controller;

import com.demo.jsrh.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/sayHelloView")
    public String sayHelloView(Model model) {

        model.addAttribute("message", "Hello Spring MVC!");
        return "sayHello";
    }

    @RequestMapping("/sayHello")
    public Map<String, Object> sayHello(String name) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        String result = demoService.sayHello(name);
        resultMap.put("resultMap", result);
        return resultMap;
    }
}
