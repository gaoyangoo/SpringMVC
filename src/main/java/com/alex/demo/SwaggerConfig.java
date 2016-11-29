package com.alex.demo;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.models.dto.builder.ApiInfoBuilder;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yang_gao on 2016/11/16.
 */

@Configuration
@EnableSwagger
public class SwaggerConfig {

    private SpringSwaggerConfig springSwaggerConfig;

    @Autowired
    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig){
        this.springSwaggerConfig = springSwaggerConfig;
    }

    @Bean
    public SwaggerSpringMvcPlugin config(){
        System.out.println("run the config swagger for set apiInfo");
        SwaggerSpringMvcPlugin plugin = new SwaggerSpringMvcPlugin(this.springSwaggerConfig);
        ApiInfo apiInfo = this.getApiInfo();
        plugin.apiInfo(apiInfo)
                .apiVersion("1.0")
                .includePatterns("/*.*")
                .swaggerGroup("v1");
        plugin.useDefaultResponseMessages(false);
        return plugin;
    }

    private ApiInfo getApiInfo() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("CRM Restful API")
                .description("CRM 系统后端API")
                .termsOfServiceUrl("http://example.com/terms-of-service")
                .contact("yang_gao@Ctrip.com")
                .license("MIT License")
                .licenseUrl("http://opensource.org/licenses/MIT")
                .build();
        return apiInfo;
    }
}
