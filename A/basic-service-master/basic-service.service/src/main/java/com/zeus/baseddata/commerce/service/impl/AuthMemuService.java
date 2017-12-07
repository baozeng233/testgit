/*
 * 文 件 名:  AuthMemuService.java
 * 版    权:  Copyright© 2015-2025 湖南物联聚创信息科技有限公司. All rights reserved. 湘ICP备16015498号
 * 描    述:  AuthMemuService.java 
 * 版    本：   1.0 
 * 创 建 人:  HuangChao
 * 创建时间: 2017年11月1日 下午1:06:38
*/
package com.zeus.baseddata.commerce.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.framework.common.utils.StringUtils;
import com.zeus.baseddata.commerce.mybatis.dao.HsAuthMenusDAO;
import com.zeus.baseddata.commerce.service.IAuthMemuService;
import com.zeus.baseddata.entity.user.HsAuthMenusDTO;
import com.zeus.baseddata.enums.ResourceType;
import com.zeus.baseddata.mybatis.model.user.HsAuthMenus;
import com.zeus.baseddata.mybatis.model.user.HsAuthMenusCriteria;
import com.zeus.baseddata.mybatis.model.user.HsAuthMenusCriteria.Criteria;
import com.zeus.baseddata.mybatis.model.user.HsAuthResource;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.service.UtilService;

/** 
* @ClassName: AuthMemuService
* @Description: 菜单管理服务数据处理类
* @author HuangChao 2017年11月1日 下午1:06:38
* 
*/
@Service(interfaceClass= IAuthMemuService.class)
public class AuthMemuService extends UtilService implements IAuthMemuService{
    
    @Resource
    private HsAuthMenusDAO hsAuthMenusDAO;
    
    @Resource
    private AuthResourceService authResourceService;
    
    @Override
    public List<HsAuthMenus> queryList(Object queryParam){
        HsAuthMenusCriteria example= new HsAuthMenusCriteria();
        Criteria criteria= example.createCriteria();
        // 添加分页查询条件
        if(queryParam!= null){
            HsAuthMenus authMenus= (HsAuthMenus)queryParam;
            
            if(StringUtils.isNotBlank(authMenus.getMenuName())){
                criteria.andMenuNameLike(authMenus.getMenuName());
            }
            
            if(StringUtils.isNotBlank(authMenus.getMenuCode())){
                criteria.andMenuCodeEqualTo(authMenus.getMenuCode());
            }
            
            if(StringUtils.isNotBlank(authMenus.getMenuType())){
                criteria.andMenuTypeEqualTo(authMenus.getMenuType());
            }
        }
        // 数据状态不能为删除
        criteria.andStatusEqualTo(TrueFalseEnum.FALSE.getValue());
        return hsAuthMenusDAO.selectByExample(example);
    }
    
    //菜单新增
    @Transactional
    public int addHsAuthMenus(HsAuthMenus hsAuthMenus){
        hsAuthMenus.setStatus(TrueFalseEnum.TRUE.getValue());
        int reult= hsAuthMenusDAO.insertSelective(hsAuthMenus);
        //资源表添加一条菜单数据
        HsAuthResource resource= new HsAuthResource();
        resource.setResId(hsAuthMenus.getMenuId());
        resource.setResCode(hsAuthMenus.getMenuCode());
        resource.setResName(hsAuthMenus.getMenuName());
        resource.setResDesc(hsAuthMenus.getMenuUrl());
        resource.setResType(ResourceType.MENU.getCode());
        resource.setCreatedBy(hsAuthMenus.getCreatedBy());
        resource.setCreatedTime(hsAuthMenus.getCreatedTime());
        resource.setParentResId(hsAuthMenus.getParentMenuId());
        resource.setRdStatus(hsAuthMenus.getStatus());
        reult= authResourceService.addHsAuthResource(resource);
        return reult;
    }
    
    //菜单编辑
    @Transactional
    public int editHsAuthMenus(HsAuthMenus hsAuthMenus){
        int result= hsAuthMenusDAO.updateByPrimaryKeySelective(hsAuthMenus);
        
        //更新资源信息
        HsAuthResource resource= new HsAuthResource();
        resource.setResId(hsAuthMenus.getMenuId());
        resource.setResCode(hsAuthMenus.getMenuCode());
        resource.setResName(hsAuthMenus.getMenuName());
        resource.setResDesc(hsAuthMenus.getMenuUrl());
        resource.setResType(ResourceType.MENU.getCode());
        resource.setModifiedBy(hsAuthMenus.getModifiedBy());
        resource.setModifiedTime(hsAuthMenus.getModifiedTime());
        resource.setParentResId(hsAuthMenus.getParentMenuId());
        resource.setRdStatus(hsAuthMenus.getStatus());
        result= authResourceService.updateAuthResource(resource);
        
        return result;
    }
    
    //菜单删除
    @Transactional
    public int delHsAuthMenus(Long menuId){
        int result= hsAuthMenusDAO.deleteByPrimaryKey(menuId);
        HsAuthResource res= new HsAuthResource();
        res.setResId(menuId);
        res.setRdStatus(TrueFalseEnum.FALSE.getValue());
        result= authResourceService.deleteHsAuthResource(res);
        return result;
    }
    
    //菜单类型查询菜单
    public List<HsAuthMenus> queryAll(String menuType){
        HsAuthMenusCriteria example= new HsAuthMenusCriteria();
        Criteria criteria= example.createCriteria();
        if(StringUtils.isNotBlank(menuType)){
            criteria.andMenuTypeEqualTo(menuType);
        }
        example.setOrderByClause("menu_order");
        return hsAuthMenusDAO.selectByExample(example);
    }
    
    //查询菜单
    public List<HsAuthMenus> queryAll(){
        return queryAll(null);
    }
    
    //查询菜单详细
    public HsAuthMenusDTO queryInfoById(Long menuId){
        return hsAuthMenusDAO.selectHsAuthMenusById(menuId);
        
    }
    
}
