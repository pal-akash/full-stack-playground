package com.akashp.studentsystem.Controller;

import com.akashp.studentsystem.Service.StudentService;
import com.akashp.studentsystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        studentService.deleteAllStudent();
        return "All student details has been deleted";
    }
}
