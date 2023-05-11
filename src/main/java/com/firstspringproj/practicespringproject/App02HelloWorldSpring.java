package com.firstspringproj.practicespringproject;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person4Qualifier") + "----");

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
//        var arr = context.getBeanDefinitionNames();
//        for(int i=0; i< arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }

}
