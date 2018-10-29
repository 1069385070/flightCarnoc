package com.carnoc.flight.flightInformation.dao;

import com.carnoc.flight.flightInformation.pojo.AircompanytBasicData;

import java.util.List;

/**
 * 航空公司基础数据dao接口
 * @Author: hy
 * @Date 2018/10/26  19:26
 **/
public interface AircompanytBasicDataDao {

    /**
     * 获得所有的航空公司
     * @return
     */
    public List<AircompanytBasicData> getAircompanytBasicData();

}
