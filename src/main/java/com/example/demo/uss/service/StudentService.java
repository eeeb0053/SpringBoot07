package com.example.demo.uss.service;

import java.util.List;

import com.example.demo.uss.service.model.StudentDTO;

import org.springframework.stereotype.Component;
@Component
public interface StudentService {
	public int register(StudentDTO student);
	public StudentDTO login(StudentDTO student);
	public StudentDTO detail(String userid);
	public List<?> list();
	public int update(StudentDTO student);
	public int detele(StudentDTO student);
}
