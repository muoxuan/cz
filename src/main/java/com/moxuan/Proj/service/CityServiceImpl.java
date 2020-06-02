package com.moxuan.Proj.service;

import com.moxuan.Proj.mapper.CityMapper;
import com.moxuan.Proj.pojo.City;
import com.moxuan.Proj.pojo.Province;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> findAllCity() {
        List<City> allCity = cityMapper.findAllCity();
        for(City c : allCity){
            List<Province> allProvince = cityMapper.findAllProvince(c);
            if(allProvince != null){
                c.setProvince(allProvince.get(0));
            }
        }
        return allCity;
    }

    @Override
    @Transactional
    public void saveCity(City city) {
        cityMapper.saveCity(city);
        System.out.println(city);
        cityMapper.saveCityAndProvince(city);
    }

    @Override
    public void deleteCity(City city) {
        cityMapper.deleteCity(city);
    }


}
