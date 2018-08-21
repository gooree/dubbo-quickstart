package com.fintech.dubbo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fintech.dubbo.service.EchoService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboConsumerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class DubboConsumerApplicationTests {

	@Reference
	private EchoService echoService;
	
	@Test
	public void testEcho() {
		String msg = echoService.echo("Hello world!");
		Assert.assertEquals("Hello world!", msg);
	}
	
}
