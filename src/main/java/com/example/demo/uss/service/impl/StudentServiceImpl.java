package com.example.demo.uss.service.impl;

import java.util.List;

import com.example.demo.cmm.mpr.StudentMapper;
import com.example.demo.uss.service.StudentService;
import com.example.demo.uss.service.model.StudentDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public int register(StudentDTO student) {
        return studentMapper.insert(student);
    }

    @Override
    public StudentDTO login(StudentDTO student) {
        return studentMapper.login(student);
    }

    @Override
    public StudentDTO detail(String userid) {
        return studentMapper.selectById(userid);
    }

    @Override
    public List<?> list() {
        return studentMapper.selectAll();
    }

    @Override
    public int update(StudentDTO student) {
        return studentMapper.update(student);
    }

    @Override
    public int detele(StudentDTO student) {
        return studentMapper.delete(student);
    }

}
