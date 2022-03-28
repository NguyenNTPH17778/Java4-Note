package BussinessLayer.IServiceBUS;

import java.util.List;

import org.apache.catalina.User;

import BussinessLayer.Entities.Admin;

public interface IServiceAdmin {
	public Admin add(Admin entity) throws Exception;
	public Admin delete(Admin entity) throws Exception;
	public Admin update(Admin entity) throws Exception;
	public List<Admin> selectAll(Admin entity) throws Exception;

	public Admin findAdmin (Admin eAdmin) ;
	public Admin loginAdmin (String user, String password);
}
