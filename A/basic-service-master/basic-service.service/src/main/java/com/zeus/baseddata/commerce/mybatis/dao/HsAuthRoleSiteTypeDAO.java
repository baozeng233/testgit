/*
 * 文 件 名:  HsAuthRoleSiteTypeDAO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  HsAuthRoleSiteTypeDAO.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月1日 上午11:12:58
*/
package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;

import com.zeus.baseddata.common.mybatis.dao.HsAuthRoleSiteTypeMapper;
import com.zeus.baseddata.mybatis.model.user.HsAuthRoleSiteType;

/**
 * @ClassName: HsAuthRoleSiteTypeDAO
 * @Description: 角色网点关联自定义操作
 * @author lifeng 2017年11月1日 上午11:12:58
 * 
 */
public interface HsAuthRoleSiteTypeDAO extends HsAuthRoleSiteTypeMapper {

    /**
     * @Title: insertByBatch
     * @Description: 批量插入关联数据
     * @param @param roleSiteTypes
     * @return void
     * @throws @author lifeng 2017年11月1日 下午2:23:39
     */
    public void insertByBatch(List<HsAuthRoleSiteType> roleSiteTypes);

}
