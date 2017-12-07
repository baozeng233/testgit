package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.person.HsBasicEmployee;
import com.zeus.baseddata.mybatis.model.person.HsBasicEmployeeCriteria;

public interface HsBasicEmployeeMapper {
    int countByExample(HsBasicEmployeeCriteria example);

    int deleteByExample(HsBasicEmployeeCriteria example);

    int deleteByPrimaryKey(Long employeeId);

    int insert(HsBasicEmployee record);

    int insertSelective(HsBasicEmployee record);

    List<HsBasicEmployee> selectByExample(HsBasicEmployeeCriteria example);

    HsBasicEmployee selectByPrimaryKey(Long employeeId);

    int updateByExampleSelective(@Param("record") HsBasicEmployee record, @Param("example") HsBasicEmployeeCriteria example);

    int updateByExample(@Param("record") HsBasicEmployee record, @Param("example") HsBasicEmployeeCriteria example);

    int updateByPrimaryKeySelective(HsBasicEmployee record);

    int updateByPrimaryKey(HsBasicEmployee record);
}