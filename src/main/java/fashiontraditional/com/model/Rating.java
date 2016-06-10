package fashiontraditional.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "RATING")
public class Rating {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	private User user;
	@ManyToOne(targetEntity = Product.class)
	@JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
	private Product product;
	@Column(name = "RATE")
	private short rate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public short getRate() {
		return rate;
	}

	public void setRate(short rate) {
		this.rate = rate;
	}

}
