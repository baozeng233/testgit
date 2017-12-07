package com.zeus.baseddata.mybatis.model.person;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.zeus.common.entity.BaseModel;

public class HsBasicEmployee extends BaseModel implements Serializable{
    
    /** 员工ID，主键 */
    private Long employeeId;
    
    /** 员工编号 */
    private String employeeCode;
    
    /** 员工名称 */
    private String employeeName;
    
    /** 名字拼音 */
    private String employeePinyin;
    
    /** 排列顺序 */
    private Integer employeeOrder;
    
    /** 所属网点ID */
    private Long siteId;
    
    private Object siteInfo;
    
    /** 部门岗位id */
    private Long deptJobId;
    
    /** 证件号码 */
    private String idCard;
    
    /** 性别 */
    private String sex;
    
    /** 联系电话 */
    private String phone;
    
    /** 短信通知号码 */
    private String phoneSms;
    
    /** 邮箱 */
    private String eMail;
    
    /** 生日 */
    private Date birthday;
    
    /** 住址 */
    private String address;
    
    /** 个人备注 */
    private String selfRemark;
    
    /** 是否在职，(0:否，1：是) */
    private Integer isUse;
    
    /** 入职日期 */
    private Date startDate;
    
    /** 离职日期 */
    private Date endDate;
    
    /** 基本工资 */
    private BigDecimal basicSalar;
    
    /** 补助 */
    private BigDecimal addSalar;
    
    /** 收派货物最高风险总额 */
    private BigDecimal limitSumAmount;
    
    /** 收派货物单件最高风险金额 */
    private BigDecimal limitOneAmount;
    
    /** 运输工具ID,字典ID */
    private Integer transportToolId;
    
    /** 所属承包区ID */
    private Long partId;
    
    /** 工作备注 */
    private String jobRemark;
    
    /** 驾照类型 */
    private String driverLicenseType;
    
    /** 结算开户银行ID */
    private Integer bankId;
    
    /** 银行开户行ID */
    private Integer bankAccountId;
    
    /** 银行开户户名 */
    private String bankAccountName;
    
    /** 银行开户帐号 */
    private String bankAccountNo;
    
    /** 创建人 */
    private Long createdBy;
    
    /** 创建时间 */
    private Date createdTime;
    
    /** 修改人 */
    private Long modifiedBy;
    
    /** 修改时间 */
    private Date modifiedTime;
    
    /** 数据状态，0：删除，1：正常 */
    private Integer rdStatus;
    
    /** 员工工号 */
    private String employeeNo;
    
    private static final long serialVersionUID= 1L;
    
    public Long getEmployeeId(){
        
        return employeeId;
    }
    
    public void setEmployeeId(Long employeeId){
        
        this.employeeId= employeeId;
    }
    
    public String getEmployeeCode(){
        
        return employeeCode;
    }
    
    public void setEmployeeCode(String employeeCode){
        
        this.employeeCode= employeeCode== null ? null : employeeCode.trim();
    }
    
    public String getEmployeeName(){
        
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName){
        
        this.employeeName= employeeName== null ? null : employeeName.trim();
    }
    
    public String getEmployeePinyin(){
        
        return employeePinyin;
    }
    
    public void setEmployeePinyin(String employeePinyin){
        
        this.employeePinyin= employeePinyin== null ? null : employeePinyin.trim();
    }
    
    public Integer getEmployeeOrder(){
        
        return employeeOrder;
    }
    
    public void setEmployeeOrder(Integer employeeOrder){
        
        this.employeeOrder= employeeOrder;
    }
    
    public Long getSiteId(){
        
        return siteId;
    }
    
    public void setSiteId(Long siteId){
        
        this.siteId= siteId;
    }
    
    public Long getDeptJobId(){
        
        return deptJobId;
    }
    
    public void setDeptJobId(Long deptJobId){
        
        this.deptJobId= deptJobId;
    }
    
    public String getIdCard(){
        
        return idCard;
    }
    
    public void setIdCard(String idCard){
        
        this.idCard= idCard== null ? null : idCard.trim();
    }
    
    public String getSex(){
        
        return sex;
    }
    
    public void setSex(String sex){
        
        this.sex= sex== null ? null : sex.trim();
    }
    
