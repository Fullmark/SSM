package com.fullmark.dao;

import com.fullmark.model.Department;

import java.util.List;

/**
 * @author fanghuanbiao
 */
public interface DepartmentMapper {

    //查询所有
    public List<Department> selectAll();
}
