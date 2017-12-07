package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsBasicArea;
import com.zeus.baseddata.mybatis.model.based.HsBasicAreaCriteria;

public interface HsBasicAreaMapper {
    int countByExample(HsBasicAreaCriteria example);

    int deleteByExample(HsBasicAreaCriteria example);

    int deleteByPrimaryKey(Long areaId);

    int insert(HsBasicArea record);

    int insertSelective(HsBasicArea record);

    List<HsBasicArea> selectByExample(HsBasicAreaCriteria example);

    HsBasicArea selectByPrimaryKey(Long areaId);

    int updateByExampleSelective(@Param("record") HsBasicArea record, @Param("example") HsBasicAreaCriteria example);

    int updateByExample(@Param("record") HsBasicArea record, @Param("example") HsBasicAreaCriteria example);

    int updateByPrimaryKeySelective(HsBasicArea record);

    int updateByPrimaryKey(HsBasicArea record);
}