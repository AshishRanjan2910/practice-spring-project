package com.firstspringproj.practicespringproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Ash";
    }

    @Bean
    public int age() {
        return 23;
    }

    @Bean
    public Person person() {
        return new Person("Kush", 44);
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age());
    }

    @Bean
    public Person person3Parameters(String name, int age){
        return new Person(name, age);
    }
}
