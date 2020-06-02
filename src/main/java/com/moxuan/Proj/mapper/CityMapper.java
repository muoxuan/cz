package com.moxuan.Proj.mapper;


import com.moxuan.Proj.pojo.City;
import com.moxuan.Proj.pojo.Province;
import org.apache.ibatis.annotations.*;


import java.util.List;

@Mapper
public interface CityMapper {
    @Select("select * from city")
    @Results({@Result(column="postal_code",property="postalCode")})
    List<City> findAllCity();

    @Select("select p.id id, p.name name, p.abbreviation abbreviation from province p, city_province cp where #{id} = cp.city_id and p.id = cp.province_id")
    List<Province> findAllProvince(City city);

    @Insert("insert into city values(#{id},#{name},#{postalCode})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn="id")
    void saveCity(City city);

    @Insert("insert into city_province values(null, #{id}, (select id from province where name = #{province.name}))")
    void saveCityAndProvince(City city);

    @Delete("DELETE from city where id = #{id}")
    void deleteCity(City city);


}
