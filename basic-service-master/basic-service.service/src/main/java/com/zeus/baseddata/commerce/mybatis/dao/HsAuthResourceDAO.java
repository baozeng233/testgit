/*
 * 文 件 名:  HsAuthResourceDAO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  HsAuthResourceDAO.java
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月3日 下午1:49:47
*/
package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.common.mybatis.dao.HsAuthResourceMapper;
import com.zeus.baseddata.entity.user.AuthResourceDTO;
import com.zeus.baseddata.mybatis.model.user.HsAuthResource;

/**
 * 
 * 资源信息操作自定义
 * 
 * @author lifeng 2017年10月27日
 * @see
 * @since 1.0
 */
public interface HsAuthResourceDAO extends HsAuthResourceMapper{
    
    /**
     * 
     * @Title: updateStatusByPrimaryKey
     * @Description: 逻辑删除
     * @param @param resId
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月8日 下午3:50:13
     */
    public int updateStatusByPrimaryKey(Long resId);
    
    /**
     * 
     * @Title: deleteRelationWithRoleByPrimaryKey
     * @Description: 清除 资源角色关联表
     * @param @param resId
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月8日 下午3:50:17
     */
    public int deleteRelationWithRoleByPrimaryKey(Long resId);
    
    /** 
    * @Title: selectList
    * @Description: 查询所有
    * @param @return
    * @return List<HsAuthResource>
    * @throws 
    * @author lifeng 2017年11月10日 上午11:34:41
     */
    public List<HsAuthResource> selectList();
    
    /** 
    * @Title: queryByParams
    * @Description: 分页条件查询
    * @param @param param
    * @param @return
    * @return List<AuthResourceDTO>
    * @throws 
    * @author lifeng 2017年11月29日 下午5:40:42
     */
    public List<AuthResourceDTO> queryByParams(Map<String,Object> param);
    
    /** 
    * @Title: queryMaxOrder
    * @Description: 获取最大顺序
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年12月1日 下午4:43:01
     */
    public Long queryMaxOrder();
    
    /** 
    * @Title: queryResbyUser
    * @Description: 获取当前用户的资源权限
    * @param @param userId
    * @param @return
    * @return List<AuthResourceDTO>
    * @throws 
    * @author lifeng 2017年12月5日 上午11:00:50
     */
    public List<AuthResourceDTO> queryResbyUser(@Param("userId") Long userId);
}
