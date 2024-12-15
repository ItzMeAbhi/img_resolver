package com.test.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Map all /imgs/** requests to the uploads/images folder
        registry.addResourceHandler("/imgs/**")
                .addResourceLocations("file:uploads/images/");
    }
}
