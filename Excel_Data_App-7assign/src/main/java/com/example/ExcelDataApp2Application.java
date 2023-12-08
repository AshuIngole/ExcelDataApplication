package com.example;

// for running the: http://localhost:8888/demo/h2-console/
// for testing:http://localhost:8888/demo/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Student;
import com.example.service.StudentService;

@SpringBootApplication
public class ExcelDataApp2Application implements CommandLineRunner {
	@Autowired
    private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(ExcelDataApp2Application.class, args);
	}
	@Override
    public void run(String...a) {
        for (int i = 0; i <= 10; i++) {
            Student student = new Student();
            student.setStudentName("Student Name");
            student.setEmail("student@mail.com");
            student.setMobileNo("XXXXXXXXXX");
            studentService.addStudent(student);
        }
    }
}


