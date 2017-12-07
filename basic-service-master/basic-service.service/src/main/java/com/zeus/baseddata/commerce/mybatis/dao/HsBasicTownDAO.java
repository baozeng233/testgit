package com.zeus.baseddata.commerce.mybatis.dao;

import com.zeus.baseddata.common.mybatis.dao.HsBasicTownMapper;
import com.zeus.baseddata.entity.based.TownDTO;

public interface HsBasicTownDAO extends HsBasicTownMapper{
    
    /** 
    * @Title: updateRdStatusByTownId
    * @Description: 逻辑删除乡镇
    * @param @param id
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 下午5:24:17
     */
    int updateRdStatusByTownId(Long id);
    
    /** 
    * @Title: queryMaxOrder
    * @Description: 获得乡镇最大顺序
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年11月21日 上午11:11:24
     */
    Long queryMaxOrder();
    
    /** 
    * @Title: queryInfo
    * @Description: 通过id查询区县明细
    * @param @param townId
    * @param @return
    * @return TownDTO
    * @throws 
    * @author lifeng 2017年11月23日 下午4:10:10
     */
    TownDTO queryInfo(Long townId);
    
}
