/*
 * 文 件 名:  AuthRoleService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  AuthRoleService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月1日 上午11:13:43
*/
package com.zeus.baseddata.commerce.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.framework.common.utils.ObjectUtils;
import com.framework.common.utils.Str2MD5;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zeus.baseddata.commerce.mybatis.dao.HsAuthRoleDAO;
import com.zeus.baseddata.commerce.mybatis.dao.HsAuthRoleResourceDAO;
import com.zeus.baseddata.commerce.mybatis.dao.HsAuthRoleSiteTypeDAO;
import com.zeus.baseddata.commerce.mybatis.dao.HsAuthUserRoleDAO;
import com.zeus.baseddata.commerce.service.IAuthRoleService;
import com.zeus.baseddata.common.mybatis.dao.HsBasicDeptJobRoleMapper;
import com.zeus.baseddata.entity.user.AuthResourceDTO;
import com.zeus.baseddata.entity.user.AuthRoleDTO;
import com.zeus.baseddata.entity.user.AuthRoleInfoDTO;
import com.zeus.baseddata.entity.user.AuthRoleSearchDTO;
import com.zeus.baseddata.mybatis.model.person.HsBasicDeptJobRoleCriteria;
import com.zeus.baseddata.mybatis.model.user.HsAuthRole;
import com.zeus.baseddata.mybatis.model.user.HsAuthRoleCriteria;
import com.zeus.baseddata.mybatis.model.user.HsAuthRoleResource;
import com.zeus.baseddata.mybatis.model.user.HsAuthRoleResourceCriteria;
import com.zeus.baseddata.mybatis.model.user.HsAuthRoleSiteType;
import com.zeus.baseddata.mybatis.model.user.HsAuthRoleSiteTypeCriteria;
import com.zeus.baseddata.mybatis.model.user.HsAuthUserRoleCriteria;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/**
 * 
 * @ClassName: AuthRoleService
 * @Description: TODO数据服务层-角色服务
 * @author lifeng 2017年11月1日 上午11:40:43
 *
 */
@Service(interfaceClass= IAuthRoleService.class)
public class AuthRoleService implements IAuthRoleService{
    
    @Resource
    private HsAuthRoleDAO hsAuthRoleDAO;
    
    @Resource
    private HsAuthRoleResourceDAO hsAuthRoleResourceDAO;
    
    @Resource
    private HsAuthRoleSiteTypeDAO hsAuthRoleSiteTypeDAO;
    
    @Resource
    private HsAuthUserRoleDAO hsAuthUserRoleDAO;
    
    @Resource
    private HsBasicDeptJobRoleMapper hsBasicDeptJobRoleMapper;
    
    /**
     * 
     * @Title: addHsAuthRole
     * @Description: 角色添加，并添加关联表
     * @param @param authRoleDTO
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月1日 上午10:56:06
     */
    @Transactional
    public int addHsAuthRole(AuthRoleDTO authRoleDTO){
        // 1.插入数据
        int result= hsAuthRoleDAO.insertSelective((HsAuthRole)authRoleDTO);
        // 2.批量插入关联表
        insertByBatch(authRoleDTO);
        return result;
    }
    
    /**
     * @Title: deleteHsAuthRole
     * @Description: 逻辑删除角色并清除关联表
     * @param @param roleId
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月1日 上午10:55:23
     */
    @Transactional
    public int deleteHsAuthRole(HsAuthRole role){
        // 逻辑删除角色
        role.setRdStatus(TrueFalseEnum.FALSE.getValue());
        int result= hsAuthRoleDAO.updateByPrimaryKeySelective(role);
        // 1.清除关联角色网点，角色资源表数据
        deleteRelationByRoleId(role.getRoleId());
        
        // 2.清除关联用户角色，岗位角色表数据
        HsAuthUserRoleCriteria example= new HsAuthUserRoleCriteria();
        example.createCriteria().andRoleIdEqualTo(role.getRoleId());
        hsAuthUserRoleDAO.deleteByExample(example);
        
        HsBasicDeptJobRoleCriteria _example= new HsBasicDeptJobRoleCriteria();
        _example.createCriteria().andRoleIdEqualTo(role.getRoleId());
        hsBasicDeptJobRoleMapper.deleteByExample(_example);
        return result;
    }
    
    /**
     * @Title: updateHsAuthRole
     * @Description: 更新角色及其关联表
     * @param @param authRoleDTO
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月1日 下午1:46:10
     */
    @Transactional
    public int updateHsAuthRole(AuthRoleDTO authRoleDTO){
        // 1.更新角色
        int result= hsAuthRoleDAO.updateByPrimaryKeySelective(authRoleDTO);
        
        // 2.更新角色关联表 先删除，再批量插入
        deleteRelationByRoleId(authRoleDTO.getRoleId());
        insertByBatch(authRoleDTO);
        return result;
    }
    
