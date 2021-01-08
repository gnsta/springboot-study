package com.example.study.springapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgsTest {

    public ArgsTest(ApplicationArguments arguments){
        System.out.println("foo "+ arguments.containsOption("foo"));
        System.out.println("bar " + arguments.containsOption("bar"));
    }

}
