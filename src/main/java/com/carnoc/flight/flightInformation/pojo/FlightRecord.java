package com.carnoc.flight.flightInformation.pojo;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * 航班动态数据实体类
 * @Author: lpf
 * @Date 2018/10/26/026  17:05
 **/

public class FlightRecord implements Serializable {

   //属性
    private int id;//航班动态数据id
    private int code;//记录号
    private Date doDate;//航班执行日期
    private String airCode;//航空公司代码
    private String flightNo;//航班号
    private String no;//机号
    private String inOut;//进出港
    private String nature;//航班性质
    private String task;//任务性质
    private String attribute;//属性（机型）
    private String seat;//机位
    private String gate;//登机口
    private String luggageTurnTable;//行李转盘
    private int relationId;//关联航空id
    private int airlineId;//航空公司id
    private String airlineCompany;//航空公司
    private String flightMission;//航班任务
    private String flightAgent;//航班代理
    private String airportStart;//起飞机场
    private String airportEnd;//降落机场
    private String airportEndSpare;//备降机场
    private int adultNum;//成人人数
    private int childNum;//儿童人数
    private int babyNum;//婴儿人数
    private int luggateNum;//货邮数量
    private double cargoWeight;//货邮重量
    private String planTakeTime;//计划起飞时间
    private String planLandTime;//计划落地时间
    private String realTakeTime;//实际起飞时间
    private String realLandTime;//实际落地时间
    private String BlockTime;//挡轮挡时间
    private String removeTime;//撤轮档时间
    private String delayRemark;//航班延误原因
    private int delayTime;//航班延误时长
    private String terminal;//航站楼
    private String doorOpenTime;//开舱门时间
    private String doorCloseTime;//关舱门时间
    private String flightStatus;//航班状态
    private String isFirst;//是否为首航

    public FlightRecord() {
    }

    public FlightRecord(int id, int code, Date doDate, String airCode, String flightNo, String no, String inOut, String nature, String task, String attribute, String seat, String gate, String luggageTurnTable, int relationId, int airlineId, String airlineCompany, String flightMission, String flightAgent, String airportStart, String airportEnd, String airportEndSpare, int adultNum, int childNum, int babyNum, int luggateNum, double cargoWeight, String planTakeTime, String planLandTime, String realTakeTime, String realLandTime, String blockTime, String removeTime, String delayRemark, int delayTime, String terminal, String doorOpenTime, String doorCloseTime, String flightStatus, String isFirst) {
        this.id = id;
        this.code = code;
        this.doDate = doDate;
        this.airCode = airCode;
        this.flightNo = flightNo;
        this.no = no;
        this.inOut = inOut;
        this.nature = nature;
        this.task = task;
        this.attribute = attribute;
        this.seat = seat;
        this.gate = gate;
        this.luggageTurnTable = luggageTurnTable;
        this.relationId = relationId;
        this.airlineId = airlineId;
        this.airlineCompany = airlineCompany;
        this.flightMission = flightMission;
        this.flightAgent = flightAgent;
        this.airportStart = airportStart;
        this.airportEnd = airportEnd;
        this.airportEndSpare = airportEndSpare;
        this.adultNum = adultNum;
        this.childNum = childNum;
        this.babyNum = babyNum;
        this.luggateNum = luggateNum;
        this.cargoWeight = cargoWeight;
        this.planTakeTime = planTakeTime;
        this.planLandTime = planLandTime;
        this.realTakeTime = realTakeTime;
        this.realLandTime = realLandTime;
        BlockTime = blockTime;
        this.removeTime = removeTime;
        this.delayRemark = delayRemark;
        this.delayTime = delayTime;
        this.terminal = terminal;
        this.doorOpenTime = doorOpenTime;
        this.doorCloseTime = doorCloseTime;
        this.flightStatus = flightStatus;
        this.isFirst = isFirst;
    }

    public FlightRecord(int code, Date doDate, String airCode, String flightNo, String no, String inOut, String nature, String task, String attribute, String seat, String gate, String luggageTurnTable, int relationId, int airlineId, String airlineCompany, String flightMission, String flightAgent, String airportStart, String airportEnd, String airportEndSpare, int adultNum, int childNum, int babyNum, int luggateNum, double cargoWeight, String planTakeTime, String planLandTime, String realTakeTime, String realLandTime, String blockTime, String removeTime, String delayRemark, int delayTime, String terminal, String doorOpenTime, String doorCloseTime, String flightStatus, String isFirst) {
        this.code = code;
        this.doDate = doDate;
        this.airCode = airCode;
        this.flightNo = flightNo;
        this.no = no;
        this.inOut = inOut;
        this.nature = nature;
        this.task = task;
        this.attribute = attribute;
        this.seat = seat;
        this.gate = gate;
        this.luggageTurnTable = luggageTurnTable;
        this.relationId = relationId;
        this.airlineId = airlineId;
        this.airlineCompany = airlineCompany;
        this.flightMission = flightMission;
        this.flightAgent = flightAgent;
        this.airportStart = airportStart;
        this.airportEnd = airportEnd;
        this.airportEndSpare = airportEndSpare;
        this.adultNum = adultNum;
        this.childNum = childNum;
        this.babyNum = babyNum;
        this.luggateNum = luggateNum;
        this.cargoWeight = cargoWeight;
        this.planTakeTime = planTakeTime;
        this.planLandTime = planLandTime;
        this.realTakeTime = realTakeTime;
        this.realLandTime = realLandTime;
        BlockTime = blockTime;
        this.removeTime = removeTime;
        this.delayRemark = delayRemark;
        this.delayTime = delayTime;
        this.terminal = terminal;
        this.doorOpenTime = doorOpenTime;
        this.doorCloseTime = doorCloseTime;
        this.flightStatus = flightStatus;
        this.isFirst = isFirst;
    }

