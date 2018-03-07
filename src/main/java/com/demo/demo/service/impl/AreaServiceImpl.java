package com.demo.demo.service.impl;

import com.demo.demo.entity.Area;
import com.demo.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaService areaService;
    @Override
    public List<Area> queryArea() {
        return areaService.queryArea();
    }

    @Override
    public List<Area> getAreaById(String areaId) {
        return areaService.getAreaById(areaId);
    }

    @Override
    public int insertArea(Area area) {
        if (area.getAreaName()!=null){
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try{
                int effectNum=areaService.insertArea(area);
                if (effectNum>0)
                    return 1;
            }catch (Exception e){
                throw new RuntimeException(" 插入信息失败"+e.getMessage());
            }
        }else {
            throw new RuntimeException("区域信息为空") ;

        }
        return 0;
    }

    @Override
    public int updateArea(Area area) {
        return 0;
    }

    @Override
    public int deleteArea(int areaId) {
        return 0;
    }
}
