package com.springboot.chapter3.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringProfiles {
    public static String active;

    @Value("${spring.profiles.active}")
    public void setActive(String active) {
        SpringProfiles.active = active;
    }
}
