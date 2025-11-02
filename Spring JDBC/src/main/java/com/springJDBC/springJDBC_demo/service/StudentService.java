package com.springJDBC.springJDBC_demo.service;

import com.springJDBC.springJDBC_demo.dao.StudentRepo;
import com.springJDBC.springJDBC_demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public void saveStudent(Student student) {
        // after applying data-modifications and logic implementations
        repo.save(student);
    }
}
