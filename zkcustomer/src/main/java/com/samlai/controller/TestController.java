package com.samlai.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.samlai.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：SamLai
 * @ Date       ：Created in 2019-03-04 14:29
 * @ Description：
 */
@RestController
public class TestController {

    @Reference(version = "${demo.service.version}",
               application = "${dubbo.application.id}",
               registry = "${dubbo.registry.id}")
    private DemoService demoService;


    // localhost:8989/dubbo
    @RequestMapping(value = "/dubbo", method = RequestMethod.GET)
    public String test() {
        String msg = demoService.sayHello("  ~~~~      Mr.samlai   ~~  hahah~~");
        return msg;
    }
}
