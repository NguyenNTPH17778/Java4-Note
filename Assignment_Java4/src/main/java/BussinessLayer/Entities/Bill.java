package BussinessLayer.Entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bills database table.
 * 
 */
@Entity
@Table(name="bills")
@NamedQuery(name="Bill.findAll", query="SELECT b FROM Bill b")
public class Bill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_b")
	private int idB;

	@Lob
	private String diachi;

	@Lob
	private String email;

	@Lob
	private String gioitinh;

	@Lob
	private String hoten;

	@Lob
	private String sdt;

	private int trangthai;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="id_sp")
	private Product product;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="id_kh")
	private Customer customer;

	public Bill() {
	}

	public int getIdB() {
		return this.idB;
	}

	public void setIdB(int idB) {
		this.idB = idB;
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

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}