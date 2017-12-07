/*
 * 文 件 名:  ResourceType.java
 * 版    权:  Copyright© 2015-2025 湖南物联聚创信息科技有限公司. All rights reserved. 湘ICP备16015498号
 * 描    述:  ResourceType.java 
 * 版    本：   1.0 
 * 创 建 人:  HuangChao
 * 创建时间: 2017年11月2日 下午4:46:51
*/
package com.zeus.baseddata.enums;

import com.zeus.common.core.enums.EnumCodeGetter;

/** 
* @ClassName: ResourceType
* @Description: 资源类型枚举
* @author HuangChao 2017年11月2日 下午4:46:51
* 
*/
public enum ResourceType implements EnumCodeGetter{
    
    MENU("MENU"),COMPONENT("COMPONENT"),URL("URL"),METHOD("METHOD");
    
    private String code;
    
    private ResourceType(String code){
        this.code= code;
    }
    
    @Override
    public String getCode(){
        return code;
    }
    
    @Override
    public String toString(){
        return this.code;
    }
    
}
