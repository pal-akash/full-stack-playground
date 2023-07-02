package com.akashp.studentsystem.Service;

import com.akashp.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
    public void deleteAllStudent();
}
