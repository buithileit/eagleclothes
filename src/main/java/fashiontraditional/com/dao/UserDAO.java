package fashiontraditional.com.dao;

import java.util.List;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.User;
import fashiontraditional.com.vo.UserVO;

public interface UserDAO {

	UserVO getUserByUsername(String username) throws DataAccessException;

	UserVO getUserByEmail(String email, String phone)
			throws DataAccessException;

	UserVO getUserByPhone(String phone) throws DataAccessException;

	Long createUser(User currentUser) throws DataAccessException;

	User findUserById(Long id) throws DataAccessException;
}
