package com.dreamjr.baseapi.service;

import com.dreamjr.baseapi.domain.TestModel;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService{

    @Override
    public TestModel getTest1() {
        return new TestModel(1, "content-1");
    }

    @Override
    public TestModel getTest2() {
        return new TestModel(2, "content-2");
    }
}
