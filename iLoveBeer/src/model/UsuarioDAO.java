package model;

import javax.persistence.EntityManager;

import model.Usuario;

public class UsuarioDAO extends AbstractDAO<Usuario> {
	
	public UsuarioDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<Usuario> getEntityClass() {
		// TODO Auto-generated method stub
		return Usuario.class;
	}
	
}