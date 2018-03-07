package com.demo.demo.dao;

import com.demo.demo.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
   @Autowired
   AreaDao areaDao;
    @Test
    public void queryArea() {
       List<Area> areaList=areaDao.queryArea();

       assertEquals(2,areaList.size());
    }

    @Test
    public void getAreaById() {
    }

    @Test
    public void insertArea() {
        Area area=new Area();
        area.setAreaName("日本-苍井空"+new Date());
        area.setPrivority(3);
        area.setLastEditTime(new Date());
        areaDao.insertArea(area) ;
    }

    @Test
    public void updateArea() {
    }

    @Test
    public void deleteArea() {
    }
}