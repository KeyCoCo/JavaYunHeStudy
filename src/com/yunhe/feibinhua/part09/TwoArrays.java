package com.yunhe.feibinhua.part09;

import java.util.Arrays;

/**
 * 二维数组
 */
public class TwoArrays {
    // 二维数组遍历
    public void ErgodicTwoArrays() {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 公司年销售额求和
    public void Sum() {
        int[][] MoneyNum = { { 22, 33, 44 }, { 55, 66, 77 }, { 88, 88, 66 }, { 22, 66, 33 } };
        int Result = 0;
        for (int i = 0; i < MoneyNum.length; i++) {
            for (int j = 0; j < MoneyNum[i].length; j++) {
                Result += MoneyNum[i][j];
            }
        }
        System.out.println("2020年某公司销售额为" + Result + "万");
    }

    // 打印杨辉三角形(行数可以键盘录入)
    public void Triangle(int x) {
        int[][] arr = new int[x][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || arr[i].length - 1 == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

    // 数组排序
    public void ArraySort(int[] arr) {
        int point;
        //循环次数
        for(int i=0;i<arr.length-1;i++){
            //每一项循环次数
            for(int j=0;j<arr.length-1-i;j++){
                //互换变量
                if(arr[j]>arr[j+1]){
                    point=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=point;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}