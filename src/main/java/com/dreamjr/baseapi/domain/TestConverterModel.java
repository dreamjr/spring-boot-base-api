package com.dreamjr.baseapi.domain;

import com.dreamjr.baseapi.domain.converter.Content;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TestConverterModel {
    private long id;
    private Content content;
}
