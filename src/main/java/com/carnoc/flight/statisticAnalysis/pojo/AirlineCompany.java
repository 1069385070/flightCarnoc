package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 航空公司基础数据表
 * @Author: hy
 * @Date 2018/10/26  19:26
 **/
public class AirlineCompany implements Serializable {

    private Integer id;
    private String airline_company;//航空公司'
    private String add_time;//添加时间

    public AirlineCompany(Integer id, String airline_company, String add_time) {
        this.id = id;
        this.airline_company = airline_company;
        this.add_time = add_time;
    }

    public AirlineCompany(String airline_company, String add_time) {
        this.airline_company = airline_company;
        this.add_time = add_time;
    }

    public AirlineCompany() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAirline_company() {
        return airline_company;
    }

    public void setAirline_company(String airline_company) {
        this.airline_company = airline_company;
    }

    public String getAdd_time() {
        return add_time;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }

    @Override
    public String toString() {
        return "AirlineCompany{" +
                "id=" + id +
                ", airline_company='" + airline_company + '\'' +
                ", add_time='" + add_time + '\'' +
                '}';
    }
}
