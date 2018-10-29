package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 航班状态基础数据表
 * @Author: hy
 * @Date 2018/10/26  21:00
 **/
public class StatelBasicData implements Serializable {


    private Integer id;
    private String code;
    private String name;

    public StatelBasicData(Integer id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public StatelBasicData(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public StatelBasicData() {
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
        return "StatelBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
