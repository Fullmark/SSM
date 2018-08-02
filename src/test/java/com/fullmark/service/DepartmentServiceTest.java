package com.fullmark.service;

import com.alibaba.fastjson.JSON;
import com.fullmark.dao.DepartmentMapper;
import com.fullmark.model.Department;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * @author fanghuanbiao
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-mybatis.xml"})
public class DepartmentServiceTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void testSelectAll() throws Exception {
        List<Department> Departments = departmentMapper.selectAll();
        for (Department department : Departments) {
            System.err.println(department.getId() + "   " + department.getDepartmentCode()
                    + "  " + department.getDepartmentName());
        }
    }

    @Test
    public void testSelectByPage() throws Exception {
        PageHelper.startPage(1, 1);
        List<Department> Departments = departmentMapper.selectAll();
        PageInfo<Department> pageInfo = new PageInfo<Department>(Departments);
        JSON json = (JSON) JSON.toJSON(pageInfo);
            System.err.println(json.toJSONString());

    }

}