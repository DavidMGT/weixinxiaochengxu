package com.demo.demo.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.beans.PropertyVetoException;
@MapperScan("com.demo.demo.dao")
@Configuration
public class DataSourceConfiguration {
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.password}")
    private String jdbcPassWord;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Bean(name = "dataSource")
    public ComboPooledDataSource createDataSource(){
    ComboPooledDataSource dataSource=new ComboPooledDataSource();
        try {
            dataSource.setDriverClass(jdbcDriver);
            dataSource.setJdbcUrl(jdbcUrl);
            dataSource.setUser(jdbcUsername);
            dataSource.setPassword(jdbcPassWord);
            dataSource.setAutoCommitOnClose(false);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }

    return dataSource;
}

}
