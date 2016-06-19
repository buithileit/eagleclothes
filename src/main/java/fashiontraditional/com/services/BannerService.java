package fashiontraditional.com.services;

import java.util.List;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;

public interface BannerService {

	List<Banner> getBanners() throws DataAccessException;

}
