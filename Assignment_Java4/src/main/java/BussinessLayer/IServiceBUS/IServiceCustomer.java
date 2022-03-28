package BussinessLayer.IServiceBUS;

import java.util.List;

import BussinessLayer.Entities.Customer;


	public interface IServiceCustomer {
	public Customer  add(Customer entity) throws Exception;
	public Customer delete(Customer entity) throws Exception;
	public Customer update(Customer entity) throws Exception;
	public List<Customer> selectAll(Customer entity) throws Exception;
	public Customer selectById(Customer entity) throws Exception;
}
