package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 航线数据表
 * @Author: hy
 * @Date 2018/10/26  19:40
 **/
public class AirRoute implements Serializable {


    private Integer id;
    private String airportStart;//起飞机场
    private String airportEnd;//降落机场
    private String airportEndSpare;//备降机场
    private double mileage;//里程
    private double addTime;//添加时间

    public AirRoute(Integer id, String airportStart, String airportEnd, String airportEndSpare, double mileage, double addTime) {
        this.id = id;
        this.airportStart = airportStart;
        this.airportEnd = airportEnd;
        this.airportEndSpare = airportEndSpare;
        this.mileage = mileage;
        this.addTime = addTime;
    }

    public AirRoute(String airportStart, String airportEnd, String airportEndSpare, double mileage, double addTime) {
        this.airportStart = airportStart;
        this.airportEnd = airportEnd;
        this.airportEndSpare = airportEndSpare;
        this.mileage = mileage;
        this.addTime = addTime;
    }

    public AirRoute() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAirportStart() {
        return airportStart;
    }

    public void setAirportStart(String airportStart) {
        this.airportStart = airportStart;
    }

    public String getAirportEnd() {
        return airportEnd;
    }

    public void setAirportEnd(String airportEnd) {
        this.airportEnd = airportEnd;
    }

    public String getAirportEndSpare() {
        return airportEndSpare;
    }

    public void setAirportEndSpare(String airportEndSpare) {
        this.airportEndSpare = airportEndSpare;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getAddTime() {
        return addTime;
    }

    public void setAddTime(double addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "AirRoute{" +
                "id=" + id +
                ", airportStart='" + airportStart + '\'' +
                ", airportEnd='" + airportEnd + '\'' +
                ", airportEndSpare='" + airportEndSpare + '\'' +
                ", mileage=" + mileage +
                ", addTime=" + addTime +
                '}';
    }
}
