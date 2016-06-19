package fashiontraditional.com.session;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import fashiontraditional.com.bean.OrderBean;
import fashiontraditional.com.controller.BannerController;
import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Catalog;
import fashiontraditional.com.model.Product;
import fashiontraditional.com.services.CatalogService;
import fashiontraditional.com.vo.CatalogVO;
import fashiontraditional.com.vo.ProductVO;

@Component("mapCatalogs")
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MapCatalogs implements Serializable {

	private List<CatalogVO> catalogs;
	private static final Logger logger = Logger
			.getLogger(BannerController.class);

	public List<CatalogVO> getCatalogs() {
		return catalogs;
	}

	public void setCatalogs(List<CatalogVO> catalogs)
			throws DataAccessException {
		this.catalogs = catalogs;
	}

}
