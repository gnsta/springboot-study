package com.example.study.externalsetting;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


import javax.validation.constraints.NotNull;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Component
@ConfigurationProperties("hee")
@Getter
@Setter
@Validated
public class ExProperties {

    @NotNull
    private String name;

    private int age;

    private String fullName;

    @DurationUnit(ChronoUnit.SECONDS)
    private Duration sessionTimeout = Duration.ofSeconds(30);//안들어오면 기본값은 30초
}
