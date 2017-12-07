/*
 * 文 件 名:  ProvinceDTO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  ProvinceDTO.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月23日 下午3:41:02
*/
package com.zeus.baseddata.entity.based;

import java.io.Serializable;

import com.zeus.baseddata.mybatis.model.based.HsBasicProvince;

/** 
* @ClassName: ProvinceDTO
* @Description: TODO(这里用一句话描述这个类的作用)
* @author lifeng 2017年11月23日 下午3:41:02
* 
*/
public class ProvinceDTO extends HsBasicProvince implements Serializable{
    
    /** 
    * 
    */
    private static final long serialVersionUID= 1887370105755030391L;
    
    private String countryName;
    
    public String getCountryName(){
        return countryName;
    }
    
    public void setCountryName(String countryName){
        this.countryName= countryName;
    }
    
}
