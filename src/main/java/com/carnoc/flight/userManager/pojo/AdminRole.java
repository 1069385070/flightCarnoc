package com.carnoc.flight.userManager.pojo;

import java.io.Serializable;

/**
 * @ClassName: AdminRole
 * @Description: TODO 用户组表f_admin_role实体类
 * @Author: Administrator
 * @CreateDate: 2018/10/26 19:26
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/26 19:26
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

public class AdminRole implements Serializable {
    private Integer id;         //用户组id
    private String roleCode;    //用户组编号
    private String name ;       //'名称',
    private String menuId ;    //'权限控制',
    private String addTime;    //'添加时间',
    private Integer roleState;  //用户组状态

    public AdminRole(Integer id, String roleCode, String name, String menuId, String addTime, Integer roleState) {
        this.id = id;
        this.roleCode = roleCode;
        this.name = name;
        this.menuId = menuId;
        this.addTime = addTime;
        this.roleState = roleState;
    }
    public AdminRole() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public Integer getRoleState() {
        return roleState;
    }

    public void setRoleState(Integer roleState) {
        this.roleState = roleState;
    }

    @Override
    public String toString() {
        return "AdminRole{" +
                "id=" + id +
                ", roleCode='" + roleCode + '\'' +
                ", name='" + name + '\'' +
                ", menuId='" + menuId + '\'' +
                ", addTime='" + addTime + '\'' +
                ", roleState=" + roleState +
                '}';
    }
}
