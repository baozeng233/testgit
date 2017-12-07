package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsBasicPart;
import com.zeus.baseddata.mybatis.model.based.HsBasicPartCriteria;

public interface HsBasicPartMapper {
    int countByExample(HsBasicPartCriteria example);

    int deleteByExample(HsBasicPartCriteria example);

    int deleteByPrimaryKey(Long partId);

    int insert(HsBasicPart record);

    int insertSelective(HsBasicPart record);

    List<HsBasicPart> selectByExample(HsBasicPartCriteria example);

    HsBasicPart selectByPrimaryKey(Long partId);

    int updateByExampleSelective(@Param("record") HsBasicPart record, @Param("example") HsBasicPartCriteria example);

    int updateByExample(@Param("record") HsBasicPart record, @Param("example") HsBasicPartCriteria example);

    int updateByPrimaryKeySelective(HsBasicPart record);

    int updateByPrimaryKey(HsBasicPart record);
}