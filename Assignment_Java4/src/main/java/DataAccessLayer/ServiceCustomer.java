package DataAccessLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import BussinessLayer.Entities.Customer;
import BussinessLayer.IServiceBUS.IServiceCustomer;
import BussinessLayer.Utils.JpaUtil;

public class ServiceCustomer implements IServiceCustomer{
	EntityManager em;
	
	public ServiceCustomer() {
		em= JpaUtil.createEntityManager();
	}
	@Override
	public Customer add(Customer entity) throws Exception {
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
			
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			 throw e;
		}
	}

	@Override
	public Customer delete(Customer entity) throws Exception {
		try {
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().rollback();
			
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			 throw e;
		}
	}

	@Override
	public Customer update(Customer entity) throws Exception {
		try {
			em.getTransaction().begin();
			em.merge(entity);
			em.getTransaction().commit();
			
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw e;
			
		}
	}

	@Override
	public List<Customer> selectAll(Customer entity) throws Exception {
		String query = "Select obj from Customer";
		TypedQuery<Customer> list = em.createQuery(query, Customer.class);
		
		return list.getResultList();
	}

	@Override
	public Customer selectById(Customer entity) throws Exception {
		Customer ct = em.find(Customer.class, entity);
		return ct;
	}

}
