package com.yunhe.feibinhua.part24.student;

import java.util.Arrays;
/**
 * 学生列表创建
 * */
public class StudentLibrary {
    protected void Library(){
        String result="";
        Student s1=new Student("小明",23,34,45);
        Student s2=new Student("小花",29,34,47);
        Student s3=new Student("小强",23,33,42);
        Student s4=new Student("李雷",23,40,40);
        Student[] Students={s1,s2,s3,s4};
        Arrays.sort(Students,new StudentComparator());
        System.out.println(Arrays.toString(Students));
    }
}
