package com.zeus.baseddata.mybatis.model.based;

import java.io.Serializable;
import java.util.Date;

import com.zeus.common.entity.BaseModel;

public class HsBasicCache extends BaseModel implements Serializable{
    
    /** 缓存ID */
    private Long cacheId;
    
    /** 缓存约束代码 */
    private String cacheCode;
    
    /** 缓存名称 */
    private String cacheName;
    
    /** 是否启用（0 不启用 1 启用） */
    private Integer isEnable;
    
    /** 数据加载服务地址 */
    private String dataUrl;
    
    /** 对象名称 */
    private String fieldCode;
    
    /** 请求方式(1 所有 2 分页) */
    private Integer reqMethod;
    
    /** 创建人 */
    private Long createdBy;
    
    /** 创建时间 */
    private Date createdTime;
    
    /** 修改人 */
    private Long modifiedBy;
    
    /** 修改时间 */
    private Date modifiedTime;
    
    /** 刷新人 */
    private Long reflushBy;
    
    /** 最后刷新时间 */
    private Date reflushTime;
    
    /** 数据标识（0 删除 1 正常） */
    private Integer rdStatus;
    
    private static final long serialVersionUID= 1L;
    
    public Long getCacheId(){
        return cacheId;
    }
    
    public void setCacheId(Long cacheId){
        this.cacheId= cacheId;
    }
    
    public String getCacheCode(){
        return cacheCode;
    }
    
    public void setCacheCode(String cacheCode){
        this.cacheCode= cacheCode== null ? null : cacheCode.trim();
    }
    
    public String getCacheName(){
        return cacheName;
    }
    
    public void setCacheName(String cacheName){
        this.cacheName= cacheName== null ? null : cacheName.trim();
    }
    
    public Integer getIsEnable(){
        return isEnable;
    }
    
    public void setIsEnable(Integer isEnable){
        this.isEnable= isEnable;
    }
    
    public String getDataUrl(){
        return dataUrl;
    }
    
    public void setDataUrl(String dataUrl){
        this.dataUrl= dataUrl== null ? null : dataUrl.trim();
    }
    
    public String getFieldCode(){
        return fieldCode;
    }
    
    public void setFieldCode(String fieldCode){
        this.fieldCode= fieldCode== null ? null : fieldCode.trim();
    }
    
    public Integer getReqMethod(){
        return reqMethod;
    }
    
    public void setReqMethod(Integer reqMethod){
        this.reqMethod= reqMethod;
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
    
    public Long getReflushBy(){
        return reflushBy;
    }
    
    public void setReflushBy(Long reflushBy){
        this.reflushBy= reflushBy;
    }
    
    public Date getReflushTime(){
        return reflushTime;
    }
    
    public void setReflushTime(Date reflushTime){
        this.reflushTime= reflushTime;
    }
    
    public Integer getRdStatus(){
        return rdStatus;
    }
    
    public void setRdStatus(Integer rdStatus){
        this.rdStatus= rdStatus;
    }
}
