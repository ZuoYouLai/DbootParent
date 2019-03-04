package com.samlai;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ Author     ：SamLai
 * @ Date       ：Created in 2019-03-04 15:37
 * @ Description：
 */
@EnableDubbo
@SpringBootApplication
public class ZkCustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZkCustomerApplication.class);
    }
}
