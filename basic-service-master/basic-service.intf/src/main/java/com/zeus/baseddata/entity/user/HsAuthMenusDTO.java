/*
 * 文 件 名:  HsAuthMenusDTO.java
 * 版    权:  Copyright© 2015-2025 湖南物联聚创信息科技有限公司. All rights reserved. 湘ICP备16015498号
 * 描    述:  HsAuthMenusDTO.java 
 * 版    本：   1.0 
 * 创 建 人:  HuangChao
 * 创建时间: 2017年11月10日 下午4:11:58
*/
package com.zeus.baseddata.entity.user;

import com.zeus.baseddata.mybatis.model.user.HsAuthMenus;

/** 
* @ClassName: HsAuthMenusDTO
* @Description: TODO(这里用一句话描述这个类的作用)
* @author HuangChao 2017年11月10日 下午4:11:58
* 
*/
public class HsAuthMenusDTO extends HsAuthMenus{
    
    
    /** 
    * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
    */
    private static final long serialVersionUID= 1L;
    
    private String parentMenuName;
    
    public String getParentMenuName(){
        return parentMenuName;
    }
    
    public void setParentMenuName(String parentMenuName){
        this.parentMenuName= parentMenuName;
    }
    
}
