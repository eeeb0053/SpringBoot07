package com.example.demo.cmm.mpr;

import com.example.demo.sym.service.model.ManagerDTO;

import org.springframework.stereotype.Repository;

@Repository
public interface ManagerMapper {
	public int insert(ManagerDTO manager);
}
