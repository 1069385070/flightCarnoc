package com.carnoc.flight.flightInformation.dao;

import com.carnoc.flight.flightInformation.pojo.Conllection;

import java.util.List;

/**
 * 数据采集dao接口
 * @Author: lpf
 * @Date 2018/10/26/026  19:19
 **/

public interface ConllectionDao {

    /**
     * 获得自动采集接口
     * @return
     */
    public List<Conllection> getAllPort();

    /**
     * 根据id修改采集数据接口转态
     *
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
