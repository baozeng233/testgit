package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsBasicCity;
import com.zeus.baseddata.mybatis.model.based.HsBasicCityCriteria;

public interface HsBasicCityMapper {
    int countByExample(HsBasicCityCriteria example);

    int deleteByExample(HsBasicCityCriteria example);

    int deleteByPrimaryKey(Long cityId);

    int insert(HsBasicCity record);

    int insertSelective(HsBasicCity record);

    List<HsBasicCity> selectByExample(HsBasicCityCriteria example);

    HsBasicCity selectByPrimaryKey(Long cityId);

    int updateByExampleSelective(@Param("record") HsBasicCity record, @Param("example") HsBasicCityCriteria example);

    int updateByExample(@Param("record") HsBasicCity record, @Param("example") HsBasicCityCriteria example);

    int updateByPrimaryKeySelective(HsBasicCity record);

    int updateByPrimaryKey(HsBasicCity record);
}