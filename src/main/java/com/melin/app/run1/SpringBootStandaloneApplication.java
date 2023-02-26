package com.melin.app.run1;

import com.melin.service.DefaultHelloService;
import com.melin.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
@Lazy
public class SpringBootStandaloneApplication implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("SpringBootStandaloneApplication.run");
        getHelloService2().hello();
    }

    @Bean
    public HelloService getHelloService2(){
        return  new DefaultHelloService();
    }
}
