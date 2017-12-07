/*
 * 文 件 名:  IBasicCityService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  IBasicCityService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月28日 下午2:29:52
*/
package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.based.CityDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicCity;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: IBasicCityService
* @Description: 城市管理接口
* @author lifeng 2017年11月28日 下午2:29:52
* 
*/
public interface IBasicCityService{
    
    /** 
    * @Title: queryMaxCityOder
    * @Description: 获得城市最大顺序
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年11月21日 上午10:59:21
     */
    Long queryMaxCityOder();
    
    /** 
     * @Title: queryCity
     * @Description: 查询省份关联的城市信息
     * @param @param provinceId
     * @param @return
     * @return List<HsBasicCity>
     * @throws 
     * @author lifeng 2017年11月14日 上午10:27:03
      */
    List<HsBasicCity> queryCity(Long provinceId);
    
    /** 
     * @Title: addCity
     * @Description: 新增城市
     * @param @param city
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月14日 上午10:46:02
      */
    int addCity(HsBasicCity city);
    
    /** 
    * @Title: getCityByName
    * @Description: 通过名称获取城市信息
    * @param @param cityName
    * @param @return
    * @return List<HsBasicCity>
    * @throws 
    * @author lifeng 2017年11月14日 上午10:47:45
     */
    List<HsBasicCity> getCityByName(HsBasicCity city);
    
    /** 
    * @Title: getCityByCode
    * @Description: 通过code获取城市信息
    * @param @param cityCode
    * @param @return
    * @return List<HsBasicCity>
    * @throws 
    * @author lifeng 2017年11月14日 上午10:47:49
     */
    List<HsBasicCity> getCityByCode(String cityCode);
    
    /** 
     * @Title: editCity
     * @Description: 编辑城市
     * @param @param city
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月14日 上午11:21:40
      */
    int editCity(HsBasicCity city);
    
    /** 
     * @Title: deleteCity
     * @Description: 逻辑删除城市
     * @param @param id
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月14日 上午11:37:52
      */
    int deleteCity(HsBasicCity city);
    
    /** 
     * @Title: queryCityInfo
     * @Description: 通过id查询城市明细
     * @param @param cityId
     * @param @return
     * @return ResultBean<CityDTO>
     * @throws 
     * @author lifeng 2017年11月23日 下午3:58:04
      */
    CityDTO queryCityInfo(Long cityId);
    
    /** 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @param @param queryInfo
    * @param @return
    * @return PageDataInfo<HsBasicCity>
    * @throws 
    * @author lifeng 2017年11月30日 下午5:43:14
     */
    PageDataInfo<HsBasicCity> pageQuery(PageQueryInfo<HsBasicCity> queryInfo);
    
}
