/*
 * 文 件 名:  BasicPartDTO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  BasicPartDTO.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月14日 下午9:31:08
*/
package com.zeus.baseddata.entity.based;

import java.io.Serializable;

import com.zeus.baseddata.mybatis.model.based.HsBasicPart;

/** 
* @ClassName: BasicPartDTO
* @Description: 承包区查询结果封装类
* @author lifeng 2017年11月14日 下午9:31:08
* 
*/

public class BasicPartDTO extends HsBasicPart implements Serializable{
    
    /** 
    * 
    */
    private static final long serialVersionUID= - 6358777270687899665L;
    
    /** 创建人 */
    private String createdName;
    
    /** 修改人 */
    private String modifiedName;
    
    /**所属网点id*/
    private Long siteId;
    
    @Override
    public Long getSiteId(){
        return siteId;
    }
    
    @Override
    public void setSiteId(Long siteId){
        this.siteId= siteId;
    }
    
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
