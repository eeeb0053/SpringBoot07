package com.example.demo.sym.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.sym.service.TeacherService;
import com.example.demo.sym.service.model.TeacherDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class TeacherController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired TeacherService teacherService;
    @PostMapping("/teachers")
    public Map<?,?> register(@RequestBody TeacherDTO teacher){
        var map = new HashMap<>();
        logger.info("등록하려는 강사 정보: "+teacher.toString());
        map.put("message", (teacherService.register(teacher) == 1) ? "SUCCESS" : "FAILURE");
        return map;
    }
}
