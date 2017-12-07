/*
 * 文 件 名:  HsAuthMenusDAO.java
 * 版    权:  Copyright© 2015-2025 湖南物联聚创信息科技有限公司. All rights reserved. 湘ICP备16015498号
 * 描    述:  HsAuthMenusDAO.java 
 * 版    本：   1.0 
 * 创 建 人:  HuangChao
 * 创建时间: 2017年11月10日 下午4:25:15
*/
package com.zeus.baseddata.commerce.mybatis.dao;

import com.zeus.baseddata.common.mybatis.dao.HsAuthMenusMapper;
import com.zeus.baseddata.entity.user.HsAuthMenusDTO;

/** 
* @ClassName: HsAuthMenusDAO
* @Description: 菜单DB操作扩展
* @author HuangChao 2017年11月10日 下午4:25:15
* 
*/
public interface HsAuthMenusDAO extends HsAuthMenusMapper{
    
    
    HsAuthMenusDTO selectHsAuthMenusById(Long menuId);
}
