package controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.PedidoDAO;
import model.Pedido;

public class PedidoControler {
	static EntityManagerFactory fac = Persistence.createEntityManagerFactory("ilovebeer");
	
	public void salvar(Pedido pedido) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			PedidoDAO pedidoDAO = new PedidoDAO(manager);
			pedidoDAO.salvar(pedido);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void atualizar(Pedido pedido) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			PedidoDAO pedidoDAO = new PedidoDAO(manager);
			pedidoDAO.salvar(pedido);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void remover(Pedido pedido) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			PedidoDAO pedidoDAO = new PedidoDAO(manager);
			pedidoDAO.salvar(pedido);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}

}