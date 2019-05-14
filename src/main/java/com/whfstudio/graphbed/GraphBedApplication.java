package com.whfstudio.graphbed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.chelaile.apptrack.dao")
public class GraphBedApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphBedApplication.class, args);
	}

}
