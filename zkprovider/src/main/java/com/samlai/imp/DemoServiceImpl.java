package com.samlai.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.samlai.service.DemoService;

/**
 * @ Author     ：SamLai
 * @ Date       ：Created in 2019-03-04 14:24
 * @ Description：
 */
@Service
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {
        System.err.println("name   -----> " + name);
        return "Hello " + name;
    }


}