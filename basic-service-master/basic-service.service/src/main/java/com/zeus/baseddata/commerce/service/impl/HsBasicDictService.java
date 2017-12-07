package com.zeus.baseddata.commerce.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicDictDAO;
import com.zeus.baseddata.commerce.service.IDictService;
import com.zeus.baseddata.common.mybatis.dao.HsBasicDictTypeMapper;
import com.zeus.baseddata.entity.based.HsBasicDictDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicDict;
import com.zeus.baseddata.mybatis.model.based.HsBasicDictCriteria;
import com.zeus.baseddata.mybatis.model.based.HsBasicDictCriteria.Criteria;
import com.zeus.baseddata.mybatis.model.based.HsBasicDictType;
import com.zeus.baseddata.mybatis.model.based.HsBasicDictTypeCriteria;
import com.zeus.common.core.enums.CachKey;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.core.service.UtilService;
import com.zeus.common.core.utils.JsonUtils;
import com.zeus.common.entity.PageQueryInfo;
import com.zeus.common.redis.util.JedisUtils;

/**
 * 
 * @ClassName: HsBasicDictService
 * @Description: 数据字典信息数据逻辑层
 * @author jiangjiao 2017/11/16 10:23:16
 *
 */
@Service(interfaceClass= IDictService.class)
public class HsBasicDictService extends UtilService implements IDictService{
    
    @Resource
    HsBasicDictDAO hsBasicDictDAO; //数据字典信息(自定义)
    
    @Resource
    HsBasicDictTypeMapper hsBasicDictTypeMapper;
    
    @Resource
    private JedisUtils jedisUtils;
    
    /**
     * @Title: queryList
     * @param queryParam
     * @param @return 列表数据(单表)
     * @return PageDataInfo<HsBasicDictDTO>
     * @throws @author jiangjiao 2017/11/16 10:23:16
     */
    @Override
    public List<HsBasicDict> queryList(Object queryParam){
        
        HsBasicDictCriteria criteria= new HsBasicDictCriteria();
        if(queryParam!= null){
            HsBasicDict model= (HsBasicDict)queryParam;
            if(StringUtils.isNotEmpty(model.getDictCode())){
                criteria.createCriteria().andDictCodeEqualTo(model.getDictCode());
            }
            if(StringUtils.isNotEmpty(model.getTypeCode())){
                criteria.createCriteria().andTypeCodeEqualTo(model.getTypeCode());
            }
        }
        criteria.createCriteria().andRdStatusEqualTo(TrueFalseEnum.TRUE.getValue());
        return hsBasicDictDAO.selectByExample(criteria);
    }
    
    /**
     * @Title: queryGrid
     * @param queryParam
     * @param @return 列表数据
     * @return PageDataInfo<HsBasicDictDTO>
     * @throws @author jiangjiao 2017/11/16 10:23:16
     */
    public PageDataInfo<HsBasicDictDTO> queryGrid(
        @RequestBody PageQueryInfo<HsBasicDictDTO> queryParam){
        
        // 设置参数
        PageHelper.startPage(queryParam.getPageNum(),queryParam.getPageSize());
        Map<String,Object> searchParams= new HashMap<String,Object>();
        searchParams.put("dictCode",queryParam.getParam().getDictCode());
        searchParams.put("dictName",queryParam.getParam().getDictName());
        searchParams.put("dictPinyin",queryParam.getParam().getDictPinyin());
        
        // 查询
        List<HsBasicDictDTO> list= hsBasicDictDAO.queryGrid(searchParams);
        
        // 结果集
        PageDataInfo<HsBasicDictDTO> pageData= new PageDataInfo<HsBasicDictDTO>();
        PageInfo<HsBasicDictDTO> pageInfo= new PageInfo<HsBasicDictDTO>(list);
        pageData.setTotal(pageInfo.getTotal());
        pageData.setRows(list);
        pageData.setPages(pageInfo.getPages());
        return pageData;
    }
    
    /**
     * @Title: selectHsBasicDictByPrimaryKey
     * @Description: 明细
     * @param @param dictId
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017/11/16 10:23:16
     */
    public HsBasicDict selectHsBasicDictByPrimaryKey(Long dictId){
        
        return hsBasicDictDAO.selectByPrimaryKey(dictId);
    }
    
    /**
     * @Title: insertHsBasicDict
     * @Description: 添加
     * @param @param hsBasicDict
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017/11/16 10:23:16
     */
    public int insertHsBasicDict(HsBasicDict hsBasicDict){
        
        return hsBasicDictDAO.insert(hsBasicDict);
    }
    
    /**
     * @Title: updateHsBasicDict
     * @Description: 修改
     * @param @param hsBasicDict
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017/11/16 10:23:16
     */
    public int updateHsBasicDict(HsBasicDict hsBasicDict){
        
        return hsBasicDictDAO.updateByPrimaryKeySelective(hsBasicDict);
    }
    
    /**
     * @Title: deleteHsBasicDict
     * @Description: 删除
     * @param @param dictId
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017/11/16 10:23:16
     */
    public int deleteHsBasicDict(Long dictId){
        
        return hsBasicDictDAO.deleteByPrimaryKey(dictId);
    }
    
