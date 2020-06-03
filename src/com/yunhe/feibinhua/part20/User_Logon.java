package com.yunhe.feibinhua.part20;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 注册类
 */
public class User_Logon {
    protected User_Message[] User_Factory=new User_Message[0];
    
    public void Logon(){
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入姓名");
        String User_Name=scan.nextLine();
        System.out.println("请输入账号");
        String User_Number=scan.nextLine();
        System.out.println("请输入密码");
        String User_Password=scan.nextLine();
        User_Message message=new User_Message(User_Number, User_Password,User_Name);
        User_Factory=Arrays.copyOf(User_Factory, User_Factory.length+1);//数组扩容
        User_Factory[User_Factory.length-1]=message;
        System.out.println(Arrays.toString(this.User_Factory));
    }
    /**
     * @return 返回用户列表
     */
    public User_Message[] getLibray(){
        return this.User_Factory;
    }
    
        
    
    
}