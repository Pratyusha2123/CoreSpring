package Com.pratyusha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Com.pratyusha.Entity.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext ab = new ClassPathXmlApplicationContext("config.xml");
        Student s = (Student) ab.getBean("student");
        s.display();
    }
}
