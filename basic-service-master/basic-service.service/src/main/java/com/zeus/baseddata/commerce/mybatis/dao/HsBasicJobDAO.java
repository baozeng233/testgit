package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;

import com.zeus.baseddata.entity.person.DeptJobRoleDTO;
import com.zeus.baseddata.mybatis.model.person.HsBasicJob;
import com.zeus.baseddata.common.mybatis.dao.HsBasicJobMapper;

/**
 * 
 * 岗位操作自定义
 * 
 * @author jinagjiao 2017年10月30日
 * @see
 * @since 1.0
 */
public interface HsBasicJobDAO extends HsBasicJobMapper{
    
    /**
     * @Title: getJobsByDtptId
     * @Description: 通过部门Id获取岗位信息
     * @param @param
     * @return void
     * @throws @author jiangjiao 2017年11月1日 下午2:23:26
     */
    List<HsBasicJob> getJobsByDtptId(Long deptId);
    
    /**
     * @Title: getDeptjobRole
     * @Description: 通过部门岗位Id获取部门岗位角色信息
     * @param @param
     * @return void
     * @throws @author jiangjiao 2017年11月1日 下午2:23:26
     */
    List<DeptJobRoleDTO> getDeptJobRoleByDeptId(Long dpid);
    
}
