package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.zeus.baseddata.common.mybatis.dao.HsAuthUserMapper;
import com.zeus.baseddata.mybatis.model.user.HsAuthUser;
import com.zeus.baseddata.mybatis.model.user.HsAuthUserCriteria;
import com.zeus.baseddata.entity.person.AuthUserDTO;

/**
 * 
 * 用户操作自定义
 * 
 * @author zhangxiaohui 2017年10月24日
 * @see
 * @since 1.0
 */
public interface HsAuthUserDAO extends HsAuthUserMapper{
    
    /**
     * 
     * @Title: selectListByExample
     * @Description: 单表查询Example
     * @param @param example
     * @param @return
     * @return List<AuthUserDTO>
     * @throws 
     * @author lidesheng 2017年11月8日 下午3:43:25
     */
    List<AuthUserDTO> selectListByExample(HsAuthUserCriteria example);
    
    /**
     * 
     * @Title: selectUserlist
     * @Description: 用户分页查询
     * @param @param mapParams
     * @param @return
     * @return List<AuthUserDTO>
     * @throws 
     * @author lidesheng 2017年11月8日 下午3:43:54
     */
    List<AuthUserDTO> selectUserlist(Map<String,Object> mapParams);
    
    /**
     * 
     * @Title: selectUserDetails
     * @Description: 查询用户明细通过ID
     * @param @param userId
     * @param @return
     * @return AuthUserDTO
     * @throws 
     * @author lidesheng 2017年11月8日 下午3:44:11
     */
    AuthUserDTO selectDetailsById(Long userId);
    
    /**
     * 
     * @Title: updateStateByPrimaryKey
     * @Description: 更新用户状态
     * @param @param userId
     * @param @return
     * @return int
     * @throws 
     * @author lidesheng 2017年11月8日 下午3:48:45
     */
    int updateStateByPrimaryKey(Long userId);
    
    /**
     * 
     * @Title: updateUserPwdByPrimaryKey
     * @Description: 更新用户及用户角色信息
     * @param @param authUserDTO
     * @param @return
     * @return int
     * @throws 
     * @author lidesheng 2017年11月8日 下午3:49:38
     */
    int updateUserPwdByPrimaryKey(AuthUserDTO authUserDTO);
    
    /**
     * 
     * @Title: selectUserInfoExist
     * @Description: 查询用户信息是否存在
     * @param @param authUserDTO
     * @param @return
     * @return int
     * @throws 
     * @author lidesheng 2017年11月8日 下午3:49:59
     */
    int selectUserInfoExist(AuthUserDTO authUserDTO);
    
    /** 
     * @Title: queryList
     * @Description: 通过id集合查询用户集合
     * @param @param idList
     * @param @return
     * @return List<HsAuthUser>
     * @throws 
     * @author lifeng 2017年11月22日 上午10:39:45
      */
    List<HsAuthUser> queryList(List<Long> idList);
}
