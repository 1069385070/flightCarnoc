package com.carnoc.flight.flightInformation.dao;

import com.carnoc.flight.flightInformation.pojo.FlightRecord;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 航班动态数据dao接口
 * @Author: lpf
 * @Date 2018/10/26/026  19:19
 **/

@Service
public interface FlightRecordDao {

    /**
     * 获得航班动态数据
     * @param flightRecord
     * @return
     */
    public List<FlightRecord> getFlightRecord(FlightRecord flightRecord);

}
