package com.placement.service;

import com.placement.model.Student;
import com.placement.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) { this.repo = repo; }

    public List<Student> getAll() { return repo.findAll(); }
    public Student save(Student s) { return repo.save(s); }
}
