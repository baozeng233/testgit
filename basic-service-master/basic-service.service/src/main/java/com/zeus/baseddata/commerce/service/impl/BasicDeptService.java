package com.zeus.baseddata.commerce.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicDeptDAO;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicJobDAO;
import com.zeus.baseddata.commerce.service.IBasicDeptService;
import com.zeus.baseddata.entity.person.BasicDeptDTO;
import com.zeus.baseddata.mybatis.model.person.HsBasicDept;
import com.zeus.baseddata.mybatis.model.person.HsBasicDeptCriteria;
import com.zeus.baseddata.mybatis.model.person.HsBasicJob;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.exception.ServiceException;

@Service(interfaceClass= IBasicDeptService.class)
public class BasicDeptService implements IBasicDeptService{
     
    @Resource
    private HsBasicDeptDAO hsBasicDeptDAO;
    
    @Resource
    private HsBasicJobDAO hsBasicJobDAO;
    
    
    
    public int insertBasicDept(HsBasicDept detp){
    
        return hsBasicDeptDAO.insert(detp);
    }
    
    public int codeNameExist(HsBasicDept detp){
    
        try{
            HsBasicDeptCriteria cr= new HsBasicDeptCriteria();
            cr.createCriteria()
                .andDeptCodeEqualTo(detp.getDeptCode())
                .andDeptIdNotEqualTo(detp.getDeptId());
            List<HsBasicDept> list= hsBasicDeptDAO.selectByExample(cr);
            if(list.size()> 0){
                return list.size();
            }
            else{
                cr= new HsBasicDeptCriteria();
                cr.createCriteria()
                    .andDeptNameEqualTo(detp.getDeptName())
                    .andDeptIdNotEqualTo(detp.getDeptId());
                list= hsBasicDeptDAO.selectByExample(cr);
                return list.size();
            }
        }
        catch(Exception e){
            throw new ServiceException("1001013","验证部门编码姓名错误");
        }
    }
    
    
    public int deleteDeptById(HsBasicDept dept){
    
        HsBasicDept dpt= hsBasicDeptDAO.selectByPrimaryKey(dept.getDeptId());
        if(dpt== null){
            return 0;
        }
        else{
            dpt.setModifiedBy(dept.getModifiedBy());//预留  修改人，修改缓存等信息
            dpt.setModifiedTime(new Date());
            dpt.setRdStatus(TrueFalseEnum.FALSE.getValue());
            return hsBasicDeptDAO.updateByPrimaryKey(dpt);
        }
    }
    
    public BasicDeptDTO selectDeptDtoById(Long deptid){
    
        Map<String,Object> params= new HashMap<String,Object>();
        params.put("deptid",deptid);
        //预留   没有查询注入字典   网点类型
        List<BasicDeptDTO> list= hsBasicDeptDAO.selectBasicDeptDtoByParams(params);
        if(list.iterator().hasNext()){
            return list.iterator().next();
        }
        return null;
    }
    
    public List<BasicDeptDTO> selectDeptAll(){
    
        List<BasicDeptDTO> list=
            hsBasicDeptDAO.selectBasicDeptDtoByParams(new HashMap<String,Object>());
        return list;
    }
    
    public List<BasicDeptDTO> selectDeptListBySiteTypeId(Long siteId){
    
        Map<String,Object> params= new HashMap<String,Object>();
        params.put("siteId",siteId);
        //预留   没有查询注入字典   网点类型
        List<BasicDeptDTO> list= hsBasicDeptDAO.selectBasicDeptDtoByParams(params);
        return list;
    }
    
    public int updateDeptEdit(HsBasicDept detp){
    
        HsBasicDept old= hsBasicDeptDAO.selectByPrimaryKey(detp.getDeptId());
        detp.setCreatedBy(old.getCreatedBy());
        detp.setCreatedTime(old.getCreatedTime());
        detp.setRdStatus(old.getRdStatus());
        return hsBasicDeptDAO.updateByPrimaryKey(detp);
    }
    
     

	public List<HsBasicJob> selectJobs(Long deptId) {
		return hsBasicJobDAO.getJobsByDtptId(deptId);
	}
    
}
