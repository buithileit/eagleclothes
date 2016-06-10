package fashiontraditional.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "COMMENT")
public class Comment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5808485698851484314L;
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
	@Column(name = "CONTENT")
	private String content;
	

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
