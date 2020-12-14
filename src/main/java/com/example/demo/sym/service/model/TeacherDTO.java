package com.example.demo.sym.service.model;

import com.example.demo.uss.service.model.MemberDTO;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Component
public class TeacherDTO extends MemberDTO{
    protected String accessKey;
}
