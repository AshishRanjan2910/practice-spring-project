package com.firstspringproj.practicespringproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "returning name bean...";
    }
}
