package com.yunhe.feibinhua.MyWebLog;


import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;

public class Log4jTest {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("Log4jTest");
        logger.debug("这是一个log");
        logger.info("这是一个info日志");
        logger.error("this is error log");
        Scanner scan = new Scanner(System.in);
        String t = scan.nextLine();
        System.out.println(t);
    }

}