package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsCommExportField;
import com.zeus.baseddata.mybatis.model.based.HsCommExportFieldCriteria;

public interface HsCommExportFieldMapper {
    int countByExample(HsCommExportFieldCriteria example);

    int deleteByExample(HsCommExportFieldCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(HsCommExportField record);

    int insertSelective(HsCommExportField record);

    List<HsCommExportField> selectByExample(HsCommExportFieldCriteria example);

    HsCommExportField selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HsCommExportField record, @Param("example") HsCommExportFieldCriteria example);

    int updateByExample(@Param("record") HsCommExportField record, @Param("example") HsCommExportFieldCriteria example);

    int updateByPrimaryKeySelective(HsCommExportField record);

    int updateByPrimaryKey(HsCommExportField record);
}