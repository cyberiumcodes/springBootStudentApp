package com.example.Springbootdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentServices {


    public List<Student> getStudents(){
        return List.of(new Student(1L, "Gary", "garyainen@gmail.com",
                        LocalDate.of(1985, Month.MARCH, 25), 36),
                new Student(2L, "Marion", "marion@gmail.com", LocalDate.of(1991, Month.APRIL, 5),
                        25));
    }
}
