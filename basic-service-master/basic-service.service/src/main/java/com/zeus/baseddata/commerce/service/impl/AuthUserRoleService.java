/*
 * 文 件 名: AuthUserRoleService.java 版 权: Copyright © 2015-2017, 湖南物联聚创信息科技有限公司 描 述: AuthUserRoleService.java 版 本： 1.0 创 建
 * 人: lidesheng 创建时间: 2017年10月30日 上午11:17:55
 */
package com.zeus.baseddata.commerce.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.zeus.baseddata.commerce.mybatis.dao.HsAuthUserRoleDAO;
import com.zeus.baseddata.commerce.service.IAuthUserRoleService;
import com.zeus.baseddata.entity.person.AuthUserRoleDTO;
import com.zeus.baseddata.mybatis.model.user.HsAuthUserRole;
import com.zeus.baseddata.mybatis.model.user.HsAuthUserRoleCriteria;
import com.zeus.baseddata.mybatis.model.user.HsAuthUserRoleCriteria.Criteria;

/**
 * @ClassName: AuthUserRoleService
 * @Description: 用户数据服务器 服务逻辑处理
 * @author lidesheng 2017年10月30日 上午11:17:55
 * 
 */
@Service(interfaceClass= IAuthUserRoleService.class)
public class AuthUserRoleService implements IAuthUserRoleService{
    
    
    @Resource
    private HsAuthUserRoleDAO hsAuthUserRoleDAO;
    
    /**
     * 
     * @Title: insertByBatch
     * @Description: 批量新增用户角色信息
     * @param @param roelId
     * @return void
     * @throws 
     * @author lidesheng 2017年10月30日 下午1:10:12
     */
    public void insertByBatch(List<AuthUserRoleDTO> roelId){
        hsAuthUserRoleDAO.insertByBatch(roelId);
    }
    
    /**
     * 
    * @Title: queryListByUserId
    * @Description: 根据用户ID查询用户角色列表
    * @param @param userId
    * @param @return
    * @return List<HsAuthUserRole>
    * @throws 
    * @author HuangChao 2017年11月7日 下午5:06:36
     */
    public List<HsAuthUserRole> queryListByUserId(Long userId){
        HsAuthUserRoleCriteria example= new HsAuthUserRoleCriteria();
        Criteria criteria= example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        return queryListByCriteria(example);
    }
    
    /**
     * 
    * @Title: queryListByRoleId
    * @Description: 根据角色ID查询用户角色列表
    * @param @param roleId
    * @param @return
    * @return List<HsAuthUserRole>
    * @throws 
    * @author HuangChao 2017年11月7日 下午5:08:49
     */
    public List<HsAuthUserRole> queryListByRoleId(Long roleId){
        HsAuthUserRoleCriteria example= new HsAuthUserRoleCriteria();
        Criteria criteria= example.createCriteria();
        criteria.andRoleIdEqualTo(roleId);
        return queryListByCriteria(example);
    }
    
    /**
     * 
    * @Title: queryListByCriteria
    * @Description: 根据条件查询列表信息
    * @param @param example
    * @param @return
    * @return List<HsAuthUserRole>
    * @throws 
    * @author HuangChao 2017年11月7日 下午5:08:52
     */
    public List<HsAuthUserRole> queryListByCriteria(HsAuthUserRoleCriteria example){
        return hsAuthUserRoleDAO.selectByExample(example);
    }
    
}
