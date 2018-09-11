package com.fintech.dubbo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.fintech.dubbo.dao.ExamUserDao;
import com.fintech.dubbo.entity.ExamUser;

@Service(timeout = 300, executes = 100, retries = 3, actives = 0, version = "1.0.0", group = "dev")
public class ExamUserServiceImpl implements ExamUserService {
	
	private static final Logger logger = LoggerFactory.getLogger(ExamUserServiceImpl.class);
	
	@Autowired
	private ExamUserDao examUserDao;

	public void delete(List<Long> ids) {
		for(Long id: ids) {
			examUserDao.delete(id);
		}
	}

	@Override
	public void save(ExamUser user) {
		examUserDao.save(user);
	}

	@Override
	public void update(ExamUser user) {
		examUserDao.update(user);
	}

	@Override
	public ExamUser get(String id) {
		return examUserDao.get(Long.parseLong(id));
	}

	@Override
	public ExamUser findUserByUserName(String userName) {
		return examUserDao.findUserByUserName(userName);
	}
	
}
