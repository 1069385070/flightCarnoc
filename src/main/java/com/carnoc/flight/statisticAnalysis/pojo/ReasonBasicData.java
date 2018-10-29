package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 异常原因基础数据
 * @Author: hy
 * @Date 2018/10/26  20:43
 **/
public class ReasonBasicData implements Serializable {


    private Integer id;
    private String code;
    private String name;
    private String enName;

    public ReasonBasicData(Integer id, String code, String name, String enName) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.enName = enName;
    }

    public ReasonBasicData(String code, String name, String enName) {
        this.code = code;
        this.name = name;
        this.enName = enName;
    }

    public ReasonBasicData() {
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

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    @Override
    public String toString() {
        return "ReasonBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", enName='" + enName + '\'' +
                '}';
    }
}
