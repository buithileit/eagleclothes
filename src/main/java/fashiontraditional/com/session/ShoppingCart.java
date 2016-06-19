package fashiontraditional.com.session;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import fashiontraditional.com.bean.OrderBean;
import fashiontraditional.com.model.Product;
import fashiontraditional.com.vo.ProductVO;

@Component("shopCart")
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShoppingCart implements Serializable {

	private List<OrderBean> orderBeans = new LinkedList<OrderBean>();
	private int size;

	public boolean addProduct(Product product, Integer amount) {
		for (OrderBean item : orderBeans) {
			if (item.equals(product))
				return item.plusAmount();

		}
		OrderBean orderBean = new OrderBean();
		orderBean.setAmount(amount);
		orderBean.setColor(product.getColor());
		orderBean.setSize(product.getSize());
		orderBean.setPrice(product.getPrice());
		orderBean.setProductId(product.getId());
		orderBean.setImageThumbnail(product.getImageThumbnail());
		orderBean.setName(product.getName());
		orderBeans.add(orderBean);
		this.size++;
		return true;
	}

	public boolean removeProduct(long productId, String color, int size) {
		// int index
		if (orderBeans != null && size > 0) {
			for (OrderBean orderBean : orderBeans) {
				if (orderBean.equals(productId, color, size)) {
					orderBeans.remove(orderBean);
					this.size--;
					return true;
				}

			}
		}
		return false;
	}

	public boolean updateProduct(OrderBean orderBean) {
		for (OrderBean item : orderBeans) {
			if (item.equals(orderBean))
				item.updateData(orderBean);

		}
		return true;
	}

	public int numberProduct() {
		if (orderBeans.isEmpty()) {
			return 0;
		}
		return orderBeans.size();
	}

	public double totalMoney() {
		double result = 0;
		for (OrderBean p : orderBeans) {
			result += p.sumMoney();
		}
		return result;
	}

	public List<OrderBean> getOrderBeans() {
		return orderBeans;
	}

	public void setOrderBeans(List<OrderBean> orderBeans) {
		this.orderBeans = orderBeans;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean updateProduct(Long productId, Integer amount, String color,
			Integer size) {
		for (OrderBean item : orderBeans) {
			if (item.equals(productId, color, size)) {
				item.updateData(amount);
				return true;
			}

		}
		return false;
	}

	@Override
	public String toString() {
		return "ShoppingCart [orderBeans=" + orderBeans + ", size=" + size
				+ "]";
	}

}
