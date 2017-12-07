package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsCommTemplate;
import com.zeus.baseddata.mybatis.model.based.HsCommTemplateCriteria;

public interface HsCommTemplateMapper {
    int countByExample(HsCommTemplateCriteria example);

    int deleteByExample(HsCommTemplateCriteria example);

    int deleteByPrimaryKey(Long templateId);

    int insert(HsCommTemplate record);

    int insertSelective(HsCommTemplate record);

    List<HsCommTemplate> selectByExample(HsCommTemplateCriteria example);

    HsCommTemplate selectByPrimaryKey(Long templateId);

    int updateByExampleSelective(@Param("record") HsCommTemplate record, @Param("example") HsCommTemplateCriteria example);

    int updateByExample(@Param("record") HsCommTemplate record, @Param("example") HsCommTemplateCriteria example);

    int updateByPrimaryKeySelective(HsCommTemplate record);

    int updateByPrimaryKey(HsCommTemplate record);
}