package com.wkx.oa.exception;

/**
 * 系统的运行时异常
 */
public class BusExpection extends RuntimeException{
    public BusExpection(int code, String message){
        this.code=code;
        this.message=message;
    }
    public BusExpection(BizCodeEnume errorMsg){
       this(errorMsg.getCode(),errorMsg.getMsg());
    }
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{code:"+code+",message:"+message+"}";
    }
}
