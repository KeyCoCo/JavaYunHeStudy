package com.yunhe.feibinhua.part23.StudentFraction;
/**
 * 学生列表类
 * @author 费斌华
 * @date 2020.05.10
 * */
import java.util.ArrayList;

public class StudentLibrary {
    protected ArrayList<Student> Lib=new ArrayList<>();
    //学生列表创建
    public void Library(){
        Student st1=new Student("张三",21);
        Student st2=new Student("李四",40);
        Student st3=new Student("李雷",70);
        Student st4=new Student("韩梅梅",55);
        Student st5=new Student("韩晓凌",20);
        Student st6=new Student("韩晓",20);
        Student st7=new Student("韩晓雪",55);
        Student st8=new Student("韩晓可",40);
        Lib.add(st1);
        Lib.add(st2);
        Lib.add(st3);
        Lib.add(st4);
        Lib.add(st5);
        Lib.add(st6);
        Lib.add(st7);
        Lib.add(st8);
        for(Student s:Lib){
            s.setGrade(s.getGrade()+5);
        }

    }
    /**
     *
     * @return 不及格学生字符串
     * @param num分数以下
     * */
    public String search(int Num){
        String Name="";
                for(Student s:Lib){
                    if(s.getGrade()<Num){
                        Name+=s.getName()+" ";
                    }
                }
        return Name;
    }
}
