package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.based.HsBasicDictDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicDict;
import com.zeus.baseddata.mybatis.model.based.HsBasicDictType;
import com.zeus.baseddata.mybatis.model.person.HsBasicEmployee;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/**
 * @ClassName: IDictService
 * @Description: 数据字典管理服务接口定义
 * @author jiangjiao 2017年11月16日 上午10:00:23
 * 
 */
public interface IDictService{
    
    /**
     * @Title: queryGrid
     * @param queryParam
     * @param @return 列表数据
     * @return PageDataInfo<HsBasicDictDTO>
     * @throws @author jiangjiao 2017/11/16 10:00:12
     */
    PageDataInfo<HsBasicDictDTO> queryGrid(PageQueryInfo<HsBasicDictDTO> queryParam);
    
    /**
     * @Title: queryAll
     * @Description: 查询所有字典
     * @param @return
     * @return List<HsBasicDict>
     * @throws @author jiangjiao 2017年11月16日 上午10:03:57
     */
    List<HsBasicDict> queryAll();
    
    /**
     * @Title: queryAll
     * @Description: 查询所有字典类型列表
     * @param @return
     * @return List<HsBasicDictType>
     * @throws @author jiangjiao 2017年11月21日 上午10:03:57
     */
    List<HsBasicDictType> queryAllDictType();
    
    /**
     * 
     * @Title: queryAllByParam
     * @Description: 通过条件查询列表
     * @param @param hsBasicDict
     * @param @return
     * @return List<HsBasicDict>
     * @throws @author jiangjiao 2017年11月16日 上午10:11:30
     */
    List<HsBasicDict> queryAllByParam(HsBasicDict hsBasicDict);
    
    /**
     * @Title: HsBasicDict
     * @Description: 明细
     * @param @param hsBasicDict
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017/11/16 10:00:12
     */
    HsBasicDict selectHsBasicDictByPrimaryKey(Long dictId);
    
    /**
     * @Title: addHsBasicDict
     * @Description: 添加
     * @param @param hsBasicDict
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017/11/16 10:00:12
     */
    int insertHsBasicDict(HsBasicDict hsBasicDict);
    
    /**
     * @Title: updateHsBasicDict
     * @Description: 修改
     * @param @param hsBasicDict
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017/11/16 10:00:12
     */
    int updateHsBasicDict(HsBasicDict hsBasicDict);
    
    /**
     * @Title: deleteHsBasicDict
     * @Description: 删除
     * @param @param dictId
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017/11/16 10:00:12
     */
    int deleteHsBasicDict(Long dictId);
    
    /**
     * @Title: codeNameExist
     * @Description: 字典的编号或者名称 是否已经存在 author jiangjiao
     * @param @param dictName和dictCode
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月16日 11:10:45
     */
    public int codeNameExist(HsBasicDict hsBasicDict);
    
    /**
     * 
     * @Title: getDictByType
     * @Description: 通过缓存获取字典类型
     * @param @param type
     * @param @return
     * @return List<HsBasicDict>
     * @throws 
     * @author caojie 2017年11月29日 下午7:07:06
     */
    public List<HsBasicDict> getDictByType(String type);
    
    /**
     * @Title: getDictListByDicId
     * @Description: 通过字典数据查询明细
     * @param @param ids
     * @param @return
     * @return List<HsBasicDict>
     * @throws 
     * @author jiangjiao 2017年12月6日 下午2:35:21
     */
    List<HsBasicDict> getDictListByDicId(List<Long> ids);
}
