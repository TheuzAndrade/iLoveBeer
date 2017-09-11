package controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.FornecedorDAO;
import model.Fornecedor;

public class FornecedorControler {
	static EntityManagerFactory fac = Persistence.createEntityManagerFactory("ilovebeer");

	public void salvar(Fornecedor fornecedor) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			FornecedorDAO fornecedorDAO = new FornecedorDAO(manager);
			fornecedorDAO.salvar(fornecedor);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void atualizar(Fornecedor fornecedor) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			FornecedorDAO fornecedorDAO = new FornecedorDAO(manager);
			fornecedorDAO.salvar(fornecedor);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void remover(Fornecedor fornecedor) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			FornecedorDAO fornecedorDAO = new FornecedorDAO(manager);
			fornecedorDAO.salvar(fornecedor);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
}