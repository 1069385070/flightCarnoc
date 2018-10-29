package com.carnoc.flight.flightInformation.service;

import com.carnoc.flight.flightInformation.dao.FlightRecordDao;
import com.carnoc.flight.flightInformation.pojo.FlightRecord;

import javax.annotation.Resource;
import java.security.PrivateKey;
import java.util.List;

/**
 * 航班动态数据service接口类
 * @Author: lpf
 * @Date 2018/10/26/026  19:21
 **/

public interface FlightRecordService {

    /**
     * 获得航班动态数据
     * @param flightRecord
     * @return
     */
    public List<FlightRecord> getFlightRecord(FlightRecord flightRecord);



}
