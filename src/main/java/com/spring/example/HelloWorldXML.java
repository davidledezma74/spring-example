package com.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldXML {

    public HelloWorldXML() {
        super();
    }

    @SuppressWarnings("resource")
    public static void main (String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Pojo bean = (Pojo) context.getBean("pojo");
        bean.sayHello("Dog");

    }
}
