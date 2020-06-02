package com.moxuan.Proj.service;

import com.moxuan.Proj.pojo.City;

import java.util.List;

public interface CityService {
    List<City> findAllCity();
    void saveCity(City city);
    void deleteCity(City city);

}
