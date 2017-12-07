package com.zeus.baseddata.mybatis.model.user;

import java.io.Serializable;
import java.util.Date;

import com.zeus.common.entity.BaseModel;

public class HsAuthUser extends BaseModel implements Serializable{
    
    
    /** 用户ID */
    private Long userId;
    
    /** 用户名称 */
    private String userName;
    
    /** 用户密码 */
    private String userPwd;
    
    /** 用户类型(0普通用户,1管理员、2管理员) */
    private Integer userType;
    
    /** 员工ID */
    private Long employeeId;
    
    /** 是否可以登录OA */
    private Integer blOa;
    
    /** PDA密码 */
    private String pdaPwd;
    
    /** 密码到期日期 */
    private Date expireDate;
    
    /** 失败重试时间 */
    private Integer failureTimes;
    
    /** 消息间隔 */
    private Integer messageInterval;
    
    /** 最后操作时间 */
    private Date lastOperateTime;
    
    /** 最后操作IP */
    private String lastOperateIp;
    
    /** 备注 */
    private String remark;
    
    /** 用户状态(N正常 L锁定 D删除-禁用) */
    private String status;
    
    /** 创建人 */
    private Long createdBy;
    
    /** 创建时间 */
    private Date createdTime;
    
    /** 修改人 */
    private Long modifiedBy;
    
    /** 修改时间 */
    private Date modifiedTime;
    
    /** 记录数据状态(0：删除 1：正常) */
    private Integer rdStatus;
    
    /** 用户系统标识，关联字典表ID */
    private Integer tenantId;
    
    private static final long serialVersionUID= 1L;
    
    public Long getUserId(){
        
        
        return userId;
    }
    
    public void setUserId(Long userId){
        
        
        this.userId= userId;
    }
    
    public String getUserName(){
        
        
        return userName;
    }
    
    public void setUserName(String userName){
        
        
        this.userName= userName== null ? null : userName.trim();
    }
    
    public String getUserPwd(){
        
        
        return userPwd;
    }
    
    public void setUserPwd(String userPwd){
        
        
        this.userPwd= userPwd== null ? null : userPwd.trim();
    }
    
    public Integer getUserType(){
        
        
        return userType;
    }
    
    public void setUserType(Integer userType){
        
        
        this.userType= userType;
    }
    
    public Long getEmployeeId(){
        
        
        return employeeId;
    }
    
    public void setEmployeeId(Long employeeId){
        
        
        this.employeeId= employeeId;
    }
    
    public Integer getBlOa(){
        
        
        return blOa;
    }
    
    public void setBlOa(Integer blOa){
        
        
        this.blOa= blOa;
    }
    
    public String getPdaPwd(){
        
        
        return pdaPwd;
    }
    
    public void setPdaPwd(String pdaPwd){
        
        
        this.pdaPwd= pdaPwd== null ? null : pdaPwd.trim();
    }
    
    public Date getExpireDate(){
        
        
        return expireDate;
    }
    
    public void setExpireDate(Date expireDate){
        
        
        this.expireDate= expireDate;
    }
    
    public Integer getFailureTimes(){
        
        
        return failureTimes;
    }
    
    public void setFailureTimes(Integer failureTimes){
        
        
        this.failureTimes= failureTimes;
    }
    
    public Integer getMessageInterval(){
        
        
        return messageInterval;
    }
    
    public void setMessageInterval(Integer messageInterval){
        
        
        this.messageInterval= messageInterval;
    }
    
    public Date getLastOperateTime(){
        
        
        return lastOperateTime;
    }
    
    public void setLastOperateTime(Date lastOperateTime){
        
        
        this.lastOperateTime= lastOperateTime;
    }
    
    public String getLastOperateIp(){
        
        
        return lastOperateIp;
    }
    
    public void setLastOperateIp(String lastOperateIp){
        
        
        this.lastOperateIp= lastOperateIp== null ? null : lastOperateIp.trim();
    }
    
    public String getRemark(){
        
        
        return remark;
    }
    
    public void setRemark(String remark){
        
        
        this.remark= remark== null ? null : remark.trim();
    }
    
    public String getStatus(){
        
        
        return status;
    }
    
    public void setStatus(String status){
        
        
        this.status= status== null ? null : status.trim();
    }
    
    public Long getCreatedBy(){
        
        
        return createdBy;
    }
    
    public void setCreatedBy(Long createdBy){
        
        
        this.createdBy= createdBy;
    }
    
    public Date getCreatedTime(){
        
        
        return createdTime;
    }
    
    public void setCreatedTime(Date createdTime){
        
        
        this.createdTime= createdTime;
    }
    
    public Long getModifiedBy(){
        
        
        return modifiedBy;
    }
    
    public void setModifiedBy(Long modifiedBy){
        
        
        this.modifiedBy= modifiedBy;
    }
    
    public Date getModifiedTime(){
        
        
        return modifiedTime;
    }
    
    public void setModifiedTime(Date modifiedTime){
        
        
        this.modifiedTime= modifiedTime;
    }
    
    public Integer getRdStatus(){
        
        
        return rdStatus;
    }
    
    public void setRdStatus(Integer rdStatus){
        
        
        this.rdStatus= rdStatus;
    }
    
    public Integer getTenantId(){
        
        
        return tenantId;
    }
    
    public void setTenantId(Integer tenantId){
        
        
        this.tenantId= tenantId;
    }
    
}
