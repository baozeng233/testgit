package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.person.HsBasicDept;
import com.zeus.baseddata.mybatis.model.person.HsBasicDeptCriteria;

public interface HsBasicDeptMapper {
    int countByExample(HsBasicDeptCriteria example);

    int deleteByExample(HsBasicDeptCriteria example);

    int deleteByPrimaryKey(Long deptId);

    int insert(HsBasicDept record);

    int insertSelective(HsBasicDept record);

    List<HsBasicDept> selectByExample(HsBasicDeptCriteria example);

    HsBasicDept selectByPrimaryKey(Long deptId);

    int updateByExampleSelective(@Param("record") HsBasicDept record, @Param("example") HsBasicDeptCriteria example);

    int updateByExample(@Param("record") HsBasicDept record, @Param("example") HsBasicDeptCriteria example);

    int updateByPrimaryKeySelective(HsBasicDept record);

    int updateByPrimaryKey(HsBasicDept record);
}