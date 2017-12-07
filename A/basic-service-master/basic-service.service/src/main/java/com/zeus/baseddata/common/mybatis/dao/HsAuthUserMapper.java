package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.user.HsAuthUser;
import com.zeus.baseddata.mybatis.model.user.HsAuthUserCriteria;

public interface HsAuthUserMapper {
    int countByExample(HsAuthUserCriteria example);

    int deleteByExample(HsAuthUserCriteria example);

    int deleteByPrimaryKey(Long userId);

    int insert(HsAuthUser record);

    int insertSelective(HsAuthUser record);

    List<HsAuthUser> selectByExample(HsAuthUserCriteria example);

    HsAuthUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") HsAuthUser record, @Param("example") HsAuthUserCriteria example);

    int updateByExample(@Param("record") HsAuthUser record, @Param("example") HsAuthUserCriteria example);

    int updateByPrimaryKeySelective(HsAuthUser record);

    int updateByPrimaryKey(HsAuthUser record);
}