package com.melin.runner;

import com.melin.app.run1.SpringBootStandaloneApplication;
import com.melin.app.run2.SpringBootStandalone2Application;
import org.springframework.boot.SpringApplication;

public class Run01 {
    public static void main(String[] args) {
        String test = "TEST";
        System.out.println(test);
        SpringApplication.run(SpringBootStandaloneApplication.class, args);
        System.out.println(test);
        SpringApplication.run(SpringBootStandalone2Application.class, args);
    }
}
