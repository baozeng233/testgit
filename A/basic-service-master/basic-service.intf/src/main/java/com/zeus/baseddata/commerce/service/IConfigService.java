package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.based.HsBasicConfigDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicConfig;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

public interface IConfigService{
    
    /**
     * @Title: queryGrid
     * @param queryParam
     * @param @return 列表数据
     * @return PageDataInfo<HsBasicConfigDTO>
     * @throws @author jiangjiao 2017/11/16 10:00:12
     */
    PageDataInfo<HsBasicConfigDTO> queryGrid(PageQueryInfo<HsBasicConfigDTO> queryParam);
    
    /**
     * @Title: queryAll
     * @Description: 查询所有数据
     * @param @return
     * @return ResultBean<List<HsBasicConfig>>
     * @throws @author jiangjiao 2017年11月14日 上午10:34:18
     */
    public List<HsBasicConfig> queryAll();
    
    /**
     * @Title: insertHsBasicConfig
     * @Description: 添加系统参数
     * @param @param hsBasicConfig
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月13日 下午4:34:01
     */
    public int insertHsBasicConfig(HsBasicConfig hsBasicConfig);
    
    /**
     * @Title: updateHsBasicConfig
     * @Description: 更新系统参数
     * @param @param hsBasicConfig
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月13日 下午4:36:28
     */
    public int updateHsBasicConfig(HsBasicConfig hsBasicConfig);
    
    /**
     * @Title: deleteHsBasicConfig
     * @Description: 逻辑删除系统参数
     * @param @param hsBasicConfig
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月13日 下午4:37:48
     */
    public int deleteHsBasicConfig(Long globalConfigId);
    
    /**
     * @Title: codeNameExist
     * @Description: 系统参数的编号或者名称 是否已经存在 author jiangjiao
     * @param @param globalConfigName和globalConfigCode
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 上午11:10:45
     */
    public int codeNameExist(HsBasicConfig hsBasicConfig);
    
    /**
     * @Title: HsBasicConfig
     * @Description: 明细
     * @param @param hsBasicConfig
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017/11/16 10:00:12
     */
    HsBasicConfig selectHsBasicConfigByPrimaryKey(Long globalConfigId);
}
