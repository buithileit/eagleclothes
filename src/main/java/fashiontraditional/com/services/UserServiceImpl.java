package fashiontraditional.com.services;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import fashiontraditional.com.bean.RegisterBean;
import fashiontraditional.com.dao.AddressDAO;
import fashiontraditional.com.dao.BannerDAO;
import fashiontraditional.com.dao.UserDAO;
import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.exception.ErrorCode;
import fashiontraditional.com.model.Address;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.User;
import fashiontraditional.com.model.enumType.Status;
import fashiontraditional.com.model.enumType.TypeUser;
import fashiontraditional.com.util.SystemUtil;
import fashiontraditional.com.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private AddressDAO addressDAO;

	@Override
	@Transactional
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	// @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode =
	// ScopedProxyMode.TARGET_CLASS)
	@Transactional
	public UserVO login(String username, String password)
			throws DataAccessException {
		try {

			UserVO user = userDAO.getUserByUsername(username);
			String generedPassword = null;
			Map<String, UserVO> map = new HashMap<String, UserVO>();
			if (user != null) {
				generedPassword = SystemUtil.generateHash(user.getEmail(),
						password);

				map.put(user.getPassword(), user);
			}

			return map.get(generedPassword);
		} catch (DataAccessException e) {
			throw e;
		} catch (NoSuchAlgorithmException e) {
			throw new DataAccessException(ErrorCode.MATCH_EXEPTION,
					e.getMessage());
		} catch (UnsupportedEncodingException e) {
			throw new DataAccessException(ErrorCode.MATCH_EXEPTION,
					e.getMessage());
		}
	}

	@Transactional
	public UserVO loginAdmin(String username, String password)
			throws DataAccessException {
		try {

			UserVO user = userDAO.getUserByUsername(username);
			String generedPassword = null;
			Map<String, UserVO> map = new HashMap<String, UserVO>();
			if (user != null && user.getTypeUser() == TypeUser.ADMIN) {
				generedPassword = SystemUtil.generateHash(user.getEmail(),
						password);

				map.put(user.getPassword(), user);
			}

			return map.get(generedPassword);
		} catch (DataAccessException e) {
			throw e;
		} catch (NoSuchAlgorithmException e) {
			throw new DataAccessException(ErrorCode.MATCH_EXEPTION,
					e.getMessage());
		} catch (UnsupportedEncodingException e) {
			throw new DataAccessException(ErrorCode.MATCH_EXEPTION,
					e.getMessage());
		}
	}

	@Override
	@Transactional
	public UserVO registry(RegisterBean register) throws DataAccessException {
		UserVO user = new UserVO();
		user.setData(register);
		try {
			UserVO userExists = userDAO.getUserByEmail(user.getEmail(),
					user.getPhoneNumber());
			if (userExists != null)
				throw new DataAccessException(ErrorCode.USER_EXISTS,
						"User is exists!");

			String generedPassword = SystemUtil.generateHash(user.getEmail(),
					user.getPassword());
			String sAddress = user.getAddress();
			User currentUser = new User();
			if (!SystemUtil.isNullOrEmpty(sAddress)) {
				List<Address> list = addressDAO.findAddressByName(sAddress);
				if (list == null || list.isEmpty()) {
					Address address = new Address();
					address.setName(sAddress);
					Long address_id = addressDAO.createAddress(address);
					address.setId(address_id);
					currentUser.setAddress(address);
				}

			}
			currentUser.setName(user.getName());
			currentUser.setEmail(user.getEmail());
			currentUser.setPhoneNumber(user.getPhoneNumber());
			currentUser.setPassword(generedPassword);
			currentUser.setStatus(Status.ABLE);
			currentUser.setTypeUser(TypeUser.NORMAL);
			currentUser.setImageThumbnail("images/user.png");
			Long id = userDAO.createUser(currentUser);
			user.setId(id);
			user.setPassword(generedPassword);

			return user;
		} catch (DataAccessException e) {
			throw e;
			// } catch (Exception e) {
			// throw new DataAccessException(ErrorCode.MATCH_EXEPTION,
			// e.getMessage());
		} catch (NoSuchAlgorithmException e) {
			throw new DataAccessException(ErrorCode.MATCH_EXEPTION,
					e.getMessage());
		} catch (UnsupportedEncodingException e) {
			throw new DataAccessException(ErrorCode.MATCH_EXEPTION,
					e.getMessage());
		}
	}

	@Override
	@Transactional
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public boolean delete(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional
	public boolean checkEmail(String email) throws DataAccessException {
		boolean result = false;
		try {

			UserVO user = userDAO.getUserByUsername(email);
			if (user != null)
				result = true;

			return result;
		} catch (DataAccessException e) {
			throw e;
		}
	}
}
