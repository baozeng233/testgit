/*
 * 文 件 名:  RegionResultDTO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  RegionResultDTO.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月21日 下午3:41:03
*/
package com.zeus.baseddata.entity.based;

import java.io.Serializable;

import com.zeus.common.entity.BaseModel;

/** 
* @ClassName: RegionResultDTO
* @Description: 关联查询结果封装实体
* @author lifeng 2017年11月21日 下午3:41:03
* 
*/

public class RegionResultDTO extends BaseModel implements Serializable{
    
    /** 
    * 
    */
    private static final long serialVersionUID= - 2278313643912649523L;
    
    /**
     * 国家名
     */
    private String countryName;
    
    /**
     * 省份名
     */
    private String provinceName;
    
    /**
     * 城市名
     */
    private String cityName;
    
    /**
     * 国家名id
     */
    private Long countryId;
    
    /**
     * 省份名id
     */
    private Long provinceId;
    
    /**
     * 城市名id
     */
    private Long cityId;
    
    public RegionResultDTO(String countryName,String provinceName,String cityName){
        super();
        this.countryName= countryName;
        this.provinceName= provinceName;
        this.cityName= cityName;
    }
    
    public RegionResultDTO(){
        super();
    }
    
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
    
    public String getCityName(){
        return cityName;
    }
    
    public void setCityName(String cityName){
        this.cityName= cityName;
    }
    
    public Long getCountryId(){
        return countryId;
    }
    
    public void setCountryId(Long countryId){
        this.countryId= countryId;
    }
    
    public Long getProvinceId(){
        return provinceId;
    }
    
    public void setProvinceId(Long provinceId){
        this.provinceId= provinceId;
    }
    
    public Long getCityId(){
        return cityId;
    }
    
    public void setCityId(Long cityId){
        this.cityId= cityId;
    }
    
}
