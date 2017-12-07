package com.zeus.baseddata.entity.person;

import com.zeus.baseddata.mybatis.model.person.HsBasicDept;

public class BasicDeptDTO extends HsBasicDept{
    
    /**
     * 
     */
    private static final long serialVersionUID= - 8185302003922585680L;
    
    private String siteName;
    
    private String managerEmployeeName;
    
    private String parentDeptName;
    
    private boolean check;
    
    public String getSiteName(){
    
        return siteName;
    }
    
    public void setSiteName(String siteName){
    
        this.siteName= siteName;
    }
    
    
    
    public String getManagerEmployeeName() {
		return managerEmployeeName;
	}

	public void setManagerEmployeeName(String managerEmployeeName) {
		this.managerEmployeeName = managerEmployeeName;
	}

	public String getParentDeptName(){
    
        return parentDeptName;
    }
    
    public void setParentDeptName(String parentDeptName){
    
        this.parentDeptName= parentDeptName;
    }
    
    public boolean isCheck(){
    
        return check;
    }
    
    public void setCheck(boolean check){
    
        this.check= check;
    }
    
}
