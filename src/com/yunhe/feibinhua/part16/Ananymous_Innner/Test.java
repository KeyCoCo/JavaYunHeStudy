package com.yunhe.feibinhua.part16.Ananymous_Innner;

//匿名内部类
public class Test {
    

    public static void main(String[] args) {
        //匿名类实现接口Calculation
        Calculation Circle=new Calculation(){
            private float PI=3.14f;
            private float R=4;
            @Override
            public double Perimeter() {
                // TODO Auto-generated method stub
                return 2*PI*R;
            }
        
            @Override
            public double Area() {
                // TODO Auto-generated method stub
                return Math.pow(PI*R, 2);
            }
        };
        //匿名类实现接口Calculation
        Calculation Rectangle=new Calculation(){
            private float Long=6;
            private float Width=7;
            @Override
            public double Perimeter() {
                // TODO Auto-generated method stub
                return (Long+Width)*2;
            }
        
            @Override
            public double Area() {
                // TODO Auto-generated method stub
                return Long*Width;
            }
        };
        System.out.println("圆的周长为："+String.format("%.2f", Circle.Perimeter())+"\n"+"圆的面积为："+String.format("%.2f", Circle.Area()));
        System.out.println("矩形的周长为："+Rectangle.Perimeter()+"\n"+"矩形的面积为："+Rectangle.Area());
        
    }
}