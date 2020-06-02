package com.moxuan.Proj.controller;
import com.moxuan.Proj.pojo.City;
import com.moxuan.Proj.pojo.Province;
import com.moxuan.Proj.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;


    @GetMapping("/select")
    public ResponseEntity<List<City>> toBlogPage(Model model){


        List<City> all = cityService.findAllCity();
        return ResponseEntity.ok(all);
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveCity(@RequestParam("name") String name,
                                            @RequestParam("postalCode") String postalCode,
                                            @RequestParam("provinceName") String provinceName){
        City city = new City();
        city.setName(name);
        city.setPostalCode(postalCode);
        Province province = new Province();
        province.setName(provinceName);
        city.setProvince(province);
        cityService.saveCity(city);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/delete")
    public ResponseEntity<Boolean> deleteCity(@RequestParam("id") int id){
        City city = new City();
        city.setId(id);
        cityService.deleteCity(city);
        return ResponseEntity.ok().build();
    }

}
