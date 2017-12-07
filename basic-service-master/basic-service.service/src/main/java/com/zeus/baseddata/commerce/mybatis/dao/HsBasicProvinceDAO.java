package com.zeus.baseddata.commerce.mybatis.dao;

import com.zeus.baseddata.common.mybatis.dao.HsBasicProvinceMapper;
import com.zeus.baseddata.entity.based.ProvinceDTO;

public interface HsBasicProvinceDAO extends HsBasicProvinceMapper{
    
    /** 
    * @Title: updateRdStatusByProvinceId
    * @Description: 逻辑删除省份信息
    * @param @param provinceId
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 上午10:12:04
     */
    int updateRdStatusByProvinceId(Long id);
    
    /** 
    * @Title: queryMaxOrder
    * @Description: 获得乡镇最大顺序
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年11月21日 上午11:11:14
     */
    Long queryMaxOrder();
    
    /** 
    * @Title: queryInfo
    * @Description: 通过id查询区县明细
    * @param @param provinceId
    * @param @return
    * @return ProvinceDTO
    * @throws 
    * @author lifeng 2017年11月23日 下午4:08:59
     */
    ProvinceDTO queryInfo(Long provinceId);
    
}
