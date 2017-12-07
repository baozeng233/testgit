package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.user.HsAuthResource;
import com.zeus.baseddata.mybatis.model.user.HsAuthResourceCriteria;

public interface HsAuthResourceMapper {
    int countByExample(HsAuthResourceCriteria example);

    int deleteByExample(HsAuthResourceCriteria example);

    int deleteByPrimaryKey(Long resId);

    int insert(HsAuthResource record);

    int insertSelective(HsAuthResource record);

    List<HsAuthResource> selectByExample(HsAuthResourceCriteria example);

    HsAuthResource selectByPrimaryKey(Long resId);

    int updateByExampleSelective(@Param("record") HsAuthResource record, @Param("example") HsAuthResourceCriteria example);

    int updateByExample(@Param("record") HsAuthResource record, @Param("example") HsAuthResourceCriteria example);

    int updateByPrimaryKeySelective(HsAuthResource record);

    int updateByPrimaryKey(HsAuthResource record);
}