package com.telusko.springjpaex.service;

import com.telusko.springjpaex.StudentRepo;
import com.telusko.springjpaex.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;
    public void save(Student s){
        repo.save(s);
    }

    public List<Student> getStudents(){
        return repo.findAll();
    }
//    public List<Student> getStudents(){
//        List<Student> students = new ArrayList<>();
//        students.add(new Student(101, "Musa", 15));
//        students.add(new Student(102, "Mandla", 16));
//        students.add(new Student(103, "Sam", 17));
//        students.add(new Student(104, "John", 18));
//        return students;
//    }


}