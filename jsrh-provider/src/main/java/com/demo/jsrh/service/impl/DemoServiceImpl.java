package com.demo.jsrh.service.impl;

import com.demo.jsrh.service.DemoService;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
