/*
 * 文 件 名: BasicAreaService.java 版 权: Copyright © 2015-2017, 湖南物联聚创信息科技有限公司 描 述: BasicAreaService.java 版 本： 1.0 创 建 人:
 * jiangjiao 创建时间: 2017年11月13日 下午4:04:14
 */
package com.zeus.baseddata.commerce.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicAreaDAO;
import com.zeus.baseddata.commerce.service.IBasicAreaService;
import com.zeus.baseddata.entity.based.BasicAreaDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicArea;
import com.zeus.baseddata.mybatis.model.based.HsBasicAreaCriteria;
import com.zeus.baseddata.mybatis.model.based.HsBasicAreaCriteria.Criteria;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/**
 * @ClassName: BasicAreaService
 * @Description: 数据服务 区域管理
 * @author jiangjiao 2017年11月13日 下午4:04:14
 * 
 */
@Service(interfaceClass= IBasicAreaService.class)
public class BasicAreaService implements IBasicAreaService{
    
    @Resource
    HsBasicAreaDAO hsBasicAreaDAO;
    
    /**
     * @Title: insertAreaByLevel
     * @Description: 新增区域
     * @param @param area
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017   年11月13日 下午4:56:00
     */
    public int insertAreaByLevel(HsBasicArea area){
        
        int count= hsBasicAreaDAO.countByExample(new HsBasicAreaCriteria());
        area.setAreaOrder(count+ 1);
        return hsBasicAreaDAO.insert(area);
    }
    
    /**
     * @Title: getCodeByAreaLevel
     * @Description: 通过层级获取编号
     * @param @param level
     * @param @return
     * @return String
     * @throws @author jiangjiao 2017年11月13日 下午5:04:42
     */
    public String getCodeByAreaLevel(int level){
        
        return hsBasicAreaDAO.getCodeByAreaLevel(level).toString();
    }
    
    /**
     * @Title: hasAreaName
     * @Description: 区域名称是否存在
     * @param @param
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 上午10:25:21
     */
    public int hasAreaName(String name){
        
        HsBasicAreaCriteria cr= new HsBasicAreaCriteria();
        cr.createCriteria().andAreaNameEqualTo(name);
        return hsBasicAreaDAO.countByExample(cr);
    }
    
    /**
     * @Title: hasAreaCode
     * @Description: 区域编号是否存在
     * @param @param
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 上午10:28:11
     */
    public int hasAreaCode(String code){
        
        HsBasicAreaCriteria cr= new HsBasicAreaCriteria();
        cr.createCriteria().andAreaNameEqualTo(code);
        return hsBasicAreaDAO.countByExample(cr);
    }
    
    /**
     * @Title: hasNextLevelByPid
     * @Description: 判断是否存在下级 未删除 数据
     * @param @param id
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 上午10:40:59
     */
    public int hasNextLevelByPid(Long id){
        
        HsBasicAreaCriteria cr= new HsBasicAreaCriteria();
        cr.createCriteria().andParentAreaIdEqualTo(id).andRdStatusEqualTo(TrueFalseEnum.TRUE
            .getValue());
        return hsBasicAreaDAO.countByExample(cr);
    }
    
    /**
     * @Title: deleteAraeById
     * @Description: 编辑和删除区域操作 逻辑删除
     * @param @param id
     * @param @return
     * @return int
     * @throws @author jiangjiao 2017年11月14日 上午10:45:57
     */
    public int updateAraeById(HsBasicArea area){
        
        HsBasicAreaCriteria example= new HsBasicAreaCriteria();
        example.createCriteria().andAreaIdEqualTo(area.getAreaId());
        int res= hsBasicAreaDAO.updateByExampleSelective(area,example);
        return res;
    }
    
    /**
     * @Title: getAreaDTOById
     * @Description: 获取 区域 数据 详情
     * @param @param id
     * @param @return
     * @return BasicAreaDTO
     * @throws @author jiangjiao 2017年11月14日 上午11:13:10
     */
    public BasicAreaDTO getAreaDTOById(Long id){
        
        return hsBasicAreaDAO.getAreaDTOById(id);
    }
    
