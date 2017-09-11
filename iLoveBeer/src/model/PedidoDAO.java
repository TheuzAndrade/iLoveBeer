package model;

import javax.persistence.EntityManager;

import model.Pedido;

public class PedidoDAO extends AbstractDAO<Pedido> {
	
	public PedidoDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<Pedido> getEntityClass() {
		// TODO Auto-generated method stub
		return Pedido.class;
	}
	
}