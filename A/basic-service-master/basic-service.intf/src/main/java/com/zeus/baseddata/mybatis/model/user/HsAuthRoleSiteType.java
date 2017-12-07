package com.zeus.baseddata.mybatis.model.user;

import com.zeus.common.entity.BaseModel;
import java.io.Serializable;

public class HsAuthRoleSiteType extends BaseModel implements Serializable {
    /** ID */
    private Long id;

    /** 网点类型ID,关联字典表ID */
    private Long siteTypeId;

    /** 角色ID */
    private Long roleId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSiteTypeId() {
        return siteTypeId;
    }

    public void setSiteTypeId(Long siteTypeId) {
        this.siteTypeId = siteTypeId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}