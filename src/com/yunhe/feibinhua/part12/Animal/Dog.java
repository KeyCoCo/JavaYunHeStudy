package com.yunhe.feibinhua.part12.Animal;

public class Dog extends Animals {
    protected Dog(String name,int age, String color){
        super(name,age,color);
    }
    public void play(){
        System.out.println("狗玩球！！");
    }
}