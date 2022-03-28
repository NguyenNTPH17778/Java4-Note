package DataAccessLayer;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import BussinessLayer.Entities.Staff;
import BussinessLayer.IServiceBUS.IServiceStaff;
import BussinessLayer.Utils.JpaUtil;

public class ServiceStaff implements IServiceStaff {
	 EntityManager em;
	 
	 public ServiceStaff() {
		em = JpaUtil.createEntityManager();
	}
	@Override
	public Staff add(Staff entity) throws Exception {
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
	public Staff delete(Staff entity) throws Exception {
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
	public Staff update(Staff entity) throws Exception {
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
	public List<Staff> selectAll(Staff entity) throws Exception {
		String query = "Select obj from Staff obj";
		TypedQuery<Staff> list = em.createNamedQuery(query,Staff.class);
		return list.getResultList();
	}

	@Override
	public Staff selectById(Staff entity) throws Exception {
		Staff stf = em.find(Staff.class, entity);
		return stf;
	}

}
