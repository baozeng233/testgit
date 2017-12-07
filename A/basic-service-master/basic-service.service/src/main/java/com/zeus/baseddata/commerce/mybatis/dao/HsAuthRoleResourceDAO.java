/*
	 * 文 件 名:  HsAuthRoleResourceDAO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  HsAuthRoleResourceDAO.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月1日 上午11:13:43
*/
package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;

import com.zeus.baseddata.common.mybatis.dao.HsAuthRoleResourceMapper;
import com.zeus.baseddata.mybatis.model.user.HsAuthRoleResource;

/**
 * @ClassName: HsAuthRoleResourceDAO
 * @Description: 角色资源关联自定义操作
 * @author lifeng 2017年11月1日 上午11:13:43
 * 
 */
public interface HsAuthRoleResourceDAO extends HsAuthRoleResourceMapper {

    /**
     * @Title: insertByBatch
     * @Description: 批量插入关联数据
     * @param @param roleResources
     * @return void
     * @throws @author lifeng 2017年11月1日 下午2:23:26
     */
    public void insertByBatch(List<HsAuthRoleResource> roleResources);

}
