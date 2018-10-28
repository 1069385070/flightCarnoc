package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 航站楼基础数据表
 * @Author: hy
 * @Date 2018/10/26  21:17
 **/
public class TerminalBasicData implements Serializable {

    private Integer id;
    private String code;//记录号
    private String name;//航站楼名称
    private String attribute;//航站楼属性
    private String company;//所属航空公司
    private String states;//状态

    public TerminalBasicData(Integer id, String code, String name, String attribute, String company, String states) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.attribute = attribute;
        this.company = company;
        this.states = states;
    }

    public TerminalBasicData(String code, String name, String attribute, String company, String states) {
        this.code = code;
        this.name = name;
        this.attribute = attribute;
        this.company = company;
        this.states = states;
    }

    public TerminalBasicData() {
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

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "TerminalBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", attribute='" + attribute + '\'' +
                ", company='" + company + '\'' +
                ", states='" + states + '\'' +
                '}';
    }
}
