/*
 * 文 件 名:  BasicBankAccountService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  BasicBankAccountService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月14日 下午8:59:38
*/
package com.zeus.baseddata.commerce.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicBankAccountDAO;
import com.zeus.baseddata.commerce.service.IBankAccountService;
import com.zeus.baseddata.entity.based.BankAccountDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicBankAccount;
import com.zeus.baseddata.mybatis.model.based.HsBasicBankAccountCriteria;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: BasicBankAccountService
* @Description: 开户行信息管理数据层服务
* @author lifeng 2017年11月14日 下午8:59:38
* 
*/
@Service(interfaceClass= IBankAccountService.class)
public class BasicBankAccountService implements IBankAccountService{
    
    @Resource
    private HsBasicBankAccountDAO bankDao;
    
    /** 
    * @Title: addBank
    * @Description: 开户行新增
    * @param @param bank
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月16日 上午11:23:23
     */
    public int addBank(HsBasicBankAccount bank){
        return bankDao.insertSelective(bank);
    }
    
    /** 
    * @Title: getbankByCode
    * @Description: 通过code获取开户行信息
    * @param @param accountCode
    * @param @return
    * @return List<HsBasicBankAccount>
    * @throws 
    * @author lifeng 2017年11月16日 上午11:33:19
     */
    public List<HsBasicBankAccount> getbankByCode(String accountCode){
        HsBasicBankAccountCriteria example= new HsBasicBankAccountCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andAccountCodeEqualTo(accountCode);
        return bankDao.selectByExample(example);
    }
    
    /** 
    * @Title: getbankName
    * @Description: 通过名称，所处城市获取开户行信息
    * @param @param bank
    * @param @return
    * @return List<HsBasicBankAccount>
    * @throws 
    * @author lifeng 2017年11月16日 上午11:33:23
     */
    public List<HsBasicBankAccount> getBankByName(HsBasicBankAccount bank){
        HsBasicBankAccountCriteria example= new HsBasicBankAccountCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andCityIdEqualTo(bank.getCityId())
            .andAccountNameEqualTo(bank.getAccountName());
        return bankDao.selectByExample(example);
    }
    
    /** 
    * @Title: editBank
    * @Description: 开户行编辑
    * @param @param bank
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月16日 下午12:12:25
     */
    public int editBank(HsBasicBankAccount bank){
        return bankDao.updateByPrimaryKeySelective(bank);
    }
    
    /** 
    * @Title: deletebank
    * @Description: 逻辑删除开户行
    * @param @param accountId
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月16日 下午1:35:57
     */
    public int deleteBank(HsBasicBankAccount bank){
        return bankDao.updateByPrimaryKeySelective(bank);
    }
    
    /** 
    * @Title: queryMaxOrder
    * @Description: queryMaxOrder
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年11月21日 上午10:16:34
     */
    public Long queryMaxOrder(){
        return bankDao.queryMaxOrder();
    }
    
    /** 
    * @Title: queryBankList
    * @Description: 通过所属银行，城市查询开户行
    * @param @param parentBankId
    * @param @param cityId
    * @param @return
    * @return List<HsBasicBankAccount>
    * @throws 
    * @author lifeng 2017年11月21日 下午2:40:31
     */
    public List<BankAccountDTO> queryBankList(Long parentBankId,Long cityId){
        return bankDao.selectBankList(parentBankId,cityId);
    }
    
    /** (非 Javadoc) 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @throws 
    * @author lifeng 2017年11月29日 下午8:28:02
     */
    @Override
    public PageDataInfo<BankAccountDTO> pageQuery(PageQueryInfo<HsBasicBankAccount> queryParam){
        PageHelper.startPage(queryParam.getPageNum(),queryParam.getPageSize());
        List<BankAccountDTO> list= bankDao.selectByQueryInfo(queryParam.getParam());
        PageInfo<BankAccountDTO> pageInfo= new PageInfo<>(list);
        PageDataInfo<BankAccountDTO> page= new PageDataInfo<>();
        page.setRows(list);
        page.setTotal(pageInfo.getTotal());
        page.setPages(pageInfo.getPages());
        return page;
    }
    
}
