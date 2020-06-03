package com.yunhe.feibinhua.part02;
/**
 * 比较三个数字的大小
 */
public class NumberLarge{
    public static void main(String[] args) {
        int n1=2,n2=7,n3=5;
        int result1=(n1>n2)? (n1>n3)?n1:n3 : (n2>n3)?n2:n3;
        System.out.println("三个数字中最大为"+result1);
        int num1=3,num2=9,num3=6,num4=8;
        int result2=(num1>num2)? (num1>num3)?(num1>num4)?num1:num4:(num3>num4)?num3:num4 : (num2>num3)?(num2>num4)?num2:num4:(num3>num4)?num3:num4 ;
        System.out.println("四个数字中最大为"+result2);
        int x=128;
        System.out.println(1%2);
    }
}