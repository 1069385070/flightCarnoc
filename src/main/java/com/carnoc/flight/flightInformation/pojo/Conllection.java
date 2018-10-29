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

    public Conllection() {
    }

    public Conllection(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Conllection(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
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


    @Override
    public String toString() {
        return "Conllection{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
