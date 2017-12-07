package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.user.HsAuthRoleSiteType;
import com.zeus.baseddata.mybatis.model.user.HsAuthRoleSiteTypeCriteria;

public interface HsAuthRoleSiteTypeMapper {
    int countByExample(HsAuthRoleSiteTypeCriteria example);

    int deleteByExample(HsAuthRoleSiteTypeCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(HsAuthRoleSiteType record);

    int insertSelective(HsAuthRoleSiteType record);

    List<HsAuthRoleSiteType> selectByExample(HsAuthRoleSiteTypeCriteria example);

    HsAuthRoleSiteType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HsAuthRoleSiteType record, @Param("example") HsAuthRoleSiteTypeCriteria example);

    int updateByExample(@Param("record") HsAuthRoleSiteType record, @Param("example") HsAuthRoleSiteTypeCriteria example);

    int updateByPrimaryKeySelective(HsAuthRoleSiteType record);

    int updateByPrimaryKey(HsAuthRoleSiteType record);
}