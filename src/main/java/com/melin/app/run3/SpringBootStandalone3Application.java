package com.melin.app.run3;

import com.melin.service.DefaultHelloService;
import com.melin.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
public class SpringBootStandalone3Application implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("SpringBootStandalone3Application");
        getHelloService3().hello();
    }



    @Bean
    public HelloService getHelloService3(){
        return  new DefaultHelloService();
    }
}
