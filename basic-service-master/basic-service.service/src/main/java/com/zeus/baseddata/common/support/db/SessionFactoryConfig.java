package com.zeus.baseddata.common.support.db;

import java.io.IOException;

import org.apache.commons.lang3.ArrayUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zeus.common.data.support.db.AbstractSessionFactoryConfig;

@Configuration
@EnableTransactionManagement
@MapperScan({
    "com.zeus.baseddata.common.mybatis.dao","com.zeus.baseddata.commerce.mybatis.dao"
})
public class SessionFactoryConfig extends AbstractSessionFactoryConfig{
    
    
    @Override
    protected Resource[] getResources()
        throws IOException{
        
        PathMatchingResourcePatternResolver resolver= new PathMatchingResourcePatternResolver();
        Resource[] resources= resolver.getResources(
            "classpath*:com/zeus/baseddata/common/mybatis/mapping/*.xml");
        Resource[] dest= resolver.getResources(
            "classpath*:com/zeus/baseddata/commerce/mybatis/mapping/*.xml");
        return ArrayUtils.addAll(resources,dest);
    }
    
}
