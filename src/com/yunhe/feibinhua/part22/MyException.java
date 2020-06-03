package com.yunhe.feibinhua.part22;
/**
 * 自定义普通异常
 */
public class MyException extends Exception{
    public MyException(String str){
        super(str);
    } 
    public MyException(){
        super("这是一个异常！！");
    }
}
