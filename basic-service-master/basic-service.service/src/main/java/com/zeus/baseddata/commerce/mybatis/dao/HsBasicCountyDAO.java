package com.zeus.baseddata.commerce.mybatis.dao;

import org.apache.ibatis.annotations.Param;

import com.zeus.baseddata.common.mybatis.dao.HsBasicCountyMapper;
import com.zeus.baseddata.entity.based.CountyDTO;
import com.zeus.baseddata.entity.based.RegionResultDTO;

public interface HsBasicCountyDAO extends HsBasicCountyMapper{
    
    /** 
    * @Title: updateRdStatusByCountyId
    * @Description: 逻辑删除区县
    * @param @param id
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 下午2:24:39
     */
    int updateRdStatusByCountyId(Long id);
    
    /** 
    * @Title: queryMaxOrder
    * @Description: 获得乡镇最大顺序
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年11月21日 上午11:11:21
     */
    Long queryMaxOrder();
    
    /** 
     * @Title: selectRegionInfo
     * @Description: 区县查询关联的国省市
     * @param @param countyId
     * @param @return
     * @return RegionResultDTO
     * @throws 
     * @author lifeng 2017年11月21日 下午3:52:45
      */
    RegionResultDTO selectRegionInfo(@Param("countyId") Long countyId);
    
    /** 
    * @Title: queryInfo
    * @Description: 通过id查询区县明细
    * @param @param countyId
    * @param @return
    * @return CountyDTO
    * @throws 
    * @author lifeng 2017年11月23日 下午4:09:41
     */
    CountyDTO queryInfo(Long countyId);
    
}
