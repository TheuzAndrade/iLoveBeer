package controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ItensDAO;
import model.Itens;

public class ItensControler {
	static EntityManagerFactory fac = Persistence.createEntityManagerFactory("ilovebeer");
	
	public void salvar(Itens itens) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			ItensDAO itensDAO = new ItensDAO(manager);
			itensDAO.salvar(itens);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void atualizar(Itens itens) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			ItensDAO itensDAO = new ItensDAO(manager);
			itensDAO.salvar(itens);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void remover(Itens itens) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			ItensDAO itensDAO = new ItensDAO(manager);
			itensDAO.salvar(itens);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
}