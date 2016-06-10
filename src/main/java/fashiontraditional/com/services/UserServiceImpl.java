package fashiontraditional.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fashiontraditional.com.dao.BannerDAO;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.User;
import fashiontraditional.com.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private BannerDAO bannerDAO;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User registry(UserVO user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
