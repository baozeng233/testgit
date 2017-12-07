package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;

import com.zeus.baseddata.common.mybatis.dao.HsBasicPartMapper;
import com.zeus.baseddata.entity.based.BasicPartDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicPart;

public interface HsBasicPartDAO extends HsBasicPartMapper{
    
    /** 
    * @Title: updateRdStatusByPrimaryKey
    * @Description: 逻辑删除
    * @param @param id
    * @return void
    * @throws 
    * @author lifeng 2017年11月15日 下午5:02:23
     */
    int updateRdStatusByPrimaryKey(Long id);
    
    /** 
    * @Title: selectByQueryInfo
    * @Description: 条件查询
    * @param @param part
    * @param @return
    * @return List<BasicPartDTO>
    * @throws 
    * @author lifeng 2017年11月16日 下午5:33:53
     */
    List<BasicPartDTO> selectByQueryInfo(HsBasicPart part);
    
    /** 
    * @Title: getMaxOrder
    * @Description: 获取最大顺序
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年11月21日 下午1:40:47
     */
    Long getMaxOrder();
    
}
