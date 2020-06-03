package com.yunhe.feibinhua.part08;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTest {
    public static int [] arr={1,2,3,4,5};
    public static int [] arr1={34,56,33,22,77};
    public static int [] arr2={33,44,55,66,77};
    public static void main(String[] args) {
        //新建ArraysDemo对象
        ArraysDemo array=new ArraysDemo();
        //遍历打印数组
        array.inputAll(arr);
        //找出数组中最大值最小值
        System.out.println(array.MaxorMin(arr1));
        //数组倒序Arrays.toString方法打印输出数组
        System.out.println(Arrays.toString(array.ArraysBack(arr)));
        //填写星期数打印星期
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入星期数");
        int k=scan.nextInt();       
        System.out.println(array.ArraysWeek(k));
        //输入一个数在一组数组中找到它的下标
        int v=scan.nextInt();
        scan.close();
        int index=array.ArraysChoose(arr2,v);
        if(index!=arr.length){
            System.out.println(v+"的下标为"+index);
        }else{
            System.out.println(v+"的下标没有找到请重新输入！");
        }
        

    }
}