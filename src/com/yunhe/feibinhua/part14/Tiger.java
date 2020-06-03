package com.yunhe.feibinhua.part14;
//定义子类
class Tiger extends Zoo{
    //定义子类构造器
    public Tiger(String Name,String Food){
        super(Name,Food);
    }
    //重写父类方法
    @Override
    public void eat(){
        //因继承关系子类可直接访问父类方法
        System.out.println("老虎"+getName()+"吃"+getFood());
    }

}