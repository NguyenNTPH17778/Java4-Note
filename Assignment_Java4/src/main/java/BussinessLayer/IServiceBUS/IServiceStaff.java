package BussinessLayer.IServiceBUS;

import java.util.List;


import BussinessLayer.Entities.Staff;

public interface IServiceStaff {
	public Staff  add(Staff entity) throws Exception;
	public Staff delete(Staff entity) throws Exception;
	public Staff update(Staff entity) throws Exception;
	public List<Staff> selectAll(Staff entity) throws Exception;
	public Staff selectById(Staff entity) throws Exception;
}
