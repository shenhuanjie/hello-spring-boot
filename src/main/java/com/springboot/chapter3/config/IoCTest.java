package com.springboot.chapter3.config;


import com.springboot.chapter3.pojo.BusinessPerson;
import com.springboot.chapter3.pojo.definition.Person;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCTest {
    private static final Logger log = Logger.getLogger(IoCTest.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = ctx.getBean(BusinessPerson.class);
        person.service();
        log.info("person = " + person);
    }
}
