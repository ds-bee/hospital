package com.aaa.service;

import com.aaa.entity.Departments;

import java.util.List;

public interface DepartmentService {
    /*
    * 项目的增删改查
    * */
    List<Departments> departmentList(Departments departments);
    int deleteDepartment(Integer departmentId);
    int addDepartment(Departments departments);
    int count(Departments departments);

    /*
     * 判断该项目是否还有医生
     * */
    int checkCount(Integer departmentId);
}
