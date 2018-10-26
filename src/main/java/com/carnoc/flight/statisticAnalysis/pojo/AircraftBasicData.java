package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 飞机信息基础数据表
 * @Author: hy
 * @Date 2018/10/26  19:17
 **/
public class AircraftBasicData implements Serializable {

    private Integer id;
    private String code;//记录号
    private String no;//机号
    private String model;//机型
    private String company;//所属航空公司
    private String attribute;//航空公司属性 国内或国外
    private String twoCode;//航空公司二字码
    private double wingspan;//翼展
    private double length;//长度
    private double height;//高度
    private int maxSeat;//实际最大座位数
    private double cargo;//载货量
    private double takeoffWeight;//最大起飞重量
    private double maxRange;//最大航程
    private double maxFuel;//最大燃油容量
    private String runway;//跑道要求
    private String aircraftType;//飞机类型',

    public AircraftBasicData(Integer id, String code, String no, String model, String company, String attribute, String twoCode, double wingspan, double length, double height, int maxSeat, double cargo, double takeoffWeight, double maxRange, double maxFuel, String runway, String aircraftType) {
        this.id = id;
        this.code = code;
        this.no = no;
        this.model = model;
        this.company = company;
        this.attribute = attribute;
        this.twoCode = twoCode;
        this.wingspan = wingspan;
        this.length = length;
        this.height = height;
        this.maxSeat = maxSeat;
        this.cargo = cargo;
        this.takeoffWeight = takeoffWeight;
        this.maxRange = maxRange;
        this.maxFuel = maxFuel;
        this.runway = runway;
        this.aircraftType = aircraftType;
    }


    public AircraftBasicData(String code, String no, String model, String company, String attribute, String twoCode, double wingspan, double length, double height, int maxSeat, double cargo, double takeoffWeight, double maxRange, double maxFuel, String runway, String aircraftType) {
        this.code = code;
        this.no = no;
        this.model = model;
        this.company = company;
        this.attribute = attribute;
        this.twoCode = twoCode;
        this.wingspan = wingspan;
        this.length = length;
        this.height = height;
        this.maxSeat = maxSeat;
        this.cargo = cargo;
        this.takeoffWeight = takeoffWeight;
        this.maxRange = maxRange;
        this.maxFuel = maxFuel;
        this.runway = runway;
        this.aircraftType = aircraftType;
    }

    public AircraftBasicData() {
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

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getTwoCode() {
        return twoCode;
    }

    public void setTwoCode(String twoCode) {
        this.twoCode = twoCode;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getMaxSeat() {
        return maxSeat;
    }

    public void setMaxSeat(int maxSeat) {
        this.maxSeat = maxSeat;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    public double getTakeoffWeight() {
        return takeoffWeight;
    }

    public void setTakeoffWeight(double takeoffWeight) {
        this.takeoffWeight = takeoffWeight;
    }

    public double getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(double maxRange) {
        this.maxRange = maxRange;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public String getRunway() {
        return runway;
    }

    public void setRunway(String runway) {
        this.runway = runway;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    @Override
    public String toString() {
        return "AircraftBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", no='" + no + '\'' +
                ", model='" + model + '\'' +
                ", company='" + company + '\'' +
                ", attribute='" + attribute + '\'' +
                ", twoCode='" + twoCode + '\'' +
                ", wingspan=" + wingspan +
                ", length=" + length +
                ", height=" + height +
                ", maxSeat=" + maxSeat +
                ", cargo=" + cargo +
                ", takeoffWeight=" + takeoffWeight +
                ", maxRange=" + maxRange +
                ", maxFuel=" + maxFuel +
                ", runway='" + runway + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                '}';
    }
}
