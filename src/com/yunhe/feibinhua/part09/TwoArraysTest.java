package com.yunhe.feibinhua.part09;

import java.util.Scanner;

public class TwoArraysTest {
    public static void main(String[] args) {

        TwoArrays Arrays=new TwoArrays();

        Arrays.ErgodicTwoArrays();

        Arrays.Sum();

        System.out.println("请输入三角形的行数");
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        scan.close();
        Arrays.Triangle(x);
        
        int [] arr1={9,7,8,5,4,6,3};
        Arrays.ArraySort(arr1);
    }
}