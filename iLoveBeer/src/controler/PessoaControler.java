package controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.PessoaDAO;
import model.Pessoa;

public class PessoaControler {
	static EntityManagerFactory fac = Persistence.createEntityManagerFactory("ilovebeer");
	
	public void salvar(Pessoa pessoa) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			PessoaDAO pessoaDAO = new PessoaDAO(manager);
			pessoaDAO.salvar(pessoa);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void atualizar(Pessoa pessoa) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			PessoaDAO pessoaDAO = new PessoaDAO(manager);
			pessoaDAO.salvar(pessoa);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void remover(Pessoa pessoa) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			PessoaDAO pessoaDAO = new PessoaDAO(manager);
			pessoaDAO.salvar(pessoa);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}

}