package com.dreamjr.baseapi.service;

import com.dreamjr.baseapi.domain.TestModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService implements ITestService{

    @Override
    public TestModel getTest1() {
        log.info("### getTest1 service info ###");
        log.debug("### getTest1 service debug ###");
        log.error("### getTest1 service error");
        return new TestModel(1, "content-1");
    }

    @Override
    public TestModel getTest2() {
        log.info("### getTest2 info ###");
        log.debug("### getTest2 debug ###");
        return new TestModel(2, "content-2");
    }
}
