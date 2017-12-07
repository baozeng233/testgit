package com.zeus.baseddata.mybatis.model.person;

import com.zeus.common.entity.BaseModel;
import java.io.Serializable;

public class HsBasicDeptJobRole extends BaseModel implements Serializable {
    /** 部门岗位ID */
    private Long deptJobId;

    /** 角色ID */
    private Long roleId;

    private static final long serialVersionUID = 1L;

    public Long getDeptJobId() {
        return deptJobId;
    }

    public void setDeptJobId(Long deptJobId) {
        this.deptJobId = deptJobId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}