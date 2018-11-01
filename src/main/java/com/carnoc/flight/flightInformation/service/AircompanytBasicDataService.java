package com.carnoc.flight.flightInformation.service;

import com.carnoc.flight.flightInformation.pojo.AircompanytBasicData;
import com.carnoc.flight.flightInformation.pojo.AirportBasicData;

import java.util.List;

/**
 * 航空公司基础数据service接口
 * @Author: lpf
 * @Date 2018/10/28/028  19:34
 **/
public interface AircompanytBasicDataService {

    /**
     * 获得所有的航空公司
     * @return
     */
    public List<AircompanytBasicData> getAircompanytBasicData();


    /**
     * 添加航空公司基础数据
     * @return
     */
    public int addAirCompanyBasicData(List<AircompanytBasicData> aircompanytBasicData);

}
