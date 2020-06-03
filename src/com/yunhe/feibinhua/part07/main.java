package com.yunhe.feibinhua.part07;

public class main {
    public static void main(String[] args) {
        
        MyCar Message=new MyCar();//创建一个对象Message
        //指定类变量
        Message.car_Name="五菱宏光";
        Message.Model="2020款 1.2L S基本型封窗车国VI LSI";
        Message.price=4.46;
        //调用car方法
        Message.car(120);
        System.out.println(Message.Speed);

    }
}