    /**
     * @Title: findByName
     * @Description: 通过名称查询角色
     * @param @param roleName
     * @param @return
     * @return List<HsAuthRole>
     * @throws @author lifeng 2017年11月2日 上午9:20:11
     */
    public List<HsAuthRole> findByName(String roleName){
        HsAuthRoleCriteria example= new HsAuthRoleCriteria();
        example.createCriteria().andRoleNameEqualTo(roleName).andRdStatusNotEqualTo(
            TrueFalseEnum.FALSE.getValue());
        return hsAuthRoleDAO.selectByExample(example);
    }
    
    /**
     * @Title: findByCode
     * @Description: 通过编码查询角色
     * @param @param roleCode
     * @param @return
     * @return List<HsAuthRole>
     * @throws @author lifeng 2017年11月2日 上午9:20:15
     */
    public List<HsAuthRole> findByCode(String roleCode){
        HsAuthRoleCriteria example= new HsAuthRoleCriteria();
        example.createCriteria().andRoleCodeEqualTo(roleCode).andRdStatusNotEqualTo(
            TrueFalseEnum.FALSE.getValue());
        return hsAuthRoleDAO.selectByExample(example);
    }
    
    /**
     * @Title: insertByBatch
     * @Description: 批量插入角色关联表数据
     * @param @param authRoleDTO
     * @return void
     * @throws @author lifeng 2017年11月2日 上午11:18:36
     */
    private void insertByBatch(AuthRoleDTO authRoleDTO){
        List<HsAuthRoleResource> roleResources= authRoleDTO.getRoleResources();
        if(CollectionUtils.isNotEmpty(roleResources)){
            hsAuthRoleResourceDAO.insertByBatch(roleResources);
        }
        List<HsAuthRoleSiteType> roleSiteTypes= authRoleDTO.getRoleSiteTypes();
        if(CollectionUtils.isNotEmpty(roleSiteTypes)){
            hsAuthRoleSiteTypeDAO.insertByBatch(roleSiteTypes);
        }
    }
    
    /**
     * @Title: deleteRelationByRoleId
     * @Description: 清除关联表数据
     * @param @param roleId
     * @return void
     * @throws @author lifeng 2017年11月2日 下午1:01:48
     */
    private void deleteRelationByRoleId(Long roleId){
        HsAuthRoleResourceCriteria example= new HsAuthRoleResourceCriteria();
        example.createCriteria().andRoleIdEqualTo(roleId);
        hsAuthRoleResourceDAO.deleteByExample(example);
        
        HsAuthRoleSiteTypeCriteria example1= new HsAuthRoleSiteTypeCriteria();
        example1.createCriteria().andRoleIdEqualTo(roleId);
        hsAuthRoleSiteTypeDAO.deleteByExample(example1);
    }
    
    /**
     * @Title: queryAll
     * @Description: 查询所有
     * @param @return
     * @return List<HsAuthRole>
     * @throws @author lifeng 2017年11月3日 下午5:04:45
     */
    public List<HsAuthRole> queryAll(){
        HsAuthRoleCriteria example= new HsAuthRoleCriteria();
        example.createCriteria().andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
        return hsAuthRoleDAO.selectByExample(example);
    }
    
    /**
     * @Title: getRoleBySiteType
     * @Description: 通过网点类型获取角色
     * @param @param siteType
     * @param @return
     * @return ResultBean<List<HsAuthRole>>
     * @throws @author lifeng 2017年11月6日 下午1:56:13
     */
    public List<HsAuthRole> getRoleBySiteType(Long siteType){
        HsAuthRoleSiteTypeCriteria example= new HsAuthRoleSiteTypeCriteria();
        example.createCriteria().andSiteTypeIdEqualTo(siteType);
        List<HsAuthRoleSiteType> list= hsAuthRoleSiteTypeDAO.selectByExample(example);
        List<Long> ids= new ArrayList<Long>();
        if(CollectionUtils.isNotEmpty(list)){
            for(HsAuthRoleSiteType hsAuthRoleSiteType : list){
                ids.add(hsAuthRoleSiteType.getRoleId());
            }
        }
        HsAuthRoleCriteria _example= new HsAuthRoleCriteria();
        _example.createCriteria().andRoleIdIn(ids);
        return hsAuthRoleDAO.selectByExample(_example);
    }
    
