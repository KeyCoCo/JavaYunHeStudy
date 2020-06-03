package com.yunhe.feibinhua.part12.Animal;

public class Cat extends Animals{
    protected Cat(String name,int age,String color){
        super(name,age,color);
    }
    public void play(){
        System.out.println("猫玩毛线！！");
    }
}