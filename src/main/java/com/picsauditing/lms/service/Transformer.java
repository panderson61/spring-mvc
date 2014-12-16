package com.picsauditing.lms.service;

public interface Transformer<E, M> {

	M transform(E entity);

}
