package com.yunhe.feibinhua.part29;

import java.io.*;

/**
 * 判断两个文本是否相等
 */
public class fileEquals {
    /**
     *
     * @param fa 文本a的路径
     * @param fb 文本b的路径
     * @return 提示信息
     * @throws IOException
     */
    public String FEquals(String fa,String fb) throws IOException {
        String result="相等";
        String str1=null;
        String str2=null;
        File f1=new File(fa);
        File f2=new File(fb);
        FileReader fr1=new FileReader(f1);
        FileReader fr2=new FileReader(f2);
        //定义两个不同的字符列表分别获取两个文本的字符数据
        char [] c1=new char[1];
        char [] c2=new char[1];
        String str="";
        int len=0;
        if(f1.length()==f2.length()){
            while ((len=fr1.read(c1))!= -1&&(len=fr2.read(c2))!= -1){
                str1=new String(c1,0,len);
                str2=new String(c2,0,len);
                if(!str1.equals(str2)){
                    System.out.println(str1+"\t"+str2);
                    result="不等";
                    break;
                }
            }
        }
        else{
            result="不等";
        }
        fr1.close();
        fr2.close();
        return result;
    }
}
