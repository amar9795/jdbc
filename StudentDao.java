package com.nucleus.dao;

import java.sql.SQLException;

import com.nucleus.entity.Student;

public interface StudentDao {
public void save(Student student) throws SQLException;
public Student getStudentById(int stdId);
}
