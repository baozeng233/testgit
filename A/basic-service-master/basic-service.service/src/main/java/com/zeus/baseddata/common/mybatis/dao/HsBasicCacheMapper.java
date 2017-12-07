package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsBasicCache;
import com.zeus.baseddata.mybatis.model.based.HsBasicCacheCriteria;

public interface HsBasicCacheMapper {
    int countByExample(HsBasicCacheCriteria example);

    int deleteByExample(HsBasicCacheCriteria example);

    int deleteByPrimaryKey(Long cacheId);

    int insert(HsBasicCache record);

    int insertSelective(HsBasicCache record);

    List<HsBasicCache> selectByExample(HsBasicCacheCriteria example);

    HsBasicCache selectByPrimaryKey(Long cacheId);

    int updateByExampleSelective(@Param("record") HsBasicCache record, @Param("example") HsBasicCacheCriteria example);

    int updateByExample(@Param("record") HsBasicCache record, @Param("example") HsBasicCacheCriteria example);

    int updateByPrimaryKeySelective(HsBasicCache record);

    int updateByPrimaryKey(HsBasicCache record);
}