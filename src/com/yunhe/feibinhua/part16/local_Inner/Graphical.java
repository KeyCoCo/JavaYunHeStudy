package com.yunhe.feibinhua.part16.local_Inner;
//局部内部类
public class Graphical {
    //调用接口重写接口方法
        class Circle implements Calculation{
            private float PI=3.14f;
            private float R;
            public Circle(float R){
                this.R=R;
            }
            @Override
            public double Perimeter(){
                return 2*PI*R;
            }
            @Override
            public double Area(){
                return Math.pow(PI*R, 2);
            }
        }
        class Rectangle implements Calculation{
            private float Long;
            private float Width;
            public Rectangle(float Long,float Width){
                this.Long=Long;
                this.Width=Width;
            }
            @Override
            public double Perimeter(){
                return (Long+Width)*2;
            }
            @Override
            public double Area(){
                return Long*Width;
            }
        }
}