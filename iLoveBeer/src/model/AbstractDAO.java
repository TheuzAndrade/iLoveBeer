package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.AbstractEntity;

public abstract class AbstractDAO<T extends AbstractEntity> {
	EntityManager manager;
	
	public abstract Class<T> getEntityClass();
	
	public AbstractDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	public void salvar(T entity) {
		manager.persist(entity);
	}
	
	public void atualizar(T entity) {
		manager.merge(entity);
	}
	
	public void remover(T entity) {
		entity = manager.find(getEntityClass(), entity.getId());
		manager.remove(entity);
	}
	
	public T buscarPorId(Long id) {
		return manager.find(getEntityClass(), id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listar() {
		Query query = manager.createQuery("select c from "+ getEntityClass().getSimpleName() + " c");
		return query.getResultList();

	}

}