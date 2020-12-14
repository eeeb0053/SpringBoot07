package com.example.demo.cmm.mpr;

import com.example.demo.sym.service.model.TeacherDTO;

import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
	public int insert(TeacherDTO teacher);
}
