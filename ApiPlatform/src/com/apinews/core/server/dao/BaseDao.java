package com.apinews.core.server.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T, ID extends Serializable> {

	public void save(T entity);

	public void delete(T entity);

	public void deleteById(Class<T> entityClass, ID id);

	public void update(T entity);

	public T getById(Class<T> entityClass, ID id);

	public List<T> getAll(Class<T> entityClass);
	
}
