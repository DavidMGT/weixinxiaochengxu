package com.demo.demo.entity;

import java.util.Date;

public class Area {
    private Integer areaId;
    private String areaName;
    private Date createTime;
    private Date lastEditTime;

    public int getPrivority() {
        return priority;
    }

    public void setPrivority(int privority) {
        this.priority = privority;
    }

    private int priority;
    @Override
    public String toString() {
        return "Area{" +
                "areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                ", privority=" + priority +
                '}';
    }




    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }



    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }


}
