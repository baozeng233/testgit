package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.person.HsBasicDeptJob;
import com.zeus.baseddata.mybatis.model.person.HsBasicDeptJobCriteria;

public interface HsBasicDeptJobMapper {
    int countByExample(HsBasicDeptJobCriteria example);

    int deleteByExample(HsBasicDeptJobCriteria example);

    int deleteByPrimaryKey(Long deptJobId);

    int insert(HsBasicDeptJob record);

    int insertSelective(HsBasicDeptJob record);

    List<HsBasicDeptJob> selectByExample(HsBasicDeptJobCriteria example);

    HsBasicDeptJob selectByPrimaryKey(Long deptJobId);

    int updateByExampleSelective(@Param("record") HsBasicDeptJob record, @Param("example") HsBasicDeptJobCriteria example);

    int updateByExample(@Param("record") HsBasicDeptJob record, @Param("example") HsBasicDeptJobCriteria example);

    int updateByPrimaryKeySelective(HsBasicDeptJob record);

    int updateByPrimaryKey(HsBasicDeptJob record);
}