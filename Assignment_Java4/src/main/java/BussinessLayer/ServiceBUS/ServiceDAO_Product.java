package BussinessLayer.ServiceBUS;

import java.util.List;

import BussinessLayer.Entities.Product;
import BussinessLayer.IServiceBUS.IServiceProduct;
import DataAccessLayer.ServiceProduct;

public class ServiceDAO_Product implements IServiceProduct {
	DataAccessLayer.ServiceProduct svProduct;
	
	public ServiceDAO_Product() {
		svProduct = new ServiceProduct();
	}
	
	@Override
	public Product add(Product entity) throws Exception {
		// TODO Auto-generated method stub
		return svProduct.add(entity);
	}

	@Override
	public Product delete(Product entity) throws Exception {
		// TODO Auto-generated method stub
		return svProduct.delete(entity);
	}

	@Override
	public Product update(Product entity) throws Exception {
		// TODO Auto-generated method stub
		return svProduct.update(entity);
	}

	@Override
	public List<Product> selectAll(Product entity) throws Exception {
		// TODO Auto-generated method stub
		return svProduct.selectAll(entity);
	}

	@Override
	public Product selectById(Product entity) throws Exception {
		// TODO Auto-generated method stub
		return svProduct.selectById(entity);
	}

}
