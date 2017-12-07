/*
 * 文 件 名:  AuthResourceService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  AuthResourceService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月1日 上午11:13:43
*/
package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.user.AuthResourceDTO;
import com.zeus.baseddata.mybatis.model.user.HsAuthResource;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/**
 * 
 * @ClassName: AuthResourceService
 * @Description: 数据服务层-资源服务
 * @author lifeng 2017年10月31日 下午4:00:56
 *
 */
public interface IAuthResourceService{
    
    /**
     * 
     * @Title: addHsAuthResource
     * @Description: 资源添加
     * @param @param hsAuthResource
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月3日 上午10:59:28
     */
    int addHsAuthResource(HsAuthResource hsAuthResource);
    
    /**
     * 
     * @Title: findById
     * @Description: 通过id查询
     * @param @param resId
     * @param @return
     * @return HsAuthResource
     * @throws @author lifeng 2017年11月3日 上午10:59:47
     */
    HsAuthResource findById(Long resId);
    
    /**
     * 
     * @Title: findByName
     * @Description: 通过名称查询
     * @param @param resName
     * @param @return
     * @return List<HsAuthResource>
     * @throws @author lifeng 2017年11月3日 上午11:00:01
     */
    List<HsAuthResource> findByName(String resName);
    
    /**
     * 
     * @Title: updateAuthResource
     * @Description: 资源更新
     * @param @param hsAuthResource
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月3日 上午11:00:41
     */
    int updateAuthResource(HsAuthResource hsAuthResource);
    
    /**
     * 
     * @Title: deleteHsAuthResource
     * @Description: 资源逻辑删除
     * @param @param resId
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月3日 上午11:01:13
     */
    int deleteHsAuthResource(HsAuthResource res);
    
    /**
     * 
     * @Title: findByParentResId
     * @Description: 通过父级查询
     * @param @param resId
     * @param @return
     * @return List<HsAuthResource>
     * @throws @author lifeng 2017年11月3日 上午11:01:35
     */
    List<HsAuthResource> findByParentResId(Long resId);
    
    /**
     * @Title: queryAll
     * @Description: 查询所有
     * @param @return
     * @return List<HsAuthResource>
     * @throws @author lifeng 2017年11月3日 下午2:48:53
     */
    List<HsAuthResource> queryAll();
    
    /** 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @param @param queryParam
    * @param @return
    * @return PageDataInfo<AuthResourceDTO>
    * @throws 
    * @author lifeng 2017年11月29日 下午5:27:35
     */
    PageDataInfo<AuthResourceDTO> pageQuery(PageQueryInfo<AuthResourceDTO> queryParam);
    
    /** 
    * @Title: getOrder
    * @Description: 获取最大顺序
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年12月1日 下午4:42:20
     */
    Long getOrder();
    
    /** 
    * @Title: queryList
    * @Description: PCN分页条件查询
    * @param @param queryInfo
    * @param @return
    * @return PageDataInfo<HsAuthResource>
    * @throws 
    * @author lifeng 2017年12月4日 下午1:43:38
     */
    PageDataInfo<HsAuthResource> queryList(PageQueryInfo<HsAuthResource> queryInfo);
    
    /** 
    * @Title: getResByUser
    * @Description: 获取当前用户的资源权限
    * @param @param currentUserId
    * @param @return
    * @return List<AuthResourceDTO>
    * @throws 
    * @author lifeng 2017年12月5日 上午10:58:50
     */
    List<AuthResourceDTO> getResByUser(Long userId);
}
