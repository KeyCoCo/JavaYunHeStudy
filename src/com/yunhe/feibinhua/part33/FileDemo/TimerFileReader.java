package com.yunhe.feibinhua.part33.FileDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 计时器文件读取写入
 */
public class TimerFileReader extends Thread{
    protected File OldFile=new File("./src/com/yunhe/FeiBinHua/part33/FileDemo/OldFile.txt");
    protected File NewFile=new File("./src/com/yunhe/FeiBinHua/part33/FileDemo/NewFile.txt");
    /**
     * 重写Thread父类的run方法
     */
    @Override
    public void run(){
        String brStr="";
        try {
            BufferedReader br=new BufferedReader(new FileReader(OldFile));
            BufferedWriter bw=new BufferedWriter(new FileWriter(NewFile,true));
            while (br.readLine()!=null){
                for(int i=0;i<10;i++){
                    brStr+=br.readLine()+"\n";
                }
                bw.write(brStr);
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("写入成功");
        }
    }

    /**
     * 计时器写入文件
     */
    public void TimerWriter(){
        TimerFileReader Tfr1=new TimerFileReader();
        TimerFileReader Tfr2=new TimerFileReader();
        ArrayList<TimerFileReader> timerfilelist=new ArrayList<>();
        timerfilelist.add(Tfr1);
        timerfilelist.add(Tfr2);
        Timer t=new Timer();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                for(TimerFileReader file:timerfilelist){
                    file.run();
                    System.out.println(file.getName());
                    file.yield();
                }
            }
        };
        t.schedule(task,3000,2000);
    }
}
