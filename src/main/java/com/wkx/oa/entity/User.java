package com.wkx.oa.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author 拾光!
 * @Date 2021年02月24日 16:08:00
 * @Description 用户实体类
 */
@Data
@TableName("oa_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId
    private Integer id;

    private String username;

    private String password;

    private String role;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    @TableLogic
    private Integer IsValid;

}
