package fashiontraditional.com.dao;

import java.util.List;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Catalog;
import fashiontraditional.com.vo.CatalogVO;

public interface CatalogDAO {

	List<Catalog> getCatalogs() throws DataAccessException;

	List<Catalog> getCatalogsByParent(Integer parent)
			throws DataAccessException;

	List<Catalog> getCatalogsEqualsParent(Integer catalogId)
			throws DataAccessException;

}
