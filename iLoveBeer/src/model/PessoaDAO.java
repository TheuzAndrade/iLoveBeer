package model;

import javax.persistence.EntityManager;

import model.Pessoa;

public class PessoaDAO extends AbstractDAO<Pessoa> {
	
	public PessoaDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<Pessoa> getEntityClass() {
		// TODO Auto-generated method stub
		return Pessoa.class;
	}
	
}