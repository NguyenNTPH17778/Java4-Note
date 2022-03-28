package BussinessLayer.Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil  {
	public static EntityManagerFactory getFactory() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Assignment_Java4");
		
		return factory;
	}
	
	public static EntityManager createEntityManager() {
		EntityManager em = getFactory().createEntityManager();
		return em;
	}

	
}
