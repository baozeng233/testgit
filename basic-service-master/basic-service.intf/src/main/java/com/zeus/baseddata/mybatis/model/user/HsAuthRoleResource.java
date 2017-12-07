package com.zeus.baseddata.mybatis.model.user;

import java.io.Serializable;

import com.zeus.common.entity.BaseModel;

public class HsAuthRoleResource extends BaseModel implements Serializable{
    
    /** ID */
    private Long id;
    
    /** 角色ID */
    private Long roleId;
    
    /** 资源ID */
    private Long resId;
    
    /** 访问权限，(0:否，1:是) */
    private Integer accessPower;
    
    /** 管理权限，(0:否，1:是) */
    private Integer grantPower;
    
    private static final long serialVersionUID= 1L;
    
    public HsAuthRoleResource(){
    }
    
    public HsAuthRoleResource(Long id,Long roleId,Long resId){
        super();
        this.id= id;
        this.roleId= roleId;
        this.resId= resId;
    }
    
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id= id;
    }
    
    public Long getRoleId(){
        return roleId;
    }
    
    public void setRoleId(Long roleId){
        this.roleId= roleId;
    }
    
    public Long getResId(){
        return resId;
    }
    
    public void setResId(Long resId){
        this.resId= resId;
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
}
