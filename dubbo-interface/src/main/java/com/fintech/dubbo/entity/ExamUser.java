package com.fintech.dubbo.entity;

public class ExamUser extends BaseEntity {
	
	private static final long serialVersionUID = 8866776940471304783L;

	private String userName;
	
	private String nickName;
	
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
