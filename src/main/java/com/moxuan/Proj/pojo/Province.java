package com.moxuan.Proj.pojo;

import java.util.List;

public class Province {

    private int id;
    private String name;
    private String abbreviation;
    private List<City> cities;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }
}
