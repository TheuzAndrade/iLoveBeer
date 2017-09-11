package model;

import javax.persistence.EntityManager;

import model.Admin;

public class AdminDAO extends AbstractDAO<Admin> {
	
	public AdminDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<Admin> getEntityClass() {
		return Admin.class;
	}
	
}