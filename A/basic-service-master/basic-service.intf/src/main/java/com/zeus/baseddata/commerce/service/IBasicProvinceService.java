/*
 * 文 件 名:  IBasicProvinceService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  IBasicProvinceService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月28日 下午2:29:43
*/
package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.based.ProvinceDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicProvince;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: IBasicProvinceService
* @Description: 省份管理接口
* @author lifeng 2017年11月28日 下午2:29:43
* 
*/
public interface IBasicProvinceService{
    
    /** 
     * @Title: queryMaxCProvinceOder
     * @Description: 获得省份最大顺序
     * @param @return
     * @return Long
     * @throws 
     * @author lifeng 2017年11月21日 上午10:59:17
      */
    Long queryMaxCProvinceOder();
    
    /** 
     * @Title: getProvinceBycountryId
     * @Description: 返回国家关联的省份列表
     * @param @param id
     * @param @return
     * @return List<HsBasicProvince>
     * @throws 
     * @author lifeng 2017年11月13日 下午5:35:02
      */
    List<HsBasicProvince> queryProvince(Long countryId);
    
    /** 
     * @Title: addProvince
     * @Description: 省份新增
     * @param @param province
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月13日 下午9:18:33
      */
    int addProvince(HsBasicProvince province);
    
    /** 
     * @Title: getProvinceByName
     * @Description: 通过名称，所属国家获取省份信息
     * @param @param provinceName
     * @param @return
     * @return List<HsBasicProvince>
     * @throws 
     * @author lifeng 2017年11月14日 上午9:12:30
      */
    List<HsBasicProvince> getProvinceByName(HsBasicProvince province);
    
    /** 
     * @Title: getProvinceByCode
     * @Description: 通过代码获取省份信息
     * @param @param provinceCode
     * @param @return
     * @return List<HsBasicProvince>
     * @throws 
     * @author lifeng 2017年11月14日 上午9:12:36
      */
    List<HsBasicProvince> getProvinceByCode(String provinceCode);
    
    /** 
     * @Title: editProvince
     * @Description: 编辑省份
     * @param @param province
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月14日 上午9:42:20
      */
    int editProvince(HsBasicProvince province);
    
    /** 
     * @Title: deleteProvince
     * @Description: 逻辑删除省份
     * @param @param provinceId
     * @return void
     * @throws 
     * @author lifeng 2017年11月14日 上午10:03:31
      */
    int deleteProvince(HsBasicProvince province);
    
    /** 
     * @Title: queryProvinceInfo
     * @Description: 通过id查询省份明细
     * @param @param provinceId
     * @param @return
     * @return ResultBean<ProvinceDTO>
     * @throws 
     * @author lifeng 2017年11月23日 下午3:58:00
      */
    ProvinceDTO queryProvinceInfo(Long provinceId);
    
    /** 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @param @param queryParam
    * @param @return
    * @return PageDataInfo<HsBasicProvince>
    * @throws 
    * @author lifeng 2017年11月30日 下午7:30:32
     */
    PageDataInfo<HsBasicProvince> pageQuery(PageQueryInfo<HsBasicProvince> queryParam);
    
}