    /**
     * @Title: codeNameExist
     * @Description: 字典名称和编号
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月16日 下午2:53:23
     */
    public int codeNameExist(HsBasicDict hsBasicDict){
        HsBasicDictCriteria example= new HsBasicDictCriteria();
        example.createCriteria()
            .andDictNameEqualTo(hsBasicDict.getDictName())
            .andTypeCodeEqualTo(hsBasicDict.getTypeCode())
            .andDictIdNotEqualTo(hsBasicDict.getDictId())
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
        List<HsBasicDict> list= hsBasicDictDAO.selectByExample(example);
        if(CollectionUtils.isNotEmpty(list)){
            return 1;
        }
        example= new HsBasicDictCriteria();
        example.createCriteria()
            .andDictCodeEqualTo(hsBasicDict.getDictCode())
            .andTypeCodeEqualTo(hsBasicDict.getTypeCode())
            .andDictIdNotEqualTo(hsBasicDict.getDictId())
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
        list= hsBasicDictDAO.selectByExample(example);
        if(CollectionUtils.isNotEmpty(list)){
            return 1;
        }
        return 0;
    }
    
    /**
     * @Title: queryAllDictType
     * @Description: 查询所有字典类型列表
     * @param @return
     * @return List<HsBasicDictType>
     * @throws @author jiangjiao 2017年11月20日 下午4:51:59
     */
    public List<HsBasicDictType> queryAllDictType(){
        
        HsBasicDictTypeCriteria cr= new HsBasicDictTypeCriteria();
        cr.createCriteria().andRdStatusEqualTo(TrueFalseEnum.TRUE.getValue());
        return hsBasicDictTypeMapper.selectByExample(cr);
    }
    
    /**
     * @Title: getAllDictType
     * @Description: 所有字典类型（缓存）
     * @param @return
     * @return Map<String, List<HsBasicDict>>
     * @throws @author jiangjiao 2017年11月24日 下午4:31:59
     */
    public Map<String,List<HsBasicDict>> getAllDictType(){
        
        List<HsBasicDictType> list= queryAllDictType();
        Map<String,List<HsBasicDict>> result= new HashMap<>();
        HsBasicDictCriteria cr= null;
        for(HsBasicDictType hs : list){
            cr= new HsBasicDictCriteria();
            cr.createCriteria().andTypeCodeEqualTo(hs.getTypeCode()).andRdStatusEqualTo(
                TrueFalseEnum.TRUE.getValue());
            result.put(hs.getTypeCode(),hsBasicDictDAO.selectByExample(cr));
        }
        return result;
    }
    
    /** 
    * @Title: queryAll
    * @Description: 查询所有字典列表
    * @throws 
    * @author jiangjiao 2017年11月28日 下午2:57:15
     */
    @Override
    public List<HsBasicDict> queryAll(){
        HsBasicDictCriteria cr= new HsBasicDictCriteria();
        cr.createCriteria().andRdStatusEqualTo(TrueFalseEnum.TRUE.getValue());
        return hsBasicDictDAO.selectByExample(cr);
    }
    
    /**  
    * @Title: queryAllByParam
    * @Description: 通过参数获取字典
    * @throws 
    * @author jiangjiao 2017年11月28日 下午2:57:15
     */
    @Override
    public List<HsBasicDict> queryAllByParam(HsBasicDict hsBasicDict){
        
        HsBasicDictCriteria cr= new HsBasicDictCriteria();
        Criteria crc= cr.createCriteria();
        if(StringUtils.isNoneEmpty(hsBasicDict.getDictCode())){
            crc.andDictCodeLike("%"+ hsBasicDict.getDictCode()+ "%");
        }
        if(StringUtils.isNoneEmpty(hsBasicDict.getTypeCode())){
            crc.andTypeCodeLike("%"+ hsBasicDict.getTypeCode()+ "%");
        }
        if(StringUtils.isNoneEmpty(hsBasicDict.getDictName())){
            crc.andDictNameLike("%"+ hsBasicDict.getDictName()+ "%");
        }
        if(hsBasicDict.getDictId()!= null){
            crc.andDictIdEqualTo(hsBasicDict.getDictId());
        }
        crc.andRdStatusEqualTo(TrueFalseEnum.TRUE.getValue());
        return hsBasicDictDAO.selectByExample(cr);
    }
    
    /**
     * @Title: getDictByType
     * @Description: 通过类型获取字典（缓存）
     * @param @return
     * @return Map<String, List<HsBasicDict>>
     * @throws @author jiangjiao 2017年11月24日 下午4:31:59
     */
    @Override
    public List<HsBasicDict> getDictByType(String type){
        Map<String,String> map= jedisUtils.getMap(CachKey.DICT_KEY.getValue()+ type);
        List<HsBasicDict> list= Lists.newArrayList();
        for(Entry<String,String> mp : map.entrySet()){
            list.add(JsonUtils.jsonToBean(mp.getValue(),HsBasicDict.class));
        }
        return list;
    }

    /** (非 Javadoc) 
     * @Title: getDictListByDicId
     * @Description: 通过字典集合查询列表数据（后期改成读取缓存）
     * @throws 
     * @author jiangjiao 2017年12月6日 下午2:36:32
     */ 
    @Override
    public List<HsBasicDict> getDictListByDicId(List<Long> ids){
        HsBasicDictCriteria criteria= new HsBasicDictCriteria();
        criteria.createCriteria().andDictIdIn(ids);
        return hsBasicDictDAO.selectByExample(criteria);
        
    }
}
