/*
 * 文 件 名:  RoleResultDTO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  RoleResultDTO.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月6日 下午11:48:13
*/
package com.zeus.baseddata.entity.user;

import java.io.Serializable;
import java.util.List;

import com.zeus.baseddata.mybatis.model.user.HsAuthRole;

/**
 * @ClassName: RoleResultDTO
 * @Description: 详细查询结果封装类
 * @author lifeng 2017年11月6日 下午11:48:13
 * 
 */
public class AuthRoleInfoDTO extends HsAuthRole implements Serializable{
    
    /** 
    * 
    */
    private static final long serialVersionUID= 5886130719057957688L;
    
    /**
     * 网点类型id
     */
    private List<Long> siteTypes;
    
    /**
     * 资源信息
     */
    private List<AuthResourceDTO> resources;
    
    /**
     * 创建人
     */
    private String createdUser;
    
    /**
     * 最后修改人
     */
    private String modifiedUser;
    
    public List<Long> getSiteTypes(){
        return siteTypes;
    }
    
    public void setSiteTypes(List<Long> siteTypes){
        this.siteTypes= siteTypes;
    }
    
    public String getCreatedUser(){
        return createdUser;
    }
    
    public void setCreatedUser(String createdUser){
        this.createdUser= createdUser;
    }
    
    public String getModifiedUser(){
        return modifiedUser;
    }
    
    public void setModifiedUser(String modifiedUser){
        this.modifiedUser= modifiedUser;
    }
    
    public List<AuthResourceDTO> getResources(){
        return resources;
    }
    
    public void setResources(List<AuthResourceDTO> resources){
        this.resources= resources;
    }
    
}
