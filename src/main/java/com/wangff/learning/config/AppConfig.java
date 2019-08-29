package com.wangff.learning.config;

import org.springframework.context.annotation.*;

/**
 * @author wangff
 * @date 2019/8/8 14:20
 */
@Configuration
@ComponentScan(basePackages="com.wangff.learning")
@PropertySource("classpath:rpc.properties")
public class AppConfig {
//    @Value("${registry.address}")
    private String registryAddress;

//    @Value("${server.address}")
    private String serverAddress;

//    @Bean(name = "serviceRegistry")
//    public ServiceRegistry serviceRegistry () {
//        return new ServiceRegistry(registryAddress);
//    }

//    @Bean(name = "rpcServer")
//    @DependsOn("serviceRegistry")
//    public RpcServer rpcServer (ServiceRegistry serviceRegistry) {
//        return new RpcServer(serverAddress,serviceRegistry);
//    }

}
