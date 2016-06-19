package fashiontraditional.com.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import fashiontraditional.com.model.Order;
import fashiontraditional.com.model.OrderDetail;
import fashiontraditional.com.model.Product;

@Entity
public class OrderBean implements Serializable {

	@Id
	private Long id;
	private String color;
	private Integer size;
	private String name;
	private String imageThumbnail;
	private Long productId;
	private int amount;
	private double price;
	private double sumMoney;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getImageThumbnail() {
		return imageThumbnail;
	}

	public void setImageThumbnail(String imageThumbnail) {
		this.imageThumbnail = imageThumbnail;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
		this.sumMoney = amount * price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public boolean plusAmount() {
		this.amount++;
		this.sumMoney += price;
		return true;

	}

	public boolean equals(OrderBean order) {
		boolean result = false;
		if ((productId == order.productId)
				&& (this.color.equalsIgnoreCase(order.color))
				&& (this.size == order.size)) {
			result = true;
		}
		return result;
	}

	public void updateData(OrderBean order) {
		if (order.amount <= 0)
			this.amount = 1;
		else
			this.amount = order.amount;

	}

	public void updateData(int amount) {
		if (amount <= 0)
			this.amount = 1;
		else
			this.amount = amount;

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		this.sumMoney = price * amount;
	}

	public double getSumMoney() {
		return sumMoney;
	}

	public double sumMoney() {

		return price * amount;
	}

	public boolean equals(long productId, String color, int size) {

		boolean result = false;
		if ((this.productId == productId)
				&& (this.color.equalsIgnoreCase(color)) && (this.size == size)) {
			result = true;
		}
		return result;
	}

}
