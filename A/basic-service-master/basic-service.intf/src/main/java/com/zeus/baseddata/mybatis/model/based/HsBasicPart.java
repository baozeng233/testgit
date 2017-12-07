package com.zeus.baseddata.mybatis.model.based;

import com.zeus.common.entity.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class HsBasicPart extends BaseModel implements Serializable {
    /** ID */
    private Long partId;

    /** 承包区编号 */
    private String partCode;

    /** 名称 */
    private String partName;

    /** 名称拼音 */
    private String partPinyin;

    /** 排列顺序 */
    private Integer partOrder;

    /** 网点ID */
    private Long siteId;

    /** 联系人 */
    private String linkMan;

    /** 号码 */
    private String phone;

    /** 短信通知号码 */
    private String phoneSms;

    /** 传真 */
    private String fax;

    /** 邮编 */
    private String postcode;

    /** 地址 */
    private String address;

    /** 承包区状态(1：正常 0：暂停 -1失效) */
    private Integer partStatus;

    /** 承包开始日期 */
    private Date startDate;

    /** 承包结束日期 */
    private Date endDate;

    /** 备注 */
    private String remark;

    /** 记录数据状态(0：删除 1：正常) */
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

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public String getPartCode() {
        return partCode;
    }

    public void setPartCode(String partCode) {
        this.partCode = partCode == null ? null : partCode.trim();
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }

    public String getPartPinyin() {
        return partPinyin;
    }

    public void setPartPinyin(String partPinyin) {
        this.partPinyin = partPinyin == null ? null : partPinyin.trim();
    }

    public Integer getPartOrder() {
        return partOrder;
    }

    public void setPartOrder(Integer partOrder) {
        this.partOrder = partOrder;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPhoneSms() {
        return phoneSms;
    }

    public void setPhoneSms(String phoneSms) {
        this.phoneSms = phoneSms == null ? null : phoneSms.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getPartStatus() {
        return partStatus;
    }

    public void setPartStatus(Integer partStatus) {
        this.partStatus = partStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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