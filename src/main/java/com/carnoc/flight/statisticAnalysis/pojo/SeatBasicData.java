package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 机位基础数据表
 * @Author: hy
 * @Date 2018/10/26  20:55
 **/
public class SeatBasicData implements Serializable {


    private Integer id;
    private String code;//记录号
    private String number;//停机位编号
    private String model;//可停靠机型
    private String attribute;//机位属性
    private int lengt;//机位长
    private int breadth;//机位宽
    private int type;//机位类型
    private int states;//机位状态 1启用 2关闭

    public SeatBasicData(Integer id, String code, String number, String model, String attribute, int lengt, int breadth, int type, int states) {
        this.id = id;
        this.code = code;
        this.number = number;
        this.model = model;
        this.attribute = attribute;
        this.lengt = lengt;
        this.breadth = breadth;
        this.type = type;
        this.states = states;
    }

    public SeatBasicData(String code, String number, String model, String attribute, int lengt, int breadth, int type, int states) {
        this.code = code;
        this.number = number;
        this.model = model;
        this.attribute = attribute;
        this.lengt = lengt;
        this.breadth = breadth;
        this.type = type;
        this.states = states;
    }

    public SeatBasicData() {
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getLengt() {
        return lengt;
    }

    public void setLengt(int lengt) {
        this.lengt = lengt;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStates() {
        return states;
    }

    public void setStates(int states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "SeatBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", attribute='" + attribute + '\'' +
                ", lengt=" + lengt +
                ", breadth=" + breadth +
                ", type=" + type +
                ", states=" + states +
                '}';
    }
}
