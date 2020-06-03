package com.yunhe.feibinhua.part25;

/**
 * Collections类打乱集合
 */

import java.util.ArrayList;
import java.util.Collections;

public class Arrayslisttest {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=45;i++){
            arr.add(i);
        }
        Collections.shuffle(arr);//Collections随机打乱集合
        System.out.println(arr);
    }


}
