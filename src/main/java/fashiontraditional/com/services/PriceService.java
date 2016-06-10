package fashiontraditional.com.services;

import java.util.List;

import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Price;

public interface PriceService {

	List<Banner> getBanners();

	Price findByProductId(Long productId);

}
