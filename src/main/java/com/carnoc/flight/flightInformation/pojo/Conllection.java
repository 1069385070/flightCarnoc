package com.carnoc.flight.flightInformation.pojo;

import java.io.Serializable;

/**
 * 数据采集接口数据--实体类
 * @Author: lpf
 * @Date 2018/10/26/026  19:28
 **/

public class Conllection implements Serializable {

    private int id;//数据采集接口数据id
    private String name;//API名称
    private String url;//接口地址
    private String updataTime;//更新时间
    private String portStatus;//接口状态

    public Conllection() {
    }


    public Conllection(String name, String url, String updataTime, String portStatus) {
        this.name = name;
        this.url = url;
        this.updataTime = updataTime;
        this.portStatus = portStatus;
    }

    public Conllection(int id, String name, String url, String updataTime, String portStatus) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.updataTime = updataTime;
        this.portStatus = portStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUpdataTime() {
        return updataTime;
    }

    public void setUpdataTime(String updataTime) {
        this.updataTime = updataTime;
    }


    public String getPortStatus() {
        return portStatus;
    }

    public void setPortStatus(String portStatus) {
        this.portStatus = portStatus;
    }

    @Override
    public String toString() {
        return "Conllection{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", updataTime='" + updataTime + '\'' +
                ", portStatus='" + portStatus + '\'' +
                '}';
    }


}