    //set/get方法


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDoDate() {
        return doDate;
    }

    public void setDoDate(Date doDate) {
        this.doDate = doDate;
    }

    public String getAirCode() {
        return airCode;
    }

    public void setAirCode(String airCode) {
        this.airCode = airCode;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(String isFirst) {
        this.isFirst = isFirst;
    }

    public String getInOut() {
        return inOut;
    }

    public void setInOut(String inOut) {
        this.inOut = inOut;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getLuggageTurnTable() {
        return luggageTurnTable;
    }

    public void setLuggageTurnTable(String luggageTurnTable) {
        this.luggageTurnTable = luggageTurnTable;
    }

    public int getRelationId() {
        return relationId;
    }

    public void setRelationId(int relationId) {
        this.relationId = relationId;
    }

    public int getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(int airlineId) {
        this.airlineId = airlineId;
    }

    public String getAirlineCompany() {
        return airlineCompany;
    }

    public void setAirlineCompany(String airlineCompany) {
        this.airlineCompany = airlineCompany;
    }

    public String getFlightMission() {
        return flightMission;
    }

    public void setFlightMission(String flightMission) {
        this.flightMission = flightMission;
    }

    public String getFlightAgent() {
        return flightAgent;
    }

    public void setFlightAgent(String flightAgent) {
        this.flightAgent = flightAgent;
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

    public int getAdultNum() {
        return adultNum;
    }

    public void setAdultNum(int adultNum) {
        this.adultNum = adultNum;
    }

    public int getChildNum() {
        return childNum;
    }

    public void setChildNum(int childNum) {
        this.childNum = childNum;
    }

    public int getBabyNum() {
        return babyNum;
    }

    public void setBabyNum(int babyNum) {
        this.babyNum = babyNum;
    }

    public int getLuggateNum() {
        return luggateNum;
    }

    public void setLuggateNum(int luggateNum) {
        this.luggateNum = luggateNum;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public String getPlanTakeTime() {
        return planTakeTime;
    }

    public void setPlanTakeTime(String planTakeTime) {
        this.planTakeTime = planTakeTime;
    }

    public String getPlanLandTime() {
        return planLandTime;
    }

    public void setPlanLandTime(String planLandTime) {
        this.planLandTime = planLandTime;
    }

    public String getRealTakeTime() {
        return realTakeTime;
    }

    public void setRealTakeTime(String realTakeTime) {
        this.realTakeTime = realTakeTime;
    }

    public String getRealLandTime() {
        return realLandTime;
    }

    public void setRealLandTime(String realLandTime) {
        this.realLandTime = realLandTime;
    }

    public String getBlockTime() {
        return BlockTime;
    }

    public void setBlockTime(String blockTime) {
        BlockTime = blockTime;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    public String getDelayRemark() {
        return delayRemark;
    }

    public void setDelayRemark(String delayRemark) {
        this.delayRemark = delayRemark;
    }

    public int getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getDoorOpenTime() {
        return doorOpenTime;
    }

    public void setDoorOpenTime(String doorOpenTime) {
        this.doorOpenTime = doorOpenTime;
    }

    public String getDoorCloseTime() {
        return doorCloseTime;
    }

    public void setDoorCloseTime(String doorCloseTime) {
        this.doorCloseTime = doorCloseTime;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }


    @Override
    public String toString() {
        return "FlightRecord{" +
                "id=" + id +
                ", code=" + code +
                ", doDate=" + doDate +
                ", airCode='" + airCode + '\'' +
                ", flightNo='" + flightNo + '\'' +
                ", no='" + no + '\'' +
                ", inOut='" + inOut + '\'' +
                ", nature='" + nature + '\'' +
                ", task='" + task + '\'' +
                ", attribute='" + attribute + '\'' +
                ", seat='" + seat + '\'' +
                ", gate='" + gate + '\'' +
                ", luggageTurnTable='" + luggageTurnTable + '\'' +
                ", relationId=" + relationId +
                ", airlineId=" + airlineId +
                ", airlineCompany='" + airlineCompany + '\'' +
                ", flightMission='" + flightMission + '\'' +
                ", flightAgent='" + flightAgent + '\'' +
                ", airportStart='" + airportStart + '\'' +
                ", airportEnd='" + airportEnd + '\'' +
                ", airportEndSpare='" + airportEndSpare + '\'' +
                ", adultNum=" + adultNum +
                ", childNum=" + childNum +
                ", babyNum=" + babyNum +
                ", luggateNum=" + luggateNum +
                ", cargoWeight=" + cargoWeight +
                ", planTakeTime='" + planTakeTime + '\'' +
                ", planLandTime='" + planLandTime + '\'' +
                ", realTakeTime='" + realTakeTime + '\'' +
                ", realLandTime='" + realLandTime + '\'' +
                ", BlockTime='" + BlockTime + '\'' +
                ", removeTime='" + removeTime + '\'' +
                ", delayRemark='" + delayRemark + '\'' +
                ", delayTime=" + delayTime +
                ", terminal='" + terminal + '\'' +
                ", doorOpenTime='" + doorOpenTime + '\'' +
                ", doorCloseTime='" + doorCloseTime + '\'' +
                ", flightStatus='" + flightStatus + '\'' +
                ", isFirst='" + isFirst + '\'' +
                '}';
    }
}
