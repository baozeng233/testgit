/*
 * 文 件 名:  AuthRoleService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  AuthRoleService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月1日 上午11:13:43
*/
package com.zeus.baseddata.commerce.service;

import java.util.List;
import java.util.Map;

import com.zeus.baseddata.entity.user.AuthRoleDTO;
import com.zeus.baseddata.entity.user.AuthRoleInfoDTO;
import com.zeus.baseddata.entity.user.AuthRoleSearchDTO;
import com.zeus.baseddata.mybatis.model.user.HsAuthRole;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/**
 * 
 * @ClassName: AuthRoleService
 * @Description: 数据服务层-角色服务
 * @author lifeng 2017年11月1日 上午11:40:43
 *
 */
public interface IAuthRoleService{
    
    /**
     * 
     * @Title: addHsAuthRole
     * @Description: 角色添加，并添加关联表
     * @param @param authRoleDTO
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月1日 上午10:56:06
     */
    int addHsAuthRole(AuthRoleDTO authRoleDTO);
    
    /**
     * @Title: deleteHsAuthRole
     * @Description: 逻辑删除角色并清除关联表
     * @param @param roleId
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月1日 上午10:55:23
     */
    int deleteHsAuthRole(HsAuthRole role);
    
    /**
     * @Title: updateHsAuthRole
     * @Description: 更新角色及其关联表
     * @param @param authRoleDTO
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月1日 下午1:46:10
     */
    int updateHsAuthRole(AuthRoleDTO authRoleDTO);
    
    /**
     * @Title: findByName
     * @Description: 通过名称查询角色
     * @param @param roleName
     * @param @return
     * @return List<HsAuthRole>
     * @throws @author lifeng 2017年11月2日 上午9:20:11
     */
    List<HsAuthRole> findByName(String roleName);
    
    /**
     * @Title: findByCode
     * @Description: 通过编码查询角色
     * @param @param roleCode
     * @param @return
     * @return List<HsAuthRole>
     * @throws @author lifeng 2017年11月2日 上午9:20:15
     */
    List<HsAuthRole> findByCode(String roleCode);
    
    /**
     * @Title: queryAll
     * @Description: 查询所有
     * @param @return
     * @return List<HsAuthRole>
     * @throws @author lifeng 2017年11月3日 下午5:04:45
     */
    List<HsAuthRole> queryAll();
    
    /**
     * @Title: getRoleBySiteType
     * @Description: 通过网点类型获取角色
     * @param @param siteType
     * @param @return
     * @return ResultBean<List<HsAuthRole>>
     * @throws @author lifeng 2017年11月6日 下午1:56:13
     */
    List<HsAuthRole> getRoleBySiteType(Long siteType);
    
    /**
     * @Title: getRoleInfoById
     * @Description: 通过id获取角色关联的详细信息
     * @param @param roleId
     * @param @return
     * @return AuthRoleInfoDTO
     * @throws @author lifeng 2017年11月7日 下午2:13:54
     */
    AuthRoleInfoDTO getRoleInfoById(Long roleId);
    
    /**
     * 
    * @Title: queryRoleMenuResAll
    * @Description: 查询所有角色菜单资源列表信息,用于缓存加载
    * @param @return
    * @return List<AuthRoleInfoDTO>
    * @throws 
    * @author HuangChao 2017年11月8日 上午11:36:12
     */
    List<AuthRoleInfoDTO> queryRoleMenuResAll();
    
    /**
     * 
    * @Title: queryRoleResAll
    * @Description: 查询所有角色资源列表信息,用于缓存加载
    * @param @return
    * @return List<AuthRoleInfoDTO>
    * @throws 
    * @author HuangChao 2017年11月8日 上午11:36:12
     */
    Map<String,Object> queryRoleResAll();
    
    /** 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @param @param queryParam
    * @param @return
    * @return PageDataInfo<AuthRoleInfoDTO>
    * @throws 
    * @author lifeng 2017年11月29日 下午5:08:26
     */
    PageDataInfo<AuthRoleInfoDTO> pageQuery(PageQueryInfo<AuthRoleSearchDTO> queryParam);
    
    /** 
    * @Title: queryList
    * @Description: PCN分页查询
    * @param @param queryParam
    * @param @return
    * @return PageDataInfo<AuthRoleInfoDTO>
    * @throws 
    * @author lifeng 2017年12月1日 下午2:17:59
     */
    PageDataInfo<HsAuthRole> queryList(PageQueryInfo<HsAuthRole> queryParam);
    
    /** 
    * @Title: getOrder
    * @Description: 获取最大顺序
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年12月1日 下午4:33:45
     */
    Long getOrder();
}
