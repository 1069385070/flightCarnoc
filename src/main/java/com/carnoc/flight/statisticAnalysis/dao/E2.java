package com.carnoc.flight.statisticAnalysis.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E2 {
    public static void main(String[] args) {

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间：" + sdf.format(d));
    }
}
