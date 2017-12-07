package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsBasicDict;
import com.zeus.baseddata.mybatis.model.based.HsBasicDictCriteria;

public interface HsBasicDictMapper {
    int countByExample(HsBasicDictCriteria example);

    int deleteByExample(HsBasicDictCriteria example);

    int deleteByPrimaryKey(Long dictId);

    int insert(HsBasicDict record);

    int insertSelective(HsBasicDict record);

    List<HsBasicDict> selectByExample(HsBasicDictCriteria example);

    HsBasicDict selectByPrimaryKey(Long dictId);

    int updateByExampleSelective(@Param("record") HsBasicDict record, @Param("example") HsBasicDictCriteria example);

    int updateByExample(@Param("record") HsBasicDict record, @Param("example") HsBasicDictCriteria example);

    int updateByPrimaryKeySelective(HsBasicDict record);

    int updateByPrimaryKey(HsBasicDict record);
}