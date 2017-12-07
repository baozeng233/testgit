/*
 * 文 件 名: IBasicAreaService.java 版 权: Copyright © 2015-2017, 湖南物联聚创信息科技有限公司 描 述: IBasicAreaService.java 版 本： 1.0 创 建 人:
 * jiangjiao 创建时间: 2017年11月13日 下午4:07:53
 */
package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.based.BasicAreaDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicArea;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/**
 * @ClassName: IBasicAreaService
 * @Description: 区域管理 -数据层调用接口
 * @author jiangjiao 2017年11月13日 下午4:07:53
 * 
 */
public interface IBasicAreaService{
    
    /**
     * @Title: insertAreaByLevel
     * @Description: 新增 地区数据
     * @param @param area
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月13日 下午4:53:37
     */
    public int insertAreaByLevel(HsBasicArea area);
    
    /**
     * 
     * @Title: getCodeByAreaLevel
     * @Description: 获取编号 当前级别有多少数量 +1
     * @param @param level
     * @param @return
     * @return String
     * @throws @author jiangjiao 2017年11月14日 上午10:22:23
     */
    public String getCodeByAreaLevel(int level);
    
    /**
     * 
     * @Title: hasAreaName
     * @Description: 判断区域名称是否已经存在
     * @param @param
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 上午10:24:10
     */
    public int hasAreaName(String name);
    
    /**
     * 
     * @Title: hasAreaCode
     * @Description: 判断区域编号是否已经存在
     * @param @param
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 上午10:25:10
     */
    public int hasAreaCode(String code);
    
    /**
     * @Title: hasNextLevelByPid
     * @Description: 判断是否存在下级 未删除 数据
     * @param @param areaid
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 上午10:38:43
     */
    public int hasNextLevelByPid(Long id);
    
    /**
     * 
     * @Title: deleteAraeById
     * @Description:编辑修改区域 作为编辑和删除操作
     * @param @param id
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 上午10:45:03
     */
    public int updateAraeById(HsBasicArea area);
    
    /**
     * 
     * @Title: getAreaDTOById
     * @Description: 获取 区域 数据 详情
     * @param @param id
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 上午11:11:40
     */
    public BasicAreaDTO getAreaDTOById(Long id);
    
    /**
     * 
     * @Title: getAreaListByLevelId
     * @Description: 获取区域 集合 通过 级别
     * @param @param id
     * @param @return
     * @return List<HsBasicArea>
     * @throws @author jiangjiao 2017年11月14日 下午2:10:56
     */
    public List<HsBasicArea> getAreaListByLevelId(int id);
    
    /**
     * 
     * @Title: getAreaListByLevel
     * @Description: 查询地区信息 通过level 级别 对外通用
     * @param @param area
     * @param @return
     * @return PageDataInfo<HsBasicArea>
     * @throws @author jiangjiao 2017年11月22日 上午10:34:49
     */
    public PageDataInfo<HsBasicArea> getAreaListByLevel(PageQueryInfo<HsBasicArea> area);
    
    /**
     * 
     * @Title: getAllAreaParentList
     * @Description: 通过片区 获取上级 对外接口
     * @param @param arid
     * @param @return
     * @return List<HsBasicArea>
     * @throws @author jiangjiao 2017年11月22日 上午11:14:34
     */
    public List<HsBasicArea> getAllAreaParentList(Long arid);
    
    /**
     * 
     * @Title: queryAll
     * @Description: 查询所有区域列表
     * @param @param arid
     * @param @return
     * @return List<HsBasicArea>
     * @throws @author jiangjiao 2017年11月22日 上午11:34:54
     */
    public List<HsBasicArea> queryAll();
}
