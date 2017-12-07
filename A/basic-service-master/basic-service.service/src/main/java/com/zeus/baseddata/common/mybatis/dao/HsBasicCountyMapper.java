package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsBasicCounty;
import com.zeus.baseddata.mybatis.model.based.HsBasicCountyCriteria;

public interface HsBasicCountyMapper {
    int countByExample(HsBasicCountyCriteria example);

    int deleteByExample(HsBasicCountyCriteria example);

    int deleteByPrimaryKey(Long countyId);

    int insert(HsBasicCounty record);

    int insertSelective(HsBasicCounty record);

    List<HsBasicCounty> selectByExample(HsBasicCountyCriteria example);

    HsBasicCounty selectByPrimaryKey(Long countyId);

    int updateByExampleSelective(@Param("record") HsBasicCounty record, @Param("example") HsBasicCountyCriteria example);

    int updateByExample(@Param("record") HsBasicCounty record, @Param("example") HsBasicCountyCriteria example);

    int updateByPrimaryKeySelective(HsBasicCounty record);

    int updateByPrimaryKey(HsBasicCounty record);
}