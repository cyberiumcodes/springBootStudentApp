package com.example.Springbootdemo;

import com.example.Springbootdemo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return List.of(new Student(1L, "Gary", "garyainen@gmail.com",
				LocalDate.of(1985, Month.MARCH, 25), 36),
				new Student(2L, "Marion", "marion@gmail.com", LocalDate.of(1991, Month.APRIL, 5),
						25));
	}

}
