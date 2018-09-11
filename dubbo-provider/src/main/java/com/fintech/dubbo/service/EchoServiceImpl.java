package com.fintech.dubbo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;

@Service(timeout = 300, executes = 100, retries = 3, actives = 0, version = "1.0.0", group = "dev")
public class EchoServiceImpl implements EchoService {
	
	private static final Logger logger = LoggerFactory.getLogger(EchoServiceImpl.class);

	@Override
	public String echo(String msg) {
		logger.info("message: " + msg);
		return msg;
	}

}
