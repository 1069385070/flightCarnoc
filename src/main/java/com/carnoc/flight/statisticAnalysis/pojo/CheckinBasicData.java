package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 值机柜台基础数据表
 * @Author: hy
 * @Date 2018/10/26  19:58
 **/
public class CheckinBasicData implements Serializable {


    private Integer id;
    private String code;//记录号
    private String name;
    private String number;//值机柜台编号
    private String company;//所属航空公司
    private String region;//对应区域
    private String terminal;//所属航站楼
    private String attribute;//值机柜台属性
    private int states;//状态 1开启 0关闭
    private String type;//类别

    public CheckinBasicData(Integer id, String code, String name, String number, String company, String region, String terminal, String attribute, int states, String type) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.number = number;
        this.company = company;
        this.region = region;
        this.terminal = terminal;
        this.attribute = attribute;
        this.states = states;
        this.type = type;
    }

    public CheckinBasicData(String code, String name, String number, String company, String region, String terminal, String attribute, int states, String type) {
        this.code = code;
        this.name = name;
        this.number = number;
        this.company = company;
        this.region = region;
        this.terminal = terminal;
        this.attribute = attribute;
        this.states = states;
        this.type = type;
    }

    public CheckinBasicData() {
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getStates() {
        return states;
    }

    public void setStates(int states) {
        this.states = states;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CheckinBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", company='" + company + '\'' +
                ", region='" + region + '\'' +
                ", terminal='" + terminal + '\'' +
                ", attribute='" + attribute + '\'' +
                ", states=" + states +
                ", type='" + type + '\'' +
                '}';
    }
}
