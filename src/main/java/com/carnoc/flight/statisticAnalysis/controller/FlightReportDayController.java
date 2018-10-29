package com.carnoc.flight.statisticAnalysis.controller;

import com.carnoc.flight.statisticAnalysis.pojo.FlightReportDay;
import com.carnoc.flight.statisticAnalysis.service.FlightReportDayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.NestedServletException;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @Author: hy
 * @Date 2018/10/29  9:32
 **/
@Controller
public class FlightReportDayController {
    @Resource
    private FlightReportDayService flightReportDayService;


    private static Logger logger = LogManager.getLogger(FlightReportDayController.class);

    @RequestMapping("/addFlightReportDay")
    public String addFlightReportDay(){
        System.out.println("进来了");
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String addTimes = dateformat.format(System.currentTimeMillis());
        int days = Integer.parseInt(addTimes.replace("-",""));
        FlightReportDay flightReportDay = new FlightReportDay(1,days,1000,863,200000,10000,1,addTimes);

        System.out.println(flightReportDay);
        //        try {
            flightReportDayService.addFlightReportDay(flightReportDay);
//        }catch (Exception e){
//            logger.info("嵌套异常");
//        }

        return null;
    }



    @RequestMapping("/getFlightReportDayDao")
    public String getFlightReportDayDao(){

        System.out.println("哈哈哈");
        List<FlightReportDay> flightReportDay = flightReportDayService.getFlightReportDay(1);
        System.out.println(flightReportDay);

        return null;
    }
}
