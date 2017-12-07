/*
 * 文 件 名:  CacheDTO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  CacheDTO.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年12月6日 上午11:40:25
*/
package com.zeus.baseddata.entity.based;

import java.io.Serializable;

import com.zeus.baseddata.mybatis.model.based.HsBasicCache;

/** 
* @ClassName: CacheDTO
* @Description: 缓存实体增强
* @author lifeng 2017年12月6日 上午11:40:25
* 
*/
public class CacheDTO extends HsBasicCache implements Serializable{
    
    /** 
    * 
    */
    private static final long serialVersionUID= - 8209493331215443777L;
    
    /**
     * 创建人
     */
    private String createdName;
    
    /**
     * 修改人
     */
    private String modifiedName;
    
    public String getCreatedName(){
        return createdName;
    }
    
    public void setCreatedName(String createdName){
        this.createdName= createdName;
    }
    
    public String getModifiedName(){
        return modifiedName;
    }
    
    public void setModifiedName(String modifiedName){
        this.modifiedName= modifiedName;
    }
    
}
