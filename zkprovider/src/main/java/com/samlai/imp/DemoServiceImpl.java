package com.samlai.imp;

import com.samlai.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @ Author     ：SamLai
 * @ Date       ：Created in 2019-03-04 14:24
 * @ Description：
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
        )
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {
        System.err.println("name   -----> " + name);
        return "Hello " + name;
    }


}