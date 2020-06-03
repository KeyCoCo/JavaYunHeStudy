package com.yunhe.feibinhua.part27;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件的基础操作
 */
public class operationFile {
    protected file file=new file("D://Java_code/Java_Learn/src/com/yunhe/FeiBinHua/part27/a/b/c/");
    private File f1=new File(file.getPath());

    /**
     * 删除指定目录下的所以文件即文件夹
     */
    protected void Delete(){
        if(f1.exists()){
            File[] f1list=f1.listFiles();
            for(File f:f1list){
                f.delete();
            }

        }
    }

    /**
     * 打印获取的文件大小
     */
    protected void Size(){
        f1.mkdirs();
        File[] f1list=f1.listFiles();
        if (f1.isFile()){
            System.out.println(f1.getName()+"文件大小为："+f1.length());
        }else if (f1.exists()){
            for(File f:f1list){
                if(f.isFile()){
                    System.out.println(f.getName()+"文件大小为："+f.length());
                }
            }
        }
    }

    /**
     * 创建文件
     * @throws IOException
     */
    protected void build() throws IOException {
        for(int i=1;i<=10;i++){
            String s="D://Java_code/Java_Learn/src/com/yunhe/FeiBinHua/part27/a/b/c/"+i+".txt";
            File f=new File(s);
            f.createNewFile();
            FileWriter fileWriter=new FileWriter(f,true);//append参数表示当所写入文件中有内容时进行追加无内容时从头开始写入
            fileWriter.write("jifejifsjljelsjfijeis");
            fileWriter.flush();
            fileWriter.close();
        }
    }
}
