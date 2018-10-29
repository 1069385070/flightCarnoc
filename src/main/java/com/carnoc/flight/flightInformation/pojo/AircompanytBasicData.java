package com.carnoc.flight.flightInformation.pojo;

import java.io.Serializable;

/**
 * 航空公司基本数据
 * @Author: hy
 * @Date 2018/10/26  18:49
 **/
public class AircompanytBasicData implements Serializable {


    private Integer Id;
    private String code;//记录号
    private String enAbb;//英文简称
    private String name;//航空公司名称
    private String branchName;//分公司名称
    private String twoCode;//航空公司二字码
    private String treeCode;//航空公司三字码
    private String attribute;//航空公司属性(国内或国外)
    private String tel;//联系电话
    private String linkman;//联系人
    private String linkmanPost;//联系人职务
    private long firstTime;//首发时间
    private String email;//邮箱

    public AircompanytBasicData(Integer id, String code, String enAbb, String name, String branchName, String twoCode, String treeCode, String attribute, String tel, String linkman, String linkmanPost, long firstTime, String email) {
        Id = id;
        this.code = code;
        this.enAbb = enAbb;
        this.name = name;
        this.branchName = branchName;
        this.twoCode = twoCode;
        this.treeCode = treeCode;
        this.attribute = attribute;
        this.tel = tel;
        this.linkman = linkman;
        this.linkmanPost = linkmanPost;
        this.firstTime = firstTime;
        this.email = email;
    }

    public AircompanytBasicData(String code, String enAbb, String name, String branchName, String twoCode, String treeCode, String attribute, String tel, String linkman, String linkmanPost, long firstTime, String email) {
        this.code = code;
        this.enAbb = enAbb;
        this.name = name;
        this.branchName = branchName;
        this.twoCode = twoCode;
        this.treeCode = treeCode;
        this.attribute = attribute;
        this.tel = tel;
        this.linkman = linkman;
        this.linkmanPost = linkmanPost;
        this.firstTime = firstTime;
        this.email = email;
    }

    public AircompanytBasicData() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEnAbb() {
        return enAbb;
    }

    public void setEnAbb(String enAbb) {
        this.enAbb = enAbb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getTwoCode() {
        return twoCode;
    }

    public void setTwoCode(String twoCode) {
        this.twoCode = twoCode;
    }

    public String getTreeCode() {
        return treeCode;
    }

    public void setTreeCode(String treeCode) {
        this.treeCode = treeCode;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkmanPost() {
        return linkmanPost;
    }

    public void setLinkmanPost(String linkmanPost) {
        this.linkmanPost = linkmanPost;
    }

    public long getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(long firstTime) {
        this.firstTime = firstTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AircompanytBasicData{" +
                "Id=" + Id +
                ", code='" + code + '\'' +
                ", enAbb='" + enAbb + '\'' +
                ", name='" + name + '\'' +
                ", branchName='" + branchName + '\'' +
                ", twoCode='" + twoCode + '\'' +
                ", treeCode='" + treeCode + '\'' +
                ", attribute='" + attribute + '\'' +
                ", tel='" + tel + '\'' +
                ", linkman='" + linkman + '\'' +
                ", linkmanPost='" + linkmanPost + '\'' +
                ", firstTime=" + firstTime +
                ", email='" + email + '\'' +
                '}';
    }
}
