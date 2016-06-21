package fashiontraditional.com.services;

import java.util.List;

import fashiontraditional.com.bean.RegisterBean;
import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.User;
import fashiontraditional.com.vo.UserVO;

public interface UserService {

	List<User> getUsers();

	/**
	 * 
	 * @param username
	 *            : maybe is phone number or email
	 * @param password
	 * @return
	 * @throws DataAccessException
	 */
	UserVO login(String username, String password) throws DataAccessException;

	UserVO registry(RegisterBean register) throws DataAccessException;

	User updateUser(User user);

	/**
	 * 
	 * @param username
	 *            is email or phone number
	 * @return
	 */
	boolean delete(String username);

	UserVO loginAdmin(String username, String password)
			throws DataAccessException;

	boolean checkEmail(String email)throws DataAccessException;

}
