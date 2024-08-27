package com.willis.DemoApp;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    Laptop laptop;


    public void build(){
        System.out.println("working on awesome project");
        laptop.compile();
    }
}
