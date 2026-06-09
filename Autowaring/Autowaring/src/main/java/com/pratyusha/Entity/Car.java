package com.pratyusha.Entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    @Autowired
    private Engine engine;

    public void SelfStart(){
        System.out.println("Engine Object Instance: " + engine);
        if(engine != null){
            engine.start();
        } else {
            System.out.println("Issue in start engine: Engine is null");
        }
    }
}
