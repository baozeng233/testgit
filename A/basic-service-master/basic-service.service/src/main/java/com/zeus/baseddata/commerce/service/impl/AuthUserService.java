package com.zeus.baseddata.commerce.service.impl;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.framework.common.utils.StringUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zeus.baseddata.commerce.mybatis.dao.HsAuthUserDAO;
import com.zeus.baseddata.commerce.mybatis.dao.HsAuthUserRoleDAO;
import com.zeus.baseddata.commerce.service.IAuthUserService;
import com.zeus.baseddata.entity.person.AuthUserDTO;
import com.zeus.baseddata.enums.UserState;
import com.zeus.baseddata.mybatis.model.user.HsAuthUser;
import com.zeus.baseddata.mybatis.model.user.HsAuthUserCriteria;
import com.zeus.baseddata.mybatis.model.user.HsAuthUserCriteria.Criteria;
import com.zeus.baseddata.mybatis.model.user.HsAuthUserRoleCriteria;
import com.zeus.common.constants.BaseConstants;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.core.service.UtilService;
import com.zeus.common.entity.PageQueryInfo;

@Service(interfaceClass= IAuthUserService.class)
public class AuthUserService extends UtilService implements IAuthUserService{
    
    @Resource
    private HsAuthUserDAO hsAuthUserDAO;
    
    @Resource
    private HsAuthUserRoleDAO hsAuthUserRoleDAO;
    
    /**
     * (非 Javadoc) 
     * @Title: queryList
     * @Description: 查询用户列表（分页）
     * @throws 
     * @author lidesheng 2017年11月3日 下午5:15:16
     */
    @Override
    public List<AuthUserDTO> queryList(Object queryParam){
        HsAuthUserCriteria paramCriteria= new HsAuthUserCriteria();
        Criteria criteria= paramCriteria.createCriteria();
        if(queryParam!= null){
            AuthUserDTO seachParam= (AuthUserDTO)queryParam;
            if(StringUtils.isNotEmpty(seachParam.getUserName())){
                criteria.andUserNameLike(seachParam.getUserName());
            }
            if(seachParam.getUserType()>= BaseConstants.NUM.ZERO){
                criteria.andUserTypeEqualTo(seachParam.getUserType());
            }
            if(StringUtils.isNotEmpty(seachParam.getStatus())){
                criteria.andStatusEqualTo(seachParam.getStatus());
            }
            
        }
        return hsAuthUserDAO.selectListByExample(paramCriteria);
    }
    
    /**
     * 
     * @Title: queryListByParams
     * @Description: 联合查询用户列表（带分页）
     * @param @param page
     * @param @return
     * @return PageDataInfo<AuthUserDTO>
     * @throws 
     * @author lidesheng 2017年11月8日 上午11:37:51
     */
    public PageDataInfo<AuthUserDTO> queryListByParams(PageQueryInfo<AuthUserDTO> page){
        
        // 设置参数
        PageHelper.startPage(page.getPageNum(),page.getPageSize());
        Map<String,Object> searchParams= new HashMap<String,Object>();
        searchParams.put("userName",page.getParam().getUserName()); //用户姓名
        searchParams.put("userType",page.getParam().getUserType()); //用户类型
        searchParams.put("employeeId",page.getParam().getEmployeeId());//员工ID
        searchParams.put("employeeName",page.getParam().getEmployeeName());//员工姓名
        searchParams.put("employeeCode",page.getParam().getEmployeeCode());//员工编号
        searchParams.put("blOa",page.getParam().getBlOa()); //是否OA登录
        searchParams.put("status",page.getParam().getStatus()); //用户状态
        searchParams.put("siteName",page.getParam().getSiteName());//网点名称
        searchParams.put("roleName",page.getParam().getRoleName());//角色名称
        searchParams.put("meanId",page.getParam().getRoleName());//菜单Id
        
        // 日期转换
        if(page.getParam().getExpireDate()!= null){
            SimpleDateFormat smt= new SimpleDateFormat("yyyy-MM-dd");
            String expireDate= smt.format(page.getParam().getExpireDate());
            searchParams.put("expireDate",expireDate);//过期日期
        }
        
        // 查询
        List<AuthUserDTO> list= hsAuthUserDAO.selectUserlist(searchParams);
        
        // 结果集设置
        PageDataInfo<AuthUserDTO> pageData= new PageDataInfo<AuthUserDTO>();
        PageInfo<AuthUserDTO> pageInfo= new PageInfo<AuthUserDTO>(list);
        pageData.setTotal(pageInfo.getTotal());
        pageData.setRows(list);
        pageData.setPages(pageInfo.getPages());
        return pageData;
    }
    
