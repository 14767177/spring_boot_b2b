package com.casic.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.Map;

/**
 * @author LRN
 * 参考xml写配置文件
 */
@Configuration
public class TransactionManagerConfig {

    @Autowired
    private DataSource dataSource;

    @Bean(name = "transactionManager")
    @Primary
    public DataSourceTransactionManager addTransactionManagerConfig(DataSource dataSource){
        DruidDataSource datasources = (DruidDataSource)dataSource;
        Map<String, Object> statData = datasources.getStatDataForMBean();
        Object maxActive = statData.get("MaxActive");
        System.out.println(maxActive+"------------------");
        return new DataSourceTransactionManager(dataSource);
    }
}
