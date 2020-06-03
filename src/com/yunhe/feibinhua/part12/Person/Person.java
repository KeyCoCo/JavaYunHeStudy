package com.yunhe.feibinhua.part12.Person;



public class Person {
    private String Name;
    private int age;
    private boolean gender;
    private String patrner;
    public Person(String Name,int age,boolean gender,String patrner){
        this.Name=Name;
        this.age=age;
        this.gender=gender;
        this.patrner=patrner;
    }
    public String getter(){
        String Is;
        if(gender){
            Is="已婚";
        }else{
            Is="未婚";
        }
        return "姓名："+Name+"\n"+"年龄："+age+"\n"+"情况："+Is+"\n"+"配偶："+patrner;
    }
    public boolean IsMarry(){
        if(gender){
            return false;
        }
        return true;
    }
}