    /**
     * 
     * @Title: queryComBoxList
     * @Description: 带查询条件用户分页下拉框
     * @param @param queryParam
     * @param @return
     * @return PageDataInfo<HsAuthUser>
     * @throws 
     * @author lidesheng 2017年11月9日 上午10:32:04
     */
    public PageDataInfo<HsAuthUser> queryComBoxList(PageQueryInfo<AuthUserDTO> queryParam){
        int pageNum= 1;
        if(queryParam.getPageNum()> 0){
            pageNum= queryParam.getPageNum();
        }
        int pageSize= NUMBER_PER_PAGE;
        if(queryParam.getPageSize()> 0){
            pageSize= queryParam.getPageSize();
        }
        PageHelper.startPage(pageNum,pageSize);
        Page page= (Page)queryComBoxWhere(queryParam);
        return new PageDataInfo<>(page);
    }
    
    /**
     * 
     * @Title: queryComBoxWhere
     * @Description: 查询用户信息数据（带模糊查询）分页
     * @param @param queryParam
     * @param @return
     * @return List<HsAuthUser>
     * @throws 
     * @author lidesheng 2017年11月9日 上午10:30:59
     */
    private List<HsAuthUser> queryComBoxWhere(PageQueryInfo<AuthUserDTO> queryParam){
        HsAuthUserCriteria criteria= new HsAuthUserCriteria();
        criteria.createCriteria().andRdStatusEqualTo(TrueFalseEnum.TRUE.getValue());
        if(StringUtils.isNotEmpty(queryParam.getParam().getUserName())){
            criteria.createCriteria().andUserNameLike(queryParam.getParam().getUserName());
        }
        return hsAuthUserDAO.selectByExample(criteria);
    }
    
    /**
     * 
     * @Title: selectUserListApi
     * @Description: 对外网点信息接口
     * @param @param userIds
     * @param @return
     * @return List<HsAuthUser>
     * @throws 
     * @author lidesheng 2017年11月22日 上午10:26:47
     */
    public List<HsAuthUser> selectUserListApi(List<Long> userIds){
        return hsAuthUserDAO.queryList(userIds);
    }
    
    /**
     * 
     * @Title: selectUserDetails
     * @Description: 查询用户明细通过用户ID
     * @param @param userId
     * @param @return
     * @return List<AuthUserDTO>
     * @throws 
     * @author lidesheng 2017年11月7日 上午11:17:54
     */
    public AuthUserDTO selectDetailsById(Long userId){
        return hsAuthUserDAO.selectDetailsById(userId);
    }
    
    /**
     * 
     * @Title: selectHsAuthUserByPrimaryKey
     * @Description: 通过用户ID查询用户信息
     * @param @param userId 用户ID
     * @param @return
     * @return HsAuthUser
     * @throws 
     * @author lidesheng 2017年11月3日 下午3:44:42
     */
    public HsAuthUser selectHsAuthUserByPrimaryKey(Long userId){
        return hsAuthUserDAO.selectByPrimaryKey(userId);
    }
    
    /**
     * 
     * @Title: addHsAuthUser
     * @Description: 新增用户信息(普通)
     * @param @param hsAuthUser
     * @param @return
     * @return int
     * @throws 
     * @author lidesheng 2017年11月3日 下午5:14:50
     */
    public int addHsAuthUser(HsAuthUser hsAuthUser){
        return hsAuthUserDAO.insertSelective(hsAuthUser);
    }
    
    /**
     * @Title: addUserByBatchTransact
     * @Description: 事物方法：新增用户及用户角色（提供给用户服务ServiceImpl 层调用）
     * @param @param authUserRoleDTO 用户角色集合
     * @param @param hsAuthUser 用户信息
     * @param @return 大于0 表示成功，否则抛出异常信息
     * @return int 
     * @throws 
     * @author lidesheng 2017年10月31日 下午2:04:41
     */
    @Transactional
    public int addAuthUserByTransact(AuthUserDTO hsAuthUser){
        int result= hsAuthUserDAO.insertSelective(hsAuthUser);
        if(result> BaseConstants.NUM.ZERO){
            // 用户角色是否有记录
            if(CollectionUtils.isEmpty(hsAuthUser.getRoles())){
                return BaseConstants.NUM.ONE;
            }
            else{
                return hsAuthUserRoleDAO.insertByBatch(hsAuthUser.getRoles());
            }
        }
        else{
            return BaseConstants.NUM.ZERO;
        }
    }
    
