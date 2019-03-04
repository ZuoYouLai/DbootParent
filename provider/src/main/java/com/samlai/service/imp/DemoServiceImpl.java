package com.samlai.service.imp;

import com.samlai.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @ Author     ：SamLai
 * @ Date       ：Created in 2019-03-04 10:48
 * @ Description：
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {


    public String sayHello(String name) {
        System.err.println("name   -----> " + name);
        return "Hello " + name;
    }


}
