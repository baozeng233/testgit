/*
 * 文 件 名:  AuthMemuService.java
 * 版    权:  Copyright© 2015-2025 湖南物联聚创信息科技有限公司. All rights reserved. 湘ICP备16015498号
 * 描    述:  AuthMemuService.java 
 * 版    本：   1.0 
 * 创 建 人:  HuangChao
 * 创建时间: 2017年11月1日 下午1:06:38
*/
package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.user.HsAuthMenusDTO;
import com.zeus.baseddata.mybatis.model.user.HsAuthMenus;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: AuthMemuService
* @Description: 菜单管理服务数据处理类
* @author HuangChao 2017年11月1日 下午1:06:38
* 
*/
public interface IAuthMemuService{
    
    
    <T> PageDataInfo<T> queryPageList(Class<T> clazz,PageQueryInfo queryParam);
    
    //菜单新增
    int addHsAuthMenus(HsAuthMenus hsAuthMenus);
    
    //菜单编辑
    int editHsAuthMenus(HsAuthMenus hsAuthMenus);
    
    //菜单删除
    int delHsAuthMenus(Long menuId);
    
    //菜单类型查询菜单
    List<HsAuthMenus> queryAll(String menuType);
    
    //查询菜单
    List<HsAuthMenus> queryAll();
    
    //查询菜单详细
    HsAuthMenusDTO queryInfoById(Long menuId);
    
}
