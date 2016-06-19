package fashiontraditional.com.dao;

import java.util.List;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.OrderDetail;

public interface OrderDetailDAO {

	
	

	Long createOrderDetail(OrderDetail orderDetail) throws DataAccessException;

	boolean deleteOrderDetail(OrderDetail orderDetail)
			throws DataAccessException;

	boolean updateOrderDetail(OrderDetail OrderDetail)
			throws DataAccessException;

	OrderDetail findOrderDetailById(Long orderDetailId)
			throws DataAccessException;

}
