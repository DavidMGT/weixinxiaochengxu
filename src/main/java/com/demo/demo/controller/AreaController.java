package com.demo.demo.controller;

import com.demo.demo.dao.AreaDao;
import com.demo.demo.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaDao areaService;
    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    private Map<String,Object> listArea(){
        Map<String ,Object> modelmap=new HashMap<String,Object>();
        List<Area> list=areaService.queryArea();
        modelmap.put("areaList",list);
        return modelmap;
    }
    @RequestMapping(value = "/getAreaById",method = RequestMethod.GET,params = "areaId")
    private Map<String,Object> getByAreaId(String areaId){
        Map<String ,Object> modelmap=new HashMap<String,Object>();
        List<Area> list=areaService.getAreaById(areaId);
        modelmap.put("areas",list);
        return modelmap;
    }
    @RequestMapping(value = "/insertArea",method = RequestMethod.GET)
    private void insertArea(Area area){
        areaService.insertArea(area);
    }
}
