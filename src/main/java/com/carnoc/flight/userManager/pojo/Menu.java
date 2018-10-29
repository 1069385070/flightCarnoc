package com.carnoc.flight.userManager.pojo;

import java.io.Serializable;

/**
 * @ClassName: Menu
 * @Description: TODO 权限目录表f_menu实体类
 * @Author: Administrator
 * @CreateDate: 2018/10/26 19:30
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/26 19:30
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

public class Menu implements Serializable {
    private Integer id;         //权限编号
    private Integer fid;        //权限父编号
    private String name ;       //'栏目名称',
    private String url ;        //'栏目路径',
    private String menuCode;    //权限编码

    public Menu(Integer id, Integer fid, String name, String url, String menuCode) {
        this.id = id;
        this.fid = fid;
        this.name = name;
        this.url = url;
        this.menuCode = menuCode;
    }

    public Menu() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", fid=" + fid +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", menuCode='" + menuCode + '\'' +
                '}';
    }
}
