package com.firstspringproj.practicespringproject.calc;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
    int[] retrieveData();
}