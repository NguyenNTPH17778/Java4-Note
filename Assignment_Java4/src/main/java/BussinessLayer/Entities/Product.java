package BussinessLayer.Entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_sp")
	private int idSp;

	private float gia;

	@Lob
	private String mota;

	private int soluong;

	@Lob
	@Column(name="ten_sp")
	private String tenSp;

	//bi-directional many-to-one association to Bill
	@OneToMany(mappedBy="product")
	private List<Bill> bills;

	//bi-directional many-to-one association to Staff
	@ManyToOne
	@JoinColumn(name="id_nv")
	private Staff staff;

	public Product() {
	}

	public int getIdSp() {
		return this.idSp;
	}

	public void setIdSp(int idSp) {
		this.idSp = idSp;
	}

	public float getGia() {
		return this.gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public String getMota() {
		return this.mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public int getSoluong() {
		return this.soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public String getTenSp() {
		return this.tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public List<Bill> getBills() {
		return this.bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}

	public Bill addBill(Bill bill) {
		getBills().add(bill);
		bill.setProduct(this);

		return bill;
	}

	public Bill removeBill(Bill bill) {
		getBills().remove(bill);
		bill.setProduct(null);

		return bill;
	}

	public Staff getStaff() {
		return this.staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

}