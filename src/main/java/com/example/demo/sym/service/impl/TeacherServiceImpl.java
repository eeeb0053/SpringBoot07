package com.example.demo.sym.service.impl;

import java.util.List;

import com.example.demo.cmm.mpr.TeacherMapper;
import com.example.demo.sym.service.TeacherService;
import com.example.demo.sym.service.model.TeacherDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired TeacherMapper teacherMapper;
    @Override
    public int register(TeacherDTO teacher) {
        return teacherMapper.insert(teacher);
    }
    @Override
    public List<?> list() {
        return teacherMapper.selectAll();
    }

    @Override
    public TeacherDTO detail(String teaNum) {
        return teacherMapper.selectById(teaNum);
    }
    
}
