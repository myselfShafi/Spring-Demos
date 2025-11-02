package com.springJDBC.springJDBC_demo;

import com.springJDBC.springJDBC_demo.model.Student;
import com.springJDBC.springJDBC_demo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);
        Student student = context.getBean(Student.class);
        student.setRollNo(1);
        student.setName("Shafi");
        student.setMarks(96);

        StudentService stServ = context.getBean(StudentService.class);
        stServ.saveStudent(student);
	}

}
