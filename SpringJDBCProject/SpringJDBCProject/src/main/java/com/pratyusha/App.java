package com.pratyusha;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.pratyusha.Entity.Student;
import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);

        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        System.out.println("Data inserted....");
        String insertSql = "INSERT INTO Student (id, name, course) VALUES (?, ?, ?)";

        System.out.println("\n----Student List----");
        String selectSql = "SELECT * FROM Student";
        List<Student> students = jdbcTemplate.query(selectSql, (rs, rowNum) -> {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setCourse(rs.getString("course"));
            return s;
        });

        students.forEach(System.out::println);
        context.close();
    }
}
