package com.yunhe.feibinhua.part32;
import java.io.*;

/**
 * 多线程文件的复制
 */
public class MultithreadingFile extends Thread {
    private String targetfile;
    //初始化源文件夹
    private final File F=new File(".\\src\\com\\yunhe\\FeiBinHua\\part32\\五行天[bookben.net].txt");
    protected File [] files=F.listFiles();
    /**
     * @param targetfile 目标文件夹
     */
    public MultithreadingFile(String targetfile){
        super();
        this.targetfile=targetfile;
    }
    /**
     *重写Thread父类的run方法
     */
    @Override
    public void run(){
        String str="";
        try {
            for (File file : files) {
                File TargetFile = new File(targetfile +file.getName());
                if (!TargetFile.exists()) {
                    TargetFile.getParentFile().mkdirs();
                    TargetFile.createNewFile();
                }
                BufferedReader br = new BufferedReader(new FileReader(file));
                BufferedWriter wr = new BufferedWriter(new FileWriter(TargetFile, true));
                while ((str = br.readLine()) != null) {
                    wr.write(str);
                    wr.newLine();
                }
                wr.flush();
                System.out.println(file.getName()+"写入完毕");
                br.close();
                wr.close();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
