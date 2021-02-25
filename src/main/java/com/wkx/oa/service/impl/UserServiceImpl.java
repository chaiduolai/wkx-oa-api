//package com.wkx.oa.service.impl;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.wkx.oa.dao.UserDao;
//import com.wkx.oa.entity.JwtUser;
//import com.wkx.oa.entity.User;
//import com.wkx.oa.service.UserService;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
///**
// * @Author 拾光!
// * @Date 2021年02月24日 16:58:00
// */
//@Service
//public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService , UserDetailsService {
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        User user = baseMapper.selectOne(new QueryWrapper<User>().eq("username", s));
//        return new JwtUser(user);
//    }
//}
