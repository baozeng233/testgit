/*
 * 文 件 名: EmployeeService.java 版 权: Copyright © 2015-2017, 湖南物联聚创信息科技有限公司 描 述: EmployeeService.java 版 本： 1.0 创 建 人:
 * HuangChao 创建时间: 2017年10月23日 下午3:17:03
 */
package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.employee.EmpAddDTO;
import com.zeus.baseddata.entity.person.BasicEmployeeDTO;
import com.zeus.baseddata.mybatis.model.person.HsBasicEmployee;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/**
 * @ClassName: EmployeeService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author HuangChao 2017年10月23日 下午3:17:03
 * 
 */
public interface IEmployeeService{
    
    
    /**
     * (非 Javadoc)
     * 
     * @Title: queryList
     * @Description: 分页查询
     * @throws @author HuangChao 2017年10月23日 下午3:17:03
     */
    List<HsBasicEmployee> selectList(Object queryParam);
    
    /**
     * 
     * @Title: getEmployeeById
     * @Description: 根据ID查询员工信息
     * @param @param employeeId
     * @param @return
     * @return HsBasicEmployee
     * @throws @author HuangChao 2017年10月23日 下午3:23:30
     */
    List<HsBasicEmployee> selectEmployeeById(List<Long> ids);
    
    int insertEmpAdd(EmpAddDTO hsBasicEmployee);
    
    PageDataInfo<BasicEmployeeDTO> selectEmployeeDTOByParams(PageQueryInfo<BasicEmployeeDTO> page);
    
    PageDataInfo<BasicEmployeeDTO> selectEmployeeSimple(PageQueryInfo<BasicEmployeeDTO> page);
    
    /**
     * 
     * @Title: getEmployeeDtoById
     * @Description: 获取员工详情
     * @param @param empid
     * @param @return
     * @return BasicEmployeeDTO
     * @throws
     * @author caojie 2017年11月1日 下午1:17:07
     */
    BasicEmployeeDTO selectEmployeeDtoById(Long empid);
    
    int deleteEmployee(HsBasicEmployee emp);
    
    int updateEmpoyee(BasicEmployeeDTO emp);
    
    int selectEmployeeCodeBySiteId( Long siteid);
    
}
