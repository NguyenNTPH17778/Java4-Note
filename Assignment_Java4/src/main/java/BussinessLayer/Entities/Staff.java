package BussinessLayer.Entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the staffs database table.
 * 
 */
@Entity
@Table(name="staffs")
@NamedQuery(name="Staff.findAll", query="SELECT s FROM Staff s")
public class Staff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_nv")
	private int idNv;

	@Lob
	private String diachi;

	@Lob
	private String email;

	@Lob
	private String gioitinh;

	@Lob
	private String hoten;

	private String password;

	@Lob
	private String sdt;

	private int trangthai;

	//bi-directional many-to-one association to Customer
	@OneToMany(mappedBy="staff")
	private List<Customer> customers;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="staff")
	private List<Product> products;

	//bi-directional many-to-one association to Admin
	@ManyToOne
	@JoinColumn(name="id_ad")
	private Admin admin;

	public Staff() {
	}

	public int getIdNv() {
		return this.idNv;
	}

	public void setIdNv(int idNv) {
		this.idNv = idNv;
	}

	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGioitinh() {
		return this.gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getHoten() {
		return this.hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public int getTrangthai() {
		return this.trangthai;
	}

	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}

	public List<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer addCustomer(Customer customer) {
		getCustomers().add(customer);
		customer.setStaff(this);

		return customer;
	}

	public Customer removeCustomer(Customer customer) {
		getCustomers().remove(customer);
		customer.setStaff(null);

		return customer;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setStaff(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setStaff(null);

		return product;
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}