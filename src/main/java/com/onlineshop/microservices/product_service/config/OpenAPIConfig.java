package com.onlineshop.microservices.product_service.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI productServiceAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Product Service API")
                        .description("Product Service API documentation")
                        .version("v1.0.0")
                        .license(new License().name("Apachae 2.0")))
                .externalDocs(new ExternalDocumentation()
                        .description("You can refer to the product service wiki documentation")
                        .url("https://product-service-dummy-url.com/docs"));

    }
}
