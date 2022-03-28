package DataAccessLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import BussinessLayer.Entities.Product;
import BussinessLayer.IServiceBUS.IServiceProduct;
import BussinessLayer.Utils.JpaUtil;

public class ServiceProduct implements IServiceProduct{
	EntityManager em;
	
	public ServiceProduct() {
		em= JpaUtil.createEntityManager();
	}
	@Override
	public Product add(Product entity) throws Exception {
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
	public Product delete(Product entity) throws Exception {
		try {
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().commit();
			
			return entity;
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw e;
		}
	}

	@Override
	public Product update(Product entity) throws Exception {
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
	public List<Product> selectAll(Product entity) throws Exception {
		String query = "Select obj from Product obj";
		TypedQuery<Product> list = em.createNamedQuery(query,Product.class);
		
		return list.getResultList();
	}

	@Override
	public Product selectById(Product entity) throws Exception {
		Product prd = em.find(Product.class, entity);
		return prd;
	}

}
