package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.user.HsAuthMenus;
import com.zeus.baseddata.mybatis.model.user.HsAuthMenusCriteria;

public interface HsAuthMenusMapper {
    int countByExample(HsAuthMenusCriteria example);

    int deleteByExample(HsAuthMenusCriteria example);

    int deleteByPrimaryKey(Long menuId);

    int insert(HsAuthMenus record);

    int insertSelective(HsAuthMenus record);

    List<HsAuthMenus> selectByExample(HsAuthMenusCriteria example);

    HsAuthMenus selectByPrimaryKey(Long menuId);

    int updateByExampleSelective(@Param("record") HsAuthMenus record, @Param("example") HsAuthMenusCriteria example);

    int updateByExample(@Param("record") HsAuthMenus record, @Param("example") HsAuthMenusCriteria example);

    int updateByPrimaryKeySelective(HsAuthMenus record);

    int updateByPrimaryKey(HsAuthMenus record);
}