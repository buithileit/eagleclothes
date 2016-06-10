package fashiontraditional.com.vo;

import java.io.Serializable;

public class ProductVO implements Serializable {

	private long id;
	private int amount;
	private String color;
	private int size;
	private double money;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean plusAmount() {
		this.amount++;
		return true;

	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public boolean equals(ProductVO product) {
		boolean result = false;
		if ((this.id == product.id)
				&& (this.color.equalsIgnoreCase(product.color))
				&& (this.size == product.size)) {
			result = true;
		}
		return result;
	}

	public void updateData(ProductVO product) {
		if (product.size <= 0)
			this.size = 1;
		else
			this.size = product.size;

	}

	public double sumMoney() {

		return this.money * amount;
	}

}
