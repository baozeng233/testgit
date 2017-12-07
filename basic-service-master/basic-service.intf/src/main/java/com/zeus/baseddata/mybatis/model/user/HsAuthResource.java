package com.zeus.baseddata.mybatis.model.user;

import com.zeus.common.entity.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class HsAuthResource extends BaseModel implements Serializable {
    /** ID */
    private Long resId;

    /** 编码 */
    private String resCode;

    /** 名称 */
    private String resName;

    /** 资源类型，COMPONENT:按钮 MTD:未知 MENU:菜单 METHOD:方法
             */
    private String resType;

    /** 请求方式，GET、POST、DELETE、PUT、ALL */
    private String reqMethod;

    /** 访问地址 */
    private String resUrl;

    /** 描述 */
    private String resDesc;

    /** 父级ID */
    private Long parentResId;

    /** 顺序 */
    private String resSeq;

    /** 级别 */
    private Integer resLevel;

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

    private static final long serialVersionUID = 1L;

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode == null ? null : resCode.trim();
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName == null ? null : resName.trim();
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType == null ? null : resType.trim();
    }

    public String getReqMethod() {
        return reqMethod;
    }

    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod == null ? null : reqMethod.trim();
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl == null ? null : resUrl.trim();
    }

    public String getResDesc() {
        return resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc == null ? null : resDesc.trim();
    }

    public Long getParentResId() {
        return parentResId;
    }

    public void setParentResId(Long parentResId) {
        this.parentResId = parentResId;
    }

    public String getResSeq() {
        return resSeq;
    }

    public void setResSeq(String resSeq) {
        this.resSeq = resSeq == null ? null : resSeq.trim();
    }

    public Integer getResLevel() {
        return resLevel;
    }

    public void setResLevel(Integer resLevel) {
        this.resLevel = resLevel;
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