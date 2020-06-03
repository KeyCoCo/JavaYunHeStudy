package com.yunhe.feibinhua.part21;

import java.util.Calendar;

/**
 * 计算指定年的天数
 * 计算指定月的天数
 * @author 费斌华
 * @version 1.0
 */
public class Days {
    /**
     * 
     * @param year
     * @return 指定年的天数
     */
    public int DayOfYear(int year){
        Calendar c=Calendar.getInstance();//创建一个日历
        c.set(year+1, 0, 1);
        c.add(c.DAY_OF_MONTH,-1);
        int result=c.get(Calendar.DAY_OF_YEAR);
        return result;    
    }
    /**
     * 
     * @param year
     * @param mouth
     * @return 指定月的天数
     */
    public int DayOfMouth(int year,int mouth){
        Calendar c=Calendar.getInstance();
        c.set(year,mouth,1);//月份从0开始所以不需要加1
        c.add(c.DAY_OF_MONTH,-1);
        int result=c.get(Calendar.DAY_OF_MONTH);
        return result;

    }
}