package com.zeus.baseddata.commerce.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicConfigDAO;
import com.zeus.baseddata.commerce.service.IConfigService;
import com.zeus.baseddata.entity.based.HsBasicConfigDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicConfig;
import com.zeus.baseddata.mybatis.model.based.HsBasicConfigCriteria;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.core.service.UtilService;
import com.zeus.common.entity.PageQueryInfo;

/**
 * 
 * @ClassName: HsBasicConfigService
 * @Description: 数据服务层-系统参数服务
 * @author jiangjiao 2017年10月31日 下午4:00:56
 *
 */
@Service(interfaceClass= IConfigService.class)
public class HsBasicConfigService extends UtilService implements IConfigService{
    
    @Resource
    private HsBasicConfigDAO hsBasicConfigDAO;
    
    /**
     * @Title: queryList
     * @param queryParam
     * @param @return 列表数据(单表)
     * @return PageDataInfo<HsBasicConfigDTO>
     * @throws @author jiangjiao 2017/11/16 10:23:16
     */
    @Override
    public List<HsBasicConfig> queryList(Object queryParam){
        
        HsBasicConfigCriteria criteria= new HsBasicConfigCriteria();
        if(queryParam!= null){
            HsBasicConfig model= (HsBasicConfig)queryParam;
            if(StringUtils.isNotEmpty(model.getGlobalConfigCode())){
                criteria.createCriteria().andGlobalConfigCodeEqualTo(model.getGlobalConfigCode());
            }
            if(StringUtils.isNotEmpty(model.getGlobalConfigName())){
                criteria.createCriteria().andGlobalConfigNameEqualTo(model.getGlobalConfigName());
            }
        }
        criteria.createCriteria().andRdStatusEqualTo(TrueFalseEnum.TRUE.getValue());
        return hsBasicConfigDAO.selectByExample(criteria);
    }
    
    /**
     * @Title: queryGrid
     * @param queryParam
     * @param @return 列表数据
     * @return PageDataInfo<HsBasicConfigDTO>
     * @throws @author jiangjiao 2017/11/16 10:23:16
     */
    public PageDataInfo<HsBasicConfigDTO> queryGrid(
        @RequestBody PageQueryInfo<HsBasicConfigDTO> queryParam){
        
        // 设置参数
        PageHelper.startPage(queryParam.getPageNum(),queryParam.getPageSize());
        Map<String,Object> searchParams= new HashMap<String,Object>();
        searchParams.put("globalConfigCode",queryParam.getParam().getGlobalConfigCode());
        searchParams.put("globalConfigName",queryParam.getParam().getGlobalConfigName());
        
        // 查询
        List<HsBasicConfigDTO> list= hsBasicConfigDAO.queryGrid(searchParams);
        
        // 结果集
        PageDataInfo<HsBasicConfigDTO> pageData= new PageDataInfo<HsBasicConfigDTO>();
        PageInfo<HsBasicConfigDTO> pageInfo= new PageInfo<HsBasicConfigDTO>(list);
        pageData.setTotal(pageInfo.getTotal());
        pageData.setRows(list);
        pageData.setPages(pageInfo.getPages());
        return pageData;
    }
    
    /**
     * 
     * @Title: insertHsBasicConfig
     * @Description: 系统参数添加
     * @param @param hsBasicConfig
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 下午4:34:28
     */
    public int insertHsBasicConfig(HsBasicConfig hsBasicConfig){
        
        return hsBasicConfigDAO.insert(hsBasicConfig);
    }
    
    /**
     * 
     * @Title: updateHsBasicConfig
     * @Description: 系统参数更新
     * @param @param HsBasicConfig
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 下午4:40:41
     */
    public int updateHsBasicConfig(HsBasicConfig hsBasicConfig){
        
        return hsBasicConfigDAO.updateByPrimaryKeySelective(hsBasicConfig);
        
    }
    
    /**
     * 
     * @Title: deleteHsBasicConfig
     * @Description: 系统参数逻辑删除
     * @param @param globalConfigId
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 下午4:45:13
     */
    public int deleteHsBasicConfig(Long globalConfigId){
        
        return hsBasicConfigDAO.deleteByPrimaryKey(globalConfigId);
    }
    
    /**
     * @Title: queryAll
     * @Description: 查询所有
     * @param @return
     * @return List<HsBasicConfig>
     * @throws @author jiangjiao 2017年11月14日 下午4:48:53
     */
    public List<HsBasicConfig> queryAll(){
        
        HsBasicConfigCriteria cr= new HsBasicConfigCriteria();
        cr.createCriteria().andRdStatusEqualTo(TrueFalseEnum.TRUE.getValue());
        return hsBasicConfigDAO.selectByExample(cr);
    }
    
    /**
     * @Title: codeNameExist
     * @Description: 系统参数名称和编号
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 下午4:53:23
     */
    public int codeNameExist(HsBasicConfig hsBasicConfig){
        
            HsBasicConfigCriteria cr= new HsBasicConfigCriteria();
            cr.createCriteria()
                .andGlobalConfigCodeEqualTo(hsBasicConfig.getGlobalConfigCode())
                .andGlobalConfigIdNotEqualTo(hsBasicConfig.getGlobalConfigId());
            int count  =hsBasicConfigDAO.countByExample(cr);
            if(count> 0){
                return count;
            }else{
                cr= new HsBasicConfigCriteria();
                cr.createCriteria()
                    .andGlobalConfigNameEqualTo(hsBasicConfig.getGlobalConfigName())
                    .andGlobalConfigIdNotEqualTo(hsBasicConfig.getGlobalConfigId());
                count= hsBasicConfigDAO.countByExample(cr);
                return count;
            }
    }
    
    /**
     * @Title: selectHsBasicConfigByPrimaryKey
     * @Description: 明细
     * @param @param globalConfigId
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017/11/16 10:23:16
     */
    public HsBasicConfig selectHsBasicConfigByPrimaryKey(Long globalConfigId){
        
        return hsBasicConfigDAO.selectByPrimaryKey(globalConfigId);
    }
}
