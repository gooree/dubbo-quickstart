package com.fintech.dubbo.service;

import java.util.List;

import com.fintech.dubbo.entity.ExamUser;

public interface ExamUserService {
	
	public ExamUser get(String id);

	public void save(ExamUser user);

	public void update(ExamUser user);

	public void delete(List<Long> ids);

	public ExamUser findUserByUserName(String userName);
}