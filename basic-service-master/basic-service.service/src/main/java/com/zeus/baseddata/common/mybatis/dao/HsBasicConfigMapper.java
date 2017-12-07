package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsBasicConfig;
import com.zeus.baseddata.mybatis.model.based.HsBasicConfigCriteria;

public interface HsBasicConfigMapper {
    int countByExample(HsBasicConfigCriteria example);

    int deleteByExample(HsBasicConfigCriteria example);

    int deleteByPrimaryKey(Long globalConfigId);

    int insert(HsBasicConfig record);

    int insertSelective(HsBasicConfig record);

    List<HsBasicConfig> selectByExample(HsBasicConfigCriteria example);

    HsBasicConfig selectByPrimaryKey(Long globalConfigId);

    int updateByExampleSelective(@Param("record") HsBasicConfig record, @Param("example") HsBasicConfigCriteria example);

    int updateByExample(@Param("record") HsBasicConfig record, @Param("example") HsBasicConfigCriteria example);

    int updateByPrimaryKeySelective(HsBasicConfig record);

    int updateByPrimaryKey(HsBasicConfig record);
}