    /**
     * @Title: getAreaListByLevelId
     * @Description: 获取区域 集合 通过 级别
     * @param @param id
     * @param @return
     * @return List<HsBasicArea>
     * @throws @author jiangjiao 2017年11月14日 下午2:12:16
     */
    public List<HsBasicArea> getAreaListByLevelId(int id){
        
        HsBasicAreaCriteria cr= new HsBasicAreaCriteria();
        cr.createCriteria().andAreaLevelEqualTo(id).andRdStatusEqualTo(TrueFalseEnum.TRUE
            .getValue());
        return hsBasicAreaDAO.selectByExample(cr);
    }
    
    /**
     * @Title: getAreaListByLevel
     * @Description: 通过层级获取区域列表
     * @param @param area
     * @param @return
     * @return List<HsBasicArea>
     * @throws @author jiangjiao 2017年11月21日 下午4:58:17
     */
    public PageDataInfo<HsBasicArea> getAreaListByLevel(PageQueryInfo<HsBasicArea> area){
        
        HsBasicAreaCriteria cr= new HsBasicAreaCriteria();
        Criteria crs= cr.createCriteria();
        HsBasicArea param= area.getParam();
        crs.andAreaLevelEqualTo(param.getAreaLevel());
        if(StringUtils.isNotEmpty(param.getAreaName())){
            crs.andAreaNameLike("%"+ param.getAreaName()+ "%");
        }
        if(StringUtils.isNotEmpty(param.getAreaPinyin())){
            crs.andAreaPinyinLike("%"+ param.getAreaPinyin().toUpperCase()+ "%");
        }
        if(StringUtils.isNotEmpty(param.getAreaCode())){
            crs.andAreaCodeLike("%"+ param.getAreaCode()+ "%");
        }
        PageHelper.startPage(area.getPageNum(),area.getPageSize());
        List<HsBasicArea> list= hsBasicAreaDAO.selectByExample(cr);
        
        PageInfo<HsBasicArea> page= new PageInfo<>(list);
        PageDataInfo<HsBasicArea> result= new PageDataInfo<>();
        result.setRows(list);
        result.setTotal(page.getTotal());
        result.setPageNum(page.getPages());
        return result;
    }
    
    /**
     * @Title: getAllAreaParentList
     * @Description: 通过片区 获取上级 对外接口
     * @param @param arid
     * @param @return
     * @return List<HsBasicArea>
     * @throws @author jiangjiao 2017年11月22日 上午10:37:40
     */
    public List<HsBasicArea> getAllAreaParentList(Long arid){
        
        List<HsBasicArea> result= new ArrayList<>();
        HsBasicArea now= hsBasicAreaDAO.selectByPrimaryKey(arid);
        result= getParentAreaList(result,now);
        return result;
    }
    
    /**
     * @Title: getParentAreaList
     * @Description: 获取上级区域列表
     * @param @param result
     * @param @param now
     * @return void
     * @throws @author jiangjiao 2017年11月22日 上午10:40:41
     */
    private List<HsBasicArea> getParentAreaList(List<HsBasicArea> result,HsBasicArea now){
        
        HsBasicArea area= hsBasicAreaDAO.selectByPrimaryKey(now.getParentAreaId());
        if(area!= null){
            result.add(0,area);
            result= getParentAreaList(result,area);
        }
        return result;
    }
    
    /**
     * @Title: queryAll
     * @Description: 查询所有区域列表
     * @param @param result
     * @param @param now
     * @return void
     * @throws @author jiangjiao 2017年11月22日 上午11:34:41
     */
    public List<HsBasicArea> queryAll(){
        
        HsBasicAreaCriteria cr= new HsBasicAreaCriteria();
        cr.createCriteria().andRdStatusEqualTo(TrueFalseEnum.TRUE.getValue());
        return hsBasicAreaDAO.selectByExample(cr);
    }
    
}
