package com.fintech.dubbo;

import java.util.concurrent.CountDownLatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.fintech.dubbo")
public class DubboProviderApplication {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(1);
		try {
			SpringApplication.run(DubboProviderApplication.class, args);
			
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
