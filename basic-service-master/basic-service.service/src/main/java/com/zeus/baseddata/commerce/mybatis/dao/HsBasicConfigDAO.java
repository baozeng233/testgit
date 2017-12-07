package com.zeus.baseddata.commerce.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.zeus.baseddata.common.mybatis.dao.HsBasicConfigMapper;
import com.zeus.baseddata.entity.based.HsBasicConfigDTO;

/**
 * 系统参数操作自定义
 * 
 * @author jiangjiao 2017年11月15日
 * @see
 * @since 1.0
 */
public interface HsBasicConfigDAO extends HsBasicConfigMapper{
    
    /**
     * @Title: queryGrid
     * @Description 分页查询
     * @param queryParam
     * @param @return 列表数据
     * @return List<HsBasicConfigDTO>
     * @throws @author jiangjiao 2017/11/16 10:18:16
     */
    List<HsBasicConfigDTO> queryGrid(Map<String,Object> queryParam);
}
