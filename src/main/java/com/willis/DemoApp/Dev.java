package com.willis.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    Laptop laptop;


    public void build(){
        System.out.println("working on awesome project");
        laptop.compile();
    }
}
