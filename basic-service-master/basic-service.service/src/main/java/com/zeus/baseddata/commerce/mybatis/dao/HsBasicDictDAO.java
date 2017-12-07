package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.zeus.baseddata.common.mybatis.dao.HsBasicDictMapper;
import com.zeus.baseddata.entity.based.HsBasicDictDTO;

/**
 * 
 * @ClassName: HsBasicDictService
 * @Description: 数据字典自定义类接口
 * @author jiangjiao 2017/11/16 10:18:16
 *
 */
public interface HsBasicDictDAO extends HsBasicDictMapper{
    
    /**
     * @Title: queryGrid
     * @Description 分页查询
     * @param queryParam
     * @param @return 列表数据
     * @return List<HsBasicDictDTO>
     * @throws @author jiangjiao 2017/11/16 10:18:16
     */
    List<HsBasicDictDTO> queryGrid(Map<String,Object> queryParam);
    
}
