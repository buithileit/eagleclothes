package fashiontraditional.com.services;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fashiontraditional.com.bean.OrderBean;
import fashiontraditional.com.controller.ShoppingCartController;
import fashiontraditional.com.dao.BannerDAO;
import fashiontraditional.com.dao.OrderDAO;
import fashiontraditional.com.dao.OrderDetailDAO;
import fashiontraditional.com.dao.ProductDAO;
import fashiontraditional.com.dao.UserDAO;
import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.exception.ErrorCode;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Order;
import fashiontraditional.com.model.OrderDetail;
import fashiontraditional.com.model.Product;
import fashiontraditional.com.model.User;
import fashiontraditional.com.model.enumType.Status;
import fashiontraditional.com.model.enumType.StatusCheck;
import fashiontraditional.com.model.enumType.StatusDeliver;
import fashiontraditional.com.session.ShoppingCart;
import fashiontraditional.com.util.DateUtils;
import fashiontraditional.com.util.SystemUtil;
import fashiontraditional.com.vo.UserVO;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDAO orderDAO;
	@Autowired
	private OrderDetailDAO orderDetailDAO;
	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private ShoppingCart shopCart;
	@Autowired
	private UserDAO userDAO;
	private static final Logger logger = Logger
			.getLogger(OrderServiceImpl.class);

	@Override
	@Transactional
	public boolean createOrder(String nameReceice, String addressReceice,
			String phoneRecece, String dateReceice, UserVO user)
			throws DataAccessException {
		double totalMoney = this.shopCart.totalMoney();
		User u = null;
		if (user != null)
			u = userDAO.findUserById(user.getId());
		Order order = new Order();
		Date currentDate = DateUtils.now("dd/mm/yyyy");
		order.setAddressReceice(addressReceice);
		order.setDateReceice(DateUtils.getDate(dateReceice));
		order.setPhoneNumber(phoneRecece);
		order.setNamePersonReceice(nameReceice);
		order.setDateOrder(currentDate);
		order.setCode(DateUtils.format(currentDate, "ddmmyyyy"));
		order.setStatusDeliver(StatusDeliver.NOT_YET);
		order.setStatusCheck(StatusCheck.DISABLE);
		order.setTotalMoney(totalMoney);
		order.setUser(u);
		logger.info("Order: " + order);
		long id = orderDAO.createOrder(order);
		order.setId(id);
		for (OrderBean orderBean : shopCart.getOrderBeans()) {
			Product product = productDAO.findProductById(orderBean
					.getProductId());
			if (product == null)
				throw new DataAccessException(ErrorCode.NULL_EXCEPTION,
						"There is nothing this product");
			OrderDetail orderDetail = new OrderDetail();
			orderDetail.setAmount(orderBean.getAmount());
			orderDetail.setColor(orderBean.getColor());
			orderDetail.setSize(orderBean.getSize());
			orderDetail.setSumMoney(product.getPrice() * orderBean.getAmount());
			orderDetail.setOrder(order);
			orderDetail.setProduct(product);
			long orderID = orderDetailDAO.createOrderDetail(orderDetail);
			logger.info(orderID);
		}
		return true;
	}
}
