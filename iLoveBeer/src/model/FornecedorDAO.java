package model;

import javax.persistence.EntityManager;

import model.Fornecedor;

public class FornecedorDAO extends AbstractDAO<Fornecedor> {
	
	public FornecedorDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<Fornecedor> getEntityClass() {
		// TODO Auto-generated method stub
		return Fornecedor.class;
	}
	
}