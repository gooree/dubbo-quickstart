package com.fintech.dubbo.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;

@Configuration
@EnableConfigurationProperties(DubboProviderProperties.class)
public class DubboProviderConfiguration {
	
	private final DubboProviderProperties properties;
	
	public DubboProviderConfiguration(DubboProviderProperties properties) {
		this.properties = properties;
	}

	@Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(properties.getApplication().getName());
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(properties.getRegistry().getAddress());
        registryConfig.setClient(properties.getRegistry().getClient());
        registryConfig.setCheck(properties.getRegistry().isCheck());
        registryConfig.setSubscribe(properties.getRegistry().isSubscribe());
        return registryConfig;
    }
    
    @Bean
    public ProtocolConfig protocolConfig() {
    	ProtocolConfig protocol = new ProtocolConfig();
    	protocol.setName(properties.getProtocol().getName());
    	protocol.setPort(properties.getProtocol().getPort());
    	protocol.setThreads(properties.getProtocol().getThreads());
    	return protocol;
    }
    
}
