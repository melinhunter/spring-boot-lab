package com.melin.app;

import com.melin.lambda.StringFun;
import com.melin.service.DefaultHelloService;
import com.melin.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.lang.invoke.MethodHandles;

@SpringBootApplication
public class SpringBootStandaloneApplication implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        String className1 =  getClassName();
        StringFun strf = () -> "TEST";
        System.out.println(strf.getString());
        StringFun classnamef = ()->MethodHandles.lookup().lookupClass().getName();
        System.out.println(classnamef);
        getHelloService().hello();
    }

    public String getClassName(){
        return MethodHandles.lookup().lookupClass().getName();
    }

    @Bean
    public HelloService getHelloService(){
        return  new DefaultHelloService();
    }
}
