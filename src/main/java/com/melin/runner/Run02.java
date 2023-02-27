package com.melin.runner;

import com.melin.app.run1.SpringBootStandaloneApplication;
import com.melin.app.run2.SpringBootStandalone2Application;
import com.melin.app.run3.SpringBootStandalone3Application;
import com.melin.app.run3.SpringBootStandalone4Application;
import org.springframework.boot.SpringApplication;

public class Run02 {
    public static void main(String[] args) {
        System.out.println("test2222");
        SpringApplication.run(SpringBootStandalone3Application.class, args);
    }
}
