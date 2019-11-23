package com.example.test.demo.impl;

import com.example.test.demo.api.Engine;
import org.springframework.stereotype.Component;

//@com.example.test.demo.customAnnotation.Gasoline
@Component
public class Gasoline implements Engine {


    @Override
    public void startEngine() {
        System.err.println("Uruchomiłem silnik benzynynowy!");

    }
}
