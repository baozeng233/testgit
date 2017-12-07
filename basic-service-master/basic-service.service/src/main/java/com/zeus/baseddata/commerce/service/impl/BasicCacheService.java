/*
 * 文 件 名: BasicCacheService.java
 * 版 权: Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描 述: BasicCacheService.java
 * 版 本： 1.0
 * 创 建 人: lifeng
 * 创建时间: 2017年12月06日 上午10:09:00
 */
package com.zeus.baseddata.commerce.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicCacheDAO;
import com.zeus.baseddata.commerce.service.ICacheService;
import com.zeus.baseddata.mybatis.model.based.HsBasicCache;
import com.zeus.baseddata.mybatis.model.based.HsBasicCacheCriteria;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: BasicCacheService
* @Description: 缓存配置管理
* @author lifeng 2017年12月06日 上午10:09:00
* 
*/
@Service(interfaceClass= ICacheService.class)
public class BasicCacheService implements ICacheService{
    
    @Resource
    private HsBasicCacheDAO CacheDAO;
    
    /** (非 Javadoc) 
    * @Title: pageQuery
    * @Description: 缓存分页条件查询
    * @throws 
    * @author lifeng 2017年12月6日 上午9:39:03
     */
    @Override
    public PageDataInfo<HsBasicCache> pageQuery(PageQueryInfo<HsBasicCache> queryInfo){
        PageHelper.startPage(queryInfo.getPageNum(),queryInfo.getPageSize());
        List<HsBasicCache> list= CacheDAO.queryByParam(queryInfo.getParam());
        PageInfo<HsBasicCache> pageInfo= new PageInfo<>(list);
        PageDataInfo<HsBasicCache> page= new PageDataInfo<>();
        page.setRows(list);
        page.setPages(pageInfo.getPages());
        page.setTotal(pageInfo.getTotal());
        return page;
    }
    
    /** (非 Javadoc) 
    * @Title: changeAble
    * @Description: 更新缓存服务 
    * @throws 
    * @author lifeng 2017年12月6日 上午10:11:51
     */
    @Override
    public int updateCache(HsBasicCache cache){
        return CacheDAO.updateByPrimaryKeySelective(cache);
    }
    
    /** (非 Javadoc) 
    * @Title: getCachebyCode
    * @Description: 用过缓存代码获取缓存
    * @throws 
    * @author lifeng 2017年12月6日 上午10:42:11
     */
    @Override
    public List<HsBasicCache> getCachebyCode(String cacheCode){
        HsBasicCacheCriteria example= new HsBasicCacheCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andCacheCodeEqualTo(cacheCode);
        return CacheDAO.selectByExample(example);
    }
    
    /** (非 Javadoc) 
    * @Title: getCachebyName
    * @Description: 用过缓存名称获取缓存
    * @throws 
    * @author lifeng 2017年12月6日 上午10:42:11
     */
    @Override
    public List<HsBasicCache> getCachebyName(String cacheName){
        HsBasicCacheCriteria example= new HsBasicCacheCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andCacheNameEqualTo(cacheName);
        return CacheDAO.selectByExample(example);
    }
    
    /** (非 Javadoc) 
    * @Title: addCache
    * @Description: 新增缓存
    * @throws 
    * @author lifeng 2017年12月6日 上午10:58:40
     */
    @Override
    public int addCache(HsBasicCache cache){
        return CacheDAO.insertSelective(cache);
    }
    
}
