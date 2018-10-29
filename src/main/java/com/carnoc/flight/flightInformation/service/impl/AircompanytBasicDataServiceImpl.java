package com.carnoc.flight.flightInformation.service.impl;

import com.carnoc.flight.flightInformation.dao.AircompanytBasicDataDao;
import com.carnoc.flight.flightInformation.pojo.AircompanytBasicData;
import com.carnoc.flight.flightInformation.pojo.AirportBasicData;
import com.carnoc.flight.flightInformation.service.AircompanytBasicDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 航空公司基础数据service实现类
 * @Author: lpf
 * @Date 2018/10/28/028  19:35
 **/
@Service("aircompanytBasicDataService")
public class AircompanytBasicDataServiceImpl implements AircompanytBasicDataService {

    @Resource
    private AircompanytBasicDataDao aircompanytBasicDataDao;

    /**
     * 获得所有的航空公司
     * @return
     */
    @Override
    public List<AircompanytBasicData> getAircompanytBasicData() {
        return aircompanytBasicDataDao.getAircompanytBasicData();
    }
}
