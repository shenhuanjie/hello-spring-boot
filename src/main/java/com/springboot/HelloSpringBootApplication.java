package com.springboot;

import com.springboot.chapter3.constant.SpringProfiles;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.xml.ws.Service;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot.chapter3"}, excludeFilters = {@ComponentScan.Filter(classes = Service.class)})
public class HelloSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootApplication.class, args);

        // 输出当前运行的环境
        System.out.println("当前运行的环境：" + SpringProfiles.active);
    }

}
