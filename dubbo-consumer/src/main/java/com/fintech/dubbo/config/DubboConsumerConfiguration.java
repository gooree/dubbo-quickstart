package com.fintech.dubbo.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;

@Configuration
@EnableConfigurationProperties(DubboConsumerProperties.class)
public class DubboConsumerConfiguration {

	private final DubboConsumerProperties properties;
	
	public DubboConsumerConfiguration(DubboConsumerProperties properties) {
		this.properties = properties;
	}
	
	@Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(properties.getApplication().getName());
        return applicationConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(properties.getConsumer().getTimeout());
        return consumerConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(properties.getRegistry().getAddress());
        registryConfig.setClient(properties.getRegistry().getClient());
        return registryConfig;
    }
    
}
