package com.wkx.oa.service.impl;

import com.wkx.oa.utils.PageUtils;
import com.wkx.oa.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.wkx.oa.dao.EmployeeRostersDao;
import com.wkx.oa.entity.EmployeeRostersEntity;
import com.wkx.oa.service.EmployeeRostersService;


@Service("employeeRostersService")
public class EmployeeRostersServiceImpl extends ServiceImpl<EmployeeRostersDao, EmployeeRostersEntity> implements EmployeeRostersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EmployeeRostersEntity> page = this.page(
                new Query<EmployeeRostersEntity>().getPage(params),
                new QueryWrapper<EmployeeRostersEntity>()
        );

        return new PageUtils(page);
    }

}