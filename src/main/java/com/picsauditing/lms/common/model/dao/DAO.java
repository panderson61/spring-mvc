package com.picsauditing.lms.common.model.dao;

public interface DAO<E, ID> {

	E save(E entity);

	E findById(ID id);

	E update(E entity);

	void delete(E entity);

}
