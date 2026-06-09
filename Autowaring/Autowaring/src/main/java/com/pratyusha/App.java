package com.pratyusha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.pratyusha.Entity.Car;
import com.pratyusha.Entity.Engine;

public class App {
    public static void main( String[] args ) {
        ApplicationContext ab = new ClassPathXmlApplicationContext("config.xml");

        Engine eng = ab.getBean("engine", Engine.class);
        Car car = ab.getBean("car", Car.class);
        car.SelfStart();
    }
}
