package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.zeus.baseddata.common.mybatis.dao.HsBasicEmployeeMapper;
import com.zeus.baseddata.entity.person.BasicEmployeeDTO;
import com.zeus.baseddata.mybatis.model.person.HsBasicEmployee;

public interface HsBasicEmployeeDAO extends HsBasicEmployeeMapper{
    
    List<BasicEmployeeDTO> selectBasicEmployeeDtoByParams(Map<String,Object> maps);
    
    List<HsBasicEmployee>  selectEmployeeByIds(List<Long> list);

	List<BasicEmployeeDTO> selectBasicEmployeeSimple(String employeePinyin);
}
