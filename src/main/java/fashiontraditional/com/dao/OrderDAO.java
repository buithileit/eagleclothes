package fashiontraditional.com.dao;

import java.util.List;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Order;

public interface OrderDAO {

	Long createOrder(Order order) throws DataAccessException;

	List<Order> findOrderByName(String orderName) throws DataAccessException;

	boolean deleteOrder(Order order) throws DataAccessException;

	boolean updateOrder(Order Order) throws DataAccessException;

	Order findOrderById(Long orderId) throws DataAccessException;

}
