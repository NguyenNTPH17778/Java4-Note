package BussinessLayer.ServiceBUS;

import java.util.List;

import BussinessLayer.Entities.Bill;
import BussinessLayer.IServiceBUS.IServiceBill;
import DataAccessLayer.ServiceBill;

public class ServiceDAO_Bill implements IServiceBill {
	DataAccessLayer.ServiceBill svBill;
	
	public ServiceDAO_Bill() {
		svBill = new ServiceBill();
	}
	@Override
	public Bill add(Bill entity) throws Exception {
		
		return svBill.add(entity);
	}

	@Override
	public Bill delete(Bill entity) throws Exception {
		return svBill.delete(entity);
	}

	@Override
	public Bill update(Bill entity) throws Exception {
		// TODO Auto-generated method stub
		return svBill.update(entity);
	}

	@Override
	public List<Bill> selectAll(Bill entity) throws Exception {
		// TODO Auto-generated method stub
		return svBill.selectAll(entity);
	}

	@Override
	public Bill selectById(Bill entity) throws Exception {
		return svBill.selectById(entity);
	}

}
