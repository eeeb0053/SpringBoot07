package com.example.demo.uss.service;

import java.util.List;

import com.example.demo.uss.service.model.MemberDTO;

import org.springframework.stereotype.Component;
@Component
public interface MemberService {
    public void registerStudent(MemberDTO student);
    public void registerTeacher(MemberDTO teacher);
    public void registerGrade(MemberDTO grade);
    public void modifyGrade(MemberDTO grade);
    public void removeGrade(MemberDTO grade);
    public void modifyStudent(MemberDTO student);
    public void removeStudent(MemberDTO student);
    public MemberDTO login(MemberDTO student);
    public MemberDTO access(MemberDTO teacher);
    public List<MemberDTO> fetchStudentList();
    public MemberDTO fetchStudentDetail(String memId);
    public boolean existId(String memName);
    public int sum(MemberDTO grade);
    public float avg(int sum);
}
