package com.fintech.dubbo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;

@Service(timeout = 5000)
public class EchoServiceImpl implements EchoService {
	
	private static final Logger logger = LoggerFactory.getLogger(EchoServiceImpl.class);

	@Override
	public String echo(String msg) {
		logger.info("message: " + msg);
		return msg;
	}

}
