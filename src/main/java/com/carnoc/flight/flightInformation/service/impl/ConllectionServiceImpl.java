package com.carnoc.flight.flightInformation.service.impl;

import com.carnoc.flight.flightInformation.dao.ConllectionDao;
import com.carnoc.flight.flightInformation.pojo.Conllection;
import com.carnoc.flight.flightInformation.service.ConllectionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 数据采集service实现类
 * @Author: lpf
 * @Date 2018/10/26/026  19:36
 **/
@Service("conllectionServiceImpl")
public class ConllectionServiceImpl  implements ConllectionService{

    @Resource
    private ConllectionDao conllectionDao;

    /**
     * 获得自动采集接口
     * @return
     */
    @Override
    public List<Conllection> getAllPort() {
        return conllectionDao.getAllPort();
    }

    /**
     * 根据id修改采集数据接口转态
     * @return
     */
    public int updataPortStatus(Conllection conllection){
        return conllectionDao.updataPortStatus(conllection);
    }

    @Override
    public int delPortStarusById(int id) {
        return conllectionDao.delPortStarusById(id);
    }
}
