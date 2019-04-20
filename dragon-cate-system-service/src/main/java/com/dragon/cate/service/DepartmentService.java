package com.dragon.cate.service;

import com.dragon.cate.domain.dbo.education.DepartmentDO;

/**
 * @author chl
 * @since 2019-03-22 18:34:45
 */
public interface DepartmentService {
    
    DepartmentDO queryById(Long id);

    int addDepartment(DepartmentDO departmentDO);

}