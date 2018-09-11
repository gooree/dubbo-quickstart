package com.fintech.dubbo.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<PK extends Serializable, E> {

	/**
	 * 获取单条数据
	 * 
	 * @param id
	 * @return
	 */
	public E get(PK pk);

	/**
	 * 查询所有数据列表
	 * 
	 * @param entity
	 * @return
	 */
	public List<E> findAll();

	/**
	 * 插入数据
	 * 
	 * @param entity
	 * @return
	 */
	public int save(E entity);

	/**
	 * 更新数据
	 * 
	 * @param entity
	 * @return
	 */
	public int update(E entity);

	/**
	 * 删除数据
	 * 
	 * @param entity
	 * @return
	 */
	public int delete(PK pk);

}
