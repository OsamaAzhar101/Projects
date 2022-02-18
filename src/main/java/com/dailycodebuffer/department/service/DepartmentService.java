package com.dailycodebuffer.department.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {

		log.info("Inside savedepartment method of DepartmentService");

		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(long departmentId) {
		// TODO Auto-generated method stub

		log.info("Inside findDepartmentById method of DepartmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
