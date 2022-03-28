package BussinessLayer.IServiceBUS;

import java.util.List;


import BussinessLayer.Entities.Product;

public interface IServiceProduct {
	public Product  add(Product entity) throws Exception;
	public Product delete(Product entity) throws Exception;
	public Product update(Product entity) throws Exception;
	public List<Product> selectAll(Product entity) throws Exception;
	public Product selectById(Product entity)throws Exception;
}
