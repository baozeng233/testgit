package com.zeus.baseddata.entity.person;

import com.zeus.baseddata.mybatis.model.person.HsBasicEmployee;

public class BasicEmployeeDTO extends HsBasicEmployee{
    
    /**
     * 
     */
    private static final long serialVersionUID= - 1932085601219712275L;
    
    /**
     * 部门
     */
    private String deptName;
    
    
    
    /**
     * 部门岗位
     */
    private String deptJobName;
    
    /**
     * 承包区域
     */
    private String partName;
    
    /**
     * 创建人
     */
    private String createdByName;
    
    /**
     * 巴枪密码
     */
    private String pda;
    
    private String modifyName;
    
    public String getDeptName(){
    
        return deptName;
    }
    
    public void setDeptName(String deptName){
    
        this.deptName= deptName;
    }
    
    public String getDeptJobName(){
    
        return deptJobName;
    }
    
    public void setDeptJobName(String deptJobName){
    
        this.deptJobName= deptJobName;
    }
    
    public String getPartName(){
    
        return partName;
    }
    
    public void setPartName(String partName){
    
        this.partName= partName;
    }
    
    public String getCreatedByName(){
    
        return createdByName;
    }
    
    public void setCreatedByName(String createdByName){
    
        this.createdByName= createdByName;
    }
    
    
    
    public String getPda(){
    
        return pda;
    }
    
    public void setPda(String pda){
    
        this.pda= pda;
    }
    
    public String getModifyName(){
    
        return modifyName;
    }
    
    public void setModifyName(String modifyName){
    
        this.modifyName= modifyName;
    }
    
}
