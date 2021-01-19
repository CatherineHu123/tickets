package com.dhu.tickets;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@MapperScan("com.dhucst.tickets.mapper")
public class TicketsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketsApplication.class, args);

    }

    @Configuration
    public class CorsConfig {
        private CorsConfiguration buildConfig() {
            //声明跨域配置策略
            CorsConfiguration corsConfiguration = new CorsConfiguration();
            //添加允许的源
            corsConfiguration.addAllowedOrigin("*");
            //添加允许的请求头
            corsConfiguration.addAllowedHeader("*");
            //添加允许的方法
            corsConfiguration.addAllowedMethod("*");
            return corsConfiguration;
        }

        @Bean
        public CorsFilter corsFilter() {
            //跨域配置源
            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
            // 配置所有请求--注册跨域配置
            source.registerCorsConfiguration("/**", buildConfig());
            return new CorsFilter(source);
        }
    }

}