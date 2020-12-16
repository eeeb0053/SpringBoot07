package com.example.demo.cmm.mpr;

import java.util.List;

import com.example.demo.sym.service.model.TeacherDTO;

import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
	public int insert(TeacherDTO teacher);
	public List<TeacherDTO> selectAll();
	public TeacherDTO selectById(String teaNum);
	public int update(TeacherDTO teacher);
	public int delete(TeacherDTO teacher);
}
