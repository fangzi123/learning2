package com.wangff.learning.server;

import com.nettyrpc.server.RpcService;
import com.wangff.learning.api.client.HelloService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }

}
