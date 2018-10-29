package com.carnoc.flight.statisticAnalysis.service.impl;

import com.carnoc.flight.statisticAnalysis.dao.FlightReportDayDao;
import com.carnoc.flight.statisticAnalysis.pojo.FlightReportDay;
import com.carnoc.flight.statisticAnalysis.service.FlightReportDayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: hy
 * @Date 2018/10/29  9:26
 **/
@Service("flightReportDayService")
public class FlightReportDayServiceImpl implements FlightReportDayService {

    @Resource
    private FlightReportDayDao flightReportDayDao;

    @Override
    public int addFlightReportDay(FlightReportDay flightReportDay) {
        System.out.println(flightReportDay);
        return flightReportDayDao.addFlightReportDay(flightReportDay);
    }

    @Override
    public List<FlightReportDay> getFlightReportDay(Integer id) {
        return flightReportDayDao.getFlightReportDay(id);
    }
}
