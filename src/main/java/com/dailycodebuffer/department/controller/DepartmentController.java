package com.dailycodebuffer.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
@RequestMapping("/departments")
//@Slf4j
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_XML)
public class DepartmentController {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {

        log.info("inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);

    }

    @Produces(MediaType.TEXT_XML)
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") long departmentId) {

        log.info("Inside findDepartmentById method of DepartmentService");

        return departmentService.findDepartmentById(departmentId);

    }
}
