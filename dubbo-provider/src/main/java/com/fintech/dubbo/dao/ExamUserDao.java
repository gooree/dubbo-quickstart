package com.fintech.dubbo.dao;

import com.fintech.dubbo.entity.ExamUser;

public interface ExamUserDao extends BaseDao<Long, ExamUser> {

	ExamUser findUserByUserName(String userName);

}