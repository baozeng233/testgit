package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.person.HsBasicDeptJobRole;
import com.zeus.baseddata.mybatis.model.person.HsBasicDeptJobRoleCriteria;

public interface HsBasicDeptJobRoleMapper {
    int countByExample(HsBasicDeptJobRoleCriteria example);

    int deleteByExample(HsBasicDeptJobRoleCriteria example);

    int insert(HsBasicDeptJobRole record);

    int insertSelective(HsBasicDeptJobRole record);

    List<HsBasicDeptJobRole> selectByExample(HsBasicDeptJobRoleCriteria example);

    int updateByExampleSelective(@Param("record") HsBasicDeptJobRole record, @Param("example") HsBasicDeptJobRoleCriteria example);

    int updateByExample(@Param("record") HsBasicDeptJobRole record, @Param("example") HsBasicDeptJobRoleCriteria example);
}