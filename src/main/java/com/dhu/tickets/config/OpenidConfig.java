package com.dhu.tickets.config;

/**
 * @Author: Catherine
 */
import com.dhu.tickets.interceptor.OpenidInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class OpenidConfig implements WebMvcConfigurer {

    @Bean
    public OpenidInterceptor getSessionInterceptor(){
        return new OpenidInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getSessionInterceptor())
                .addPathPatterns("/user/userInfoById",
                        "/user/userInfoByName",
                        "/user/userInfoByPhone",
                        "/user/userSign",
                        "/user/getUser");
    }
}
