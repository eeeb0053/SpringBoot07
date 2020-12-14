package com.example.demo.sym.service.impl;

import com.example.demo.cmm.mpr.ManagerMapper;
import com.example.demo.sym.service.ManagerService;
import com.example.demo.sym.service.model.ManagerDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired ManagerMapper managerMapper;
    @Override
    public int register(ManagerDTO manager) {
        return managerMapper.insert(manager);
    }
    
}
