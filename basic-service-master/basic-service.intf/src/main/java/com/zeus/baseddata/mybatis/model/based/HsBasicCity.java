package com.zeus.baseddata.mybatis.model.based;

import com.zeus.common.entity.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class HsBasicCity extends BaseModel implements Serializable {
    /** ID */
    private Long cityId;

    /** 编码 */
    private String cityCode;

    /** 名称 */
    private String cityName;

    /** 拼音 */
    private String cityPinyin;

    /** 排序顺序 */
    private Integer cityOrder;

    /** 所属省份ID */
    private Long provinceId;

    /** 邮政编码 */
    private String postcode;

    /** 备注 */
    private String remark;

    /** 数据状态(0：删除  1：正常) */
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

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getCityPinyin() {
        return cityPinyin;
    }

    public void setCityPinyin(String cityPinyin) {
        this.cityPinyin = cityPinyin == null ? null : cityPinyin.trim();
    }

    public Integer getCityOrder() {
        return cityOrder;
    }

    public void setCityOrder(Integer cityOrder) {
        this.cityOrder = cityOrder;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
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