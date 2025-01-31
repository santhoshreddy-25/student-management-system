package com.springbootsms.student_management_system.service;

import com.springbootsms.student_management_system.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);
}
