package com.yunhe.feibinhua.part28;

import java.io.*;
import java.util.Scanner;

/**
 * 文件的复制操作
 * 字节流
 */
public class IO {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        FileStr file=new FileStr();
        System.out.println("请输入源文件夹位置：");
        String input=scan.nextLine();
        file.setInputfile(input);
        System.out.println("请输入指定文件夹位置：");
        String output=scan.nextLine();
        file.setOutputfile(output);
        File sourcefile=new File(file.getInputfile());
        //创建指定文件
        File[] SourceFile=sourcefile.listFiles();
        for(File Source:SourceFile){
            File appointfile=new File(file.getOutputfile()+Source.getName());
            if(!appointfile.exists()){
            appointfile.getParentFile().mkdirs();
            appointfile.createNewFile();
            }
            //创建字节流
            FileInputStream fis=new FileInputStream(Source);
            FileOutputStream fos=new FileOutputStream(appointfile);
            BufferedInputStream bis=new BufferedInputStream(fis);//高效输入字节流
            BufferedOutputStream bos=new BufferedOutputStream(fos);//高效输出字节流
            byte [] b=new byte[1024];//创建每次读写大小
            int len=0;
            while ((len=bis.read(b))!=-1){
                bos.write(b,0,len);//b表示读取的字节数组 0表示从字节数组的第0个下标开始写入 len表示读取的字节数组的长度
            }
            //在输出后先刷新后关闭
            bos.flush();
            fos.flush();
            bis.close();
            bos.close();
            fis.close();
            fos.close();
            Source.delete();
        }

    }
}
