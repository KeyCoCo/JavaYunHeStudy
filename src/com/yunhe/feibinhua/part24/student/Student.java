package com.yunhe.feibinhua.part24.student;
/**
 * 学生类
 * */
public class Student {
    private String Name;
    private int Chinese;
    private int Mathematics;
    private int English;
    public Student(String name,int chinese,int mathematics,int english){
        this.Name=name;
        this.Chinese=chinese;
        this.Mathematics=mathematics;
        this.English=english;
    }

    public String getName() {
        return Name;
    }

    public int getChinese() {
        return Chinese;
    }

    public int getMathematics() {
        return Mathematics;
    }

    public int getEnglish() {
        return English;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setChinese(int chinese) {
        this.Chinese = chinese;
    }

    public void setMathematics(int mathematics) {
        this.Mathematics = mathematics;
    }

    public void setEnglish(int english) {
        this.English = english;
    }
    //重写toString方法
    @Override
    public String toString(){
        return "姓名："+this.Name+"数学："+this.Mathematics+"语文："+this.Chinese+"英语："+this.English+"\n";
    }

}
