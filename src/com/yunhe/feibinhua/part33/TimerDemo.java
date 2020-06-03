package com.yunhe.feibinhua.part33;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author KeyHack
 */
public class TimerDemo {
    public void DelayTime(){
        Timer t=new Timer();
        TimerTask task=new TimerTask() {
            @Override //重写run方法创建一个定时任务
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.printf("%1$tY年%1$tm月%1$td日  ; %1$tH时%1$tM分%1$tS秒%n", new Date());//%t后Y代表年m代表月d代表日H代表小时M代表分S代表秒
                }
            }
        };
        t.schedule(task,2000);
        //schedule启动定时任务task，2000毫秒后开始执行
    }
    public void PeriodTime(){
        Timer t=new Timer();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.printf("%1$tY年%1$tm月%1$td日  ; %1$tH时%1$tM分%1$tS秒%n", new Date());//%t后Y代表年m代表月d代表日H代表小时M代表分S代表秒
                }
            }
        };
        t.schedule(task,2000,1000);
        //schedule启动定时任务task，2000毫秒后开始执行之后每1000毫秒执行一次
    }
    public void DateTime(){
        Timer t=new Timer();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.printf("%1$tY年%1$tm月%1$td日  ; %1$tH时%1$tM分%1$tS秒%n", new Date());//%t后Y代表年m代表月d代表日H代表小时M代表分S代表秒
                }
            }
        };
        t.schedule(task,new Date(),1000);
        //schedule启动定时任务task，Date时间后开始执行之后每1000毫秒执行一次
    }
}
