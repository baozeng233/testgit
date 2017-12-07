/*
 * 文 件 名:  HsBasicCacheDAO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  HsBasicCacheDAO.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年12月6日 上午9:27:10
*/
package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;

import com.zeus.baseddata.common.mybatis.dao.HsBasicCacheMapper;
import com.zeus.baseddata.mybatis.model.based.HsBasicCache;

/** 
* @ClassName: HsBasicCacheDAO
* @Description: 缓存自定义数据操作接口
* @author lifeng 2017年12月6日 上午9:27:10
* 
*/
public interface HsBasicCacheDAO extends HsBasicCacheMapper{
    
    /** 
    * @Title: queryByParam
    * @Description: 分页联合查询
    * @param @param param
    * @param @return
    * @return List<HsBasicCache>
    * @throws 
    * @author lifeng 2017年12月6日 上午11:38:26
     */
    List<HsBasicCache> queryByParam(HsBasicCache cache);
    
}
