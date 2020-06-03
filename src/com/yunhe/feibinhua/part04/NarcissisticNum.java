package com.yunhe.feibinhua.part04;
/**
 * 求水仙花数
 */
public class NarcissisticNum {
    public static void main(String[] args) {
        int first,second,third;
        for(int i=100;i<1000;i++){
            first=i%10;
            second=i/10%10;
            third=i/100;
            if(Math.pow(first, 3)+Math.pow(second,3)+Math.pow(third,3)==i){
                System.out.println(i);
            }
        }
    }
}