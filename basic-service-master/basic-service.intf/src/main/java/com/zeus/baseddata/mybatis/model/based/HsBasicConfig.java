package com.zeus.baseddata.mybatis.model.based;

import com.zeus.common.entity.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class HsBasicConfig extends BaseModel implements Serializable {
    /** ID */
    private Long globalConfigId;

    /** 编号 */
    private String globalConfigCode;

    /** 名称 */
    private String globalConfigName;

    /** 值 */
    private String globalConfigValue;

    /** 维护显示 */
    private Integer blUser;

    /** 备注 */
    private String remark;

    /** 数据状态（0：删除  1：正常） */
    private Integer rdStatus;

    /** 创建人 */
    private Long createdBy;

    /** 创建时间 */
    private Date createdTime;

    /** 修改人 */
    private Long modifiedBy;

    /** 修改时间 */
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

    public Long getGlobalConfigId() {
        return globalConfigId;
    }

    public void setGlobalConfigId(Long globalConfigId) {
        this.globalConfigId = globalConfigId;
    }

    public String getGlobalConfigCode() {
        return globalConfigCode;
    }

    public void setGlobalConfigCode(String globalConfigCode) {
        this.globalConfigCode = globalConfigCode == null ? null : globalConfigCode.trim();
    }

    public String getGlobalConfigName() {
        return globalConfigName;
    }

    public void setGlobalConfigName(String globalConfigName) {
        this.globalConfigName = globalConfigName == null ? null : globalConfigName.trim();
    }

    public String getGlobalConfigValue() {
        return globalConfigValue;
    }

    public void setGlobalConfigValue(String globalConfigValue) {
        this.globalConfigValue = globalConfigValue == null ? null : globalConfigValue.trim();
    }

    public Integer getBlUser() {
        return blUser;
    }

    public void setBlUser(Integer blUser) {
        this.blUser = blUser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getRdStatus() {
        return rdStatus;
    }

    public void setRdStatus(Integer rdStatus) {
        this.rdStatus = rdStatus;
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
}