package com.ejemplo.pedidoservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import feign.Logger;

@Configuration
@EnableFeignClients(basePackages = "com.ejemplo.pedidoservice.client")
public class FeignConfig {
    
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
} 