package com.pratyusha;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.pratyusha.Entity.Student;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);

        Student s = context.getBean("student", Student.class);
        s.display();

        context.close();
    }
}
