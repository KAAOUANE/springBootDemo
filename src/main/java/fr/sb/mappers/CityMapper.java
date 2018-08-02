package fr.sb.mappers;

import fr.sb.bean.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CityMapper {

    //@Select("SELECT * FROM CITY WHERE state = #{state}")
	City findByState(@Param("state") String state);

}
