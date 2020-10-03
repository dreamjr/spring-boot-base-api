package com.dreamjr.baseapi.controller;

import com.dreamjr.baseapi.domain.TestModel;
import com.dreamjr.baseapi.service.ITestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final ITestService testService;

    @GetMapping("/test1")
    public TestModel test1() {
        return testService.getTest1();
    }

    @GetMapping("/test2")
    public TestModel test2() {
        return testService.getTest2();
    }
}
