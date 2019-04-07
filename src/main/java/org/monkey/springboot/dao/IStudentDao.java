package org.monkey.springboot.dao;

import org.monkey.springboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentDao extends JpaRepository<Student, Integer> {
}
