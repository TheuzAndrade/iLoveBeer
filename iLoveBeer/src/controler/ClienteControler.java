package controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ClienteDAO;
import model.Cliente;

public class ClienteControler {
	static EntityManagerFactory fac = Persistence.createEntityManagerFactory("ilovebeer");
	
	public void salvar(Cliente cliente) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			ClienteDAO clienteDAO = new ClienteDAO(manager);
			clienteDAO.salvar(cliente);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void atualizar(Cliente cliente) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			ClienteDAO clienteDAO = new ClienteDAO(manager);
			clienteDAO.salvar(cliente);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void remover(Cliente cliente) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			ClienteDAO clienteDAO = new ClienteDAO(manager);
			clienteDAO.salvar(cliente);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}

}