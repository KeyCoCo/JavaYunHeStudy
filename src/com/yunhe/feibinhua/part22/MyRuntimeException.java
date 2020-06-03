package com.yunhe.feibinhua.part22;
/**
 * 自定义运行时异常
 */
public class MyRuntimeException extends RuntimeException{
    public MyRuntimeException(){
        super("这是一个异常");
    }
}