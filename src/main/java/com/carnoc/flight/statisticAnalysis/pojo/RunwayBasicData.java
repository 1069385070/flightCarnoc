package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 跑道基础数据表
 * @Author: hy
 * @Date 2018/10/26  20:51
 **/
public class RunwayBasicData implements Serializable {


    private Integer id;
    private String code;//记录号
    private String number;//跑道编号
    private String length;//跑道长度
    private double direction;//跑道方向
    private String attribute;//跑道属性


    public RunwayBasicData(Integer id, String code, String number, String length, double direction, String attribute) {
        this.id = id;
        this.code = code;
        this.number = number;
        this.length = length;
        this.direction = direction;
        this.attribute = attribute;
    }

    public RunwayBasicData(String code, String number, String length, double direction, String attribute) {
        this.code = code;
        this.number = number;
        this.length = length;
        this.direction = direction;
        this.attribute = attribute;
    }

    public RunwayBasicData() {
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "RunwayBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", number='" + number + '\'' +
                ", length='" + length + '\'' +
                ", direction=" + direction +
                ", attribute='" + attribute + '\'' +
                '}';
    }
}
