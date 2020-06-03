package com.yunhe.feibinhua.part15;

public class Test {
    public static void main(String[] args) {
        Circle circle=new Circle("圆形",3);
        Rectangle rectangle=new Rectangle("矩形",5,7);
        System.out.println(circle.getName()+"的周长为"+ String.format("%.2f", circle.Perimeter()));
        System.out.println(circle.getName()+"的面积为"+String.format("%.2f", circle.Area()));
        System.out.println(rectangle.getName()+"的周长为"+rectangle.Perimeter());
        System.out.println(rectangle.getName()+"的面积为"+rectangle.Area());
    }
}