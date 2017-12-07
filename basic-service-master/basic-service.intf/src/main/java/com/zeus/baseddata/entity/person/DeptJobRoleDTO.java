package com.zeus.baseddata.entity.person;

import java.util.List;

import com.zeus.baseddata.mybatis.model.person.HsBasicDeptJobRole;
import com.zeus.baseddata.mybatis.model.user.HsAuthRole;

public class DeptJobRoleDTO extends HsBasicDeptJobRole{
    
    /**
     * 
     */
    private static final long serialVersionUID= 1L;
    
    private boolean checkd;
    
    private List<Long> ids;
    
    private List<HsAuthRole> roles;
    
    public boolean isCheckd(){
        
        return checkd;
    }
    
    public void setCheckd(boolean checkd){
        
        this.checkd= checkd;
    }
    
    public List<Long> getIds(){
        
        return ids;
    }
    
    public void setIds(List<Long> ids){
        
        this.ids= ids;
    }
    
    public List<HsAuthRole> getRoles(){
        
        return roles;
    }
    
    public void setRoles(List<HsAuthRole> roles){
        
        this.roles= roles;
    }
    
}
