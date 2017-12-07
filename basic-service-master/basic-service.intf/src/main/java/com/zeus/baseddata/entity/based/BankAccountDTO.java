/*
 * 文 件 名:  HsBasicBankAccountDTO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  HsBasicBankAccountDTO.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月13日 下午1:22:02
*/
package com.zeus.baseddata.entity.based;

import java.io.Serializable;

import com.zeus.baseddata.mybatis.model.based.HsBasicBankAccount;

/** 
* @ClassName: BankAccountDTO
* @Description: 开户行查询结果封装实体
* @author lifeng 2017年11月13日 下午1:22:02
* 
*/

public class BankAccountDTO extends HsBasicBankAccount implements Serializable{
    
    /** 
    * 
    */
    private static final long serialVersionUID= - 2832939829281496219L;
    
    /**
     * 所属银行
     */
    private String parentBankName;
    
    /**
     * 所属省份
     */
    private String provinceName;
    
    /**
     * 所属城市
     */
    private String cityName;
    
    /**
     * 创建人
     */
    private String createdName;
    
    /**
     * 修改人
     */
    private String modifiedName;
    
    public String getParentBankName(){
        return parentBankName;
    }
    
    public void setParentBankName(String parentBankName){
        this.parentBankName= parentBankName;
    }
    
    public String getProvinceName(){
        return provinceName;
    }
    
    public void setProvinceName(String provinceName){
        this.provinceName= provinceName;
    }
    
    public String getCityName(){
        return cityName;
    }
    
    public void setCityName(String cityName){
        this.cityName= cityName;
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
