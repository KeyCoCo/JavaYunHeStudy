package com.yunhe.feibinhua.part12.Animal;

public class Animals {
    private String name;
    private int age;
    private String color;
    public Animals(String name,int age, String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public String eat(String food){
        return name+"吃"+food;
    }
}