    /**
     * @Title: getRoleInfoById
     * @Description: 通过id获取角色关联的详细信息
     * @param @param roleId
     * @param @return
     * @return AuthRoleInfoDTO
     * @throws @author lifeng 2017年11月7日 下午2:13:54
     */
    public AuthRoleInfoDTO getRoleInfoById(Long roleId){
        return hsAuthRoleDAO.getRoleInfoById(roleId);
    }
    
    /**
     * 
    * @Title: queryRoleMenuResAll
    * @Description: 查询所有角色菜单资源列表信息,用于缓存加载
    * @param @return
    * @return List<AuthRoleInfoDTO>
    * @throws 
    * @author HuangChao 2017年11月8日 上午11:36:12
     */
    public List<AuthRoleInfoDTO> queryRoleMenuResAll(){
        return hsAuthRoleDAO.queryRoleMenuResAll();
    }
    
    /**
     * 
    * @Title: queryRoleResAll
    * @Description: 查询所有角色资源列表信息,用于缓存加载
    * @param @return
    * @return List<AuthRoleInfoDTO>
    * @throws 
    * @author HuangChao 2017年11月8日 上午11:36:12
     */
    public Map<String,Object> queryRoleResAll(){
        List<AuthRoleInfoDTO> rs= hsAuthRoleDAO.queryRoleResAll();
        Map<String,Object> resMap= new HashMap<>();
        for(AuthRoleInfoDTO role : rs){
            List<AuthResourceDTO> dto= role.getResources();
            if(! dto.isEmpty()){
                for(AuthResourceDTO resourceDTO : dto){
                    resourceDTO.setField(Str2MD5.MD516(resourceDTO.getResUrl()));
                }
            }
            resMap.put(String.valueOf(role.getRoleId()),dto);
        }
        return resMap;
    }
    
    /** (非 Javadoc) 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @throws 
    * @author lifeng 2017年11月29日 下午5:09:05
     */
    @Override
    public PageDataInfo<AuthRoleInfoDTO> pageQuery(PageQueryInfo<AuthRoleSearchDTO> queryParam){
        PageHelper.startPage(queryParam.getPageNum(),queryParam.getPageSize());
        List<AuthRoleInfoDTO> list= hsAuthRoleDAO.selectByQueryInfo(queryParam.getParam());
        //设置结果集
        PageInfo<AuthRoleInfoDTO> pageInfo= new PageInfo<>(list);
        PageDataInfo<AuthRoleInfoDTO> dataInfo= new PageDataInfo<>();
        dataInfo.setTotal(pageInfo.getTotal());
        dataInfo.setRows(list);
        dataInfo.setPages(dataInfo.getPages());
        return dataInfo;
    }
    
    /** (非 Javadoc) 
    * @Title: queryList
    * @Description: PCN分页查询
    * @throws 
    * @author lifeng 2017年12月1日 下午2:18:29
     */
    @Override
    public PageDataInfo<HsAuthRole> queryList(PageQueryInfo<HsAuthRole> queryParam){
        PageHelper.startPage(queryParam.getPageNum(),queryParam.getPageSize());
        HsAuthRole role= queryParam.getParam();
        HsAuthRoleCriteria example= new HsAuthRoleCriteria();
        if(ObjectUtils.isNotNull(role)){
            if(StringUtils.isNotBlank(role.getRoleName())){
                example.or().andRoleNameLike("%"+ role.getRoleName()+ "%").andRdStatusNotEqualTo(
                    TrueFalseEnum.FALSE.getValue());
            }
            if(StringUtils.isNotBlank(role.getRoleCode())){
                example.or().andRoleCodeLike("%"+ role.getRoleCode()+ "%").andRdStatusNotEqualTo(
                    TrueFalseEnum.FALSE.getValue());
            }
            if(StringUtils.isNotBlank(role.getRolePinyin())){
                example.or()
                    .andRolePinyinLike("%"+ role.getRolePinyin().toUpperCase()+ "%")
                    .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
            }
        }
        List<HsAuthRole> list= hsAuthRoleDAO.selectByExample(example);
        //设置结果集
        PageInfo<HsAuthRole> pageInfo= new PageInfo<>(list);
        PageDataInfo<HsAuthRole> dataInfo= new PageDataInfo<>();
        dataInfo.setTotal(pageInfo.getTotal());
        dataInfo.setRows(list);
        dataInfo.setPages(pageInfo.getPages());
        return dataInfo;
    }
    
    /** (非 Javadoc) 
    * @Title: getOrder
    * @Description: 获取最大顺序
    * @throws 
    * @author lifeng 2017年12月1日 下午4:34:55
     */
    @Override
    public Long getOrder(){
        return hsAuthRoleDAO.queryMaxOrder();
    }
    
}
