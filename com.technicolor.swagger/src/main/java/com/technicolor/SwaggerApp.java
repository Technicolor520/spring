package com.technicolor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Technicolor
 * @version v1.0
 * @date 2019/6/20 16:22
 * @description
 **/

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "com.technicolor")
public class SwaggerApp {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerApp.class,args);
    }
}
