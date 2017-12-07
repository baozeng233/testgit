package com.zeus.baseddata.entity.person;

import java.util.List;

import com.zeus.baseddata.mybatis.model.person.HsBasicEmployee;
import com.zeus.baseddata.mybatis.model.user.HsAuthUser;

@SuppressWarnings("serial")
public class AuthUserDTO extends HsAuthUser{
    
    /** 提交方式:edit 表示修改 **/
    private int submitType;
    
    /** 网点名称 */
    private String siteName;
    
    /** 员工编号 */
    private String employeeCode;
    
    /** 员工名称 */
    private String employeeName;
    
    private HsBasicEmployee employee;
    
    /** 角色列表 **/
    private List<AuthUserRoleDTO> roles;
    
    /** 角色选中值数组 **/
    private List<Long> roleId;
    
    /** 角色名称 **/
    private String roleName; 
    
    /** 重置密码源 **/
    private String resetPwd;
    
    /** 菜单ID **/
    private String meanId; 
    
    /** 网点ID **/
    private Long siteId;
    
    public Long getSiteId(){
        return siteId;
    }
    
    public void setSiteId(Long siteId){
        this.siteId= siteId;
    }
    
    public String getMeanId(){
        return meanId;
    }
    
    public void setMeanId(String meanId){
        this.meanId= meanId;
    }
    
    public String getRoleName(){
        return roleName;
    }
    
    public void setRoleName(String roleName){
        this.roleName= roleName;
    }
    
    public String getResetPwd(){
        return resetPwd;
    }
    
    public void setResetPwd(String resetPwd){
        this.resetPwd= resetPwd;
    }
    
    /** 用户关联员工编号 **/
    private Long userEmployeeCode;
    
    public Long getUserEmployeeCode(){
        return userEmployeeCode;
    }
    
    public void setUserEmployeeCode(Long userEmployeeCode){
        this.userEmployeeCode= userEmployeeCode;
    }
    
    public List<Long> getRoleId(){
        return roleId;
    }
    
    public void setRoleId(List<Long> roleId){
        this.roleId= roleId;
    }
    
    public String getEmployeeCode(){
        return employeeCode;
    }
    
    public void setEmployeeCode(String employeeCode){
        this.employeeCode= employeeCode;
    }
    
    public String getEmployeeName(){
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName){
        this.employeeName= employeeName;
    }
    
    public int getSubmitType(){
        return submitType;
    }
    
    public void setSubmitType(int submitType){
        this.submitType= submitType;
    }
    
    public List<AuthUserRoleDTO> getRoles(){
        
        return roles;
    }
    
    public void setRoles(List<AuthUserRoleDTO> roles){
        
        this.roles= roles;
    }
    
    public HsBasicEmployee getEmployee(){
        
        return employee;
    }
    
    public void setEmployee(HsBasicEmployee employee){
        
        this.employee= employee;
    }
    
    public String getSiteName(){
        return siteName;
    }
    
    public void setSiteName(String siteName){
        this.siteName= siteName;
    }
    
}
