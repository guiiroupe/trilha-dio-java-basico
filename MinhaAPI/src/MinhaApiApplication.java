package com.empresa.minhaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.SwaggerUiConfigParameters;

@SpringBootApplication
public class MinhaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinhaApiApplication.class, args);
    }

    // Configuração do OpenAPI (Springdoc OpenAPI)
    @Bean
    public GroupedOpenApi groupedOpenApi() {
        return GroupedOpenApi.builder()
                .group("api")
                .pathsToMatch("/api/**")
                .build();
    }
}
