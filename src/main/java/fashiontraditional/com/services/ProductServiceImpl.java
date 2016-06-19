package fashiontraditional.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fashiontraditional.com.dao.BannerDAO;
import fashiontraditional.com.dao.ProductDAO;
import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Product;
import fashiontraditional.com.util.Page;
import fashiontraditional.com.vo.ProductVO;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDAO;

	@Override
	public Product findProductById(Long productId) throws DataAccessException {
		return productDAO.findProductById(productId);
	}

	@Override
	public Product createProduct(Product product) throws DataAccessException {
		return productDAO.createProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) throws DataAccessException {
		return productDAO.updateProduct(product);
	}

	@Override
	public boolean deleteProduct(Product product) throws DataAccessException {
		return productDAO.deleteProduct(product);
	}

	@Override
	public List<ProductVO> getProducts() throws DataAccessException {

		return productDAO.getProducts();
	}

	@Override
	public List<ProductVO> getProductsByCatalog(Integer page,
			Page<ProductVO> paging, Integer catalogId)
			throws DataAccessException {
		return productDAO.getProductsByCatalog(page, paging, catalogId);
	}

	// @Override
	// public List<Product> findProductByCatalog(Integer catalogId)
	// throws DataAccessException {
	//
	// return productDAO.getProductsByCatalog(page, numberRecord, catalogID);;
	// }

}
