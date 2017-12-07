package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.person.BasicDeptDTO;
import com.zeus.baseddata.mybatis.model.person.HsBasicDept;
import com.zeus.baseddata.mybatis.model.person.HsBasicJob;

public interface IBasicDeptService{
    
    int insertBasicDept(HsBasicDept detp);
    
    int codeNameExist(HsBasicDept detp);
    
    
    int deleteDeptById(HsBasicDept dept);
    
    BasicDeptDTO selectDeptDtoById(Long deptid);
    
    List<BasicDeptDTO> selectDeptAll();
    
    List<BasicDeptDTO> selectDeptListBySiteTypeId(Long siteId);
    
    int updateDeptEdit(HsBasicDept detp);

	List<HsBasicJob> selectJobs(Long deptId);
	
    
}
