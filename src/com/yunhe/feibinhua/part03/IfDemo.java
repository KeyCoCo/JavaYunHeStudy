package com.yunhe.feibinhua.part03;
/**
 * 判断Y值的0和1
 */
public class IfDemo {
    public static void main(String[] args) {
        int x=0,y;
        if(x==1){
            y=1;
        }else if(x>1){
            System.out.println("x大于1判断错误");
        }else if(x<0){
            System.out.println("x小于1判断错误");
        }
        else{
            y=0;
        }

    }
}