package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 航班任务基础数据表
 * @Author: hy
 * @Date 2018/10/26  21:07
 **/
public class TaskBasicData implements Serializable {

    private Integer id;
    private String code;//记录号
    private String synopsis;//任务简称
    private String name;//任务性质
    private String enName;//英文名称
    private String task_code;//任务性质代码
    private int rank;//任务排序

    public TaskBasicData(Integer id, String code, String synopsis, String name, String enName, String task_code, int rank) {
        this.id = id;
        this.code = code;
        this.synopsis = synopsis;
        this.name = name;
        this.enName = enName;
        this.task_code = task_code;
        this.rank = rank;
    }

    public TaskBasicData(String code, String synopsis, String name, String enName, String task_code, int rank) {
        this.code = code;
        this.synopsis = synopsis;
        this.name = name;
        this.enName = enName;
        this.task_code = task_code;
        this.rank = rank;
    }

    public TaskBasicData() {
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

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getTask_code() {
        return task_code;
    }

    public void setTask_code(String task_code) {
        this.task_code = task_code;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "TaskBasicData{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", name='" + name + '\'' +
                ", enName='" + enName + '\'' +
                ", task_code='" + task_code + '\'' +
                ", rank=" + rank +
                '}';
    }
}
