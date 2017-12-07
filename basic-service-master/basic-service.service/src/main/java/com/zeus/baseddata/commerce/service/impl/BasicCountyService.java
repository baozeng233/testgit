/*
 * 文 件 名:  BasicCountyService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  BasicCountyService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月21日 下午5:13:45
*/
package com.zeus.baseddata.commerce.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.framework.common.utils.ObjectUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicCountyDAO;
import com.zeus.baseddata.commerce.service.IBasicCountyService;
import com.zeus.baseddata.entity.based.CountyDTO;
import com.zeus.baseddata.entity.based.RegionResultDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicCounty;
import com.zeus.baseddata.mybatis.model.based.HsBasicCountyCriteria;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: BasicCountyService
* @Description: 区县管理服务
* @author lifeng 2017年11月21日 下午5:13:45
* 
*/
@Service(interfaceClass= IBasicCountyService.class)
public class BasicCountyService implements IBasicCountyService{
    
    @Resource
    private HsBasicCountyDAO hsBasicCountyDAO;
    
    /** 
     * @Title: queryCounty
     * @Description: 获取城市关联的区县列表
     * @param @param cityId
     * @param @return
     * @return List<HsBasicCounty>
     * @throws 
     * @author lifeng 2017年11月14日 下午1:21:34
      */
    public List<HsBasicCounty> queryCounty(Long cityId){
        HsBasicCountyCriteria example= new HsBasicCountyCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andCityIdEqualTo(cityId);
        return hsBasicCountyDAO.selectByExample(example);
    }
    
    /** 
    * @Title: addCounty
    * @Description: 区县新增
    * @param @param county
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 下午1:44:46
     */
    public int addCounty(HsBasicCounty county){
        return hsBasicCountyDAO.insertSelective(county);
    }
    
    /** 
    * @Title: getCountyByName
    * @Description: 通过名称获取区县信息
    * @param @param countyName
    * @param @return
    * @return List<HsBasicCounty>
    * @throws 
    * @author lifeng 2017年11月14日 下午1:56:05
     */
    public List<HsBasicCounty> getCountyByName(HsBasicCounty county){
        HsBasicCountyCriteria example= new HsBasicCountyCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andCountyNameEqualTo(county.getCountyName())
            .andCityIdEqualTo(county.getCityId());
        return hsBasicCountyDAO.selectByExample(example);
    }
    
    /** 
    * @Title: getCountyByCode
    * @Description: 通过code获取区县信息
    * @param @param countyCode
    * @param @return
    * @return List<HsBasicCounty>
    * @throws 
    * @author lifeng 2017年11月14日 下午1:56:09
     */
    public List<HsBasicCounty> getCountyByCode(String countyCode){
        HsBasicCountyCriteria example= new HsBasicCountyCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andCountyCodeEqualTo(countyCode);
        return hsBasicCountyDAO.selectByExample(example);
    }
    
    /** 
    * @Title: editCounty
    * @Description: 区县编辑
    * @param @param county
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 下午2:05:10
     */
    public int editCounty(HsBasicCounty county){
        return hsBasicCountyDAO.updateByPrimaryKeySelective(county);
    }
    
    /** 
    * @Title: deleteCounty
    * @Description: 逻辑删除区县
    * @param @param id
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 下午2:23:51
     */
    public int deleteCounty(HsBasicCounty county){
        return hsBasicCountyDAO.updateByPrimaryKeySelective(county);
    }
    
    /** 
     * @Title: queryMaxCountyOder
     * @Description: 获得区县最大顺序
     * @param @return
     * @return Long
     * @throws 
     * @author lifeng 2017年11月21日 上午11:05:58
      */
    public Long queryMaxCountyOder(){
        return hsBasicCountyDAO.queryMaxOrder();
    }
    
    /** 
     * @Title: queryRegionInfo
     * @Description: 区县查询关联的国省市
     * @param @param countyId
     * @param @return
     * @return RegionResultDTO
     * @throws 
     * @author lifeng 2017年11月21日 下午3:51:40
      */
    public RegionResultDTO queryRegionInfo(Long countyId){
        return hsBasicCountyDAO.selectRegionInfo(countyId);
    }
    
    /** 
    * @Title: queryCountyInfo
    * @Description: 通过id查询区县明细
    * @param @param countyId
    * @param @return
    * @return CountyDTO
    * @throws 
    * @author lifeng 2017年11月23日 下午4:07:23
     */
    public CountyDTO queryCountyInfo(Long countyId){
        return hsBasicCountyDAO.queryInfo(countyId);
    }
    
    /** (非 Javadoc) 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @throws 
    * @author lifeng 2017年11月30日 下午7:25:11
     */
    @Override
    public PageDataInfo<HsBasicCounty> pageQuery(PageQueryInfo<HsBasicCounty> queryParam){
        PageHelper.startPage(queryParam.getPageNum(),queryParam.getPageSize());
        HsBasicCounty county= queryParam.getParam();
        HsBasicCountyCriteria example= new HsBasicCountyCriteria();
        if(ObjectUtils.isNotNull(county)){
            if(ObjectUtils.isNotNull(county.getCountyName()))
                example.or()
                    .andCountyNameLike("%"+ county.getCountyName()+ "%")
                    .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
            if(ObjectUtils.isNotNull(county.getCountyCode()))
                example.or()
                    .andCountyCodeLike("%"+ county.getCountyCode()+ "%")
                    .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
            if(ObjectUtils.isNotNull(county.getCountyPinyin()))
                example.or()
                    .andCountyPinyinLike("%"+ county.getCountyPinyin().toUpperCase()+ "%")
                    .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
        }
        List<HsBasicCounty> list= hsBasicCountyDAO.selectByExample(example);
        PageInfo<HsBasicCounty> pageInfo= new PageInfo<>(list);
        PageDataInfo<HsBasicCounty> page= new PageDataInfo<>();
        page.setRows(list);
        page.setPages(pageInfo.getPages());
        page.setTotal(pageInfo.getTotal());
        return page;
    }
    
}
