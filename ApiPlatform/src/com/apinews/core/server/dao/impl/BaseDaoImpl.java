package com.apinews.core.server.dao.impl;

import java.io.Serializable;
import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import com.apinews.core.server.dao.BaseDao;

@Transactional
public class BaseDaoImpl<T, ID extends Serializable> extends
		HibernateDaoSupport implements BaseDao<T, ID> {

	public void save(T entity) {
		this.getHibernateTemplate().save(entity);
	}

	public void delete(T entity) {
		this.getHibernateTemplate().delete(entity);
	}

	public void deleteById(Class<T> entityClass, ID id) {
		this.getHibernateTemplate().delete(getById(entityClass, id));
	}

	public void update(T entity) {
		this.getHibernateTemplate().update(entity);
	}

	public T getById(Class<T> entityClass, ID id) {
		return (T) this.getHibernateTemplate().get(entityClass, id);
	}

	public List<T> getAll(Class<T> entityClass) {
		return this.getHibernateTemplate().loadAll(entityClass);
	}
}