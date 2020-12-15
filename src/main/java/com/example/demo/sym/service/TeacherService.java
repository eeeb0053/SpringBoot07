package com.example.demo.sym.service;

import java.util.List;

import com.example.demo.sym.service.model.TeacherDTO;

import org.springframework.stereotype.Component;

@Component
public interface TeacherService {
	public int register(TeacherDTO teacher);

	public List<?> list();

	public TeacherDTO detail(String teaNum);
}
