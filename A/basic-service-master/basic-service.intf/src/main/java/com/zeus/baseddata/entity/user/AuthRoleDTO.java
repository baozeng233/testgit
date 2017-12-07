/*
 * 文 件 名:  AuthRoleDTO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  AuthRoleDTO.java
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月3日 下午1:49:47
*/
package com.zeus.baseddata.entity.user;

import java.io.Serializable;
import java.util.List;

import com.zeus.baseddata.mybatis.model.user.HsAuthRole;
import com.zeus.baseddata.mybatis.model.user.HsAuthRoleResource;
import com.zeus.baseddata.mybatis.model.user.HsAuthRoleSiteType;

/**
 * 
 * @ClassName: AuthRoleDTO
 * @Description: 自定义角色增强类(用于关联增删改)
 * @author lifeng 2017年10月31日 下午3:58:09
 *
 */
public class AuthRoleDTO extends HsAuthRole implements Serializable{
    
    /** 
    */
    private static final long serialVersionUID= 7100225365334283017L;
    
    /**
     * 资源id列表
     */
    private List<Long> resId;
    
    private List<HsAuthRoleResource> roleResources;
    
    /**
     * 网点类型id列表
     */
    private List<Long> siteTypes;
    
    private List<HsAuthRoleSiteType> roleSiteTypes;
    
    /**
     * 可以操作的资源id
     */
    private List<Long> management;
    
    /**
     * 可以访问的资源id
     */
    private List<Long> view;
    
    public List<Long> getResId(){
        return resId;
    }
    
    public void setResId(List<Long> resId){
        this.resId= resId;
    }
    
    public List<HsAuthRoleResource> getRoleResources(){
        return roleResources;
    }
    
    public void setRoleResources(List<HsAuthRoleResource> roleResources){
        this.roleResources= roleResources;
    }
    
    public List<Long> getSiteTypes(){
        return siteTypes;
    }
    
    public void setSiteTypes(List<Long> siteTypes){
        this.siteTypes= siteTypes;
    }
    
    public List<HsAuthRoleSiteType> getRoleSiteTypes(){
        return roleSiteTypes;
    }
    
    public void setRoleSiteTypes(List<HsAuthRoleSiteType> roleSiteTypes){
        this.roleSiteTypes= roleSiteTypes;
    }
    
    public List<Long> getManagement(){
        return management;
    }
    
    public void setManagement(List<Long> management){
        this.management= management;
    }
    
    public List<Long> getView(){
        return view;
    }
    
    public void setView(List<Long> view){
        this.view= view;
    }
    
}
