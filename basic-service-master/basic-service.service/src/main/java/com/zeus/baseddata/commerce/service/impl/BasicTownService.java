/*
 * 文 件 名:  BasicTownService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  BasicTownService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月21日 下午5:16:45
*/
package com.zeus.baseddata.commerce.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicTownDAO;
import com.zeus.baseddata.commerce.service.IBasicTownService;
import com.zeus.baseddata.entity.based.TownDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicTown;
import com.zeus.baseddata.mybatis.model.based.HsBasicTownCriteria;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.service.UtilService;

/** 
* @ClassName: BasicTownService
* @Description: 乡镇管理数据层服务
* @author lifeng 2017年11月21日 下午5:16:45
* 
*/
@Service(interfaceClass= IBasicTownService.class)
public class BasicTownService extends UtilService implements IBasicTownService{
    
    @Resource
    private HsBasicTownDAO hsBasicTownDAO;
    
    /** (非 Javadoc) 
    * @Title: queryList
    * @Description: 
    * @throws 
    * @author lifeng 2017年11月21日 下午5:16:45
     */
    @Override
    protected <T> List queryList(T queryParam){
        return null;
    }
    
    /** 
     * @Title: queryCounty
     * @Description: 获取区县的关联乡镇列表
     * @param @param countyId
     * @param @return
     * @return List<HsBasicTown>
     * @throws 
     * @author lifeng 2017年11月14日 下午2:38:53
      */
    public List<HsBasicTown> queryTown(Long countyId){
        HsBasicTownCriteria example= new HsBasicTownCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andCountyIdEqualTo(countyId);
        return hsBasicTownDAO.selectByExample(example);
    }
    
    /** 
    * @Title: addTown
    * @Description: 新增乡镇
    * @param @param town
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 下午3:59:04
     */
    public int addTown(HsBasicTown town){
        return hsBasicTownDAO.insertSelective(town);
    }
    
    /** 
    * @Title: getTownByCode
    * @Description: 通过code获取乡镇信息
    * @param @param townCode
    * @param @return
    * @return List<HsBasicTown>
    * @throws 
    * @author lifeng 2017年11月14日 下午4:49:22
     */
    public List<HsBasicTown> getTownByCode(String townCode){
        HsBasicTownCriteria example= new HsBasicTownCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andTownCodeEqualTo(townCode);
        return hsBasicTownDAO.selectByExample(example);
    }
    
    /** 
    * @Title: getTownByName
    * @Description: 通过名称，所属区县获取乡镇信息
    * @param @param town
    * @param @return
    * @return List<HsBasicTown>
    * @throws 
    * @author lifeng 2017年11月14日 下午4:52:13
     */
    public List<HsBasicTown> getTownByName(HsBasicTown town){
        HsBasicTownCriteria example= new HsBasicTownCriteria();
        example.createCriteria()
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue())
            .andTownNameEqualTo(town.getTownName())
            .andCountyIdEqualTo(town.getCountyId());
        return hsBasicTownDAO.selectByExample(example);
    }
    
    /** 
    * @Title: editTown
    * @Description: 编辑乡镇
    * @param @param town
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 下午5:17:44
     */
    public int editTown(HsBasicTown town){
        return hsBasicTownDAO.updateByPrimaryKeySelective(town);
    }
    
    /** 
    * @Title: deleteTown
    * @Description: 逻辑删除乡镇
    * @param @param id
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月14日 下午5:23:29
     */
    public int deleteTown(HsBasicTown town){
        return hsBasicTownDAO.updateByPrimaryKeySelective(town);
    }
    
    /** 
     * @Title: queryMaxTownOder
     * @Description: 获得乡镇最大顺序
     * @param @return
     * @return Long
     * @throws 
     * @author lifeng 2017年11月21日 上午11:06:03
      */
    public Long queryMaxTownOder(){
        return hsBasicTownDAO.queryMaxOrder();
    }
    
    /** 
    * @Title: queryInfo
    * @Description: 通过id查询乡镇明细
    * @param @param townId
    * @param @return
    * @return TownDTO
    * @throws 
    * @author lifeng 2017年11月23日 下午4:07:28
     */
    public TownDTO queryTownInfo(Long townId){
        return hsBasicTownDAO.queryInfo(townId);
    }
    
}
