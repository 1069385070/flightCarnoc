package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 统计基础数据表
 * @Author: hy
 * @Date 2018/10/26  21:02
 **/
public class StatisticsBasicData implements Serializable {


    private Integer id;
    private String code;
    private String name;

    public StatisticsBasicData(Integer id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public StatisticsBasicData(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public StatisticsBasicData() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StatisticsBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
