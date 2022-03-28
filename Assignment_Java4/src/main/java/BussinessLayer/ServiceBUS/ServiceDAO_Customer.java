package BussinessLayer.ServiceBUS;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.TypedQuery;

import BussinessLayer.Entities.Customer;
import BussinessLayer.IServiceBUS.IServiceCustomer;
import DataAccessLayer.ServiceCustomer;

public class ServiceDAO_Customer implements IServiceCustomer{
	DataAccessLayer.ServiceCustomer svCustomer;
	
	public ServiceDAO_Customer() {
		svCustomer = new ServiceCustomer();
	}
	@Override
	public Customer add(Customer entity) throws Exception {
		// TODO Auto-generated method stub
		return svCustomer.add(entity);
	}

	@Override
	public Customer delete(Customer entity) throws Exception {
		// TODO Auto-generated method stub
		return svCustomer.delete(entity);
	}

	@Override
	public Customer update(Customer entity) throws Exception {
		// TODO Auto-generated method stub
		return svCustomer.update(entity);
	}

	@Override
	public List<Customer> selectAll(Customer entity) throws Exception {
		return svCustomer.selectAll(entity);
	}

	@Override
	public Customer selectById(Customer entity) throws Exception {
		// TODO Auto-generated method stub
		return svCustomer.selectById(entity);
	}

}
