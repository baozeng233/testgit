package com.zeus.baseddata.commerce.mybatis.dao;

import com.zeus.baseddata.common.mybatis.dao.HsBasicCityMapper;
import com.zeus.baseddata.entity.based.CityDTO;

public interface HsBasicCityDAO extends HsBasicCityMapper{
    
    /** 
    * @Title: updateRdStatusByCityId
    * @Description: 逻辑删除城市
    * @param @param id
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 下午1:08:17
     */
    int updateRdStatusByCityId(Long id);
    
    /** 
    * @Title: queryMaxOrder
    * @Description: 获得乡镇最大顺序
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年11月21日 上午11:11:17
     */
    Long queryMaxOrder();
    
    /** 
    * @Title: queryInfo
    * @Description: 通过id查询区县明细
    * @param @param cityId
    * @param @return
    * @return CityDTO
    * @throws 
    * @author lifeng 2017年11月23日 下午4:09:17
     */
    CityDTO queryInfo(Long cityId);
    
}
