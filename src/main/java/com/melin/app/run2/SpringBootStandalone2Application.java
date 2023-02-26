package com.melin.app.run2;

import com.melin.service.DefaultHelloService;
import com.melin.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
@Lazy
public class SpringBootStandalone2Application implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("SpringBootStandalone2Application.run");
        getHelloService().hello();
    }

    @Bean
    public HelloService getHelloService(){
        return  new DefaultHelloService();
    }
}
