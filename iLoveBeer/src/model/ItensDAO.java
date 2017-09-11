package model;

import javax.persistence.EntityManager;

import model.Itens;

public class ItensDAO extends AbstractDAO<Itens> {

	public ItensDAO(EntityManager manager) {
		super(manager);
	}
	
	@Override
	public Class<Itens> getEntityClass() {
		// TODO Auto-generated method stub
		return Itens.class;
	}
	
}