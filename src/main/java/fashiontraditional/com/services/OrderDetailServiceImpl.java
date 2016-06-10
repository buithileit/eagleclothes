package fashiontraditional.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fashiontraditional.com.dao.BannerDAO;
import fashiontraditional.com.model.Banner;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
	@Autowired
	private BannerDAO bannerDAO;

	@Override
	public List<Banner> getBanners() {
		// TODO Auto-generated method stub
		return bannerDAO.getBanners();
	}

}
