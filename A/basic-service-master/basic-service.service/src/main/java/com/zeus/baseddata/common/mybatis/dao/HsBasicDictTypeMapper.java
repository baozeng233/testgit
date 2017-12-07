package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsBasicDictType;
import com.zeus.baseddata.mybatis.model.based.HsBasicDictTypeCriteria;

public interface HsBasicDictTypeMapper {
    int countByExample(HsBasicDictTypeCriteria example);

    int deleteByExample(HsBasicDictTypeCriteria example);

    int deleteByPrimaryKey(String typeCode);

    int insert(HsBasicDictType record);

    int insertSelective(HsBasicDictType record);

    List<HsBasicDictType> selectByExample(HsBasicDictTypeCriteria example);

    HsBasicDictType selectByPrimaryKey(String typeCode);

    int updateByExampleSelective(@Param("record") HsBasicDictType record, @Param("example") HsBasicDictTypeCriteria example);

    int updateByExample(@Param("record") HsBasicDictType record, @Param("example") HsBasicDictTypeCriteria example);

    int updateByPrimaryKeySelective(HsBasicDictType record);

    int updateByPrimaryKey(HsBasicDictType record);
}