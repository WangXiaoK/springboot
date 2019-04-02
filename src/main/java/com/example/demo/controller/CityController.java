 /**  
    * @Title: CityController.java
    * @Package com.example.demo.controller
    * @Description: TODO(用一句话描述该文件做什么)
    * @author wjk
    * @date 2018年5月10日
    * @version V1.0  
    */

package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.City;
import com.example.demo.service.CityService;


@RequestMapping("/city")
@RestController
public class CityController {
    @Resource 
    private  CityService cityService;
   
    @GetMapping("/insertValues")
    public void insertValus() {
        City city =  new  City();
        city.setCityCode("370000");
        city.setCityName("山东");
        city.setId(2);
        cityService.insertValues(city);
    }

    @GetMapping("/list")
    public List<City> listCity() {
        return  cityService.listCity();
    }
 
    @RequestMapping("getCityById")
    public City selectByPrimaryKey() {
        return  cityService.selectByPrimaryKey(2);
    }
}
