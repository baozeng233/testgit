package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.zeus.baseddata.entity.person.BasicDeptDTO;
import com.zeus.baseddata.common.mybatis.dao.HsBasicDeptMapper;

public interface HsBasicDeptDAO extends HsBasicDeptMapper{
    
    /**
     * 查询部门信息 DTO 集合 单个等 〈功能详细描述〉 author caojie
     * 
     * @param parsms
     * @return
     */
    public List<BasicDeptDTO> selectBasicDeptDtoByParams(Map<String,Object> parsms);
}
