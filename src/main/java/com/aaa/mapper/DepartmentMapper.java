package com.aaa.mapper;

import com.aaa.entity.Departments;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    List<Departments> departmentList(Departments departments);
    int deleteDepartment(Integer departmentId);
    int addDepartment(Departments departments);
    int count(Departments departments);

    /*
    * 判断该项目是否还有医生
    * */
    int checkCount(Integer departmentId);
}
