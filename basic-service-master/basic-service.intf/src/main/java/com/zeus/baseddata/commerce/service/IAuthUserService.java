package com.zeus.baseddata.commerce.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.zeus.baseddata.entity.person.AuthUserDTO;
import com.zeus.baseddata.mybatis.model.user.HsAuthUser;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

public interface IAuthUserService{
    
    
    /**
     * (非 Javadoc) 
     * @Title: queryList
     * @Description: 查询用户列表（分页）
     * @throws 
     * @author lidesheng 2017年11月3日 下午5:15:16   
     */
    <T> PageDataInfo<T> queryPageList(Class<T> clazz,PageQueryInfo queryParam);
    
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
    PageDataInfo<AuthUserDTO> queryListByParams(PageQueryInfo<AuthUserDTO> page);
    
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
    PageDataInfo<HsAuthUser> queryComBoxList(PageQueryInfo<AuthUserDTO> queryParam);
    
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
    List<HsAuthUser> selectUserListApi(List<Long> userIds);
    
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
    AuthUserDTO selectDetailsById(Long userId);
    
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
    HsAuthUser selectHsAuthUserByPrimaryKey(Long userId);
    
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
    int addHsAuthUser(HsAuthUser hsAuthUser);
    
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
    int addAuthUserByTransact(AuthUserDTO hsAuthUser);
    
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
    int updateAuthUserByTransact(AuthUserDTO hsAuthUser);
    
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
    int updateHsAuthUser(HsAuthUser hsAuthUser);
    
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
    int deleteHsAuthUser(HsAuthUser user);
    
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
    int selectUserInfoExist(AuthUserDTO authUserDTO);
    
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
    int updateUserPwd(AuthUserDTO authUserDTO);
    
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
    int updateStateByUnlock(HsAuthUser user);
    
    /**
    * @Title: queryCacheList
    * @Description: 查询缓存加载数据
    * @param @param queryParam
    * @param @return
    * @return PageDataInfo<HsAuthUser>
    * @throws 
    * @author zhangxiaohui 2017年11月8日 上午9:57:23
     */
    PageDataInfo<HsAuthUser> queryCacheList(PageQueryInfo<?> queryParam);
    
}
