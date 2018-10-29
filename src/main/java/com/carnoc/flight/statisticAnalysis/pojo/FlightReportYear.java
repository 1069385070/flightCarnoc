package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 年度航班信息统计表
 * @Author: hy
 * @Date 2018/10/26  20:18
 **/
public class FlightReportYear implements Serializable {

    private Integer id;
    private int day;//统计标示 哪一天
    private int flights;//航班架次
    private int passengers;//旅客数量
    private int cargoWeight;//货邮行重量
    private int rtype;//统计类型1进港2出港3过站
    private String addTime;//统计时间

    public FlightReportYear(Integer id, int day, int flights, int passengers, int cargoWeight, int rtype, String addTime) {
        this.id = id;
        this.day = day;
        this.flights = flights;
        this.passengers = passengers;
        this.cargoWeight = cargoWeight;
        this.rtype = rtype;
        this.addTime = addTime;
    }

    public FlightReportYear(int day, int flights, int passengers, int cargoWeight, int rtype, String addTime) {
        this.day = day;
        this.flights = flights;
        this.passengers = passengers;
        this.cargoWeight = cargoWeight;
        this.rtype = rtype;
        this.addTime = addTime;
    }

    public FlightReportYear() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getFlights() {
        return flights;
    }

    public void setFlights(int flights) {
        this.flights = flights;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public int getRtype() {
        return rtype;
    }

    public void setRtype(int rtype) {
        this.rtype = rtype;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "FlightReportYear{" +
                "id=" + id +
                ", day=" + day +
                ", flights=" + flights +
                ", passengers=" + passengers +
                ", cargoWeight=" + cargoWeight +
                ", rtype=" + rtype +
                ", addTime='" + addTime + '\'' +
                '}';
    }
}
