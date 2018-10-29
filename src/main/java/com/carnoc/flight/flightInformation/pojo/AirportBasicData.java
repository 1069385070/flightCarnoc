package com.carnoc.flight.flightInformation.pojo;

import java.io.Serializable;

/**
 * 机场基础数据表
 * @Author: hy
 * @Date 2018/10/26  19:32
 **/
public class AirportBasicData implements Serializable {


    private Integer id;
    private String code;//记录号
    private String name;//机场名称
    private String route_abb;//航线简称
    private String enAbb;//英文简称
    private String attribute;//航空公司属性 国内或国外
    private String threeCode;//机场三字码
    private String fourCode;//机场四字码
    private String city;//机场所属城市
    private String level;//机场等级
    private String address;//地址
    private String tel;//联系电话
    private String province;//省份

    public AirportBasicData(Integer id, String code, String name, String route_abb, String enAbb, String attribute, String threeCode, String fourCode, String city, String level, String address, String tel, String province) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.route_abb = route_abb;
        this.enAbb = enAbb;
        this.attribute = attribute;
        this.threeCode = threeCode;
        this.fourCode = fourCode;
        this.city = city;
        this.level = level;
        this.address = address;
        this.tel = tel;
        this.province = province;
    }

    public AirportBasicData(String code, String name, String route_abb, String enAbb, String attribute, String threeCode, String fourCode, String city, String level, String address, String tel, String province) {
        this.code = code;
        this.name = name;
        this.route_abb = route_abb;
        this.enAbb = enAbb;
        this.attribute = attribute;
        this.threeCode = threeCode;
        this.fourCode = fourCode;
        this.city = city;
        this.level = level;
        this.address = address;
        this.tel = tel;
        this.province = province;
    }

    public AirportBasicData() {
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

    public String getRoute_abb() {
        return route_abb;
    }

    public void setRoute_abb(String route_abb) {
        this.route_abb = route_abb;
    }

    public String getEnAbb() {
        return enAbb;
    }

    public void setEnAbb(String enAbb) {
        this.enAbb = enAbb;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getThreeCode() {
        return threeCode;
    }

    public void setThreeCode(String threeCode) {
        this.threeCode = threeCode;
    }

    public String getFourCode() {
        return fourCode;
    }

    public void setFourCode(String fourCode) {
        this.fourCode = fourCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "AirportBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", route_abb='" + route_abb + '\'' +
                ", enAbb='" + enAbb + '\'' +
                ", attribute='" + attribute + '\'' +
                ", threeCode='" + threeCode + '\'' +
                ", fourCode='" + fourCode + '\'' +
                ", city='" + city + '\'' +
                ", level='" + level + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
