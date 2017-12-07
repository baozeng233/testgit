package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsBasicCountry;
import com.zeus.baseddata.mybatis.model.based.HsBasicCountryCriteria;

public interface HsBasicCountryMapper {
    int countByExample(HsBasicCountryCriteria example);

    int deleteByExample(HsBasicCountryCriteria example);

    int deleteByPrimaryKey(Long countryId);

    int insert(HsBasicCountry record);

    int insertSelective(HsBasicCountry record);

    List<HsBasicCountry> selectByExample(HsBasicCountryCriteria example);

    HsBasicCountry selectByPrimaryKey(Long countryId);

    int updateByExampleSelective(@Param("record") HsBasicCountry record, @Param("example") HsBasicCountryCriteria example);

    int updateByExample(@Param("record") HsBasicCountry record, @Param("example") HsBasicCountryCriteria example);

    int updateByPrimaryKeySelective(HsBasicCountry record);

    int updateByPrimaryKey(HsBasicCountry record);
}