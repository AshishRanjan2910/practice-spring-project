package com.firstspringproj.practicespringproject.template.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class TemplateLauncherApplication {
    public static void main(String[] args) {
        var depInjectionContext = new AnnotationConfigApplicationContext(TemplateLauncherApplication.class);
        Arrays.stream(depInjectionContext.getBeanDefinitionNames())
                .forEach(System.out::println);
    }
}
