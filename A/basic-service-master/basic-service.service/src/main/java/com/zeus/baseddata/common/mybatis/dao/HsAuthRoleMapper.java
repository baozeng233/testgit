package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.user.HsAuthRole;
import com.zeus.baseddata.mybatis.model.user.HsAuthRoleCriteria;

public interface HsAuthRoleMapper {
    int countByExample(HsAuthRoleCriteria example);

    int deleteByExample(HsAuthRoleCriteria example);

    int deleteByPrimaryKey(Long roleId);

    int insert(HsAuthRole record);

    int insertSelective(HsAuthRole record);

    List<HsAuthRole> selectByExample(HsAuthRoleCriteria example);

    HsAuthRole selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") HsAuthRole record, @Param("example") HsAuthRoleCriteria example);

    int updateByExample(@Param("record") HsAuthRole record, @Param("example") HsAuthRoleCriteria example);

    int updateByPrimaryKeySelective(HsAuthRole record);

    int updateByPrimaryKey(HsAuthRole record);
}