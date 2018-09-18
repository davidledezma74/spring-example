package com.spring.example;

public class Pojo {


    private String msg = "";


    public void setGreeting (String msg) {

        this.msg = msg;
    }

    public void sayHello (String greeting) {

        System.out.println (this.msg.concat (" ").concat (greeting));
    }
}
