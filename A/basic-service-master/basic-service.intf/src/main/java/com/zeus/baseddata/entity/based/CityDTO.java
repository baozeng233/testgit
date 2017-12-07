/*
 * 文 件 名:  CityDTO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  CityDTO.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月23日 下午3:41:53
*/
package com.zeus.baseddata.entity.based;

import java.io.Serializable;

import com.zeus.baseddata.mybatis.model.based.HsBasicCity;

/** 
* @ClassName: CityDTO
* @Description: TODO(这里用一句话描述这个类的作用)
* @author lifeng 2017年11月23日 下午3:41:53
* 
*/

public class CityDTO extends HsBasicCity implements Serializable{
    
    /** 
    *
    */
    private static final long serialVersionUID= 3584100424887445615L;
    
    private String countryName;
    
    private String provinceName;
    
    public String getCountryName(){
        return countryName;
    }
    
    public void setCountryName(String countryName){
        this.countryName= countryName;
    }
    
    public String getProvinceName(){
        return provinceName;
    }
    
    public void setProvinceName(String provinceName){
        this.provinceName= provinceName;
    }
    
}
