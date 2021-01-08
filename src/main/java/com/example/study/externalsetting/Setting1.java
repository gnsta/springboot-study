package com.example.study.externalsetting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Setting1 implements ApplicationRunner {

//    @Value("${hee.name}")
//    private String name;
//
//    @Value("${hee.age}")
//    private int age;
//
//    @Value("${hee.fullName}")
//    private String fullName;

    @Autowired
    ExProperties exProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("================");
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(fullName);
//        System.out.println("================");
        System.out.println("================");
        System.out.println(exProperties.getName());
        System.out.println(exProperties.getAge());
        System.out.println(exProperties.getSessionTimeout());
        System.out.println("================");
    }
}
