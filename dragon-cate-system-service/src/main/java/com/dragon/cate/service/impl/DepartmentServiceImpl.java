package com.dragon.cate.service.impl;

import com.dragon.cate.dao.mapper.education.DepartmentMapper;
import com.dragon.cate.domain.dbo.education.DepartmentDO;
import com.dragon.cate.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 学校院系信息表(DepartmentDO)表控制层
 *
 * @author chl
 * @since 2019-03-25 11:01:03
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    
    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public DepartmentDO queryById(Long id) {
        return departmentMapper.queryById(id);
    }

    @Override
    public int addDepartment(DepartmentDO departmentDO) {
        return departmentMapper.insert(departmentDO);
    }
}