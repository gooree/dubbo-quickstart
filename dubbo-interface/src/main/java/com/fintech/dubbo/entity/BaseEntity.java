package com.fintech.dubbo.entity;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseEntity implements Serializable {

	/**
	 * 实体ID
	 */
	protected long id;
	
	/**
	 * 记录有效标志
	 */
	protected String validFlag;

	/**
	 * 记录创建者
	 */
	protected String createdBy;

	/**
	 * 记录创建时间
	 */
	protected Date createdTs;

	/**
	 * 记录最后更新者
	 */
	protected String lastUpdBy;

	/**
	 * 记录最后更新时间
	 */
	protected Date lastUpdTs;

	/**
	 * 记录被修改次数
	 */
	protected Long modiNum;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTs() {
		return createdTs;
	}

	public void setCreatedTs(Date createdTs) {
		this.createdTs = createdTs;
	}

	public String getLastUpdBy() {
		return lastUpdBy;
	}

	public void setLastUpdBy(String lastUpdBy) {
		this.lastUpdBy = lastUpdBy;
	}

	public Date getLastUpdTs() {
		return lastUpdTs;
	}

	public void setLastUpdTs(Date lastUpdTs) {
		this.lastUpdTs = lastUpdTs;
	}

	public Long getModiNum() {
		return modiNum;
	}

	public void setModiNum(Long modiNum) {
		this.modiNum = modiNum;
	}
	
}
