package com.zeus.baseddata.commerce.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.zeus.baseddata.commerce.mybatis.dao.HsAuthRoleDAO;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicJobDAO;
import com.zeus.baseddata.commerce.service.IHsBasicJobService;
import com.zeus.baseddata.common.mybatis.dao.HsBasicDeptJobMapper;
import com.zeus.baseddata.common.mybatis.dao.HsBasicDeptJobRoleMapper;
import com.zeus.baseddata.entity.person.DeptJobRoleDTO;
import com.zeus.baseddata.entity.person.HsBasicJobDTO;
import com.zeus.baseddata.mybatis.model.person.HsBasicDeptJob;
import com.zeus.baseddata.mybatis.model.person.HsBasicDeptJobCriteria;
import com.zeus.baseddata.mybatis.model.person.HsBasicDeptJobRole;
import com.zeus.baseddata.mybatis.model.person.HsBasicDeptJobRoleCriteria;
import com.zeus.baseddata.mybatis.model.person.HsBasicJob;
import com.zeus.baseddata.mybatis.model.person.HsBasicJobCriteria;
import com.zeus.baseddata.mybatis.model.user.HsAuthRole;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.exception.ServiceException;
import com.zeus.common.core.id.IdUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(interfaceClass= IHsBasicJobService.class)
public class HsBasicJobService implements IHsBasicJobService{
    
    @Resource
    private HsBasicJobDAO hsBasicJobDAO;
    
    @Resource
    private HsAuthRoleDAO hsAuthRoleDAO;
    
    @Resource
    private HsBasicDeptJobMapper hsBasicDeptJobMapper;
    
    @Resource
    private HsBasicDeptJobRoleMapper hsBasicDeptJobRoleMapper;
    
    /**
     * @Title: insertHsBasicJob
     * @Description: 新增岗位
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月1日 下午1:26:12
     */
    @Transactional
    public int insertHsBasicJob(HsBasicJobDTO hsBasicJob){
        
        HsBasicDeptJob job= null;
        for(Long i : hsBasicJob.getDepts()){
            job= new HsBasicDeptJob();
            job.setDeptJobId(IdUtil.getId());
            job.setDeptJobName(hsBasicJob.getJobName());
            job.setDeptId(i);
            job.setJobId(hsBasicJob.getJobId());
            hsBasicDeptJobMapper.insert(job);
        }
        return hsBasicJobDAO.insert(hsBasicJob);
    }
    
    /**
     * @Title: updateHsBasicJob
     * @Description: 修改岗位
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月1日 下午1:36:42
     */
    @Transactional
    public int updateHsBasicJob(HsBasicJobDTO hsBasicJob){
        
        //1删除原有关联数据
        HsBasicDeptJobCriteria cr= new HsBasicDeptJobCriteria();
        cr.createCriteria().andJobIdEqualTo(hsBasicJob.getJobId());
        hsBasicDeptJobMapper.deleteByExample(cr);
        //2新增新的关联数据
        HsBasicDeptJob job= null;
        for(Long i : hsBasicJob.getDepts()){
            job= new HsBasicDeptJob();
            job.setDeptJobId(IdUtil.getId());
            job.setDeptJobName(hsBasicJob.getJobName());
            job.setDeptId(i);
            job.setJobId(hsBasicJob.getJobId());
            hsBasicDeptJobMapper.insert(job);
        }
        //3修改岗位数据
        HsBasicJob old= hsBasicJobDAO.selectByPrimaryKey(hsBasicJob.getJobId());
        hsBasicJob.setCreatedBy(old.getCreatedBy());
        hsBasicJob.setCreatedTime(old.getCreatedTime());
        hsBasicJob.setRdStatus(old.getRdStatus());
        int result= hsBasicJobDAO.updateByPrimaryKey(hsBasicJob);
        log.debug("修改"+ result);
        return result;
    }
    
    /**
     * @Title: deleteHsBasicJob
     * @Description: 逻辑删除岗位
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月1日 下午1:46:28
     */
    @Transactional
    public int deleteHsBasicJob(Long jobId){
        
        //岗位信息数据执行逻辑删除操作，部门岗位数据进行物理删除
        //1删除原有关联数据
        HsBasicDeptJobCriteria cr= new HsBasicDeptJobCriteria();
        cr.createCriteria().andJobIdEqualTo(jobId);
        hsBasicDeptJobMapper.deleteByExample(cr);
        
        //2修改岗位数据
        HsBasicJob old= hsBasicJobDAO.selectByPrimaryKey(jobId);
        old.setRdStatus(TrueFalseEnum.FALSE.getValue());
        old.setModifiedTime(new Date());
        int result= hsBasicJobDAO.updateByPrimaryKey(old);
        return result;
    }
    
