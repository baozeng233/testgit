/*
 * 文 件 名:  AuthResourceService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  AuthResourceService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月1日 上午11:13:43
*/
package com.zeus.baseddata.commerce.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import com.alibaba.dubbo.config.annotation.Service;
import com.framework.common.utils.ObjectUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Maps;
import com.zeus.baseddata.commerce.mybatis.dao.HsAuthResourceDAO;
import com.zeus.baseddata.commerce.service.IAuthResourceService;
import com.zeus.baseddata.entity.user.AuthResourceDTO;
import com.zeus.baseddata.mybatis.model.user.HsAuthResource;
import com.zeus.baseddata.mybatis.model.user.HsAuthResourceCriteria;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/**
 * 
 * @ClassName: AuthResourceService
 * @Description: 数据服务层-资源服务
 * @author lifeng 2017年10月31日 下午4:00:56
 *
 */
@Service(interfaceClass= IAuthResourceService.class)
public class AuthResourceService implements IAuthResourceService{
    
    @Resource
    private HsAuthResourceDAO hsAuthResourceDAO;
    
    /**
     * 
     * @Title: addHsAuthResource
     * @Description: 资源添加
     * @param @param hsAuthResource
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月3日 上午10:59:28
     */
    public int addHsAuthResource(HsAuthResource hsAuthResource){
        return hsAuthResourceDAO.insertSelective(hsAuthResource);
    }
    
    /**
     * 
     * @Title: findById
     * @Description: 通过di查询
     * @param @param resId
     * @param @return
     * @return HsAuthResource
     * @throws @author lifeng 2017年11月3日 上午10:59:47
     */
    public HsAuthResource findById(Long resId){
        HsAuthResourceCriteria example= new HsAuthResourceCriteria();
        example.createCriteria().andResIdEqualTo(resId).andRdStatusNotEqualTo(TrueFalseEnum.FALSE
            .getValue());
        List<HsAuthResource> resources= hsAuthResourceDAO.selectByExample(example);
        if(CollectionUtils.isNotEmpty(resources)){
            return resources.get(0);
        }
        return null;
    }
    
    /**
     * 
     * @Title: findByName
     * @Description: 通过名称查询
     * @param @param resName
     * @param @return
     * @return List<HsAuthResource>
     * @throws @author lifeng 2017年11月3日 上午11:00:01
     */
    public List<HsAuthResource> findByName(String resName){
        HsAuthResourceCriteria example= new HsAuthResourceCriteria();
        example.createCriteria().andResNameEqualTo(resName).andRdStatusNotEqualTo(
            TrueFalseEnum.FALSE.getValue());
        return hsAuthResourceDAO.selectByExample(example);
    }
    
    /**
     * 
     * @Title: updateAuthResource
     * @Description: 资源更新
     * @param @param hsAuthResource
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月3日 上午11:00:41
     */
    public int updateAuthResource(HsAuthResource hsAuthResource){
        return hsAuthResourceDAO.updateByPrimaryKeySelective(hsAuthResource);
        
    }
    
    /**
     * 
     * @Title: deleteHsAuthResource
     * @Description: 资源逻辑删除
     * @param @param resId
     * @param @return
     * @return int
     * @throws @author lifeng 2017年11月3日 上午11:01:13
     */
    public int deleteHsAuthResource(HsAuthResource res){
        int result= hsAuthResourceDAO.updateByPrimaryKeySelective(res);
        //清除 资源角色关联表
        hsAuthResourceDAO.deleteRelationWithRoleByPrimaryKey(res.getResId());
        return result;
    }
    
    /**
     * 
     * @Title: findByParentResId
     * @Description: 通过父级查询
     * @param @param resId
     * @param @return
     * @return List<HsAuthResource>
     * @throws @author lifeng 2017年11月3日 上午11:01:35
     */
    public List<HsAuthResource> findByParentResId(Long resId){
        HsAuthResourceCriteria example= new HsAuthResourceCriteria();
        example.createCriteria().andParentResIdEqualTo(resId).andRdStatusNotEqualTo(
            TrueFalseEnum.FALSE.getValue());
        return hsAuthResourceDAO.selectByExample(example);
    }
    
    /**
     * @Title: queryAll
     * @Description: 查询所有
     * @param @return
     * @return List<HsAuthResource>
     * @throws @author lifeng 2017年11月3日 下午2:48:53
     */
    public List<HsAuthResource> queryAll(){
        return hsAuthResourceDAO.selectList();
    }
    
    /** (非 Javadoc) 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @throws 
    * @author lifeng 2017年11月29日 下午5:28:07
     */
    @Override
    public PageDataInfo<AuthResourceDTO> pageQuery(PageQueryInfo<AuthResourceDTO> queryParam){
        PageHelper.startPage(queryParam.getPageNum(),queryParam.getPageSize());
        Map<String,Object> param= Maps.newHashMap();
        param.put("resName",queryParam.getParam().getResName());
        param.put("resType",queryParam.getParam().getResType());
        param.put("reqMethod",queryParam.getParam().getReqMethod());
        List<AuthResourceDTO> list= hsAuthResourceDAO.queryByParams(param);
        PageInfo<AuthResourceDTO> pageInfo= new PageInfo<>(list);
        PageDataInfo<AuthResourceDTO> page= new PageDataInfo<>();
        page.setRows(list);
        page.setTotal(pageInfo.getTotal());
        page.setPages(pageInfo.getPages());
        return page;
    }
    
    /** (非 Javadoc) 
    * @Title: getOrder
    * @Description: 获取最大顺序
    * @throws 
    * @author lifeng 2017年12月1日 下午4:42:35
     */
    @Override
    public Long getOrder(){
        return hsAuthResourceDAO.queryMaxOrder();
    }
    
    /** (非 Javadoc) 
    * @Title: queryList
    * @Description: PCN分页条件查询
    * @throws 
    * @author lifeng 2017年12月4日 下午1:44:07
     */
    @Override
    public PageDataInfo<HsAuthResource> queryList(PageQueryInfo<HsAuthResource> queryInfo){
        PageHelper.startPage(queryInfo.getPageNum(),queryInfo.getPageSize());
        HsAuthResourceCriteria example= new HsAuthResourceCriteria();
        HsAuthResource res= queryInfo.getParam();
        if(ObjectUtils.isNotNull(res)){
            if(StringUtils.isNotBlank(res.getResCode())){
                example.or().andResCodeLike("%"+ res.getResCode()+ "%").andRdStatusNotEqualTo(
                    TrueFalseEnum.FALSE.getValue());
            }
            if(StringUtils.isNotBlank(res.getResName())){
                example.or().andResNameLike("%"+ res.getResName()+ "%").andRdStatusNotEqualTo(
                    TrueFalseEnum.FALSE.getValue());
            }
        }
        List<HsAuthResource> list= hsAuthResourceDAO.selectByExample(example);
        PageInfo<HsAuthResource> pageInfo= new PageInfo<>(list);
        PageDataInfo<HsAuthResource> page= new PageDataInfo<>();
        page.setRows(list);
        page.setPages(pageInfo.getPages());
        page.setTotal(pageInfo.getTotal());
        return page;
    }
    
    /** (非 Javadoc) 
    * @Title: getResByUser
    * @Description: 获取当前用户的资源权限
    * @throws 
    * @author lifeng 2017年12月5日 上午10:59:28
     */
    @Override
    public List<AuthResourceDTO> getResByUser(Long userId){
        return hsAuthResourceDAO.queryResbyUser(userId);
    }
    
}
