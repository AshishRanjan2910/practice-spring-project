package com.firstspringproj.practicespringproject.calc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class CalculatorLauncherApplication {
    public static void main(String[] args) {
        var calcContext = new AnnotationConfigApplicationContext(CalculatorLauncherApplication.class);
        System.out.println(calcContext.getBean(BusinessCalculationService.class).findMax());
        Arrays.stream(calcContext.getBeanDefinitionNames()).forEach(System.out::println);

    }
}
