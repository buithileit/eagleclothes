package fashiontraditional.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fashiontraditional.com.dao.BannerDAO;
import fashiontraditional.com.dao.ProductDAO;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDAO;

	@Override
	public Product findProductById(Long productId) {

		Product p = new Product();
		p.setId(1);
		p.setColor("BLUE");
		p.setPrice(129);
		p.setSize(34);
		p.setName("Woman T shirt");
		return productDAO.findProductById(productId);
	}

}
