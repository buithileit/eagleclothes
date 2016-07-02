package fashiontraditional.com.services;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fashiontraditional.com.dao.BannerDAO;
import fashiontraditional.com.dao.CatalogDAO;
import fashiontraditional.com.dao.CatalogDAOImpl;
import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Catalog;
import fashiontraditional.com.vo.CatalogVO;

@Service
public class CatalogServiceImpl implements CatalogService {
	@Autowired
	private CatalogDAO catalogDAO;
	private static final Logger logger = Logger
			.getLogger(CatalogServiceImpl.class);

	@Override
	@Transactional
	public List<CatalogVO> getCatalogs() throws DataAccessException {
		List<CatalogVO> result = new LinkedList<CatalogVO>();
		List<Catalog> catalogRoot = catalogDAO.getCatalogsByParent(null);
		for (Catalog catalog : catalogRoot) {
			CatalogVO c = new CatalogVO();
			c.setId(catalog.getId());
			c.setName(catalog.getName());
			List<Catalog> catalogsChild = catalogDAO
					.getCatalogsByParent(catalog.getId());
			c.setChildrens(catalogsChild);
			result.add(c);
		}
		return result;
	}

	@Override
	@Transactional
	public List<Catalog> getCatalogsByParent(Integer parent)
			throws DataAccessException {

		return catalogDAO.getCatalogsByParent(parent);
	}

	@Override
	@Transactional
	public List<Catalog> getCatalogsEqualsParent(Integer catalogId)
			throws DataAccessException {
		// TODO Auto-generated method stub
		return catalogDAO.getCatalogsEqualsParent(catalogId);
	}

}
