package com.picsauditing.lms.common.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDAO<E, ID> implements DAO<E, ID> {

	@PersistenceContext
	protected EntityManager em;

	protected Class<E> type;

	@Override
	public E save(E entity) {
		em.persist(entity);
		em.flush();
		return entity;
	}

	@Override
	public E findById(ID id) {
		return em.find(type, id);
	}

	@Override
	public E update(E entity) {
		entity = em.merge(entity);
		em.flush();
		return entity;
	}

	@Override
	public void delete(E entity) {
		em.remove(entity);
		em.flush();
	}
}
