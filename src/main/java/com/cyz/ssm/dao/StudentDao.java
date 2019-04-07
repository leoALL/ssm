package com.cyz.ssm.dao;

import com.cyz.ssm.entity.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> findAll();
}
