package com.zeus.baseddata.mybatis.model.person;

import com.zeus.common.entity.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class HsBasicJob extends BaseModel implements Serializable {
    /** 岗位ID */
    private Long jobId;

    /** 岗位编号 */
    private String jobCode;

    /** 岗位名称 */
    private String jobName;

    /** 名称拼音 */
    private String jobPinyin;

    /** 排列顺序 */
    private Integer jobOrder;

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

    /** 数据状态（0：删除 1：正常） */
    private Integer rdStatus;

    private static final long serialVersionUID = 1L;

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode == null ? null : jobCode.trim();
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobPinyin() {
        return jobPinyin;
    }

    public void setJobPinyin(String jobPinyin) {
        this.jobPinyin = jobPinyin == null ? null : jobPinyin.trim();
    }

    public Integer getJobOrder() {
        return jobOrder;
    }

    public void setJobOrder(Integer jobOrder) {
        this.jobOrder = jobOrder;
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