package com.zeus.baseddata.commerce.service.impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zeus.baseddata.commerce.service.IAuthMemuService;
import com.zeus.baseddata.mybatis.model.user.HsAuthMenus;
import com.zeus.common.core.id.IdUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthMemuServiceTests{
    
    
    @Autowired
    private IAuthMemuService iAuthMemuService;
    
    @Test
    public void contextLoads(){
        //        List<HsAuthMenus> menus= iAuthMemuService.queryAll();
        //        System.err.println(menus.size());
    }
    
    @Test
    public void addMemu(){
        HsAuthMenus hsAuthMenus= new HsAuthMenus();
        hsAuthMenus.setMenuId(IdUtil.getId());
        hsAuthMenus.setMenuCode("11112");
        hsAuthMenus.setMenuName("测试菜单");
        hsAuthMenus.setMenuType("BS");
        hsAuthMenus.setParentMenuId(0l);
        hsAuthMenus.setCreatedBy(000l);
        int result= iAuthMemuService.addHsAuthMenus(hsAuthMenus);
        assertThat(result);
    }
    
}
