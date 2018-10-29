package com.carnoc.flight.statisticAnalysis.pojo;

import java.io.Serializable;

/**
 * 航班进出港流水表
 * @Author: hy
 * @Date 2018/10/26  20:23
 **/
public class FlightStream implements Serializable {


    private Integer id;
    private String flightNo;//航班号
    private Integer airlineId;//航空公司ID
    private String airlineCompany;//航空公司
    private String planTakeTime;//计划起飞
    private String planLandTime;//计划落地
    private String realTakeTime;//实际起飞
    private String realLandTime;//实际落地时间
    private String blockTime;//挡轮挡时间
    private String removeTime;//撤轮挡时间
    private String park;//停机位
    private String bridgesTime;//靠廊桥时间
    private String removeBridgesTime;//撤廊桥时间
    private String delayRemark;//航班延误原因
    private int delayTime;//航班延误时长
    private String abnormalRemark;//航班放行不正常原因
    private String terminal;//航站楼
    private String gate;//登机口
    private String luggageTurntable;//行李转盘
    private String doorOpenTime;//开舱门时间
    private String doorCloseTime;//关舱门时间
    private String cargodoorOpenTime;//开货舱门时间
    private String cargodoorCloseTime;//关货舱门时间

    public FlightStream(Integer id, String flightNo, Integer airlineId, String airlineCompany, String planTakeTime, String planLandTime, String realTakeTime, String realLandTime, String blockTime, String removeTime, String park, String bridgesTime, String removeBridgesTime, String delayRemark, int delayTime, String abnormalRemark, String terminal, String gate, String luggageTurntable, String doorOpenTime, String doorCloseTime, String cargodoorOpenTime, String cargodoorCloseTime) {
        this.id = id;
        this.flightNo = flightNo;
        this.airlineId = airlineId;
        this.airlineCompany = airlineCompany;
        this.planTakeTime = planTakeTime;
        this.planLandTime = planLandTime;
        this.realTakeTime = realTakeTime;
        this.realLandTime = realLandTime;
        this.blockTime = blockTime;
        this.removeTime = removeTime;
        this.park = park;
        this.bridgesTime = bridgesTime;
        this.removeBridgesTime = removeBridgesTime;
        this.delayRemark = delayRemark;
        this.delayTime = delayTime;
        this.abnormalRemark = abnormalRemark;
        this.terminal = terminal;
        this.gate = gate;
        this.luggageTurntable = luggageTurntable;
        this.doorOpenTime = doorOpenTime;
        this.doorCloseTime = doorCloseTime;
        this.cargodoorOpenTime = cargodoorOpenTime;
        this.cargodoorCloseTime = cargodoorCloseTime;
    }


    public FlightStream(String flightNo, Integer airlineId, String airlineCompany, String planTakeTime, String planLandTime, String realTakeTime, String realLandTime, String blockTime, String removeTime, String park, String bridgesTime, String removeBridgesTime, String delayRemark, int delayTime, String abnormalRemark, String terminal, String gate, String luggageTurntable, String doorOpenTime, String doorCloseTime, String cargodoorOpenTime, String cargodoorCloseTime) {
        this.flightNo = flightNo;
        this.airlineId = airlineId;
        this.airlineCompany = airlineCompany;
        this.planTakeTime = planTakeTime;
        this.planLandTime = planLandTime;
        this.realTakeTime = realTakeTime;
        this.realLandTime = realLandTime;
        this.blockTime = blockTime;
        this.removeTime = removeTime;
        this.park = park;
        this.bridgesTime = bridgesTime;
        this.removeBridgesTime = removeBridgesTime;
        this.delayRemark = delayRemark;
        this.delayTime = delayTime;
        this.abnormalRemark = abnormalRemark;
        this.terminal = terminal;
        this.gate = gate;
        this.luggageTurntable = luggageTurntable;
        this.doorOpenTime = doorOpenTime;
        this.doorCloseTime = doorCloseTime;
        this.cargodoorOpenTime = cargodoorOpenTime;
        this.cargodoorCloseTime = cargodoorCloseTime;
    }

    public FlightStream() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public Integer getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(Integer airlineId) {
        this.airlineId = airlineId;
    }

    public String getAirlineCompany() {
        return airlineCompany;
    }

    public void setAirlineCompany(String airlineCompany) {
        this.airlineCompany = airlineCompany;
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
        return blockTime;
    }

    public void setBlockTime(String blockTime) {
        this.blockTime = blockTime;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public String getBridgesTime() {
        return bridgesTime;
    }

    public void setBridgesTime(String bridgesTime) {
        this.bridgesTime = bridgesTime;
    }

    public String getRemoveBridgesTime() {
        return removeBridgesTime;
    }

    public void setRemoveBridgesTime(String removeBridgesTime) {
        this.removeBridgesTime = removeBridgesTime;
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

    public String getAbnormalRemark() {
        return abnormalRemark;
    }

    public void setAbnormalRemark(String abnormalRemark) {
        this.abnormalRemark = abnormalRemark;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getLuggageTurntable() {
        return luggageTurntable;
    }

    public void setLuggageTurntable(String luggageTurntable) {
        this.luggageTurntable = luggageTurntable;
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

    public String getCargodoorOpenTime() {
        return cargodoorOpenTime;
    }

    public void setCargodoorOpenTime(String cargodoorOpenTime) {
        this.cargodoorOpenTime = cargodoorOpenTime;
    }

    public String getCargodoorCloseTime() {
        return cargodoorCloseTime;
    }

    public void setCargodoorCloseTime(String cargodoorCloseTime) {
        this.cargodoorCloseTime = cargodoorCloseTime;
    }


    @Override
    public String toString() {
        return "FlightStream{" +
                "id=" + id +
                ", flightNo='" + flightNo + '\'' +
                ", airlineId=" + airlineId +
                ", airlineCompany='" + airlineCompany + '\'' +
                ", planTakeTime='" + planTakeTime + '\'' +
                ", planLandTime='" + planLandTime + '\'' +
                ", realTakeTime='" + realTakeTime + '\'' +
                ", realLandTime='" + realLandTime + '\'' +
                ", blockTime='" + blockTime + '\'' +
                ", removeTime='" + removeTime + '\'' +
                ", park='" + park + '\'' +
                ", bridgesTime='" + bridgesTime + '\'' +
                ", removeBridgesTime='" + removeBridgesTime + '\'' +
                ", delayRemark='" + delayRemark + '\'' +
                ", delayTime=" + delayTime +
                ", abnormalRemark='" + abnormalRemark + '\'' +
                ", terminal='" + terminal + '\'' +
                ", gate='" + gate + '\'' +
                ", luggageTurntable='" + luggageTurntable + '\'' +
                ", doorOpenTime='" + doorOpenTime + '\'' +
                ", doorCloseTime='" + doorCloseTime + '\'' +
                ", cargodoorOpenTime='" + cargodoorOpenTime + '\'' +
                ", cargodoorCloseTime='" + cargodoorCloseTime + '\'' +
                '}';
    }
}
