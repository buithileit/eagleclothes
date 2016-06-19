package fashiontraditional.com.dao;

import java.util.List;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Product;
import fashiontraditional.com.util.Page;
import fashiontraditional.com.vo.ProductVO;

public interface ProductDAO {

	Product findProductById(Long productId) throws DataAccessException;

	Product createProduct(Product product) throws DataAccessException;

	boolean updateProduct(Product product) throws DataAccessException;

	boolean deleteProduct(Product product) throws DataAccessException;

	List<ProductVO> getProducts() throws DataAccessException;

	List<ProductVO> getProductsByCatalog(Integer page,Page<ProductVO> paging,
			Integer catalogId) throws DataAccessException ;
}
