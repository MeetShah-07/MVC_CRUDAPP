package com.meetshah.crudapp.dao;

import com.meetshah.crudapp.model.Student;

import java.util.List;

public interface StudentDAO {
    void insert(Student student);
    void delete(int id);
    Student getStudentByID(int id);
    void update(Student student);
    List<Student> getAllStudents();
}
