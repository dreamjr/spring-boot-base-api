package com.dreamjr.baseapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // https://stackoverflow.com/questions/28324352/how-to-customise-the-jackson-json-mapper-implicitly-used-by-spring-boot
    @Override
    public void addFormatters(FormatterRegistry registry) {
        // registry.addConverter(new ContentTypeConverter());
    }
}
