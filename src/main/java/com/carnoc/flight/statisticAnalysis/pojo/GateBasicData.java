package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 登机口基础数据
 * @Author: hy
 * @Date 2018/10/26  20:34
 **/
public class GateBasicData implements Serializable {


    private Integer id;
    private String code;//记录号
    private String attribute;//航空公司属性 国内或国外
    private int type;//类型 1近 2远
    private String channel;//对应航站楼
    private String name;//登机口名称
    private String seat;//对应机位
    private int states;//登机记状态  1正在登记 2未使用

    public GateBasicData(Integer id, String code, String attribute, int type, String channel, String name, String seat, int states) {
        this.id = id;
        this.code = code;
        this.attribute = attribute;
        this.type = type;
        this.channel = channel;
        this.name = name;
        this.seat = seat;
        this.states = states;
    }

    public GateBasicData(String code, String attribute, int type, String channel, String name, String seat, int states) {
        this.code = code;
        this.attribute = attribute;
        this.type = type;
        this.channel = channel;
        this.name = name;
        this.seat = seat;
        this.states = states;
    }

    public GateBasicData() {
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

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public int getStates() {
        return states;
    }

    public void setStates(int states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "GateBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", attribute='" + attribute + '\'' +
                ", type=" + type +
                ", channel='" + channel + '\'' +
                ", name='" + name + '\'' +
                ", seat='" + seat + '\'' +
                ", states=" + states +
                '}';
    }
}
