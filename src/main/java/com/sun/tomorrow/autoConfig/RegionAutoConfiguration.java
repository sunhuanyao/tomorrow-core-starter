package com.sun.tomorrow.autoConfig;


import com.sun.tomorrow.core.service.ApplicationRegionFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RegionProperties.class)
public class RegionAutoConfiguration {

    @Bean
    public ApplicationRegionFactory applicationRegionFactory(RegionProperties regionProperties){
        return new ApplicationRegionFactory(regionProperties.getFileName());
    }

}
