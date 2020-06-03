package com.yunhe.feibinhua.part16.local_Inner;

public class Test {
    public static void main(String[] args) {
        Graphical Grap=new Graphical();//实例化外部类
        Graphical.Circle Cir=Grap.new Circle(3);//实例化内部类对象
        Graphical.Rectangle Rect=Grap.new Rectangle(3,4);//实例化内部类对象
        System.out.println("圆的周长为："+String.format("%.2f", Cir.Perimeter())+"\n"+"圆的面积为："+String.format("%.2f", Cir.Area()));
        System.out.println("矩形的周长为："+Rect.Perimeter()+"\n"+"矩形的面积为："+Rect.Area());
        
    }
}