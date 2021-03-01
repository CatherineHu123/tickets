package com.dhu.tickets;

import com.dhu.tickets.interceptor.TokenInterceptor;
import com.google.common.base.Predicates;
import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Api(description = "后台")
@Configuration
@EnableSwagger2
public class SwaggerConfig implements WebMvcConfigurer {
    @Bean
    public Docket webApiConfig() {

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
                .paths(Predicates.not(PathSelectors.regex("/admin/.*")))
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();

    }

    private ApiInfo webApiInfo() {

        return new ApiInfoBuilder()
                .title("tickets")
                .description("tickets")
                .version("1.0")
                .build();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        registry.addInterceptor(new TokenInterceptor()).addPathPatterns("/userLogin", "/adminLogin");
    }
}
