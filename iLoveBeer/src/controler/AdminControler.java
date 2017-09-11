package controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.AdminDAO;
import model.Admin;

public class AdminControler {
	static EntityManagerFactory fac = Persistence.createEntityManagerFactory("ILoveBeer");

	public void salvar(Admin admin) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			AdminDAO adminDAO = new AdminDAO(manager);
			adminDAO.salvar(admin);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void atualizar(Admin admin) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			AdminDAO adminDAO = new AdminDAO(manager);
			adminDAO.salvar(admin);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void remover(Admin admin) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			AdminDAO adminDAO = new AdminDAO(manager);
			adminDAO.salvar(admin);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
}