package fashiontraditional.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import fashiontraditional.com.vo.ProductVO;

@Entity(name = "ORDER_DETAIL")
public class OrderDetail {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private long id;
	@ManyToOne(targetEntity = Order.class)
	@JoinColumn(name = "ORDER_ID", referencedColumnName = "ID")
	private Order order;
	@ManyToOne(targetEntity = Product.class)
	@JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
	private Product product;
	@Column(name = "AMOUNT")
	private int amount;
	@Column(name = "SIZE")
	private int size;
	@Column(name = "COLOR")
	private String color;
	@Column(name = "SUM_MONEY")
	private double sumMoney;

	public double getSumMoney() {
		return sumMoney;
	}

	public void setSumMoney(double sumMoney) {
		this.sumMoney = sumMoney;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean plusAmount() {
		this.amount++;
		this.sumMoney += product.getPrice();
		return true;

	}

	public boolean equals(OrderDetail orderDetail) {
		boolean result = false;
		if ((this.product.getId() == orderDetail.product.getId())
				&& (this.color.equalsIgnoreCase(orderDetail.color))
				&& (this.size == orderDetail.size)) {
			result = true;
		}
		return result;
	}

	public void updateData(OrderDetail orderDetail) {
		if (orderDetail.amount <= 0)
			this.amount = 1;
		else
			this.amount = orderDetail.amount;

	}

	public double sumMoney() {

		return this.product.getPrice() * amount;
	}

}
