package com.company.businessdomain.context.common.resource.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 扫描
 *
 * @author only
 * @since 2020-05-22
 */
@Configuration
@AutoConfigureAfter(MyBatisConfig.class)
public class MapperScannerConfig {
    @Bean
    public MapperScannerConfigurer buildMapperScannerConfigurer() {
        MapperScannerConfigurer configure = new MapperScannerConfigurer();
        configure.setSqlSessionFactoryBeanName("sqlSessionFactory");
        configure.setBasePackage("com.company.system.common.resource.config");
        return configure;
    }
}
