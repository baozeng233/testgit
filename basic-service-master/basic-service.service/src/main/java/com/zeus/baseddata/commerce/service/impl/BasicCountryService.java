/*
 * 文 件 名:  BasicCountryService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  BasicCountryService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月21日 下午5:14:06
*/
package com.zeus.baseddata.commerce.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.framework.common.utils.ObjectUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicCountryDAO;
import com.zeus.baseddata.commerce.service.IBasicCountryService;
import com.zeus.baseddata.mybatis.model.based.HsBasicCountry;
import com.zeus.baseddata.mybatis.model.based.HsBasicCountryCriteria;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: BasicCountryService
* @Description: 国家管理服务
* @author lifeng 2017年11月21日 下午5:14:06
* 
*/
@Service(interfaceClass= IBasicCountryService.class)
public class BasicCountryService implements IBasicCountryService{
    
    @Resource
    private HsBasicCountryDAO hsBasicCountryDAO;
    
    /** 
     * @Title: queryCountry
     * @Description: 查询国家列表
     * @param @return
     * @return List<HsBasicCountry>
     * @throws 
     * @author lifeng 2017年11月13日 下午2:33:15
      */
    public List<HsBasicCountry> queryCountry(){
        HsBasicCountryCriteria example= new HsBasicCountryCriteria();
        example.createCriteria().andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
        return hsBasicCountryDAO.selectByExample(example);
    }
    
    /** 
    * @Title: addCountry
    * @Description: 国家新增
    * @param @param country
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月13日 下午4:29:10
     */
    public int addCountry(HsBasicCountry country){
        return hsBasicCountryDAO.insertSelective(country);
    }
    
    /** 
    * @Title: editCountry
    * @Description: 国家编辑
    * @param @param country
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月13日 下午5:04:22
     */
    public int editCountry(HsBasicCountry country){
        return hsBasicCountryDAO.updateByPrimaryKeySelective(country);
    }
    
    /** 
     * @Title: getCountryByCode
     * @Description: 通过代码获取国家信息
     * @param @param countryCode
     * @param @return
     * @return List<HsBasicCountry>
     * @throws 
     * @author lifeng 2017年11月13日 下午4:18:04
      */
    public List<HsBasicCountry> getCountryByCode(String countryCode){
        HsBasicCountryCriteria example= new HsBasicCountryCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andCountryCodeEqualTo(countryCode);
        return hsBasicCountryDAO.selectByExample(example);
    }
    
    /** 
     * @Title: getCountryByName
     * @Description: 通过名称获取国家信息
     * @param @param countryName
     * @param @return
     * @return List<HsBasicCountry>
     * @throws 
     * @author lifeng 2017年11月13日 下午4:25:43
      */
    public List<HsBasicCountry> getCountryByName(String countryName){
        HsBasicCountryCriteria example= new HsBasicCountryCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andCountryNameEqualTo(countryName);
        return hsBasicCountryDAO.selectByExample(example);
    }
    
    /** 
    * @Title: deleteCountry
    * @Description: 逻辑删除国家
    * @param @param id
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月13日 下午7:23:59
     */
    public int deleteCountry(HsBasicCountry country){
        return hsBasicCountryDAO.updateByPrimaryKeySelective(country);
    }
    
    /** 
     * @Title: queryMaxCountryOder
     * @Description: 获得国家最大顺序
     * @param @return
     * @return Long
     * @throws 
     * @author lifeng 2017年11月21日 上午11:05:42
      */
    public Long queryMaxCountryOder(){
        return hsBasicCountryDAO.queryMaxOrder();
    }
    
    /** (非 Javadoc) 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @throws 
    * @author lifeng 2017年11月30日 下午7:15:50
     */
    @Override
    public PageDataInfo<HsBasicCountry> pageQuery(PageQueryInfo<HsBasicCountry> queryParam){
        PageHelper.startPage(queryParam.getPageNum(),queryParam.getPageSize());
        HsBasicCountry country= queryParam.getParam();
        HsBasicCountryCriteria example= new HsBasicCountryCriteria();
        if(ObjectUtils.isNotNull(country)){
            if(ObjectUtils.isNotNull(country.getCountryName()))
                example.or()
                    .andCountryNameLike("%"+ country.getCountryName()+ "%")
                    .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
            if(ObjectUtils.isNotNull(country.getCountryCode()))
                example.or()
                    .andCountryCodeLike("%"+ country.getCountryCode()+ "%")
                    .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
            if(ObjectUtils.isNotNull(country.getCountryPinyin()))
                example.or()
                    .andCountryPinyinLike("%"+ country.getCountryPinyin().toUpperCase()+ "%")
                    .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
        }
        List<HsBasicCountry> list= hsBasicCountryDAO.selectByExample(example);
        PageInfo<HsBasicCountry> pageInfo= new PageInfo<>(list);
        PageDataInfo<HsBasicCountry> page= new PageDataInfo<>();
        page.setRows(list);
        page.setTotal(pageInfo.getTotal());
        page.setPages(pageInfo.getPages());
        return page;
    }
    
}
