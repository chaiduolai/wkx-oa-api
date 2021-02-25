package com.wkx.oa.exception;

import com.wkx.oa.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 拾光!
 * @Date 2021年02月24日 11:01:00
 * @Description 集中处理所有异常
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.wkx.oa.controller")
public class OaApiExceptionControllerAdvice {
    /**
     * 处理系统主动抛出的异常
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = BusExpection.class)
    public R busExpectionHandler(BusExpection e){
        log.info("busExpectionHandler:{}",e.toString());
        return R.error(e.getCode(),e.getMessage());
    }
    @ExceptionHandler(value = NullPointerException.class)
    public R handleException(NullPointerException e){

        log.error("空指针异常：",e);
        return R.error(BizCodeEnume.NULL_POINTER_EXCEPTIO.getCode(),BizCodeEnume.NULL_POINTER_EXCEPTIO.getMsg());
    }
    /**
     * 处理数据校验异常
     * @param e
     * @return
     */
    @ExceptionHandler(value= MethodArgumentNotValidException.class)
    public R handleVaildException(MethodArgumentNotValidException e){
        log.error("数据校验出现问题{}，异常类型：{}",e.getMessage(),e.getClass());
        BindingResult bindingResult = e.getBindingResult();

        Map<String,String> errorMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError)->{
            errorMap.put(fieldError.getField(),fieldError.getDefaultMessage());
        });
        return R.error(BizCodeEnume.VAILD_EXCEPTION.getCode(),BizCodeEnume.VAILD_EXCEPTION.getMsg()).put("data",errorMap);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable){

        log.error("错误：",throwable);
        return R.error(BizCodeEnume.UNKNOW_EXCEPTION.getCode(),BizCodeEnume.UNKNOW_EXCEPTION.getMsg());
    }
}

