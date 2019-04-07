package org.monkey.springboot.service.impl;

import org.monkey.springboot.dao.IStudentDao;
import org.monkey.springboot.entity.Student;
import org.monkey.springboot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao studentDao;

    @Override
    public List<Student> getStudentList() {
        System.out.println("query all student!");
        return studentDao.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        System.out.println("query student by id, id=" + id);
        return studentDao.findOne(id);
    }

    @Override
    public void addStudent(Student student) {
        studentDao.save(student);
    }
}
