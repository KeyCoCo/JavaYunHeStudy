package com.yunhe.feibinhua.part19.Statistics;
import java.lang.String;
/**
 * 统计字符串中的数字，字母，其他字符各有多少个
 */
public class Char_Statistics {
    public void Char_Statistic(String TxT){
        
        int Charact=0,Number=0,Other=0;
        char[] charAry = TxT.toCharArray();//将指定的字符串变为字符类型的数组
        for(char c:charAry){
            if(Character.isDigit(c)){//统计数字
                Number++;
            }else if(Character.isLetter(c)){//统计字母
                Charact++;
            }else{//统计其他字符
                Other++;
            }
        }
        System.out.println("这个字符串中有"+Charact+"个字母，"+Number+"个数字"+Other+"个其他符号");            
    }
}