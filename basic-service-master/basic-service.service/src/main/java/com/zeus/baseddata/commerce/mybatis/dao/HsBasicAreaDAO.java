/*
 * 文 件 名: HsBasicAreaDAO.java 版 权: Copyright © 2015-2017, 湖南物联聚创信息科技有限公司 描 述: HsBasicAreaDAO.java 版 本： 1.0 创 建 人:
 * jiangjiao 创建时间: 2017年11月13日 下午4:04:59
 */
package com.zeus.baseddata.commerce.mybatis.dao;

import com.zeus.baseddata.common.mybatis.dao.HsBasicAreaMapper;
import com.zeus.baseddata.entity.based.BasicAreaDTO;

/**
 * @ClassName: HsBasicAreaDAO
 * @Description: 自定义 区域管理
 * @author jiangjiao 2017年11月13日 下午4:04:59
 * 
 */
public interface HsBasicAreaDAO extends HsBasicAreaMapper{
    
    /**
     * @Title: getCodeByAreaLevel
     * @Description: 通过层级获取编号
     * @param @param level
     * @param @return
     * @return String
     * @throws @author jiangjiao 2017年11月13日 下午5:05:02
     */
    public Integer getCodeByAreaLevel(int level);
    
    /**
     * @Title: getAreaDTOById
     * @Description: 获取 区域 数据 详情
     * @param @param id
     * @param @return
     * @return BasicAreaDTO
     * @throws @author jiangjiao 2017年11月14日 上午11:13:52
     */
    public BasicAreaDTO getAreaDTOById(Long id);
    
}
