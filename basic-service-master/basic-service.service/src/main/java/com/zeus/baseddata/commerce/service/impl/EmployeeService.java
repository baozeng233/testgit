/*
 * 文 件 名: EmployeeService.java 版 权: Copyright © 2015-2017, 湖南物联聚创信息科技有限公司 描 述: EmployeeService.java 版 本： 1.0 创 建 人:
 * HuangChao 创建时间: 2017年10月23日 下午3:17:03
 */
package com.zeus.baseddata.commerce.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zeus.baseddata.commerce.mybatis.dao.HsAuthUserDAO;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicEmployeeDAO;
import com.zeus.baseddata.commerce.service.IEmployeeService;
import com.zeus.baseddata.entity.employee.EmpAddDTO;
import com.zeus.baseddata.entity.person.BasicEmployeeDTO;
import com.zeus.baseddata.mybatis.model.person.HsBasicEmployee;
import com.zeus.baseddata.mybatis.model.person.HsBasicEmployeeCriteria;
import com.zeus.baseddata.mybatis.model.user.HsAuthUser;
import com.zeus.baseddata.mybatis.model.user.HsAuthUserCriteria;
import com.zeus.common.annotation.AssemblyType;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/**
 * @ClassName: EmployeeService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author HuangChao 2017年10月23日 下午3:17:03
 * 
 */
@Service(interfaceClass= IEmployeeService.class,timeout=3000)
public class EmployeeService   implements IEmployeeService{
     
    @Resource
    private HsBasicEmployeeDAO hsBasicEmployeeDAO;
    
    @Resource
    private HsAuthUserDAO hsAuthUserDAO;
    
    /**
     * (非 Javadoc)
     * 
     * @Title: queryList
     * @Description: 分页查询
     * @throws @author HuangChao 2017年10月23日 下午3:17:03
     */
    @Override
    public List<HsBasicEmployee> selectList(Object queryParam){
    
        HsBasicEmployeeCriteria criteria= new HsBasicEmployeeCriteria();
        criteria.createCriteria().andRdStatusEqualTo(TrueFalseEnum.TRUE.getValue());
        return hsBasicEmployeeDAO.selectByExample(criteria);
    }
    
    /**
     * 
     * @Title: getEmployeeById
     * @Description: 根据ID查询员工信息
     * @param @param employeeId
     * @param @return
     * @return HsBasicEmployee
     * @throws @author HuangChao 2017年10月23日 下午3:23:30
     */
    public List<HsBasicEmployee> selectEmployeeById(List<Long> ids){
    	
        return hsBasicEmployeeDAO.selectEmployeeByIds(ids);
    }
    @Transactional
    public int insertEmpAdd(EmpAddDTO hsBasicEmployee){
    
        hsAuthUserDAO.insert(hsBasicEmployee.getUser());
        int result= hsBasicEmployeeDAO.insert(hsBasicEmployee.getEmp());
        return result;
    }
    
    @AssemblyType
    public PageDataInfo<BasicEmployeeDTO> selectEmployeeDTOByParams(
        PageQueryInfo<BasicEmployeeDTO> page){
    
        //1设置参数
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        Map<String,Object> param= new HashMap<String,Object>();
        param.put("code",page.getParam().getEmployeeCode());
        param.put("empname",page.getParam().getEmployeeName());
        param.put("site",page.getParam().getSiteId());
        param.put("empno",page.getParam().getEmployeeNo());
        if(StringUtils.isNotEmpty(page.getParam().getEmployeePinyin())){
        	param.put("pinyin", page.getParam().getEmployeePinyin().toUpperCase());
        }
        
        
        //2查询
        List<BasicEmployeeDTO> list= hsBasicEmployeeDAO.selectBasicEmployeeDtoByParams(param);
         
        //3结果集设置
        PageDataInfo<BasicEmployeeDTO> pager= new PageDataInfo<BasicEmployeeDTO>();
        PageInfo<BasicEmployeeDTO> pageinfo= new PageInfo<BasicEmployeeDTO>(list);
        pager.setTotal(pageinfo.getTotal());
        pager.setRows(list);
        pager.setPages(pageinfo.getPages());
        //todo 网点类型  目前没有查  
        return pager;
    }
    
    @Override
    public PageDataInfo<BasicEmployeeDTO> selectEmployeeSimple(
    		PageQueryInfo<BasicEmployeeDTO> page) {
    	 //1设置参数
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        
        String s ="";
        if(StringUtils.isNotEmpty(page.getParam().getEmployeePinyin())){
        	s="%"+page.getParam().getEmployeePinyin().toUpperCase()+"%";
        }
        //2查询
        List<BasicEmployeeDTO> list= hsBasicEmployeeDAO.selectBasicEmployeeSimple(s);
        
        //3结果集设置
        PageDataInfo<BasicEmployeeDTO> pager= new PageDataInfo<BasicEmployeeDTO>();
        PageInfo<BasicEmployeeDTO> pageinfo= new PageInfo<BasicEmployeeDTO>(list);
        pager.setTotal(pageinfo.getTotal());
        pager.setRows(list);
        pager.setPages(pageinfo.getPages());
        //todo 网点类型  目前没有查  
        return pager;
    }
    
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
    public BasicEmployeeDTO selectEmployeeDtoById(Long empid){
    
        Map<String,Object> param= new HashMap<String,Object>();
        param.put("empid",empid);
        List<BasicEmployeeDTO> list= hsBasicEmployeeDAO.selectBasicEmployeeDtoByParams(param);
        if(list.iterator().hasNext()){
            return list.iterator().next();
        }
        return null;
    }
    
    public int deleteEmployee(HsBasicEmployee emp){
    
        HsAuthUserCriteria cr= new HsAuthUserCriteria();
        cr.createCriteria().andEmployeeIdEqualTo(emp.getEmployeeId());
        List<HsAuthUser> list= hsAuthUserDAO.selectByExample(cr);
        if(list.iterator().hasNext()){
            return TrueFalseEnum.OTHER.getValue();
        }
        else{
            HsBasicEmployee emps= hsBasicEmployeeDAO.selectByPrimaryKey(emp.getEmployeeId());
            emps.setModifiedTime(new Date());
            emps.setModifiedBy(emp.getCreatedBy());
            emps.setRdStatus(TrueFalseEnum.FALSE.getValue());
            int res= hsBasicEmployeeDAO.updateByPrimaryKey(emps);
            if(res> 0){
                return TrueFalseEnum.TRUE.getValue();
            }
            else{
                return TrueFalseEnum.FALSE.getValue();
            }
        }
    }
    
    public int updateEmpoyee(BasicEmployeeDTO emp){
    
        HsBasicEmployee bs= hsBasicEmployeeDAO.selectByPrimaryKey(emp.getEmployeeId());
        emp.setCreatedBy(bs.getCreatedBy());
        emp.setCreatedTime(bs.getCreatedTime());
        emp.setRdStatus(bs.getRdStatus());
        int res= hsBasicEmployeeDAO.updateByPrimaryKey(emp);
        return res;
    }
    
    @Override
    public int selectEmployeeCodeBySiteId(Long siteid) {
    	HsBasicEmployeeCriteria cr =new HsBasicEmployeeCriteria();
    	cr.createCriteria().andSiteIdEqualTo(siteid);
    	return hsBasicEmployeeDAO.countByExample(cr)+1;
    }
    
}
