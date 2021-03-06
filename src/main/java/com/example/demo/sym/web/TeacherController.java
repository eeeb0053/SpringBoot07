package com.example.demo.sym.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.sym.service.TeacherService;
import com.example.demo.sym.service.model.TeacherDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController @RequestMapping("/teachers")
public class TeacherController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired TeacherService teacherService;
    @PostMapping("")
    public Map<?,?> register(@RequestBody TeacherDTO teacher){
        var map = new HashMap<>();
        logger.info("등록하려는 강사 정보: "+teacher.toString());
        map.put("message", (teacherService.register(teacher) == 1) ? "SUCCESS" : "FAILURE");
        return map;
    }
    @GetMapping("/{teaNum}")
    public TeacherDTO profile(@PathVariable String teaNum){
        return teacherService.detail(teaNum);
    }
    @GetMapping("")
    public List<?> list(){
        return teacherService.list();
    }
    @PutMapping("")
    public Map<?,?> update(@RequestBody TeacherDTO teacher){
        logger.info("강사 정보 수정 요청 진입: "+teacher.toString());
        var map = new HashMap<>();
        map.put("message", (teacherService.update(teacher) == 1) ? "SUCCESS" : "FAILURE");
        return map;
    }
    @DeleteMapping("")
    public Map<?,?> delete(@RequestBody TeacherDTO teacher){
        logger.info("강사 정보 삭제 요청 진입: "+teacher.getTeaNum());
        var map = new HashMap<>();
        map.put("message", (teacherService.delete(teacher) == 1) ? "SUCCESS": "FAILURE");
        return map;
    }
}
