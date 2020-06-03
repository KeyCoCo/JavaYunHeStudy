package com.yunhe.feibinhua.part15;

//矩形子类 extends 继承父类 Geometry ======= implements 调用接口 Calculation
public class Rectangle extends Geometry implements Calculation{
    private int Long;
    private int Width;
    public Rectangle(String Name,int Long,int Width){
        super(Name);
        this.Long=Long;
        this.Width=Width;
    }
    //实现接口方法Perimeter与Area
    public double Perimeter(){
        return (Long+Width)*2;
    }
    public double Area(){
        return Long*Width;
    }
}