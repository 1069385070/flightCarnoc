package com.carnoc.flight.userManager.pojo;

import java.io.Serializable;

/**
 * @ClassName: Admin
 * @Description: TODO 用户表f_admin实体类
 * @Author: Administrator
 * @CreateDate: 2018/10/26 19:02
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/26 19:02
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

public class Admin implements Serializable {
    private Integer id ;            //'id编号'
    private String code ;           //'编号',
    private String username ;       //'用户账号',
    private String password ;       //'用户密码',
    private String name ;           //'名称',
    private Integer sex ;           //'0保密1男2女',
    private Integer age ;           //'年龄',
    private String post ;           //'职务',
    private String qq ;             //'QQ',
    private String tel ;            //'联系电话',
    private String email ;          //'邮箱',
    private String other ;          //'其它联系方式',
    private Integer roleId ;       //'角色ID',
    private Integer state ;         //'账号状态1正常0停用',
    private String addTime ;       //'添加时间',
    private String loginTime ;     //登录时间
    private String remark ;         //'备注',

    public Admin(Integer id, String code, String username, String password, String name, Integer sex, Integer age, String post, String qq, String tel, String email, String other, Integer roleId, Integer state, String addTime, String loginTime, String remark) {
        this.id = id;
        this.code = code;
        this.username = username;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.post = post;
        this.qq = qq;
        this.tel = tel;
        this.email = email;
        this.other = other;
        this.roleId = roleId;
        this.state = state;
        this.addTime = addTime;
        this.loginTime = loginTime;
        this.remark = remark;
    }

    public Admin() {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", qq='" + qq + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", other='" + other + '\'' +
                ", roleId=" + roleId +
                ", state=" + state +
                ", addTime='" + addTime + '\'' +
                ", loginTime='" + loginTime + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
