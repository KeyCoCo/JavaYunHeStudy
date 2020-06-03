package com.yunhe.feibinhua.part20;

/**
 * 用户信息类
 */
public class User_Message {
    protected String User_Name;
	protected String User_Num;
    protected String Password;
    public User_Message(String User_Num,String Password,String User_Name){
        this.User_Num=User_Num;
        this.Password=Password;
        this.User_Name=User_Name;
    }
}