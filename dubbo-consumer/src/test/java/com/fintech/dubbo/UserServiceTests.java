package com.fintech.dubbo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fintech.dubbo.entity.ExamUser;
import com.fintech.dubbo.service.ExamUserService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboConsumerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class UserServiceTests {

	@Reference(version = "1.0.0", group = "dev", interfaceClass = com.fintech.dubbo.service.ExamUserService.class, timeout = 300, retries = 3, actives = 0)
	private ExamUserService userService;
	
	@Test
	public void testGet() {
		ExamUser user = userService.get("1");
		Assert.assertEquals("admin", user.getUserName());
	}
	
	@Test
	public void testFindUserByUserName() {
		ExamUser user = userService.findUserByUserName("admin");
		Assert.assertEquals("123456", user.getPassword());
	}
	
	@Test
	public void testSave() {
		ExamUser user = new ExamUser();
		user.setUserName("dubbo");
		user.setNickName("dubbo");
		user.setPassword("888888");
		user.setValidFlag("1");
		userService.save(user);
		user = userService.findUserByUserName("dubbo");
		Assert.assertEquals("888888", user.getPassword());
	}
	
}
