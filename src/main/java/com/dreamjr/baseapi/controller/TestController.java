package com.dreamjr.baseapi.controller;

import com.dreamjr.baseapi.domain.TestModel;
import com.dreamjr.baseapi.service.ITestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

    private final ITestService testService;

    @GetMapping("/test1")
    public TestModel test1() {
        log.info("!!! getTest1 controller info !!!");
        log.debug("!!! getTest1 controller debug !!!");
        log.error("!!! getTest1 controller error !!!");
        return testService.getTest1();
    }

    @GetMapping("/test2")
    public TestModel test2() {
        return testService.getTest2();
    }
}