    public String getPhone(){
        
        return phone;
    }
    
    public void setPhone(String phone){
        
        this.phone= phone== null ? null : phone.trim();
    }
    
    public String getPhoneSms(){
        
        return phoneSms;
    }
    
    public void setPhoneSms(String phoneSms){
        
        this.phoneSms= phoneSms== null ? null : phoneSms.trim();
    }
    
    public String geteMail(){
        
        return eMail;
    }
    
    public void seteMail(String eMail){
        
        this.eMail= eMail== null ? null : eMail.trim();
    }
    
    public Date getBirthday(){
        
        return birthday;
    }
    
    public void setBirthday(Date birthday){
        
        this.birthday= birthday;
    }
    
    public String getAddress(){
        
        return address;
    }
    
    public void setAddress(String address){
        
        this.address= address== null ? null : address.trim();
    }
    
    public String getSelfRemark(){
        
        return selfRemark;
    }
    
    public void setSelfRemark(String selfRemark){
        
        this.selfRemark= selfRemark== null ? null : selfRemark.trim();
    }
    
    public Integer getIsUse(){
        
        return isUse;
    }
    
    public void setIsUse(Integer isUse){
        
        this.isUse= isUse;
    }
    
    public Date getStartDate(){
        
        return startDate;
    }
    
    public void setStartDate(Date startDate){
        
        this.startDate= startDate;
    }
    
    public Date getEndDate(){
        
        return endDate;
    }
    
    public void setEndDate(Date endDate){
        
        this.endDate= endDate;
    }
    
    public BigDecimal getBasicSalar(){
        
        return basicSalar;
    }
    
    public void setBasicSalar(BigDecimal basicSalar){
        
        this.basicSalar= basicSalar;
    }
    
    public BigDecimal getAddSalar(){
        
        return addSalar;
    }
    
    public void setAddSalar(BigDecimal addSalar){
        
        this.addSalar= addSalar;
    }
    
    public BigDecimal getLimitSumAmount(){
        
        return limitSumAmount;
    }
    
    public void setLimitSumAmount(BigDecimal limitSumAmount){
        
        this.limitSumAmount= limitSumAmount;
    }
    
    public BigDecimal getLimitOneAmount(){
        
        return limitOneAmount;
    }
    
    public void setLimitOneAmount(BigDecimal limitOneAmount){
        
        this.limitOneAmount= limitOneAmount;
    }
    
    public Integer getTransportToolId(){
        
        return transportToolId;
    }
    
    public void setTransportToolId(Integer transportToolId){
        
        this.transportToolId= transportToolId;
    }
    
    public Long getPartId(){
        
        return partId;
    }
    
    public void setPartId(Long partId){
        
        this.partId= partId;
    }
    
    public String getJobRemark(){
        
        return jobRemark;
    }
    
    public void setJobRemark(String jobRemark){
        
        this.jobRemark= jobRemark== null ? null : jobRemark.trim();
    }
    
    public String getDriverLicenseType(){
        
        return driverLicenseType;
    }
    
    public void setDriverLicenseType(String driverLicenseType){
        
        this.driverLicenseType= driverLicenseType== null ? null : driverLicenseType.trim();
    }
    
    public Integer getBankId(){
        
        return bankId;
    }
    
    public void setBankId(Integer bankId){
        
        this.bankId= bankId;
    }
    
    public Integer getBankAccountId(){
        
        return bankAccountId;
    }
    
    public void setBankAccountId(Integer bankAccountId){
        
        this.bankAccountId= bankAccountId;
    }
    
    public String getBankAccountName(){
        
        return bankAccountName;
    }
    
    public void setBankAccountName(String bankAccountName){
        
        this.bankAccountName= bankAccountName== null ? null : bankAccountName.trim();
    }
    
    public String getBankAccountNo(){
        
        return bankAccountNo;
    }
    
    public void setBankAccountNo(String bankAccountNo){
        
        this.bankAccountNo= bankAccountNo== null ? null : bankAccountNo.trim();
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
    
    public String getEmployeeNo(){
        
        return employeeNo;
    }
    
    public void setEmployeeNo(String employeeNo){
        
        this.employeeNo= employeeNo== null ? null : employeeNo.trim();
    }
}
