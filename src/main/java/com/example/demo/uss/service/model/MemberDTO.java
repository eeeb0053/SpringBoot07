package com.example.demo.uss.service.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Component
public class MemberDTO {
    protected int memId;
    protected String memName, password;
    // memId, memName, password
}