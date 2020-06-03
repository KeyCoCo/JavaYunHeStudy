package com.yunhe.feibinhua.part24.student;

import java.util.Comparator;
/**
 * 比较器
 * */
public class StudentComparator implements Comparator<Student> {
  	@Override
  	public int compare(Student o1,Student o2) {
        		if(o1.getMathematics() < o2.getMathematics()){
             			return 1;
             		}else if(o1.getMathematics() > o2.getMathematics()){
             			return -1;
             		}else{
             			if(o1.getChinese() < o2.getChinese()){
             			    return 1;
                        }
             			else if(o1.getChinese() > o2.getChinese()){
             			    return -1;
                        }
             			else{
             			    return 0;
                        }
             		}
         	}
  }
