package com.zeus.baseddata.common.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.mybatis.model.based.HsBasicBankAccount;
import com.zeus.baseddata.mybatis.model.based.HsBasicBankAccountCriteria;

public interface HsBasicBankAccountMapper {
    int countByExample(HsBasicBankAccountCriteria example);

    int deleteByExample(HsBasicBankAccountCriteria example);

    int deleteByPrimaryKey(Long accountId);

    int insert(HsBasicBankAccount record);

    int insertSelective(HsBasicBankAccount record);

    List<HsBasicBankAccount> selectByExample(HsBasicBankAccountCriteria example);

    HsBasicBankAccount selectByPrimaryKey(Long accountId);

    int updateByExampleSelective(@Param("record") HsBasicBankAccount record, @Param("example") HsBasicBankAccountCriteria example);

    int updateByExample(@Param("record") HsBasicBankAccount record, @Param("example") HsBasicBankAccountCriteria example);

    int updateByPrimaryKeySelective(HsBasicBankAccount record);

    int updateByPrimaryKey(HsBasicBankAccount record);
}