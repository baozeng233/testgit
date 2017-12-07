package com.zeus.baseddata.commerce.mybatis.dao;

import com.zeus.baseddata.common.mybatis.dao.HsBasicCountryMapper;

public interface HsBasicCountryDAO extends HsBasicCountryMapper{
    
    /** 
    * @Title: updateRdStatusByCountryId
    * @Description: 逻辑删除国家
    * @param @param id
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月13日 下午7:27:46
     */
    int updateRdStatusByCountryId(Long id);
    
    /** 
    * @Title: queryMaxOrder
    * @Description: 获得乡镇最大顺序
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年11月21日 上午11:11:08
     */
    Long queryMaxOrder();
    
}
