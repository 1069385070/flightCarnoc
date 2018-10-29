package com.carnoc.flight.flightInformation.controller;

import com.alibaba.fastjson.JSON;
import com.carnoc.flight.flightInformation.pojo.AircompanytBasicData;
import com.carnoc.flight.flightInformation.pojo.AirportBasicData;
import com.carnoc.flight.flightInformation.pojo.FlightRecord;
import com.carnoc.flight.flightInformation.service.AircompanytBasicDataService;
import com.carnoc.flight.flightInformation.service.FlightRecordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 航班动态数据控制器
 * @Author: lpf
 * @Date 2018/10/26/026  20:21
 **/
@Controller
public class FlightRecordController {

    @Resource
    private FlightRecordService flightRecordService;
    @Resource
    private AircompanytBasicDataService aircompanytBasicDataService;


    /**
     * /获得航班动态信息
     * @param response
     * @param flightRecord
     * @param session
     * @throws IOException
     */
    @RequestMapping(value="/getFlightRecord.do")
    public void getFlightRecord(HttpServletResponse response, FlightRecord flightRecord, HttpSession session) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        //获得航班动态信息
        List<FlightRecord> flightRecordList = flightRecordService.getFlightRecord(flightRecord);
        response.getWriter().write(JSON.toJSONString(flightRecordList));
    }


    /**
     * 获得航空公司基础数据
     * @param response
     * @param session
     */
    @RequestMapping("/getAirCompanyBasicData.do")
    public void getAirCompanyBasicData(HttpServletResponse response,HttpSession session) throws IOException{
        response.setContentType("text/html;charset=utf-8");
        List<AircompanytBasicData> airportBasicDataList =aircompanytBasicDataService.getAircompanytBasicData();
        response.getWriter().write(JSON.toJSONString(airportBasicDataList));
    }




    /**
     * 按条件查询航班动态信息
     * @param response
     * @param flightRecord
     * @param session
     * @throws IOException
     */
    @RequestMapping(value="/getFlightRecordByCondition.do")
    public void getFlightRecordBy(HttpServletResponse response, FlightRecord flightRecord, HttpSession session) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        System.out.println("查询条件："+flightRecord);
        List<FlightRecord> flightRecordList = flightRecordService.getFlightRecord(flightRecord);
        response.getWriter().write(JSON.toJSONString(flightRecordList));
    }




}
