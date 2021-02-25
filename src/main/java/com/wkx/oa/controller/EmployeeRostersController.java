package com.wkx.oa.controller;

import java.util.Arrays;
import java.util.Map;

import com.wkx.oa.utils.PageUtils;
import com.wkx.oa.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wkx.oa.entity.EmployeeRostersEntity;
import com.wkx.oa.service.EmployeeRostersService;




/**
 * 员工花名册表
 *
 * @author chaiduolai
 * @email cduolai@163.com
 * @date 2021-02-24 14:38:55
 */
@RestController
@RequestMapping("/oa/employeerosters")
public class EmployeeRostersController {
    @Autowired
    private EmployeeRostersService employeeRostersService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = employeeRostersService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @GetMapping("/info/{ids}")
    public R info(@PathVariable("ids") String ids){
		EmployeeRostersEntity employeeRosters = employeeRostersService.getById(ids);

        return R.ok().put("employeeRosters", employeeRosters);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody EmployeeRostersEntity employeeRosters){
		employeeRostersService.save(employeeRosters);

        return R.ok();
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R update(@RequestBody EmployeeRostersEntity employeeRosters){
		employeeRostersService.updateById(employeeRosters);

        return R.ok();
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete")
    public R delete(@RequestBody String[] idss){
		employeeRostersService.removeByIds(Arrays.asList(idss));

        return R.ok();
    }

}
