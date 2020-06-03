package com.yunhe.feibinhua.part18;

import java.lang.String;
import java.util.Scanner;

public class StringDemo {
    //遍历字符串
    public void Ergodic(){
        String txt="abc";
    for(int i=0;i<txt.length();i++){
        System.out.println(txt.charAt(i));
    }
    }
    //将int类型数组转化为字符串
    public void Splicing(int [] arr){
        String Result="";
        for(int i=0;i<arr.length;i++){
            Result+=arr[i];
        }
        System.out.println(Result);
    }
    //首字母大写其余小写
    public void Transformation(String txt){
        String first=txt.substring(0,1);
        String after=txt.substring(1);
        System.out.println(first.toUpperCase()+after.toLowerCase());
    }
    //搜索字符串在字典中出现的次数
    public void Serch(String txt){
        int Result=0;
        int indexupper,indexdown;
        String TxT="abciueabc,jiabcj,eifabc";
        for(int i=0;i<TxT.length()-2;i++){
            if(txt.equals(TxT.substring(i, i+3))){
                Result++;
            }
        }
        System.out.println("字符串"+txt+"在字典中出现了"+Result+"次");
    }
    //模拟登录
    public void Login(){
        String UserName="admin";
        String PassWord="admin";
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入用户名");
        String User=scan.nextLine();
        System.out.println("请输入密码");
        String password=scan.nextLine();
        if(User.equals(UserName)&&password.equals(PassWord)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败，请检查用户名是否错误！！");
        }

    }

    
}