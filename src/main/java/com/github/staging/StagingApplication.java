package com.github.staging;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 项目启动
 * @author qiOrange
 * @version 1.00
 */
@MapperScan("com.github.staging.mapper")
@SpringBootApplication
public class StagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(StagingApplication.class, args);
	}

}
