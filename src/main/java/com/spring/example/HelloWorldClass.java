package com.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldClass {

    public HelloWorldClass() {
        super();
    }

    @SuppressWarnings("resource")
    public static void main (String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Pojo bean = (Pojo) context.getBean("pojo");
        bean.sayHello("Monkey");
    }
}
