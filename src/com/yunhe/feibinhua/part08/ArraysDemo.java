package com.yunhe.feibinhua.part08;

public class ArraysDemo {
    //数组遍历(依次输出数组中的每一个元素)
    public void inputAll(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // 数组获取最值(获取数组中的最大值最小值)
    public String MaxorMin(final int[] arr) {
        int Max = 0;
        int Min = 0;
        final int Result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Result > arr[i]) {
                Max = Result;
                Min = arr[i];
            } else {
                Max = arr[i];
                Min = Result;
            }
        }
        return "最大值为：" + Max + "最小值为：" + Min;
    }

    // 数组元素逆序(就是把元素对调)
    public int[] ArraysBack(int[] arr) {
        int key;
        for(int i=0;i<arr.length/2;i++){
            key=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=key;
        }
        return arr;
    }
    //数组查表法(根据键盘录入索引,查找对应星期)
    public String ArraysWeek(int i){
        String [] week={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        if(i>week.length||i<1){
            return "找不到你的星期请重新输入";
        }
        return week[i-1];
    }
    //数组元素查找(查找指定元素第一次在数组中出现的索引)
    public int ArraysChoose(int [] arr,int value){
        int index=arr.length;
        for(int i=0;i<arr.length;i++){
            if(value==arr[i]){
                index=i;
            }
        }
        return index;
    }
}