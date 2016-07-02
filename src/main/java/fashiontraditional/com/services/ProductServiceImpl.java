package fashiontraditional.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
	public Product findProductById(Long productId) throws DataAccessException {
		return productDAO.findProductById(productId);
	}

	@Override
	@Transactional
	public Product createProduct(Product product) throws DataAccessException {
		return productDAO.createProduct(product);
	}

	@Override
	@Transactional
	public boolean updateProduct(Product product) throws DataAccessException {
		return productDAO.updateProduct(product);
	}

	@Override
	@Transactional
	public boolean deleteProduct(Product product) throws DataAccessException {
		return productDAO.deleteProduct(product);
	}

	@Override
	@Transactional
	public List<ProductVO> getProducts() throws DataAccessException {

		return productDAO.getProducts();
	}

	@Override
	@Transactional
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
