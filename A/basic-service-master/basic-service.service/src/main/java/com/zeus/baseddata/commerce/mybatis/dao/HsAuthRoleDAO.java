/*
 * 文 件 名:  HsAuthRoleDAO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  HsAuthRoleDAO.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月1日 上午11:19:27
*/
package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;

import com.zeus.baseddata.common.mybatis.dao.HsAuthRoleMapper;
import com.zeus.baseddata.entity.user.AuthRoleInfoDTO;
import com.zeus.baseddata.entity.user.AuthRoleSearchDTO;
import com.zeus.baseddata.mybatis.model.user.HsAuthRole;

/**
 * @ClassName: HsAuthRoleDAO
 * @Description: 角色自定义数据操作接口
 * @author lifeng 2017年11月1日 上午11:19:27
 * 
 */
public interface HsAuthRoleDAO extends HsAuthRoleMapper{
    
    /**
     * @Title: updateRdStatusByPrimaryKey
     * @Description: 更新数据状态
     * @param @param value
     * @param @param roleId
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月1日 上午11:19:35
     */
    public int updateRdStatusByPrimaryKey(Long roleId);
    
    /**
     * 
     * @Title: selectByQueryInfo
     * @Description: 条件查询
     * @param @param authRoleSearchDTO
     * @param @return
     * @return List<AuthRoleDTO>
     * @throws @author lifeng 2017年11月3日 上午11:26:32
     */
    public List<AuthRoleInfoDTO> selectByQueryInfo(AuthRoleSearchDTO authRoleSearchDTO);
    
    /**
     * @Title: getRoleInfoById
     * @Description: 通过id获取角色关联的详细信息
     * @param @param roleId
     * @param @return
     * @return AuthRoleInfoDTO
     * @throws @author lifeng 2017年11月7日 下午2:18:03
     */
    public AuthRoleInfoDTO getRoleInfoById(Long roleId);
    
    /**
     * 
    * @Title: queryRoleResAll
    * @Description: 查询所有角色菜单资源列表信息
    * @param @return
    * @return List<AuthRoleInfoDTO>
    * @throws 
    * @author HuangChao 2017年11月8日 上午11:28:13
     */
    List<AuthRoleInfoDTO> queryRoleMenuResAll();
    
    /**
     * 
    * @Title: queryRoleResAll
    * @Description: 查询所有角色资源列表信息
    * @param @return
    * @return List<AuthRoleInfoDTO>
    * @throws 
    * @author HuangChao 2017年11月8日 上午11:28:13
     */
    List<AuthRoleInfoDTO> queryRoleResAll();
    
    /** 
    * @Title: getAllRole
    * @Description: 获取所属角色信息  主要描述和名称
    * @param @return
    * @return List<HsAuthRole>
    * @throws 
    * @author caojie 2017年11月13日 上午10:43:29
     */
    public List<HsAuthRole> getAllRole();
    
    /** 
    * @Title: queryMaxOrder
    * @Description: 获取最大顺序
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年12月1日 下午4:35:28
     */
    public Long queryMaxOrder();
    
}
