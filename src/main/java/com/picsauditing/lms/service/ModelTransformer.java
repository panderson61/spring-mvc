package com.picsauditing.lms.service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

class ModelTransformer<E, M> implements Transformer<E, M> {

	@Autowired
	private Map<Class<E>, ModelTransformer<E, M>> transformerRegistry;

	@Override
	public M transform(E entity) {
		return transformerRegistry.get(entity.getClass()).transform(entity);
	}
}
