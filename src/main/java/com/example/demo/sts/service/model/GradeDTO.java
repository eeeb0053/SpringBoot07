package com.example.demo.sts.service.model;

import com.example.demo.uss.service.model.StudentDTO;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Component
public class GradeDTO extends StudentDTO{
    private String gradeNum, subject, score, grade, stuNum;
}
