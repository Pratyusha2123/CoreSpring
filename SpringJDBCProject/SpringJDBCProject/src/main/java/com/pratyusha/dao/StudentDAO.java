package com.pratyusha.dao;

import com.pratyusha.Entity.Student;
import java.util.List;

public interface StudentDAO {
    int insert(Student student);
    List<Student> getAllStudents();
}
