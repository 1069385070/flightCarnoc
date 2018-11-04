package com.carnoc.flight.flightInformation.dao;

import com.carnoc.flight.flightInformation.pojo.FlightRecord;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
     * @return List
     */
    public List<FlightRecord> getFlightRecord(FlightRecord flightRecord);


    /**
     * 根据id获得航班动态数据
     * @param id
     * @return FlightRecord
     */
    public FlightRecord getFlightRecordById(int id);


    /**
     * 根据id修改航班动态数据updateFlightRecord
     * @param flightRecord
     * @return
     */
    public int updateFlightRecord(FlightRecord flightRecord);


    /**
     * 获得因为各种原因的航班
     * @param map
     * @return
     */
    public Map getdelayRemark(@Param("map") Map map);

}
