/*
 * 文 件 名:  AuthRoleSearchDTO.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  AuthRoleSearchDTO.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月1日 下午3:24:24
*/
package com.zeus.baseddata.entity.user;

import java.io.Serializable;

import com.zeus.common.entity.BaseModel;

/**
 * @ClassName: AuthRoleSearchDTO
 * @Description: 角色查询条件封装实体类
 * @author lifeng 2017年11月1日 下午3:24:24
 * 
 */
public class AuthRoleSearchDTO extends BaseModel implements Serializable{
    
    /** 
    * 
    */
    private static final long serialVersionUID= - 423828458447161797L;
    
    /**
     * 角色名称
     */
    private String roleName;
    
    /**
     * 资源名称
     */
    private String resName;
    
    /**
     * 网点类型
     */
    private String dictName;
    
    /**
     * 角色代码
     */
    private String roleCode;
    
    /**
     * 角色拼音，首字母
     */
    private String rolePinyin;
    
    /**
     * 标记是否联合多表查询(0：不联合 ，1：联合)
     */
    private Integer flag= 0;
    
    public String getRoleName(){
        return roleName;
    }
    
    public void setRoleName(String roleName){
        this.roleName= roleName;
    }
    
    public String getResName(){
        return resName;
    }
    
    public void setResName(String resName){
        this.resName= resName;
    }
    
    public String getDictName(){
        return dictName;
    }
    
    public void setDictName(String dictName){
        this.dictName= dictName;
    }
    
    public String getRoleCode(){
        return roleCode;
    }
    
    public void setRoleCode(String roleCode){
        this.roleCode= roleCode;
    }
    
    public String getRolePinyin(){
        return rolePinyin;
    }
    
    public void setRolePinyin(String rolePinyin){
        this.rolePinyin= rolePinyin;
    }
    
    public Integer getFlag(){
        return flag;
    }
    
    public void setFlag(Integer flag){
        this.flag= flag;
    }
    
}
