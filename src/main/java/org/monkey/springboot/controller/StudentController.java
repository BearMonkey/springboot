package org.monkey.springboot.controller;


import org.monkey.springboot.entity.Student;
import org.monkey.springboot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;


    @GetMapping(value = "student/query")
    public List<Student> queryStudent(@RequestParam(value = "id", defaultValue = "")Integer id) {
        System.out.println("query student, id=" + id);
        List<Student> students = new ArrayList<Student>();
        if (null == id) {
            students = studentService.getStudentList();
        } else {
            Student student = studentService.getStudentById(id);
            if (null != student) {
                students.add(student);
            }
        }
        return students;
    }

    @GetMapping(value="student/add")
    public void addStudent(@RequestParam("name")String name, @RequestParam("age")Integer age) {
        System.out.println("add student!");
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        studentService.addStudent(student);
        System.out.println("add student success!");
    }


}
