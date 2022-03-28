package BussinessLayer.ServiceBUS;

import java.util.List;

import BussinessLayer.Entities.Staff;
import BussinessLayer.IServiceBUS.IServiceStaff;
import DataAccessLayer.ServiceStaff;

public class ServiceDAO_Staff implements IServiceStaff {
	DataAccessLayer.ServiceStaff svStaff;
	
	public ServiceDAO_Staff() {
		svStaff = new ServiceStaff();
	}
	@Override
	public Staff add(Staff entity) throws Exception {
		// TODO Auto-generated method stub
		return svStaff.add(entity);
	}

	@Override
	public Staff delete(Staff entity) throws Exception {
		// TODO Auto-generated method stub
		return svStaff.delete(entity);
	}

	@Override
	public Staff update(Staff entity) throws Exception {
		// TODO Auto-generated method stub
		return svStaff.update(entity);
	}

	@Override
	public List<Staff> selectAll(Staff entity) throws Exception {
		// TODO Auto-generated method stub
		return svStaff.selectAll(entity);
	}

	@Override
	public Staff selectById(Staff entity) throws Exception {
		// TODO Auto-generated method stub
		return svStaff.selectById(entity);
	}

}
