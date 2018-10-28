package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 廊桥基础数据
 * @Author: hy
 * @Date 2018/10/26  20:47
 **/
public class RecBasicData implements Serializable {


    private Integer id;
    private String code;//记录号
    private String number;//廊桥编号
    private String seat;//对应机位

    public RecBasicData(Integer id, String code, String number, String seat) {
        this.id = id;
        this.code = code;
        this.number = number;
        this.seat = seat;
    }

    public RecBasicData(String code, String number, String seat) {
        this.code = code;
        this.number = number;
        this.seat = seat;
    }

    public RecBasicData() {
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

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "RecBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", number='" + number + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
