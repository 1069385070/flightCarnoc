package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 安检通道基础数据表
 * @Author: hy
 * @Date 2018/10/26  19:46
 **/
public class ChannelBasicData implements Serializable {


    private Integer id;
    private String code;//记录号
    private String number;//安检通道编号
    private String attribute;//安检通道属性
    private String region;//对应区域
    private int states;//安检口状态 1开启  2关闭
    private String terminal;//所属航站楼

    public ChannelBasicData(Integer id, String code, String number, String attribute, String region, int states, String terminal) {
        this.id = id;
        this.code = code;
        this.number = number;
        this.attribute = attribute;
        this.region = region;
        this.states = states;
        this.terminal = terminal;
    }

    public ChannelBasicData(String code, String number, String attribute, String region, int states, String terminal) {
        this.code = code;
        this.number = number;
        this.attribute = attribute;
        this.region = region;
        this.states = states;
        this.terminal = terminal;
    }

    public ChannelBasicData() {
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

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getStates() {
        return states;
    }

    public void setStates(int states) {
        this.states = states;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    @Override
    public String toString() {
        return "ChannelBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", number='" + number + '\'' +
                ", attribute='" + attribute + '\'' +
                ", region='" + region + '\'' +
                ", states=" + states +
                ", terminal='" + terminal + '\'' +
                '}';
    }
}
