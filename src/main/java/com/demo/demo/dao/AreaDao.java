package com.demo.demo.dao;

import com.demo.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     *
     * @return
     */
    List<Area> queryArea();

    List<Area> getAreaById(String areaId);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);
}
