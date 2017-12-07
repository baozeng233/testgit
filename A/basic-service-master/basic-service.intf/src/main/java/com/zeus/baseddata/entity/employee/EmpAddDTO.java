package com.zeus.baseddata.entity.employee;

import java.io.Serializable;

import com.zeus.baseddata.mybatis.model.person.HsBasicEmployee;
import com.zeus.baseddata.mybatis.model.user.HsAuthUser;

public class EmpAddDTO implements Serializable{
    
    /** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/ 
	private static final long serialVersionUID = 1L;

	private HsBasicEmployee emp;
    
    private HsAuthUser user;
    
    
    public EmpAddDTO() {
	}
    public EmpAddDTO(HsBasicEmployee emp,HsAuthUser user){
        this.emp= emp;
        this.user= user;
    }
    
    public HsBasicEmployee getEmp(){
    
        return emp;
    }
    
    public void setEmp(HsBasicEmployee emp){
    
        this.emp= emp;
    }
    
    public HsAuthUser getUser(){
    
        return user;
    }
    
    public void setUser(HsAuthUser user){
    
        this.user= user;
    }
    
}
