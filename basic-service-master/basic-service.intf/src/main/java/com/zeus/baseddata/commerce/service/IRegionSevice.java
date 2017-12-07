/*
 * 文 件 名:  IRegionSevice.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  IRegionSevice.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月13日 下午1:52:59
*/
package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.based.RegionResultDTO;
import com.zeus.baseddata.entity.based.TownDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicTown;

/** 
* @ClassName: IRegionSevice
* @Description: 行政区域管理服务调用接口
* @author lifeng 2017年11月13日 下午1:52:59
* 
*/
public interface IRegionSevice{
    
    /** 
     * @Title: queryCounty
     * @Description: 获取区县的关联乡镇列表
     * @param @param countyId
     * @param @return
     * @return List<HsBasicTown>
     * @throws 
     * @author lifeng 2017年11月14日 下午2:35:42
      */
    List<HsBasicTown> queryTown(Long countyId);
    
    /** 
     * @Title: addTown
     * @Description: 乡镇新增
     * @param @param town
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月14日 下午3:55:31
      */
    int addTown(HsBasicTown town);
    
    /** 
     * @Title: getTownByCode
     * @Description: 通过code获取乡镇信息
     * @param @param townCode
     * @param @return
     * @return List<HsBasicTown>
     * @throws 
     * @author lifeng 2017年11月14日 下午4:36:07
      */
    List<HsBasicTown> getTownByCode(String townCode);
    
    /** 
    * @Title: getTownByName
    * @Description: 通过name获取乡镇信息
    * @param @param town
    * @param @return
    * @return List<HsBasicTown>
    * @throws 
    * @author lifeng 2017年11月14日 下午4:36:14
     */
    List<HsBasicTown> getTownByName(HsBasicTown town);
    
    /** 
     * @Title: editTown
     * @Description: 编辑乡镇
     * @param @param town
     * @param @return
     * @return Object
     * @throws 
     * @author lifeng 2017年11月14日 下午5:13:58
      */
    int editTown(HsBasicTown town);
    
    /** 
    * @Title: deleteTown
    * @Description: 逻辑删除乡镇
    * @param @param id
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 下午5:21:39
     */
    int deleteTown(Long id);
    
    /** 
    * @Title: queryMaxTownOder
    * @Description: 获得乡镇最大顺序
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年11月21日 上午10:59:29
     */
    Long queryMaxTownOder();
    
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
    * @Title: queryTownInfo
    * @Description: 通过id查询乡镇明细
    * @param @param townId
    * @param @return
    * @return ResultBean<TownDTO>
    * @throws 
    * @author lifeng 2017年11月23日 下午3:58:11
     */
    TownDTO queryTownInfo(Long townId);
    
}
