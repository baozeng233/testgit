package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.common.mybatis.dao.HsBasicBankAccountMapper;
import com.zeus.baseddata.entity.based.BankAccountDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicBankAccount;

public interface HsBasicBankAccountDAO extends HsBasicBankAccountMapper{
    
    /** 
    * @Title: selectByQueryInfo
    * @Description: 条件查询
    * @param @param bankAccount
    * @param @return
    * @return List<BankAccountDTO>
    * @throws 
    * @author lifeng 2017年11月16日 上午10:06:11
     */
    List<BankAccountDTO> selectByQueryInfo(HsBasicBankAccount bankAccount);
    
    /** 
    * @Title: updateRdStatusByPrimaryKey
    * @Description: 逻辑删除开户行
    * @param @param accountId
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月16日 下午1:36:58
     */
    int updateRdStatusByPrimaryKey(Long accountId);
    
    /** 
    * @Title: queryMaxOrder
    * @Description: queryMaxOrder
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年11月21日 上午10:17:19
     */
    Long queryMaxOrder();
    
    /** 
    * @Title: queryBankList
    * @Description: 通过所属银行，城市查询开户行
    * @param @param parentBankId
    * @param @param cityId
    * @param @return
    * @return List<HsBasicBankAccount>
    * @throws 
    * @author lifeng 2017年11月21日 下午3:06:01
     */
    List<BankAccountDTO> selectBankList(@Param("parentBankId") Long parentBankId,
        @Param("cityId") Long cityId);
    
}
