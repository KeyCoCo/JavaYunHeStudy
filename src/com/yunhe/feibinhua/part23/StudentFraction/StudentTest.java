package com.yunhe.feibinhua.part23.StudentFraction;

/**
 * 成绩系统测试类
 * @author 费斌华
 * @date 2020.05.10
 * */
public class StudentTest {
    public static void main(String[] args) {
        StudentLibrary lib=new StudentLibrary();
        lib.Library();
        System.out.println("不及格学生："+lib.search(60));
    }
}
