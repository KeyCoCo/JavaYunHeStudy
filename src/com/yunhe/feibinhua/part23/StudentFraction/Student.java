package com.yunhe.feibinhua.part23.StudentFraction;
/**
 * 学生对象类
 * @author 费斌华
 * @date 2020.05.10
 * */
public class Student {
    private String Name;
    private int Grade;
    //构造学生方法
    public Student(String Name, int Grade) {
        this.Name = Name;
        this.Grade = Grade;
    }

    public int getGrade() {
        return Grade;
    }

    public String getName() {
        return Name;
    }

    public void setGrade(int grade) {
        this.Grade = grade;
    }

    public void setName(String name) {
        this.Name = name;
    }
}
