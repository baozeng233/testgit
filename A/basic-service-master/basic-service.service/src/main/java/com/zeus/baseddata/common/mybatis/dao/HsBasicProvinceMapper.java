package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsBasicProvince;
import com.zeus.baseddata.mybatis.model.based.HsBasicProvinceCriteria;

public interface HsBasicProvinceMapper {
    int countByExample(HsBasicProvinceCriteria example);

    int deleteByExample(HsBasicProvinceCriteria example);

    int deleteByPrimaryKey(Long provinceId);

    int insert(HsBasicProvince record);

    int insertSelective(HsBasicProvince record);

    List<HsBasicProvince> selectByExample(HsBasicProvinceCriteria example);

    HsBasicProvince selectByPrimaryKey(Long provinceId);

    int updateByExampleSelective(@Param("record") HsBasicProvince record, @Param("example") HsBasicProvinceCriteria example);

    int updateByExample(@Param("record") HsBasicProvince record, @Param("example") HsBasicProvinceCriteria example);

    int updateByPrimaryKeySelective(HsBasicProvince record);

    int updateByPrimaryKey(HsBasicProvince record);
}