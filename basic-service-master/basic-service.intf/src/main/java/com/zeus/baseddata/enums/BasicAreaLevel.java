/*
 * 文 件 名:  BasicAreaLevel.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  BasicAreaLevel.java 
 * 版    本：   1.0 
 * 创 建 人:  caojie
 * 创建时间: 2017年11月13日 下午4:28:00
*/
package com.zeus.baseddata.enums;

/** 
 * @ClassName: BasicAreaLevel
 * @Description: 业务架构关系  层级枚举
 * @author caojie 2017年11月13日 下午4:28:00
 * 
 */
public enum BasicAreaLevel {
	 /**
     * 省
     */
	PROVIENCE(1),
    /**
     * 市区
     */
    CITY(2),
    /**
     * 分拨
     */
    AREAS(3),
    /**
     * 片区
     */
    DISTRICT(4);
    
    private int value;
    
    private BasicAreaLevel(int value){
    
        this.value= value;
    }
    
    public int getValue(){
    
        return value;
    }
}
