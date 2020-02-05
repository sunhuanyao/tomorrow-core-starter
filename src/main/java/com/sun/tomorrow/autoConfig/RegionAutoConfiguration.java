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
        if(regionProperties == null || regionProperties.getFileName() == null){
            return new ApplicationRegionFactory();
        }
        return new ApplicationRegionFactory(regionProperties.getFileName());
    }

}
