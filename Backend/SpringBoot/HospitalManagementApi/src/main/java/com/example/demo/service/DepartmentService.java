package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository drepo;
	
	public List<Department> getallDept(){
		return drepo.findAll();
	}

}
