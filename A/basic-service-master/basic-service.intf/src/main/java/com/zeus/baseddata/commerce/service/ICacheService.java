/*
 * 文 件 名:  ICacheService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  ICacheService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年12月6日 上午9:24:35
*/
package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.mybatis.model.based.HsBasicCache;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: ICacheService
* @Description: 缓存管理服务接口定义
* @author lifeng 2017年12月6日 上午9:24:35
* 
*/
public interface ICacheService{
    
    /** 
    * @Title: pageQuery
    * @Description: 缓存分页条件查询
    * @param @param queryInfo
    * @param @return
    * @return PageDataInfo<HsBasicCache>
    * @throws 
    * @author lifeng 2017年12月6日 上午9:35:13
     */
    PageDataInfo<HsBasicCache> pageQuery(PageQueryInfo<HsBasicCache> queryInfo);
    
    /**
    * 
    * @Title: changeAble
    * @Description: 启用/停用缓存服务 
    * @param @param cache
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年12月6日 上午10:11:37
    */
    int updateCache(HsBasicCache cache);
    
    /** 
    * @Title: getCachebyCode
    * @Description: 用过缓存代码获取缓存
    * @param @param cacheCode
    * @param @return
    * @return List<HsBasicCache>
    * @throws 
    * @author lifeng 2017年12月6日 上午10:32:56
     */
    List<HsBasicCache> getCachebyCode(String cacheCode);
    
    /** 
    * @Title: getCachebyName
    * @Description: 用过缓存名称获取缓存
    * @param @param cacheName
    * @param @return
    * @return List<HsBasicCache>
    * @throws 
    * @author lifeng 2017年12月6日 上午10:38:00
     */
    List<HsBasicCache> getCachebyName(String cacheName);
    
    /** 
    * @Title: addCache
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * @param @param cache
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年12月6日 上午10:58:20
     */
    int addCache(HsBasicCache cache);
    
}
