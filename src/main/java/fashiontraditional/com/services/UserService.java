package fashiontraditional.com.services;

import java.util.List;

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
	 */
	User login(String username, String password);

	User registry(UserVO user);

	User updateUser(User user);

	/**
	 * 
	 * @param username
	 *            is email or phone number
	 * @return
	 */
	boolean delete(String username);

}
