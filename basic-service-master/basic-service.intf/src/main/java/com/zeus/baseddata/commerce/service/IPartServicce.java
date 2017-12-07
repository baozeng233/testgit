/*
 * 文 件 名:  IPartServicce.java
 * 版    权:  Copyright © 2015-2017, 湖南物联聚创信息科技有限公司
 * 描    述:  IPartServicce.java 
 * 版    本：   1.0 
 * 创 建 人:  lifeng
 * 创建时间: 2017年11月14日 下午8:50:15
*/
package com.zeus.baseddata.commerce.service;

import java.util.List;

import com.zeus.baseddata.entity.based.BasicPartDTO;
import com.zeus.baseddata.mybatis.model.based.HsBasicPart;
import com.zeus.common.core.info.PageDataInfo;
import com.zeus.common.entity.PageQueryInfo;

/** 
* @ClassName: IPartServicce
* @Description: 承包区服务调用接口
* @author lifeng 2017年11月14日 下午8:50:15
* 
*/
public interface IPartServicce{
    
    /** 
     * @Title: addPart
     * @Description: 承包区新增
     * @param @param part
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月15日 下午3:28:57
      */
    int addPart(HsBasicPart part);
    
    /** 
     * @Title: editPart
     * @Description: 承包区编辑
     * @param @param part
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月15日 下午3:39:32
      */
    int editPart(HsBasicPart part);
    
    /** 
     * @Title: getPartByCode
     * @Description: 通过code获取承包区信息
     * @param @param partCode
     * @param @return
     * @return List<HsBasicPart>
     * @throws 
     * @author lifeng 2017年11月15日 下午4:19:03
      */
    List<HsBasicPart> getPartByCode(String partCode);
    
    /** 
    * @Title: getPartByName
    * @Description: 通过名称，所属网点获取承包区信息
    * @param @param part
    * @param @return
    * @return List<HsBasicPart>
    * @throws 
    * @author lifeng 2017年11月15日 下午4:19:08
     */
    List<HsBasicPart> getPartByName(HsBasicPart part);
    
    /** 
     * @Title: deletePart
     * @Description: 逻辑删除承包区
     * @param @param id
     * @param @return
     * @return int
     * @throws 
     * @author lifeng 2017年11月15日 下午4:59:01
      */
    int deletePart(HsBasicPart part);
    
    /** 
     * @Title: getMaxOrder
     * @Description: 获取最大顺序
     * @param @return
     * @return Long
     * @throws 
     * @author lifeng 2017年11月21日 下午1:37:45
      */
    Long getMaxOrder();
    
    /** 
    * @Title: pageQuery
    * @Description: 分页条件查询
    * @param @param queryParam
    * @param @return
    * @return PageDataInfo<BasicPartDTO>
    * @throws 
    * @author lifeng 2017年11月30日 上午10:14:36
     */
    PageDataInfo<BasicPartDTO> pageQuery(PageQueryInfo<HsBasicPart> queryParam);
    
}
