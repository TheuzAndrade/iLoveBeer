package model;

import javax.persistence.EntityManager;

import model.AbstractDAO;
import model.Cliente;

public class ClienteDAO extends AbstractDAO<Cliente> {

	public ClienteDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<Cliente> getEntityClass() {
		// TODO Auto-generated method stub
		return Cliente.class;
	}

}