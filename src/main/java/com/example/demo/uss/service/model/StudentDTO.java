package com.example.demo.uss.service.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class StudentDTO{
    private String stuNum, userId, password, name, ssn, regDate;
}
