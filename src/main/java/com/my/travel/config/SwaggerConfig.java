package com.my.travel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: YANG
 * Date: 2020/11/10
 */

@Configuration
@EnableSwagger2       // 开启swagger
public class SwaggerConfig {

    // 配置swagger的docket的bean实例
    @Bean
    public Docket testDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("myname")
                .apiInfo(apiInfo())
                .enable(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.my.travel.controller"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo("Title "
                , "swagger-demo"
                , "1.0"
                , "http://terms.service.url/"
                , new Contact("万千星辉不及你", "https://github.com/yy202901582/", "neko_star@foxmail.com")
                , "Apache 2.0"
                , "http://www.apache.org/licenses/LICENSE-2.0"
                , new ArrayList());

    }
}