    /**
     * @Title: updateAuthUserByTransact
     * @Description: 事物方法：修改用户及用户角色（提供给用户服务ServiceImpl 层调用）
     * @param @param authUserRoleDTO 用户角色集合
     * @param @param hsAuthUser 用户信息
     * @param @return 大于0 表示成功，否则抛出异常信息
     * @return int 
     * @throws 
     * @author lidesheng 2017年10月31日 下午2:04:41
     */
    @Transactional
    public int updateAuthUserByTransact(AuthUserDTO hsAuthUser){
        int result= hsAuthUserDAO.updateByPrimaryKeySelective(hsAuthUser);
        if(result> BaseConstants.NUM.ZERO){
            // 删除当前用户所属角色
            HsAuthUserRoleCriteria userRolecriteria= new HsAuthUserRoleCriteria();
            userRolecriteria.createCriteria().andUserIdEqualTo(hsAuthUser.getUserId());
            hsAuthUserRoleDAO.deleteByExample(userRolecriteria);
            
            // 用户角色是否有记录
            if(CollectionUtils.isEmpty(hsAuthUser.getRoles())){
                return BaseConstants.NUM.ONE;
            }
            else{
                return hsAuthUserRoleDAO.insertByBatch(hsAuthUser.getRoles());
            }
        }
        else{
            return BaseConstants.NUM.ZERO;
        }
    }
    
    /**
     * 
     * @Title: updateHsAuthUser
     * @Description: 更新用户信息
     * @param @param hsAuthUser
     * @param @return
     * @return int
     * @throws 
     * @author lidesheng 2017年11月3日 下午5:14:14
     */
    public int updateHsAuthUser(HsAuthUser hsAuthUser){
        return hsAuthUserDAO.updateByPrimaryKeySelective(hsAuthUser);
    }
    
    /**
     * 
     * @Title: deleteHsAuthUser
     * @Description: 删除用户(逻辑)
     * @param @param userId 用户Id
     * @param @return
     * @return int
     * @throws 
     * @author lidesheng 2017年11月3日 下午5:13:29
     */
    public int deleteHsAuthUser(HsAuthUser authUserDTO){
        authUserDTO.setRdStatus(BaseConstants.NUM.ZERO);
        authUserDTO.setUserId(authUserDTO.getUserId());
        authUserDTO.setModifiedBy(authUserDTO.getModifiedBy());
        return hsAuthUserDAO.updateByPrimaryKeySelective(authUserDTO);
    }
    
    /**
     * 
     * @Title: selectUserInfoExist
     * @Description: 查询用户信息
     * @param @param authUserDTO
     * @param @return
     * @return int
     * @throws 
     * @author lidesheng 2017年11月3日 下午5:13:55
     */
    public int selectUserInfoExist(AuthUserDTO authUserDTO){
        return hsAuthUserDAO.selectUserInfoExist(authUserDTO);
    }
    
    /**
     * 
     * @Title: updateUserPwd
     * @Description: 修改用户密码
     * @param @param authUserDTO
     * @param @return
     * @return int
     * @throws 
     * @author lidesheng 2017年11月6日 上午8:01:58
     */
    public int updateUserPwd(AuthUserDTO authUserDTO){
        return hsAuthUserDAO.updateUserPwdByPrimaryKey(authUserDTO);
    }
    
    /**
     * 
     * @Title: updateStateByUnlock
     * @Description: 解锁用户
     * @param @param userId
     * @param @return
     * @return int
     * @throws 
     * @author lidesheng 2017年11月6日 上午9:20:24
     */
    public int updateStateByUnlock(HsAuthUser authUserDTO){
        authUserDTO.setStatus(UserState.STATUSN.getCode());
        authUserDTO.setUserId(authUserDTO.getUserId());
        authUserDTO.setModifiedBy(authUserDTO.getModifiedBy());
        return hsAuthUserDAO.updateByPrimaryKeySelective(authUserDTO);
    }
    
    /**
    * @Title: queryCacheList
    * @Description: 查询缓存加载数据
    * @param @param queryParam
    * @param @return
    * @return PageDataInfo<HsAuthUser>
    * @throws 
    * @author zhangxiaohui 2017年11月8日 上午9:57:23
     */
    public PageDataInfo<HsAuthUser> queryCacheList(PageQueryInfo<?> queryParam){
        int pageNum= 1;
        boolean count= true;
        if(queryParam.getPageNum()> 0){
            pageNum= queryParam.getPageNum();
            count= false;
        }
        int pageSize= NUMBER_PER_PAGE;
        if(queryParam.getPageSize()> 0){
            pageSize= queryParam.getPageSize();
        }
        PageHelper.startPage(pageNum,pageSize,count);
        Page<HsAuthUser> page= (Page<HsAuthUser>)queryCache();
        return new PageDataInfo<>(page);
    }
    
    private List<HsAuthUser> queryCache(){
        HsAuthUserCriteria criteria= new HsAuthUserCriteria();
        criteria.createCriteria().andRdStatusEqualTo(TrueFalseEnum.TRUE.getValue());
        return hsAuthUserDAO.selectByExample(criteria);
    }
    
}
