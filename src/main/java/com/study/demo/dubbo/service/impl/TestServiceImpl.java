package com.study.demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.study.demo.dubbo.service.TestService;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("dubbo服务调用成功");
    }
}
