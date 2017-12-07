package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.person.HsBasicJob;
import com.zeus.baseddata.mybatis.model.person.HsBasicJobCriteria;

public interface HsBasicJobMapper {
    int countByExample(HsBasicJobCriteria example);

    int deleteByExample(HsBasicJobCriteria example);

    int deleteByPrimaryKey(Long jobId);

    int insert(HsBasicJob record);

    int insertSelective(HsBasicJob record);

    List<HsBasicJob> selectByExample(HsBasicJobCriteria example);

    HsBasicJob selectByPrimaryKey(Long jobId);

    int updateByExampleSelective(@Param("record") HsBasicJob record, @Param("example") HsBasicJobCriteria example);

    int updateByExample(@Param("record") HsBasicJob record, @Param("example") HsBasicJobCriteria example);

    int updateByPrimaryKeySelective(HsBasicJob record);

    int updateByPrimaryKey(HsBasicJob record);
}