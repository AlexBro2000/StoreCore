package com.soft.storecore.core.config;

import com.soft.storecore.core.config.strategy.ConfigurationFetchingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class CoreBeanContext {

    @Resource
    private ConfigurationFetchingStrategy databaseConfigurationFetchingStrategy;
    @Resource
    private ConfigurationFetchingStrategy propertiesConfigurationFetchingStrategy;

    @Bean
    public List<ConfigurationFetchingStrategy> configurationFetchingStrategies(){
        List<ConfigurationFetchingStrategy> strategies = new ArrayList<>();
        strategies.add(databaseConfigurationFetchingStrategy);
        strategies.add(propertiesConfigurationFetchingStrategy);
        return strategies;
    }
}
