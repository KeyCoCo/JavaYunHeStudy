package com.yunhe.feibinhua.part14;
//定义父类
public class Zoo {
    private String Name;
    private String Food;
    //定义父类构造器
    public Zoo(String Name,String Food){
        this.Name=Name;
        this.Food=Food;
    }
    //返回得到姓名与食物
    protected String getName(){
        return Name;
    }
    protected String getFood(){
        return Food;
    }
    //父类方法
    public void eat(){};
}