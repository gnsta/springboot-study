package com.example.study;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//@Component// Application Context 만들어지고 난 후에라 빈 등록후 가능 그래서 안됨
public class SampleListener implements ApplicationListener<ApplicationStartingEvent>{
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("========================");
        System.out.println("Applications is Starting");
        System.out.println("========================");
    }
}
