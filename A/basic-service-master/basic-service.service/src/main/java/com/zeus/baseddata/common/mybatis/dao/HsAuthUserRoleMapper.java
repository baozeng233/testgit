package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.user.HsAuthUserRole;
import com.zeus.baseddata.mybatis.model.user.HsAuthUserRoleCriteria;

public interface HsAuthUserRoleMapper {
    int countByExample(HsAuthUserRoleCriteria example);

    int deleteByExample(HsAuthUserRoleCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(HsAuthUserRole record);

    int insertSelective(HsAuthUserRole record);

    List<HsAuthUserRole> selectByExample(HsAuthUserRoleCriteria example);

    HsAuthUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HsAuthUserRole record, @Param("example") HsAuthUserRoleCriteria example);

    int updateByExample(@Param("record") HsAuthUserRole record, @Param("example") HsAuthUserRoleCriteria example);

    int updateByPrimaryKeySelective(HsAuthUserRole record);

    int updateByPrimaryKey(HsAuthUserRole record);
}