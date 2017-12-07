package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.user.HsAuthMenuRes;
import com.zeus.baseddata.mybatis.model.user.HsAuthMenuResCriteria;

public interface HsAuthMenuResMapper {
    int countByExample(HsAuthMenuResCriteria example);

    int deleteByExample(HsAuthMenuResCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(HsAuthMenuRes record);

    int insertSelective(HsAuthMenuRes record);

    List<HsAuthMenuRes> selectByExample(HsAuthMenuResCriteria example);

    HsAuthMenuRes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HsAuthMenuRes record, @Param("example") HsAuthMenuResCriteria example);

    int updateByExample(@Param("record") HsAuthMenuRes record, @Param("example") HsAuthMenuResCriteria example);

    int updateByPrimaryKeySelective(HsAuthMenuRes record);

    int updateByPrimaryKey(HsAuthMenuRes record);
}