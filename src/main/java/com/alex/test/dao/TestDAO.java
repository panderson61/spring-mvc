package com.alex.test.dao;

import com.alex.test.entity.Test;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TestDAO {

	@PersistenceContext
	protected EntityManager em;

	@Transactional
	public Test save(Test test) {
		em.persist(test);
		em.flush();
		return test;
	}

}
