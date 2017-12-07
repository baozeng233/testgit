/*
 * 文 件 名:  UserType.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  UserType.java 
 * 版    本：   1.0 
 * 创 建 人:  lidesheng
 * 创建时间: 2017年12月1日 下午1:03:45
*/
package com.zeus.baseddata.enums;

import com.zeus.common.core.enums.EnumCodeGetter;

/** 
 * @ClassName: UserType
 * @Description: 用户枚举参数定义
 * @author lidesheng 2017年12月1日 下午1:03:45
 * 
 */
public enum UserState implements EnumCodeGetter{
    
    /**
     * 用户状态D:删除-禁用
     */
    STATUSD("D"),
    
    /**
     * 用户状态N:正常
     */
    STATUSN("N"),
    
    /**
     * 用户状态L:锁定
     */
    STATUSL("L")
    ;
    
    private String code;
    
    private UserState(String code){
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
