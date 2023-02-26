package com.melin.runner;

import com.melin.app.run1.SpringBootStandaloneApplication;
import com.melin.app.run2.SpringBootStandalone2Application;
import org.springframework.boot.SpringApplication;

public class Run02 {
    public static void main(String[] args) {
        System.out.println("test011");
        SpringApplication.run(SpringBootStandaloneApplication.class, args);
        System.out.println("test022");
        SpringApplication.run(SpringBootStandalone2Application.class, args);
    }
}
