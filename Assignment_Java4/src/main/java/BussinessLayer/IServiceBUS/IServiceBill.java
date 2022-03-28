package BussinessLayer.IServiceBUS;

import java.util.List;

import BussinessLayer.Entities.Bill;


public interface IServiceBill {
	public Bill  add(Bill entity) throws Exception;
	public Bill delete(Bill entity) throws Exception;
	public Bill update(Bill entity) throws Exception;
	public List<Bill> selectAll(Bill entity) throws Exception;
	public Bill selectById(Bill entity) throws Exception;
}
