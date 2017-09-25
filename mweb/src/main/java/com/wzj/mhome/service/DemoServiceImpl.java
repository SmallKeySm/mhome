package com.wzj.mhome.service;

import com.wzj.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService {

    @Override
    public String getName() {
        return "Demo";
    }
}
