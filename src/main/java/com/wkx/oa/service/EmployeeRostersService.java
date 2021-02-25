package com.wkx.oa.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wkx.oa.entity.EmployeeRostersEntity;
import com.wkx.oa.utils.PageUtils;

import java.util.Map;

/**
 * 员工花名册表
 *
 * @author chaiduolai
 * @email cduolai@163.com
 * @date 2021-02-24 14:38:55
 */
public interface EmployeeRostersService extends IService<EmployeeRostersEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

