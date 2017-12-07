package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.user.HsAuthRoleResource;
import com.zeus.baseddata.mybatis.model.user.HsAuthRoleResourceCriteria;

public interface HsAuthRoleResourceMapper {
    int countByExample(HsAuthRoleResourceCriteria example);

    int deleteByExample(HsAuthRoleResourceCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(HsAuthRoleResource record);

    int insertSelective(HsAuthRoleResource record);

    List<HsAuthRoleResource> selectByExample(HsAuthRoleResourceCriteria example);

    HsAuthRoleResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HsAuthRoleResource record, @Param("example") HsAuthRoleResourceCriteria example);

    int updateByExample(@Param("record") HsAuthRoleResource record, @Param("example") HsAuthRoleResourceCriteria example);

    int updateByPrimaryKeySelective(HsAuthRoleResource record);

    int updateByPrimaryKey(HsAuthRoleResource record);
}