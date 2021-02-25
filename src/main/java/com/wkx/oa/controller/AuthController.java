package com.wkx.oa.controller;

import com.wkx.oa.dao.UserDao;
import com.wkx.oa.entity.User;
import com.wkx.oa.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author 拾光!
 * @Date 2021年02月24日 17:21:00
 * @Description 权限接口
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    // 为了减少篇幅就不写service接口了
    @Autowired
    private UserDao userDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/register")
    public R registerUser(@RequestBody Map<String,String> registerUser){
        User user = new User();
        user.setUsername(registerUser.get("username"));
        // 记得注册的时候把密码加密一下
        user.setPassword(bCryptPasswordEncoder.encode(registerUser.get("password")));
        user.setRole("ROLE_USER");
        int insert = userDao.insert(user);

        return R.ok();
    }
}
