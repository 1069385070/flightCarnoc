package com.carnoc.flight.flightInformation.timedTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: lpf
 * @Date 2018/11/1/001  10:33
 **/

@Component
public class task {


    @Scheduled(cron="0 0 1 * * ?")
    public void prin(){

        System.out.println("打印:"+new Date());
    }
}
