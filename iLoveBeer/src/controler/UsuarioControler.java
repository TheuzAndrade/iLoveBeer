package controler;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.UsuarioDAO;
import model.Usuario;

public class UsuarioControler {
	static EntityManagerFactory fac = Persistence.createEntityManagerFactory("ilovebeer");
	
	public void salvar(Usuario usuario) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			UsuarioDAO usuarioDAO = new UsuarioDAO(manager);
			usuarioDAO.salvar(usuario);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void atualizar(Usuario usuario) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			UsuarioDAO usuarioDAO = new UsuarioDAO(manager);
			usuarioDAO.salvar(usuario);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}
	
	public void remover(Usuario usuario) {
		EntityManager manager = fac.createEntityManager();
		try {
			manager.getTransaction().begin();
			UsuarioDAO usuarioDAO = new UsuarioDAO(manager);
			usuarioDAO.salvar(usuario);
			manager.getTransaction().commit();	
		}catch(Exception e){
			manager.getTransaction().rollback();
		}
		finally{
			manager.close();
		}
	}

}