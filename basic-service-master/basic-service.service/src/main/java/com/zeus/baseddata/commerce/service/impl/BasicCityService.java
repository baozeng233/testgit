/*
 * 文 件 名:  BasicCityService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  BasicCityService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月21日 下午5:15:30
*/
package com.zeus.baseddata.commerce.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.framework.common.utils.ObjectUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicCityDAO;
import com.zeus.baseddata.commerce.service.IBasicCityService;
import com.zeus.baseddata.entity.based.CityDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicCity;
import com.zeus.baseddata.mybatis.model.based.HsBasicCityCriteria;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: BasicCityService
* @Description: 城市管理服务
* @author lifeng 2017年11月21日 下午5:15:30
* 
*/
@Service(interfaceClass= IBasicCityService.class)
public class BasicCityService implements IBasicCityService{
    
    @Resource
    private HsBasicCityDAO hsBasicCityDAO;
    
    /** 
     * @Title: queryCity
     * @Description: 查询省份关联的城市信息
     * @param @param provinceId
     * @param @return
     * @return List<HsBasicCity>
     * @throws 
     * @author lifeng 2017年11月14日 上午10:31:56
      */
    public List<HsBasicCity> queryCity(Long provinceId){
        HsBasicCityCriteria example= new HsBasicCityCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andProvinceIdEqualTo(provinceId);
        return hsBasicCityDAO.selectByExample(example);
    }
    
    /** 
    * @Title: addCity
    * @Description: 城市新增
    * @param @param city
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 上午11:00:24
     */
    public int addCity(HsBasicCity city){
        return hsBasicCityDAO.insertSelective(city);
    }
    
    /** 
    * @Title: getCityByName
    * @Description: 通过名称获取城市信息
    * @param @param cityName
    * @param @return
    * @return List<HsBasicCity>
    * @throws 
    * @author lifeng 2017年11月14日 上午11:00:27
     */
    public List<HsBasicCity> getCityByName(HsBasicCity city){
        HsBasicCityCriteria example= new HsBasicCityCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andCityNameEqualTo(city.getCityName())
            .andProvinceIdEqualTo(city.getProvinceId());
        return hsBasicCityDAO.selectByExample(example);
    }
    
    /** 
    * @Title: getCityByCode
    * @Description: 通过代码获取城市信息
    * @param @param cityCode
    * @param @return
    * @return List<HsBasicCity>
    * @throws 
    * @author lifeng 2017年11月14日 上午11:00:31
     */
    public List<HsBasicCity> getCityByCode(String cityCode){
        HsBasicCityCriteria example= new HsBasicCityCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andCityCodeEqualTo(cityCode);
        return hsBasicCityDAO.selectByExample(example);
    }
    
    /** 
    * @Title: editCity
    * @Description: 编辑城市
    * @param @param city
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 上午11:25:43
     */
    public int editCity(HsBasicCity city){
        return hsBasicCityDAO.updateByPrimaryKeySelective(city);
    }
    
    /** 
    * @Title: deleteCity
    * @Description: 逻辑删除城市
    * @param @param id
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 下午1:07:41
     */
    public int deleteCity(HsBasicCity city){
        return hsBasicCityDAO.updateByPrimaryKeySelective(city);
    }
    
    /** 
     * @Title: queryMaxCityOder
     * @Description: 获得城市最大顺序
     * @param @return
     * @return Long
     * @throws 
     * @author lifeng 2017年11月21日 上午11:05:52
      */
    public Long queryMaxCityOder(){
        return hsBasicCityDAO.queryMaxOrder();
    }
    
    /** 
    * @Title: queryInfo
    * @Description: 通过id查询城市明细
    * @param @param cityId
    * @param @return
    * @return CityDTO
    * @throws 
    * @author lifeng 2017年11月23日 下午4:07:17
     */
    public CityDTO queryCityInfo(Long cityId){
        return hsBasicCityDAO.queryInfo(cityId);
    }
    
    /** (非 Javadoc) 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @throws 
    * @author lifeng 2017年11月30日 下午5:43:51
     */
    public PageDataInfo<HsBasicCity> pageQuery(PageQueryInfo<HsBasicCity> queryParam){
        PageHelper.startPage(queryParam.getPageNum(),queryParam.getPageSize());
        HsBasicCity city= queryParam.getParam();
        HsBasicCityCriteria example= new HsBasicCityCriteria();
        if(ObjectUtils.isNotNull(city)){
            if(ObjectUtils.isNotNull(city.getCityName()))
                example.or().andCityNameLike("%"+ city.getCityName()+ "%").andRdStatusNotEqualTo(
                    TrueFalseEnum.FALSE.getValue());
            if(ObjectUtils.isNotNull(city.getCityCode()))
                example.or().andCityCodeLike("%"+ city.getCityCode()+ "%").andRdStatusNotEqualTo(
                    TrueFalseEnum.FALSE.getValue());
            if(ObjectUtils.isNotNull(city.getCityPinyin()))
                example.or()
                    .andCityPinyinLike("%"+ city.getCityPinyin().toUpperCase()+ "%")
                    .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
        }
        List<HsBasicCity> list= hsBasicCityDAO.selectByExample(example);
        PageInfo<HsBasicCity> pageInfo= new PageInfo<>(list);
        PageDataInfo<HsBasicCity> page= new PageDataInfo<>();
        page.setRows(list);
        page.setPages(pageInfo.getPages());
        page.setTotal(pageInfo.getTotal());
        return page;
    }
    
}
