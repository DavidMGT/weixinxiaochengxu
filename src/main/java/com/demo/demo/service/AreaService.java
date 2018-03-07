package com.demo.demo.service;

import com.demo.demo.entity.Area;

import java.util.List;

public interface AreaService {

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
