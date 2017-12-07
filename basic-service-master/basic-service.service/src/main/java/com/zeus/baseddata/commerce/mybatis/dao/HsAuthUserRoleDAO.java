/*
 * 文 件 名: HsAuthUserRoleDAO.java 版 权: Copyright © 2015-2017, 湖南物联聚创信息科技有限公司 描 述: HsAuthUserRoleDAO.java 版 本： 1.0 创 建 人:
 * view 创建时间: 2017年10月27日 上午10:16:05
 */
package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;

import com.zeus.baseddata.entity.person.AuthUserRoleDTO;
import com.zeus.baseddata.common.mybatis.dao.HsAuthUserRoleMapper;

/**
 * @ClassName: HsAuthUserRoleDAO
 * @Description: 用户角色关联 DAO
 * @author view 2017年10月27日 上午10:16:05
 * 
 */
public interface HsAuthUserRoleDAO extends HsAuthUserRoleMapper{
    
    /**
    * 
    * @Title: insertByBatch
    * @Description: 批量插入用户角色
    * @param @param authUserRoleDTO
    * @param @return
    * @return int
    * @throws 
    * @author lidesheng 2017年11月8日 下午3:47:47
    */
    int insertByBatch(List<AuthUserRoleDTO> authUserRoleDTO);
}
