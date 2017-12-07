/*
 * 文 件 名:  IBasicCountryService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  IBasicCountryService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月28日 下午2:29:32
*/
package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.mybatis.model.based.HsBasicCountry;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: IBasicCountryService
* @Description: 管家管理接口
* @author lifeng 2017年11月28日 下午2:29:32
* 
*/
public interface IBasicCountryService{
    
    /** 
     * @Title: queryMaxCountryOder
     * @Description: 获得国家最大顺序
     * @param @return
     * @return Long
     * @throws 
     * @author lifeng 2017年11月21日 上午10:59:13
      */
    Long queryMaxCountryOder();
    
    /** 
     * @Title: queryCountry
     * @Description: 查询国家信息列表
     * @param @return
     * @return List<HsBasicCountry>
     * @throws 
     * @author lifeng 2017年11月13日 下午2:18:14
      */
    List<HsBasicCountry> queryCountry();
    
    /** 
     * @Title: addCountry
     * @Description: 国家新增
     * @param @param country
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月13日 下午4:04:23
      */
    int addCountry(HsBasicCountry country);
    
    /** 
     * @Title: editCountry
     * @Description: 国家编辑
     * @param @param country
     * @return void
     * @throws 
     * @author lifeng 2017年11月13日 下午4:34:39
      */
    public int editCountry(HsBasicCountry country);
    
    /** 
     * @Title: getCountryByName
     * @Description: 通过名称获取国家信息
     * @param @param countryName
     * @param @return
     * @return HsBasicCountry
     * @throws 
     * @author lifeng 2017年11月13日 下午3:42:34
      */
    List<HsBasicCountry> getCountryByName(String countryName);
    
    /** 
     * @Title: getCountryByCode
     * @Description: 通过code获取国家信息
     * @param @param countryCode
     * @param @return
     * @return HsBasicCountry
     * @throws 
     * @author lifeng 2017年11月13日 下午3:51:22
      */
    List<HsBasicCountry> getCountryByCode(String countryCode);
    
    /** 
    * @Title: deleteCountry
    * @Description: 删除国家
    * @param @param id
    * @return void
    * @throws 
    * @author lifeng 2017年11月13日 下午5:36:07
     */
    int deleteCountry(HsBasicCountry country);
    
    /** 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @param @param queryParam
    * @param @return
    * @return PageDataInfo<HsBasicCountry>
    * @throws 
    * @author lifeng 2017年11月30日 下午7:13:49
     */
    PageDataInfo<HsBasicCountry> pageQuery(PageQueryInfo<HsBasicCountry> queryParam);
    
}
