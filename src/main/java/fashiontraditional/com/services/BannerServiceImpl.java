package fashiontraditional.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fashiontraditional.com.dao.BannerDAO;
import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;

@Service
public class BannerServiceImpl implements BannerService {
	@Autowired
	private BannerDAO bannerDAO;

	@Override
	@Transactional
	public List<Banner> getBanners() throws DataAccessException {
		// TODO Auto-generated method stub
		return bannerDAO.getBanners();
	}

}
