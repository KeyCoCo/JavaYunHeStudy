package com.yunhe.feibinhua.part29.FileDivision;

import java.io.*;
import java.util.regex.Pattern;

/**
 * 小说分割
 */
public class fileDivision {
    /**
     *
     * @param fileURL 小说原文件路径
     * @throws Exception
     */
    public void fileDVS(String fileURL) throws Exception {
        File f=new File(fileURL);
        File Title=new File("D:\\Java_code\\Java_Learn\\src\\com\\yunhe\\FeiBinHua\\part29\\小说\\"+f.getName());
        if(!Title.exists()){
            Title.mkdirs();
        }
//        正则表达式
        String pattern = "^\\S*第.*章.*$";
        BufferedReader br = new BufferedReader(new FileReader(f));
        String str="";
        String fileurl="D:\\Java_code\\Java_Learn\\src\\com\\yunhe\\FeiBinHua\\part29\\小说\\五行天[bookben.net].txt\\简介.txt";
        //创建txt文件并写入每章内容
        while ((str=br.readLine())!=null){
            //获取章节标题
            if(Pattern.matches(pattern,str)&&str.length()<=15){
                File title=new File(Title.getPath()+"\\"+str+".txt");
                fileurl=Title.getPath()+"\\"+str+".txt";
                System.out.println(fileurl);
                System.out.println(title.createNewFile());
            }
            else{
                File fi=new File(fileurl);
                BufferedWriter bw=new BufferedWriter(new FileWriter(fi,true));
                bw.write(str);
                bw.newLine();
                System.out.println("写入成功");
                bw.flush();
                bw.close();
            }
        }
        br.close();
    }
}
