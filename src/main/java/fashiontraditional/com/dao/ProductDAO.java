package fashiontraditional.com.dao;

import java.util.List;

import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Product;

public interface ProductDAO {

	Product findProductById(Long productId);

}
