package com.whfstudio.graphbed.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@MapperScan(basePackages = "com.whfstudio.graphbed.provider.dao")
@EnableAutoConfiguration
public class GraphBedProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GraphBedProviderApplication.class)
                .run(args);
    }
}