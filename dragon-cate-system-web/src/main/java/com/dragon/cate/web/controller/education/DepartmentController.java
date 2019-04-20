package com.dragon.cate.web.controller.education;

import com.alibaba.fastjson.JSONObject;
import com.dragon.cate.domain.base.ResponseVO;
import com.dragon.cate.domain.dbo.education.DepartmentDO;
import com.dragon.cate.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 学校院系信息表(DepartmentDO)表控制层
 *
 * @author chl
 * @since 2019-03-25 10:50:51
 */
@RestController
@RequestMapping("department")
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;

    /**
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("queryById")
    public DepartmentDO queryById(Long id) {
        return this.departmentService.queryById(id);
    }


    @PostMapping("addDepartment")
    @ResponseBody
    public Object addDepartment(@RequestBody JSONObject jsonObject) {
        DepartmentDO param = jsonObject.toJavaObject(DepartmentDO.class);
        departmentService.addDepartment(param);
        return ResponseVO.ok(param.getId() > 0);
    }
}