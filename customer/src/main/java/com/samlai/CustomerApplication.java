package com.samlai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ Author     ：SamLai
 * @ Date       ：Created in 2019-03-04 10:54
 * @ Description：
 */
@SpringBootApplication
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class);
    }



//	@Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
//	private DemoService demoService;


//	@Bean
//	public ApplicationRunner runner() {
//		return args -> {
//			logger.info(demoService.sayHello("samlai"));
//		};
//	}

}