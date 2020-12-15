package com.example.demo.cmm.mpr;

import java.util.List;

import com.example.demo.uss.service.model.StudentDTO;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
	public int insert(StudentDTO student);
	public StudentDTO login(StudentDTO student);
	public StudentDTO selectById(String userid);
	public List<StudentDTO> selectAll();
}
