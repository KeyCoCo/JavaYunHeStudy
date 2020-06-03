package com.yunhe.feibinhua.part07;

public class MyCar {
    public String car_Name;
    public String Model;
    public double price;
    public int Speed;
    public void car(int Speed){
        System.out.println("车名："+car_Name);
        System.out.println("型号："+Model);
        System.out.println("价格："+price+"万");
        //this表示在当前方法中使用类中的全局变量speed,将传入参数赋值给当前全局变量
        this.Speed=Speed;
        System.out.println("车速："+Speed+"km/h");
    }
}