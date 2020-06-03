package com.yunhe.feibinhua.part17;

import java.util.Random;
/**
 * 
 * @since 2020/04/28
 * @author 费斌华
 * @version 1.0
 */
public class Dichroic_sphere {
    public int[] rand_Num() {
        Random r= new Random();
        int[] result = new int[7];
        int index=0;
        boolean Is=true;
        while(true){
            int rand_N=r.nextInt(12)+1;
            for(int i=0;i<index;i++){
                if(result[i]==rand_N){
                    Is=false;
                    continue;
                }
            }
            if(Is){
                result[index]=rand_N;
                index++;
            }
            Is=true;
            if(index>=5){
                int rand_first=r.nextInt(6)+1;
                result[result.length-2]=rand_first;
                while(true){
                    int rand_second=r.nextInt(6)+1;
                    if(rand_first!=rand_second){
                        result[result.length-1]=rand_second;
                        break;
                    }else{
                        continue;
                    }
                }
                break;
            }
        }
        return result;
    }
}
