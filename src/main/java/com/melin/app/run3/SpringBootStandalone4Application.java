package com.melin.app.run3;

import com.melin.service.DefaultHelloService;
import com.melin.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import java.lang.invoke.MethodHandles;

@SpringBootApplication
public class SpringBootStandalone4Application implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println(getClassName());
        getHelloService4().hello();
    }

    public String getClassName(){
        return MethodHandles.lookup().lookupClass().getName();
    }

    @Bean
    public HelloService getHelloService4(){
        return  new DefaultHelloService();
    }
}
