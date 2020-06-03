package com.yunhe.feibinhua.part23.GatherTest;


import java.util.ArrayList;

/**
 * list集合练习
 * List接口继承collection接口 Arraylist类实现List接口
 * list set 接口都继承collection接口
 */
public class Gather{
    private ArrayList<String> arrTest=new ArrayList<>();//()中可设置所见集合的大小
    //增
   public void Add(){
       arrTest.add("a");
       arrTest.add("b");
       arrTest.add("c");
       arrTest.add("d");
       check();
   }
   //删
   public void Remove(){
       arrTest.remove(0);//删除下标为index的元素
       arrTest.remove("b");//删除元素为O的元素
       check();
   }
   //改
   public void change(int index,String str){
       try {
           if(index<arrTest.size()){
               arrTest.add(index,str);//在下标为index的位置添加元素str
               arrTest.remove(index+1);//移除下标为index+1的元素
           }
       }catch (Exception e){
           System.out.println("下标超出范围"+arrTest.size());
       }
       check();
   }
   //查
    public void check(){
       for(String str:arrTest){
           System.out.println("下标："+arrTest.indexOf(str)+"的元素是"+str);
       }
    }


}
