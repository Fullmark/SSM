package com.fullmark.service;

import com.fullmark.dao.DepartmentMapper;
import com.fullmark.model.Department;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fanghuanbiao
 */
@Service
@Transactional
public class DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    public List<Department> selectAll() {
        List<Department> list = departmentMapper.selectAll();
        return list;
    }
}
