package BussinessLayer.ServiceBUS;

import java.util.List;

import BussinessLayer.Entities.Admin;
import BussinessLayer.IServiceBUS.IServiceAdmin;
import DataAccessLayer.ServiceAdmin;

public class ServiceDAO_Admin implements IServiceAdmin {
	 DataAccessLayer.ServiceAdmin emAdmin;
	 
	 public ServiceDAO_Admin() {
		 emAdmin= new ServiceAdmin(); 
	}
	 
	@Override
	public Admin add(Admin entity) throws Exception {
			return emAdmin.add(entity);
	}

	@Override
	public Admin delete(Admin entity) throws Exception {
		return emAdmin.delete(entity);
	}

	@Override
	public Admin update(Admin entity) throws Exception {
		return emAdmin.update(entity);
	}

	@Override
	public List<Admin> selectAll(Admin entity) throws Exception {
		return emAdmin.selectAll(entity);
	}

	@Override
	public Admin findAdmin(Admin eAdmin) {
		return emAdmin.findAdmin(eAdmin);
	}

	@Override
	public Admin loginAdmin(String user, String password) {
		
		return emAdmin.loginAdmin(user, password);
	}
	
}
