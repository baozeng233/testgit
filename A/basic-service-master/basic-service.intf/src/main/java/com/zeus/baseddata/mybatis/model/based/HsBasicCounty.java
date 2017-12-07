package com.zeus.baseddata.mybatis.model.based;

import com.zeus.common.entity.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class HsBasicCounty extends BaseModel implements Serializable {
    /** ID
             */
    private Long countyId;

    /** 编码 */
    private String countyCode;

    /** 名称 */
    private String countyName;

    /** 拼音 */
    private String countyPinyin;

    /** 排列顺序 */
    private Integer countyOrder;

    /** 所属城市ID */
    private Long cityId;

    /** 邮政编码 */
    private String postcode;

    /** 备注 */
    private String remark;

    /** 数据状态(0：删除  1：正常) */
    private Integer rdStatus;

    /** 是否全境派送(0：否，1：是，2:盲区) */
    private Integer overallFlag;

    /** 创建人 */
    private Long createdBy;

    /** 创建时间 */
    private Date createdTime;

    /** 修改人 */
    private Long modifiedBy;

    /** 修改时间 */
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode == null ? null : countyCode.trim();
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }

    public String getCountyPinyin() {
        return countyPinyin;
    }

    public void setCountyPinyin(String countyPinyin) {
        this.countyPinyin = countyPinyin == null ? null : countyPinyin.trim();
    }

    public Integer getCountyOrder() {
        return countyOrder;
    }

    public void setCountyOrder(Integer countyOrder) {
        this.countyOrder = countyOrder;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
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

    public Integer getOverallFlag() {
        return overallFlag;
    }

    public void setOverallFlag(Integer overallFlag) {
        this.overallFlag = overallFlag;
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