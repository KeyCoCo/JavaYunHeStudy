package com.yunhe.feibinhua.part15;
//抽象类 abstract声明抽象类
public abstract class Geometry{
    private String Name;
    public Geometry(String Name){
        this.Name=Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
}