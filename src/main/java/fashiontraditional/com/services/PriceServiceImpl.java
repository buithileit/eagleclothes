package fashiontraditional.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fashiontraditional.com.dao.BannerDAO;
import fashiontraditional.com.dao.PriceDAO;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Price;

@Service
public class PriceServiceImpl implements PriceService {
	@Autowired
	private PriceDAO priceDAO;

	@Override
	public List<Banner> getBanners() {
		// TODO Auto-generated method stub
		return priceDAO.getBanners();
	}

	@Override
	public Price findByProductId(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
