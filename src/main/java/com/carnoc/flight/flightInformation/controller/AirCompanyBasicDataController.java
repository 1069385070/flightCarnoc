package com.carnoc.flight.flightInformation.controller;

import com.carnoc.flight.flightInformation.pojo.AircompanytBasicData;
import com.carnoc.flight.flightInformation.service.AircompanytBasicDataService;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 航空公司基本数据Controller
 * @Author: lpf
 * @Date 2018/11/1/001  13:35
 **/

public class AirCompanyBasicDataController {

    @Resource
    private AircompanytBasicDataService aircompanytBasicDataService;

    @RequestMapping(value = "/addAirCompanyBasicData.do")
    public int addAirCompanyBasicData(){

        return 0;
    }


}
