/*
 * 文 件 名:  IBasicCountyService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  IBasicCountyService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月28日 下午2:30:04
*/
package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.based.CountyDTO;
import com.zeus.baseddata.entity.based.RegionResultDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicCounty;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: IBasicCountyService
* @Description: 区县管理服务
* @author lifeng 2017年11月28日 下午2:30:04
* 
*/
public interface IBasicCountyService{
    
    /** 
     * @Title: queryMaxCountyOder
     * @Description: 获得区县最大顺序
     * @param @return
     * @return Long
     * @throws 
     * @author lifeng 2017年11月21日 上午10:59:24
      */
    Long queryMaxCountyOder();
    
    /** 
     * @Title: getCountyByCityId
     * @Description: 获取城市关联的区县列表
     * @param @param cityId
     * @param @return
     * @return List<HsBasicCounty>
     * @throws 
     * @author lifeng 2017年11月14日 下午1:17:26
      */
    List<HsBasicCounty> queryCounty(Long cityId);
    
    /** 
     * @Title: addCounty
     * @Description: 区县新增
     * @param @param county
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月14日 下午1:40:55
      */
    int addCounty(HsBasicCounty county);
    
    /** 
     * @Title: getCountyByName
     * @Description: 通过名称获取区县信息
     * @param @param countyName
     * @param @return
     * @return List<HsBasicCounty>
     * @throws 
     * @author lifeng 2017年11月14日 下午1:46:50
      */
    List<HsBasicCounty> getCountyByName(HsBasicCounty county);
    
    /** 
    * @Title: getCountyByCode
    * @Description: 通过code获取区县信息
    * @param @param countyCode
    * @param @return
    * @return List<HsBasicCounty>
    * @throws 
    * @author lifeng 2017年11月14日 下午1:46:55
     */
    List<HsBasicCounty> getCountyByCode(String countyCode);
    
    /** 
    * @Title: editCounty
    * @Description: 区县编辑
    * @param @param county
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 下午2:02:08
     */
    int editCounty(HsBasicCounty county);
    
    /** 
     * @Title: deleteCounty
     * @Description: 逻辑删除区县
     * @param @param id
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月14日 下午2:20:37
      */
    int deleteCounty(HsBasicCounty county);
    
    /** 
     * @Title: queryCountyInfo
     * @Description: 通过id查询区县明细
     * @param @param countyId
     * @param @return
     * @return ResultBean<CountyDTO>
     * @throws 
     * @author lifeng 2017年11月23日 下午3:58:08
      */
    CountyDTO queryCountyInfo(Long countyId);
    
    /** 
     * @Title: queryRegionInfo
     * @Description: 区县查询关联的国省市
     * @param @param countyId
     * @param @return
     * @return RegionResultDTO
     * @throws 
     * @author lifeng 2017年11月21日 下午3:49:13
      */
    RegionResultDTO queryRegionInfo(Long countyId);
    
    /** 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @param @param queryParam
    * @param @return
    * @return PageDataInfo<HsBasicCounty>
    * @throws 
    * @author lifeng 2017年11月30日 下午7:24:18
     */
    PageDataInfo<HsBasicCounty> pageQuery(PageQueryInfo<HsBasicCounty> queryParam);
    
}
