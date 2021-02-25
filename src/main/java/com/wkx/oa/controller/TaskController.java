package com.wkx.oa.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 拾光!
 * @Date 2021年02月24日 17:15:00
 * @Description 用户权限的验证
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {

    @GetMapping
    public String listTasks(){
        return "任务列表";
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public String newTasks(){
        return "创建了一个新的任务";
    }

    @PutMapping("/{taskId}")
    public String updateTasks(@PathVariable("taskId")Integer id){
        return "更新了一下id为:"+id+"的任务";
    }

    @DeleteMapping("/{taskId}")
    public String deleteTasks(@PathVariable("taskId")Integer id){
        return "删除了id为:"+id+"的任务";
    }
}
