package fashiontraditional.com.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import fashiontraditional.com.vo.ProductVO;

@Component("shopCart")
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShoppingCart implements Serializable {

	private List<OrderDetail> orderDetails = new LinkedList<OrderDetail>();
	private int size;

	public boolean addProduct(Product product, Integer amount) {
		for (OrderDetail item : orderDetails) {
			if (item.equals(product))
				return item.plusAmount();

		}
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setAmount(amount);
		orderDetail.setColor(product.getColor());
		orderDetail.setSize(product.getSize());
		orderDetail.setSumMoney(product.getPrice());
		orderDetail.setProduct(product);
		orderDetails.add(orderDetail);
		this.size++;
		return true;
	}

	public boolean removeProduct(ProductVO product) {
		for (OrderDetail item : orderDetails) {
			if (item.equals(product)) {
				orderDetails.remove(item);
				this.size--;
			}

		}
		return true;
	}

	public boolean updateProduct(OrderDetail orderDetail) {
		for (OrderDetail item : orderDetails) {
			if (item.equals(orderDetail))
				item.updateData(orderDetail);

		}
		return true;
	}

	public int numberProduct() {
		if (orderDetails.isEmpty()) {
			return 0;
		}
		return orderDetails.size();
	}

	public double totalMoney() {
		double result = 0;
		for (OrderDetail p : orderDetails) {
			result += p.sumMoney();
		}
		return result;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
