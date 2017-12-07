/*
 * 文 件 名:  BasicPartService.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  BasicPartService.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月14日 下午8:55:10
*/
package com.zeus.baseddata.commerce.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zeus.baseddata.commerce.mybatis.dao.HsBasicPartDAO;
import com.zeus.baseddata.commerce.service.IPartServicce;
import com.zeus.baseddata.entity.based.BasicPartDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicPart;
import com.zeus.baseddata.mybatis.model.based.HsBasicPartCriteria;
import com.zeus.common.core.enums.impl.TrueFalseEnum;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: BasicPartService
* @Description: 数据层-承包区服务
* @author lifeng 2017年11月14日 下午8:55:10
* 
*/
@Service(interfaceClass= IPartServicce.class)
public class BasicPartService implements IPartServicce{
    
    @Resource
    private HsBasicPartDAO hsBasicPartDAO;
    
    /** 
    * @Title: addPart
    * @Description: 承包区新增
    * @param @param part
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月15日 下午3:34:44
     */
    public int addPart(HsBasicPart part){
        return hsBasicPartDAO.insertSelective(part);
    }
    
    /** 
    * @Title: editPart
    * @Description: 承包区编辑
    * @param @param part
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月15日 下午3:41:45
     */
    public int editPart(HsBasicPart part){
        return hsBasicPartDAO.updateByPrimaryKeySelective(part);
    }
    
    /** 
    * @Title: getPartByCode
    * @Description: 通过code获取承包区
    * @param @param partCode
    * @param @return
    * @return List<HsBasicPart>
    * @throws 
    * @author lifeng 2017年11月15日 下午4:30:33
     */
    public List<HsBasicPart> getPartByCode(String partCode){
        HsBasicPartCriteria example= new HsBasicPartCriteria();
        example.createCriteria().andPartCodeEqualTo(partCode).andRdStatusNotEqualTo(
            TrueFalseEnum.FALSE.getValue());
        return hsBasicPartDAO.selectByExample(example);
    }
    
    /** 
    * @Title: getPartByName
    * @Description: 通过名称，所属网点获取承包区
    * @param @param part
    * @param @return
    * @return List<HsBasicPart>
    * @throws 
    * @author lifeng 2017年11月15日 下午4:30:37
     */
    public List<HsBasicPart> getPartByName(HsBasicPart part){
        HsBasicPartCriteria example= new HsBasicPartCriteria();
        example.createCriteria()
            .andPartNameEqualTo(part.getPartName())
            .andSiteIdEqualTo(part.getSiteId())
            .andRdStatusNotEqualTo(TrueFalseEnum.FALSE.getValue());
        return hsBasicPartDAO.selectByExample(example);
    }
    
    /** 
    * @Title: deletePart
    * @Description: 逻辑删除承包区
    * @param @param id
    * @param @return
    * @return int
    * @throws 
    * @author lifeng 2017年11月15日 下午5:00:46
     */
    public int deletePart(HsBasicPart part){
        return hsBasicPartDAO.updateByPrimaryKeySelective(part);
    }
    
    /** 
    * @Title: getMaxOrder
    * @Description: 获取最大顺序
    * @param @return
    * @return Long
    * @throws 
    * @author lifeng 2017年11月21日 下午1:40:10
     */
    public Long getMaxOrder(){
        return hsBasicPartDAO.getMaxOrder();
    }
    
    /** (非 Javadoc) 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @throws 
    * @author lifeng 2017年11月30日 上午10:15:18
     */
    public PageDataInfo<BasicPartDTO> pageQuery(PageQueryInfo<HsBasicPart> queryParam){
        PageHelper.startPage(queryParam.getPageNum(),queryParam.getPageSize());
        List<BasicPartDTO> list= hsBasicPartDAO.selectByQueryInfo(queryParam.getParam());
        PageInfo<BasicPartDTO> pageInfo= new PageInfo<>(list);
        PageDataInfo<BasicPartDTO> page= new PageDataInfo<>();
        page.setRows(list);
        page.setPages(pageInfo.getPages());
        page.setTotal(pageInfo.getTotal());
        return page;
    }
    
}
