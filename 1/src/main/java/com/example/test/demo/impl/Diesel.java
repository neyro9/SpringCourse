package com.example.test.demo.impl;

import com.example.test.demo.api.Engine;
import org.springframework.stereotype.Component;

//@com.example.test.demo.customAnnotation.Diesel
@Component
public class Diesel implements Engine {


    @Override
    public void startEngine() {
        System.err.println("Uruchomiłem silnik diesla!");

    }
}