    /**
     * @Title: codeNameExist
     * @Description: 岗位名称和编号
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月1日 下午1:53:23
     */
    public int codeNameExist(HsBasicJob hsBasicJob){
        
            HsBasicJobCriteria cr= new HsBasicJobCriteria();
            cr.createCriteria().andJobCodeEqualTo(hsBasicJob.getJobCode()).andJobIdNotEqualTo(
                hsBasicJob.getJobId());
            int count  =hsBasicJobDAO.countByExample(cr);
            if(count> 0){
                return count;
            }
            else{
                cr= new HsBasicJobCriteria();
                cr.createCriteria().andJobNameEqualTo(hsBasicJob.getJobName()).andJobIdNotEqualTo(
                    hsBasicJob.getJobId());
                count= hsBasicJobDAO.countByExample(cr);
                return count;
            }
        }
    
    /**
     * @Title: queryJob
     * @Description: 查询所有岗位信息
     * @param @return
     * @return List<HsBasicJob>
     * @throws @author jiangjiao 2017年11月1日 下午2:06:08
     */
    public List<HsBasicJob> queryJob(){
        
        HsBasicJobCriteria cr= new HsBasicJobCriteria();
        cr.createCriteria().andRdStatusEqualTo(TrueFalseEnum.TRUE.getValue());
        return hsBasicJobDAO.selectByExample(cr);
    }
    
    /**
     * @Title: getBasicJobById
     * @Description: 通过Id获取岗位信息
     * @param @return
     * @return HsBasicJob
     * @throws @author jiangjiao 2017年11月1日 下午2:16:18
     */
    public HsBasicJob getBasicJobById(Long id){
        
        return hsBasicJobDAO.selectByPrimaryKey(id);
    }
    
    /**
     * @Title: getDeptJobByJobId
     * @Description: 通过岗位Id获取部门岗位信息
     * @param @return
     * @return List<HsBasicDeptJob>
     * @throws @author jiangjiao 2017年11月1日 下午2:26:03
     */
    public List<HsBasicDeptJob> getDeptJobByJobId(Long id){
        
        HsBasicDeptJobCriteria cr= new HsBasicDeptJobCriteria();
        cr.createCriteria().andJobIdEqualTo(id);
        
        return hsBasicDeptJobMapper.selectByExample(cr);
    }
    
    /**
     * @Title: queryAllDeptJob
     * @Description: 查询所有部门岗位信息
     * @param @return
     * @return List<HsBasicDeptJob>
     * @throws @author jiangjiao 2017年11月1日 下午2:36:13
     */
    public List<HsBasicDeptJob> queryAllDeptJob(){
        
        return hsBasicDeptJobMapper.selectByExample(new HsBasicDeptJobCriteria());
    }
    
    /**
     * @Title: getDeptjobRole
     * @Description: 获取部门岗位角色信息
     * @param @return
     * @return List<DeptJobRoleDTO>
     * @throws @author jiangjiao 2017年11月1日 下午2:46:53
     */
    public List<HsBasicDeptJobRole> getDeptJobRole(Long dpid){
        
        HsBasicDeptJobRoleCriteria cr= new HsBasicDeptJobRoleCriteria();
        cr.createCriteria().andDeptJobIdEqualTo(dpid);
        
        return hsBasicDeptJobRoleMapper.selectByExample(cr);
    }
    
    /**
     * @Title: updateJobRole
     * @Description: 编辑岗位角色
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月1日 下午3:06:08
     */
    @Transactional
    public int updateJobRole(DeptJobRoleDTO dto){
        
        HsBasicDeptJobRoleCriteria cr= new HsBasicDeptJobRoleCriteria();
        cr.createCriteria().andDeptJobIdEqualTo(dto.getRoleId());
        hsBasicDeptJobRoleMapper.deleteByExample(cr);
        HsBasicDeptJobRole ro= null;
        List<Long> list= dto.getIds();
        for(Long l : list){
            ro= new HsBasicDeptJobRole();
            ro.setDeptJobId(dto.getRoleId());
            ro.setRoleId(l);
            hsBasicDeptJobRoleMapper.insert(ro);
        }
        return TrueFalseEnum.TRUE.getValue();
    }
    
    /**
     * @Title: getAllRole
     * @Description: 获取所有角色信息
     * @param @return
     * @return List<HsAuthRole>
     * @throws @author jiangjiao 2017年11月13日 上午10:42:38
     */
    public List<HsAuthRole> getAllRole(){
        
        return hsAuthRoleDAO.getAllRole();
    }
    
}
