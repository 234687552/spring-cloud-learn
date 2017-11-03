package com.lzd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类
 * @author Administrator
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderServerApplication.class, args);
	}
}
