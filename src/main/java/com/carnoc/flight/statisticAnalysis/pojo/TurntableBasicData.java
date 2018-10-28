package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 行李转盘基础数据表
 * @Author: hy
 * @Date 2018/10/26  21:23
 **/
public class TurntableBasicData implements Serializable {

    private Integer id;
    private String code;//记录号
    private int states;//状态
    private String attribute;//航空公司属性 国内或国外
    private String company;//所属航空公司
    private String number;//行李转盘编号
    private String terminal;//所属航站楼


    public TurntableBasicData(Integer id, String code, int states, String attribute, String company, String number, String terminal) {
        this.id = id;
        this.code = code;
        this.states = states;
        this.attribute = attribute;
        this.company = company;
        this.number = number;
        this.terminal = terminal;
    }

    public TurntableBasicData(String code, int states, String attribute, String company, String number, String terminal) {
        this.code = code;
        this.states = states;
        this.attribute = attribute;
        this.company = company;
        this.number = number;
        this.terminal = terminal;
    }

    public TurntableBasicData() {
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

    public int getStates() {
        return states;
    }

    public void setStates(int states) {
        this.states = states;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }


    @Override
    public String toString() {
        return "TurntableBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", states=" + states +
                ", attribute='" + attribute + '\'' +
                ", company='" + company + '\'' +
                ", number='" + number + '\'' +
                ", terminal='" + terminal + '\'' +
                '}';
    }
}
