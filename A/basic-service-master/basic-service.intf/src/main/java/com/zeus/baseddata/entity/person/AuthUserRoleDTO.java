/*
 * 文 件 名: AuthUserRoleDTO.java 版 权: Copyright © 2015-2017, 湖南物联聚创信息科技有限公司 描 述: AuthUserRoleDTO.java 版 本： 1.0 创 建 人: view
 * 创建时间: 2017年10月27日 上午9:50:45
 */
package com.zeus.baseddata.entity.person;

import com.zeus.baseddata.mybatis.model.user.HsAuthUserRole;

/**
 * @ClassName: AuthUserRoleDTO
 * @Description: TODO(自定义：用户角色关联 DTO)
 * @author view 2017年10月27日 上午9:50:45
 * 
 */
@SuppressWarnings("serial")
public class AuthUserRoleDTO extends HsAuthUserRole{
    
    /** 用户角色名称 **/
    private String roleName;
    
    public String getRoleName(){
        return roleName;
    }
    
    public void setRoleName(String roleName){
        this.roleName= roleName;
    }
    
}
