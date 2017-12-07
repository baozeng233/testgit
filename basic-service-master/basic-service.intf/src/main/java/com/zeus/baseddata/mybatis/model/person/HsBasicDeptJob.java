package com.zeus.baseddata.mybatis.model.person;

import com.zeus.common.entity.BaseModel;
import java.io.Serializable;

public class HsBasicDeptJob extends BaseModel implements Serializable {
    /** 部门岗位ID */
    private Long deptJobId;

    /** 部门ID */
    private Long deptId;

    /** 岗位ID */
    private Long jobId;

    /** 部门岗位名称 */
    private String deptJobName;

    private static final long serialVersionUID = 1L;

    public Long getDeptJobId() {
        return deptJobId;
    }

    public void setDeptJobId(Long deptJobId) {
        this.deptJobId = deptJobId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getDeptJobName() {
        return deptJobName;
    }

    public void setDeptJobName(String deptJobName) {
        this.deptJobName = deptJobName == null ? null : deptJobName.trim();
    }
}