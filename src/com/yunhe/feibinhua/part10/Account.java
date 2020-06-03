package com.yunhe.feibinhua.part10;

public class Account {
    private String Name;
    private String Phone_Number;
    private int Money; 
    public Account(String Name,String Phone_Number,int Money){
        this.Name=Name;
        this.Phone_Number=Phone_Number;
        this.Money=Money;
    }
    public void output_Message(){
        System.out.println("姓名："+Name+"\n"+"手机号："+Phone_Number+"\n"+"余额："+(double)(Money)+"元");
    }
    public void Store_Money(int Store_Mon){
        Money+=Store_Mon;
    }
    public void Take_Money(int Take_Mon){
        if(Money>Take_Mon){
            Money-=Take_Mon;
        }else{
            System.out.println("您的余额不足");
        }
        
    }


}