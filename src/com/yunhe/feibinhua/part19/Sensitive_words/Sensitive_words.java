package com.yunhe.feibinhua.part19.Sensitive_words;

import java.lang.String;
public class Sensitive_words {
    public void Sensitive(String stry){
        String [] strarr={"色情","恐怖","枪","爆炸"};
        for(String str:strarr){
            if(stry.contains(str)){//String类的contains方法判断指定字符串是否出现在给定字符串中
                System.out.println("包含敏感词不能输出");
                break;
            }
            else{
                System.out.println(stry);
                break;
            }
        }
    }
    public void Char_Cover(String stry){
        String [] strarr={"色情","恐怖","枪","爆炸","炸弹"};
        StringBuffer Buffer=new StringBuffer(stry);//定义一个可变的String缓冲类
        for(String str:strarr){
            if(stry.contains(str)){
                char [] chararr=str.toCharArray();
                for(char c:chararr){
                    int ind=stry.indexOf(c);//indexOf获取指定字符在字符串中的下标
                    Buffer.replace(ind, ind+1, "*");//替换敏感字符为*
                }
            }
                
            
        }
        System.out.println(Buffer);
    }
}