package com.stackoverflow.jpa.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.core.GenericTypeResolver;
import org.springframework.stereotype.Repository;

import com.stackoverflow.dao.CrudRepository;
import com.stackoverflow.domain.model.BusinessObject;


public abstract class JpaCrudRepository<T extends BusinessObject<ID>, ID extends Serializable>
		implements CrudRepository<T, ID> {

	@PersistenceContext
	private EntityManager em;

	private Class<T> genericType;

	@PostConstruct
	@SuppressWarnings("unchecked")
	public void init() {
		this.genericType = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), JpaCrudRepository.class);
	}

	@Override
	public T getById(ID id) {
		return em.find(genericType, id);
	}

	@Override
	public void save(T entity) {
		em.merge(entity);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() {

		StringBuilder b = new StringBuilder();
		b.append("SELECT e FROM ").append(genericType.getSimpleName()).append(" ").append("e");

		return em.createQuery(b.toString()).getResultList();
	}

	@Override
	public void delete(T entity) {
		entity.setIsActive(false);
		save(entity);
	}

}
