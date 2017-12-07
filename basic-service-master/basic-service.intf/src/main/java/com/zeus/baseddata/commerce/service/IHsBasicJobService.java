package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.person.DeptJobRoleDTO;
import com.zeus.baseddata.entity.person.HsBasicJobDTO;
import com.zeus.baseddata.mybatis.model.person.HsBasicDeptJob;
import com.zeus.baseddata.mybatis.model.person.HsBasicDeptJobRole;
import com.zeus.baseddata.mybatis.model.person.HsBasicJob;
import com.zeus.baseddata.mybatis.model.user.HsAuthRole;

public interface IHsBasicJobService{
    
    /**
     * @Title: insertHsBasicJob
     * @Description: 新增岗位
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月1日 下午1:26:12
     */
    int insertHsBasicJob(HsBasicJobDTO hsBasicJob);
    
    /**
     * @Title: updateHsBasicJob
     * @Description: 修改岗位
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月1日 下午1:36:42
     */
    int updateHsBasicJob(HsBasicJobDTO hsBasicJob);
    /**
     * @Title: deleteHsBasicJob
     * @Description: 逻辑删除岗位
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月1日 下午1:46:28
     */
    int deleteHsBasicJob(Long jobId);
    
    /**
     * @Title: codeNameExist
     * @Description: 岗位名称和编号
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月1日 下午1:53:23
     */
    int codeNameExist(HsBasicJob hsBasicJob);
    
    /**
     * @Title: queryJob
     * @Description: 查询所有岗位信息
     * @param @return
     * @return List<HsBasicJob>
     * @throws @author jiangjiao 2017年11月1日 下午2:06:08
     */
    List<HsBasicJob> queryJob();
    
    /**
     * @Title: getBasicJobById
     * @Description: 通过Id获取岗位信息
     * @param @return
     * @return HsBasicJob
     * @throws @author jiangjiao 2017年11月1日 下午2:16:18
     */
    HsBasicJob getBasicJobById(Long id);
    
    /**
     * @Title: getDeptJobByJobId
     * @Description: 通过岗位Id获取部门岗位信息
     * @param @return
     * @return List<HsBasicDeptJob>
     * @throws @author jiangjiao 2017年11月1日 下午2:26:03
     */
    List<HsBasicDeptJob> getDeptJobByJobId(Long id);
    
    /**
     * @Title: queryAllDeptJob
     * @Description: 查询所有部门岗位信息
     * @param @return
     * @return List<HsBasicDeptJob>
     * @throws @author jiangjiao 2017年11月1日 下午2:36:13
     */
    List<HsBasicDeptJob> queryAllDeptJob();
    
    /**
     * @Title: getDeptjobRole
     * @Description: 获取部门岗位角色信息
     * @param @return
     * @return List<DeptJobRoleDTO>
     * @throws @author jiangjiao 2017年11月1日 下午2:46:53
     */
    List<HsBasicDeptJobRole> getDeptJobRole(Long dpid);
    
    /**
     * @Title: updateJobRole
     * @Description: 编辑岗位角色
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月1日 下午3:06:08
     */
    int updateJobRole(DeptJobRoleDTO dto);
    
    /**
     * @Title: getAllRole
     * @Description: 获取所有角色信息
     * @param @return
     * @return List<HsAuthRole>
     * @throws @author jiangjiao 2017年11月13日 上午10:42:38
     */
    List<HsAuthRole> getAllRole();
    
}
