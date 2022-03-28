package DataAccessLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import BussinessLayer.Entities.Bill;
import BussinessLayer.IServiceBUS.IServiceBill;
import BussinessLayer.Utils.JpaUtil;

public class ServiceBill implements IServiceBill {
	
	EntityManager em ;
	
	public ServiceBill() {
		em = JpaUtil.createEntityManager();
	}
	
	@Override
	public Bill add(Bill entity) throws Exception {
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
	public Bill delete(Bill entity) throws Exception {
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
	public Bill update(Bill entity) throws Exception {
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
	public List<Bill> selectAll(Bill entity) throws Exception {
		String query= "Select obj Bill obj";
		TypedQuery<Bill> list = em.createQuery(query, Bill.class);
		return list.getResultList();
	}

	@Override
	public Bill selectById(Bill entity) throws Exception {
		Bill xBill = em.find(Bill.class, entity.getIdB());
		return xBill ;
	}

}
