package com.cyz.ssm.service.impl;

import com.cyz.ssm.dao.StudentDao;
import com.cyz.ssm.entity.Student;
import com.cyz.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
