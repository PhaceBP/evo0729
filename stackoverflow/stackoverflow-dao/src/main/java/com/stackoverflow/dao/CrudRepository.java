package com.stackoverflow.dao;

import java.io.Serializable;
import java.util.List;

import com.stackoverflow.domain.model.BusinessObject;

public interface CrudRepository<T extends BusinessObject<ID>, ID extends Serializable> {

	T getById(ID id);
	
	void save(T entity);
	
	List<T> getAll();
	
	void delete(T entity);
	
	
}
