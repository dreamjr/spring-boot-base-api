package com.dreamjr.baseapi.config;

import com.dreamjr.baseapi.domain.converter.Content;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ContentTypeConverter implements Converter<String, Content> {
    private static long id = 0L;

    @Override
    public Content convert(String value) {
        id++;
        return new Content(id, value + " #222");
    }
}
