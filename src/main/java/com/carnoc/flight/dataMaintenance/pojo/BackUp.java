package com.carnoc.flight.dataMaintenance.pojo;

import java.io.Serializable;

/**
 * @ClassName: BackUp
 * @Description: TODO 备份日志表实体类
 * @Author: Administrator
 * @CreateDate: 2018/10/31 9:53
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/10/31 9:53
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

public class BackUp implements Serializable {
    private Integer id ;          //记录id,
    private String name;         // '备份名称',
    private String addTime;     //  '操作时间',
    private int backupState;     //状态

    public BackUp(Integer id, String name, String addTime, int backupState) {
        this.id = id;
        this.name = name;
        this.addTime = addTime;
        this.backupState = backupState;
    }

    public BackUp() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public int getBackupState() {
        return backupState;
    }

    public void setBackupState(int backupState) {
        this.backupState = backupState;
    }

    @Override
    public String toString() {
        return "BackUp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addTime='" + addTime + '\'' +
                ", backupState=" + backupState +
                '}';
    }
}
