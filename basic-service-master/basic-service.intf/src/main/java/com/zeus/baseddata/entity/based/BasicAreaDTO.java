/*
 * 文 件 名: BasicAreaDTO.java 版 权: Copyright © 2015-2017, 湖南物联聚创信息科技有限公司 描 述: BasicAreaDTO.java 版 本： 1.0 创 建 人: jiangjiao
 * 创建时间: 2017年11月14日 上午11:09:16
 */
package com.zeus.baseddata.entity.based;

import com.zeus.baseddata.mybatis.model.based.HsBasicArea;

/**
 * @ClassName: BasicAreaDTO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author jiangjiao 2017年11月14日 上午11:09:16
 * 
 */
public class BasicAreaDTO extends HsBasicArea{
    
    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID= 1L;
    
    private String parentName;
    
    /**
     * @return parentName
     */
    public String getParentName(){
        
        return parentName;
    }
    
    /**
     * @param parentName 要设置的 parentName
     */
    public void setParentName(String parentName){
        
        this.parentName= parentName;
    }
    
}
