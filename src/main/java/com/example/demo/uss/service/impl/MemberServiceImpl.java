package com.example.demo.uss.service.impl;

import java.util.List;

import com.example.demo.uss.service.model.MemberDTO;
import com.example.demo.uss.service.MemberService;

import org.springframework.stereotype.Service;
@Service
public class MemberServiceImpl implements MemberService {

    @Override
    public void registerStudent(MemberDTO student) {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerTeacher(MemberDTO teacher) {
        // TODO Auto-generated method stub

    }

    @Override
    public void modifyStudent(MemberDTO student) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeStudent(MemberDTO student) {
        // TODO Auto-generated method stub

    }

    @Override
    public MemberDTO login(MemberDTO student) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MemberDTO access(MemberDTO teacher) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<MemberDTO> fetchStudentList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MemberDTO fetchStudentDetail(String memId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean existId(String memName) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int sum(MemberDTO grade) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float avg(int sum) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void registerGrade(MemberDTO grade) {
        // TODO Auto-generated method stub

    }

    @Override
    public void modifyGrade(MemberDTO grade) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeGrade(MemberDTO grade) {
        // TODO Auto-generated method stub

    }
    
}
