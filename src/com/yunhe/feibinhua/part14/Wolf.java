package com.yunhe.feibinhua.part14;
//定义子类
public class Wolf extends Zoo {
    //定义子类构造器
    public Wolf(String Name,String Food) {
        super(Name,Food);
    }
    //重写父类方法
    @Override
    public void eat() {
        //因继承关系子类可直接访问父类方法
        System.out.println("狼" + getName() + "吃"+getFood());
    }
    
}