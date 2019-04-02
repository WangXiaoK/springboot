package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.City;

public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

	List<City> selelctList();
}