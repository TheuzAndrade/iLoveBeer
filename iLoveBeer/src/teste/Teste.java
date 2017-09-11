package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {

	public static void main(String[] args) {

		EntityManagerFactory fac = Persistence.createEntityManagerFactory("ilovebeer");
		EntityManager manager = fac.createEntityManager();

	}

}
