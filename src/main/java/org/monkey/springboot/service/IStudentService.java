package org.monkey.springboot.service;

import org.monkey.springboot.entity.Student;

import java.util.List;

public interface IStudentService {

    /**
     * 查询所有学生信息
     * @return
     */
    public List<Student> getStudentList();

    /**
     * 根据id查询学生信息
     * @param id
     * @return
     */
    public Student getStudentById(Integer id);

    /**
     * 添加一个学生
     * @param student
     */
    public void addStudent(Student student);
}
