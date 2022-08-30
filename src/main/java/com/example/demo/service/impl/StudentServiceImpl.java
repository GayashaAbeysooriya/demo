package com.example.demo.service.impl;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    public StudentRepository studentRepository;

//    @Override
//    public List<Student> getStudents() {
//        return null;
//    }
//
//    @Override
//    public List<Student> getStudentByCity(String city) {
//        return null;
//    }
//
//    @Override
//    public void addNewStudent(Student student) {
//
//    }
//
//    @Override
//    public void updateStudent(Long studentId, String name, String city, String email) {
//
//    }

    @Override
    public List<Student> getStudents() {
        return null;
    }

    @Override
    public List<Student> getStudentByCity(String city){
        return studentRepository.findStudentByCity(city);
    }

    @Override
    public void addNewStudent(Student student) {

    }

    @Override
    public void updateStudent(Long studentId, String name, String city, String email) {

    }

    @Override
    public  List <Student> getAllStudents(){
        return studentRepository.findAll();
    }

}
