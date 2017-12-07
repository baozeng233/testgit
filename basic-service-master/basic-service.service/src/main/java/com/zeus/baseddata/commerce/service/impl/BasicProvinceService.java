/*
 * 文 件 名:  BasicProvinceService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  BasicProvinceService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月21日 下午5:16:21
*/
package com.zeus.baseddata.commerce.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.framework.common.utils.ObjectUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicProvinceDAO;
import com.zeus.baseddata.commerce.service.IBasicProvinceService;
import com.zeus.baseddata.entity.based.ProvinceDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicProvince;
import com.zeus.baseddata.mybatis.model.based.HsBasicProvinceCriteria;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: BasicProvinceService
* @Description: 省份管理服务
* @author lifeng 2017年11月21日 下午5:16:21
* 
*/
@Service(interfaceClass= IBasicProvinceService.class)
public class BasicProvinceService implements IBasicProvinceService{
    
    @Resource
    private HsBasicProvinceDAO hsBasicProvinceDAO;
    
    /** 
     * @Title: queryProvince
     * @Description: 返回国家关联的省份列表
     * @param @param countryId
     * @param @return
     * @return List<HsBasicProvince>
     * @throws 
     * @author lifeng 2017年11月13日 下午9:05:17
      */
    public List<HsBasicProvince> queryProvince(Long countryId){
        HsBasicProvinceCriteria example= new HsBasicProvinceCriteria();
        example.createCriteria().andCountryIdEqualTo(countryId).andRdStatusNotEqualTo(
            TrueFalseEnum.FALSE.getValue());
        return hsBasicProvinceDAO.selectByExample(example);
    }
    
    /** 
    * @Title: addProvince
    * @Description: 新增省份
    * @param @param province
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月13日 下午9:22:58
     */
    public int addProvince(HsBasicProvince province){
        return hsBasicProvinceDAO.insertSelective(province);
    }
    
    /** 
    * @Title: getProvinceByName
    * @Description: 通过名称,所属国家获取省份信息
    * @param @param provinceName
    * @param @return
    * @return List<HsBasicProvince>
    * @throws 
    * @author lifeng 2017年11月14日 上午9:30:10
     */
    public List<HsBasicProvince> getProvinceByName(HsBasicProvince province){
        HsBasicProvinceCriteria example= new HsBasicProvinceCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andProvinceNameEqualTo(province.getProvinceName())
            .andCountryIdEqualTo(province.getCountryId());
        return hsBasicProvinceDAO.selectByExample(example);
    }
    
    /** 
    * @Title: getProvinceByCode
    * @Description: 通过代码获取省份信息
    * @param @param provinceCode
    * @param @return
    * @return List<HsBasicProvince>
    * @throws 
    * @author lifeng 2017年11月14日 上午9:30:14
     */
    public List<HsBasicProvince> getProvinceByCode(String provinceCode){
        HsBasicProvinceCriteria example= new HsBasicProvinceCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andProvinceCodeEqualTo(provinceCode);
        return hsBasicProvinceDAO.selectByExample(example);
    }
    
    /** 
    * @Title: editProvince
    * @Description: 编辑省份信息
    * @param @param province
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 上午10:09:53
     */
    public int editProvince(HsBasicProvince province){
        return hsBasicProvinceDAO.updateByPrimaryKeySelective(province);
    }
    
    /** 
    * @Title: deleteProvince
    * @Description: 逻辑删除省份信息
    * @param @param provinceId
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 上午10:09:58
     */
    public int deleteProvince(HsBasicProvince province){
        return hsBasicProvinceDAO.updateByPrimaryKeySelective(province);
    }
    
    /** 
     * @Title: queryMaxCProvinceOder
     * @Description: 获得省份最大顺序
     * @param @return
     * @return Long
     * @throws 
     * @author lifeng 2017年11月21日 上午11:05:47
      */
    public Long queryMaxCProvinceOder(){
        return hsBasicProvinceDAO.queryMaxOrder();
    }
    
    /** 
    * @Title: queryProvinceInfo
    * @Description: 通过id查询省份明细
    * @param @param provinceId
    * @param @return
    * @return ProvinceDTO
    * @throws 
    * @author lifeng 2017年11月23日 下午4:07:12
     */
    public ProvinceDTO queryProvinceInfo(Long provinceId){
        return hsBasicProvinceDAO.queryInfo(provinceId);
    }
    
    /** (非 Javadoc) 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @throws 
    * @author lifeng 2017年11月30日 下午7:31:29
     */
    @Override
    public PageDataInfo<HsBasicProvince> pageQuery(PageQueryInfo<HsBasicProvince> queryParam){
        PageHelper.startPage(queryParam.getPageNum(),queryParam.getPageSize());
        HsBasicProvince province= queryParam.getParam();
        HsBasicProvinceCriteria example= new HsBasicProvinceCriteria();
        if(ObjectUtils.isNotNull(province)){
            if(ObjectUtils.isNotNull(province.getProvinceName()))
                example.or()
                    .andProvinceNameLike("%"+ province.getProvinceName()+ "%")
                    .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
            if(ObjectUtils.isNotNull(province.getProvinceCode()))
                example.or()
                    .andProvinceCodeLike("%"+ province.getProvinceCode()+ "%")
                    .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
            if(ObjectUtils.isNotNull(province.getProvincePinyin()))
                example.or()
                    .andProvincePinyinLike("%"+ province.getProvincePinyin().toUpperCase()+ "%")
                    .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
        }
        List<HsBasicProvince> list= hsBasicProvinceDAO.selectByExample(example);
        PageInfo<HsBasicProvince> pageInfo= new PageInfo<>(list);
        PageDataInfo<HsBasicProvince> page= new PageDataInfo<>();
        page.setRows(list);
        page.setPages(pageInfo.getPages());
        page.setTotal(pageInfo.getTotal());
        return page;
    }
    
}
