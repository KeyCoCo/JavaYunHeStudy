package com.yunhe.feibinhua.part20;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 登录类
 */
public class Sign_in {
    public void Sign(User_Message[] User_Factory){
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入账号");
        String User_Num=scan.nextLine();
        System.out.println("请输入密码");
        String User_Password=scan.nextLine();
        for(User_Message M:User_Factory){
            System.out.println(M.User_Num);
            if(M.User_Num.equals(User_Num)){
                if(M.Password.equals(User_Password)){
                    System.out.println("当年登录用户为："+M.User_Name);
                    Date D=new Date();
                    SimpleDateFormat Simple=new SimpleDateFormat("yyyy-MM-dd");
                    String Data=Simple.format(D);
                    System.out.println("登录时间为："+Data);
                }
            }
        }
    }
}