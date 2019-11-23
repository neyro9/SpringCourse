package com.example.test.demo.vehicle;

import com.example.test.demo.api.Engine;
import com.example.test.demo.customAnnotation.Diesel;
import com.example.test.demo.customAnnotation.Gas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlfaRomeo {

    @Autowired
    //@Gas
    private Engine engine;

    public void start() {
        engine.startEngine();
    }
}
