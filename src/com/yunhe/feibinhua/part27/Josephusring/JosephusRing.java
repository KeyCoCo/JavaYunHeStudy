package com.yunhe.feibinhua.part27.Josephusring;

import java.util.ArrayList;

/**
 * 约瑟夫环
 */
public class JosephusRing {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList();
        for(int i=1;i<=51;i++){
            arr.add(i);
        }
        JosephusRing j=new JosephusRing();
        System.out.println(arr);
        j.kill(arr);
        System.out.println(arr);
    }
    private void  kill(ArrayList<Integer> num){
        int k=0;
        if(num.size()>2){
            num.remove(2+k);
            k+=2;
            JosephusRing j=new JosephusRing();
            j.kill(num);
        }


    }
}
