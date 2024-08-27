package com.willis.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
   // @Autowired//field injection
    Laptop laptop;
    //Constructor injection
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }
    public void setLaptop(Laptop laptop){
        this.laptop=laptop;
    }


    public void build(){
        System.out.println("working on awesome project");
        laptop.compile();
    }
}
