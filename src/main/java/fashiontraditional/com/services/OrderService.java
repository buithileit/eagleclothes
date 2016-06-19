package fashiontraditional.com.services;

import java.util.List;

import fashiontraditional.com.bean.OrderBean;
import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.vo.UserVO;

public interface OrderService {


	boolean createOrder(String nameReceice, String addressReceice,
			String phoneRecece, String dateReceice, UserVO user)throws DataAccessException;

}
