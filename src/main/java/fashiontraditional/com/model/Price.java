package fashiontraditional.com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import fashiontraditional.com.model.enumType.Status;

@Entity(name = "PRICE")
public class Price implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -346517902644494774L;
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "DATE_START")
	@Temporal(TemporalType.DATE)
	private Date dateStart;
	@Column(name = "DATE_END")
	@Temporal(TemporalType.DATE)
	private Date dateEnd;
	@ManyToOne(targetEntity = Product.class)
	@JoinColumn(name="PRODUCT_ID", referencedColumnName="ID")
	private Product product;
	@Column(name = "STATUS")
	@Enumerated(EnumType.ORDINAL)
	private Status status;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}

	
}
