/*
 * 文 件 名:  IBankAccountService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  IBankAccountService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月13日 上午10:58:14
*/
package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.based.BankAccountDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicBankAccount;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: IBankAccountService
* @Description: 开户行信息服务调用接口
* @author lifeng 2017年11月13日 上午10:58:14
* 
*/

public interface IBankAccountService{
    
    /** 
     * @Title: addBank
     * @Description: 开户行新增
     * @param @param bank
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月16日 上午11:10:11
      */
    int addBank(HsBasicBankAccount bank);
    
    /** 
     * @Title: getbankByCode
     * @Description: 通过code获取开户行信息
     * @param @param accountCode
     * @param @return
     * @return List<HsBasicBankAccount>
     * @throws 
     * @author lifeng 2017年11月16日 上午11:24:52
      */
    List<HsBasicBankAccount> getbankByCode(String accountCode);
    
    /** 
    * @Title: getBankByName
    * @Description: 通过名称，所处城市获取开户行信息
    * @param @param bank
    * @param @return
    * @return List<HsBasicBankAccount>
    * @throws 
    * @author lifeng 2017年11月16日 上午11:25:43
     */
    List<HsBasicBankAccount> getBankByName(HsBasicBankAccount bank);
    
    /** 
     * @Title: editBank
     * @Description: 开户行编辑
     * @param @param bank
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月16日 上午11:38:29
      */
    int editBank(HsBasicBankAccount bank);
    
    /** 
     * @Title: deleteBank
     * @Description: 删除开户行
     * @param @param bank
     * @return void
     * @throws 
     * @author lifeng 2017年11月16日 下午1:25:22
      */
    int deleteBank(HsBasicBankAccount bank);
    
    /** 
     * @Title: queryBankList
     * @Description: 通过所属银行，城市查询开户行
     * @param @param parentBankId
     * @param @param cityId
     * @param @return
     * @return List<HsBasicBankAccount>
     * @throws 
     * @author lifeng 2017年11月21日 下午2:37:31
      */
    List<BankAccountDTO> queryBankList(Long parentBankId,Long cityId);
    
    /** 
     * @Title: queryMaxOrder
     * @Description: 获取max顺序
     * @param @return
     * @return Long
     * @throws 
     * @author lifeng 2017年11月21日 上午10:14:50
      */
    Long queryMaxOrder();
    
    /** 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @param @param queryParam
    * @param @return
    * @return PageDataInfo<BankAccountDTO>
    * @throws 
    * @author lifeng 2017年11月29日 下午8:27:34
     */
    PageDataInfo<BankAccountDTO> pageQuery(PageQueryInfo<HsBasicBankAccount> queryParam);
    
}
