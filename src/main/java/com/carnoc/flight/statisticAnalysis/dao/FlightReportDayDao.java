package com.carnoc.flight.statisticAnalysis.dao;

import com.carnoc.flight.statisticAnalysis.pojo.FlightReportDay;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 每日航班信息统计表
 * @Author: hy
 * @Date 2018/10/29  08:43
 */
@Service
public interface FlightReportDayDao {

    /**
     * 每日航班信息统计
     * 增加一些记录做测试
     * @param flightReportDay
     * @return
     */
    public int addFlightReportDay(FlightReportDay flightReportDay);

    /**
     * 根据id去查询某一天的航班信息统计
     * @param id
     * @return
     */
    public List<FlightReportDay> getFlightReportDay(Integer id);


    /**
     * 查询过站的数据
     * @param startDate
     * @return
     */
    public FlightReportDay getFlightReportDayDate(String startDate);


    /**
     * 根据日期查询
     * @param startDate
     * @param endDate
     * @return
     */
    public List<FlightReportDay> getFlightReportDayNormal(@Param("map") Map map);


    /**
     * 获得所有的数据
     * @param map
     * @return
     */
    public List<FlightReportDay> getFlightReportDayAll(@Param("map") Map map);
}
