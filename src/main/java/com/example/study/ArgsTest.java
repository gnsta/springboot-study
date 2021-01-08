package com.example.study;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArgsTest {

    public ArgsTest(ApplicationArguments arguments){
        System.out.println("foo "+ arguments.containsOption("foo"));
        System.out.println("bar " + arguments.containsOption("bar"));
    }

}
