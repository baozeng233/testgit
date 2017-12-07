package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsBasicTown;
import com.zeus.baseddata.mybatis.model.based.HsBasicTownCriteria;

public interface HsBasicTownMapper {
    int countByExample(HsBasicTownCriteria example);

    int deleteByExample(HsBasicTownCriteria example);

    int deleteByPrimaryKey(Long townId);

    int insert(HsBasicTown record);

    int insertSelective(HsBasicTown record);

    List<HsBasicTown> selectByExample(HsBasicTownCriteria example);

    HsBasicTown selectByPrimaryKey(Long townId);

    int updateByExampleSelective(@Param("record") HsBasicTown record, @Param("example") HsBasicTownCriteria example);

    int updateByExample(@Param("record") HsBasicTown record, @Param("example") HsBasicTownCriteria example);

    int updateByPrimaryKeySelective(HsBasicTown record);

    int updateByPrimaryKey(HsBasicTown record);
}