package com.carnoc.flight.flightInformation.service;

import com.carnoc.flight.flightInformation.pojo.Conllection;

import java.util.List;

/**
 * 数据采集service接口
 * @Author: lpf
 * @Date 2018/10/26/026  19:36
 **/

public interface ConllectionService {

    /**
     * 获得自动采集接口
     * @return
     */
    public List<Conllection> getAllPort();

    /**
     * 根据id修改采集数据接口转态
     * @return
     */
    public int updataPortStatus(Conllection conllection);


    /**
     * 根据id删除接口
     * @param id
     * @return
     */
    public int delPortStarusById(int id);

}
