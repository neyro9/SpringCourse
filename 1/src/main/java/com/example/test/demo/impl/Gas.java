package com.example.test.demo.impl;

import com.example.test.demo.api.Engine;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@com.example.test.demo.customAnnotation.Gas
@Component
@Primary // ma pierszenstwo w wstrzyknieciu, mozemy tez uzyc Qualifier
//klasy disel beznzyna czy gas powinismy oznaczyc jako qualifier engine
/*3 sposoby na wstrzykiwanie*/
public class Gas implements Engine {

    @Override
    public void startEngine() {
        System.err.println("Uruchomiłem silnik na gaz");
    }
}
