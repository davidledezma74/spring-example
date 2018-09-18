package com.spring.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public AppConfig() {
        super();
    }

    @Bean (name = "pojo")
    public Pojo getObject () {
        Pojo b = new Pojo();
        b.setGreeting("Hello");

        return b;
    }
}
