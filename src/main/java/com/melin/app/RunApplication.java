package com.melin.app;

import com.melin.app.run.SpringBootStandaloneApplication;
import org.springframework.boot.SpringApplication;

public class RunApplication {
    public static void main(String[] args) {
        String test = "TEST";
        System.out.println(test);
        SpringApplication.run(SpringBootStandaloneApplication.class, args);

    }
}
