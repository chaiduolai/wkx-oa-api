package com.wkx.oa.controller;

import com.wkx.oa.exception.BizCodeEnume;
import com.wkx.oa.exception.BusExpection;
import com.wkx.oa.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 拾光!
 * @Date 2021年02月24日 11:03:00
 * @Description 首页接口
 */
@RestController
@RequestMapping("/index")
public class IndexController {
    @GetMapping("/test")
    public R test(){
        System.out.print("测试数据");
        int a=10;
        if (a>5){
            throw new BusExpection(BizCodeEnume.SMS_CODE_EXCEPTION);
        }
        return R.error(BizCodeEnume.PRODUCT_UP_EXCEPtiON.getCode(),BizCodeEnume.PRODUCT_UP_EXCEPtiON.getMsg());
    }
}
