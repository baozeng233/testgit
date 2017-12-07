/*
 * 文 件 名:  AuthResourceDTO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  AuthResourceDTO.java
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月3日 下午1:49:47
*/
package com.zeus.baseddata.entity.user;

import java.io.Serializable;

import com.zeus.baseddata.mybatis.model.user.HsAuthResource;

public class AuthResourceDTO extends HsAuthResource implements Serializable{
    
    /** 
    * 
    */
    private static final long serialVersionUID= 2765646598598032337L;
    
    /**
     * 创建人名称
     */
    private String createdName;
    
    /**
     * 修改人名称
     */
    private String modifiedName;
    
    /** 访问权限，(0:否，1:是) */
    private Integer accessPower;
    
    /** 管理权限，(0:否，1:是) */
    private Integer grantPower;
    
    /**
     * 所属菜单
     */
    private String menuName;
    
    /**用于缓存存储字段*/
    private String field;
    
    public String getCreatedName(){
        return createdName;
    }
    
    public void setCreatedName(String createdName){
        this.createdName= createdName;
    }
    
    public String getModifiedName(){
        return modifiedName;
    }
    
    public void setModifiedName(String modifiedName){
        this.modifiedName= modifiedName;
    }
    
    public Integer getAccessPower(){
        return accessPower;
    }
    
    public void setAccessPower(Integer accessPower){
        this.accessPower= accessPower;
    }
    
    public Integer getGrantPower(){
        return grantPower;
    }
    
    public void setGrantPower(Integer grantPower){
        this.grantPower= grantPower;
    }
    
    public String getField(){
        return field;
    }
    
    public void setField(String field){
        this.field= field;
    }
    
    public String getMenuName(){
        return menuName;
    }
    
    public void setMenuName(String menuName){
        this.menuName= menuName;
    }
    
}
