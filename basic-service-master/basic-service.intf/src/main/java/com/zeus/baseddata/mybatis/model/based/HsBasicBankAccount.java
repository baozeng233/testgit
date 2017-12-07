package com.zeus.baseddata.mybatis.model.based;

import com.zeus.common.entity.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class HsBasicBankAccount extends BaseModel implements Serializable {
    /** ID */
    private Long accountId;

    /** 开户行编号 */
    private String accountCode;

    /** 开户行名称 */
    private String accountName;

    /** 名称拼音 */
    private String accountPinyin;

    /** 数据排列顺序 */
    private Integer accountOrder;

    /** 所属银行ID */
    private Long parentBankId;

    /** 城市ID */
    private Long cityId;

    /** 备注 */
    private String remark;

    /** 创建人 */
    private Long createdBy;

    /** 创建时间 */
    private Date createdTime;

    /** 修改人 */
    private Long modifiedBy;

    /** 修改时间 */
    private Date modifiedTime;

    /** 记录数据状态（0：删除  1：正常） */
    private Integer rdStatus;

    private static final long serialVersionUID = 1L;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode == null ? null : accountCode.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountPinyin() {
        return accountPinyin;
    }

    public void setAccountPinyin(String accountPinyin) {
        this.accountPinyin = accountPinyin == null ? null : accountPinyin.trim();
    }

    public Integer getAccountOrder() {
        return accountOrder;
    }

    public void setAccountOrder(Integer accountOrder) {
        this.accountOrder = accountOrder;
    }

    public Long getParentBankId() {
        return parentBankId;
    }

    public void setParentBankId(Long parentBankId) {
        this.parentBankId = parentBankId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Integer getRdStatus() {
        return rdStatus;
    }

    public void setRdStatus(Integer rdStatus) {
        this.rdStatus = rdStatus;
    }
}