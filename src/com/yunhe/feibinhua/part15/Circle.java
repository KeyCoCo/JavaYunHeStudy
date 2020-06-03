package com.yunhe.feibinhua.part15;
//圆形子类 extends 继承父类 Geometry ======= implements 调用接口 Calculation
public class Circle extends Geometry implements Calculation{
    private int R;
    private final float PI=3.14f;
    public Circle(String Name,int R){
        super(Name);
        this.R=R;
    }
    //实现接口方法Perimeter与Area
    public double Perimeter(){
        return 2*PI*R;
    }
    public double Area(){
        return Math.pow(PI*R, 2);
    }
}