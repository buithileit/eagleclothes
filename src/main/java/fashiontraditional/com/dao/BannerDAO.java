package fashiontraditional.com.dao;

import java.util.List;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;

public interface BannerDAO {

	List<Banner> getBanners() throws DataAccessException;

}
