package com.example.Springbootdemo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentCotroller {

    private StudentCotroller studentCotroller;

    @Autowired
    public StudentCotroller(StudentCotroller studentCotroller) {
        this.studentCotroller = studentCotroller;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentCotroller.getStudents();
    }
}
