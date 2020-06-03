package com.yunhe.feibinhua.part14;
//多态应用
public class TestZoo {
    public static void main(String[] args) {
        //新建一个子类对象把它赋值给父类
        Master m=new Master();
        Zoo wolf=new Wolf("灰太狼","肉");
        Zoo sheep=new Sheep("喜羊羊","青草");
        Zoo tiger=new Tiger("泰哥","牛肉");
        //因继承关系子类
        m.feed(wolf);
        m.feed(sheep);
        m.feed(tiger);
    }
}