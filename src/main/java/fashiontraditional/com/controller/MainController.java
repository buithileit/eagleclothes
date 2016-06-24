package fashiontraditional.com.controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Catalog;
import fashiontraditional.com.model.SystemInfo;
import fashiontraditional.com.services.BannerService;
import fashiontraditional.com.services.CatalogService;
import fashiontraditional.com.services.ProductService;
import fashiontraditional.com.session.MapCatalogs;
import fashiontraditional.com.session.ShoppingCart;
import fashiontraditional.com.util.CatalogName;
import fashiontraditional.com.util.Page;
import fashiontraditional.com.vo.CatalogVO;
import fashiontraditional.com.vo.ProductVO;

@Controller
@Scope("request")
public class MainController {
	@Autowired
	private BannerService bannerService;
	@Autowired
	private ProductService productService;
	@Autowired
	private ShoppingCart shopCart;
	@Autowired
	private CatalogService catalogService;
	@Autowired
	private SystemInfo systemInfo;

	private static final Logger logger = Logger.getLogger(MainController.class);

	@RequestMapping("/getMain")
	public String getMain(Locale locale, Model model,
			HttpServletResponse response, HttpSession session) {
		logger.info(locale);
		try {
			List<Banner> banners = bannerService.getBanners();
			int page = 1, numberRecord = 10, catalogID = CatalogName.FEATURED_PRODUCTS;
			Page<ProductVO> paging = new Page<ProductVO>(numberRecord);
			List<ProductVO> productsFeatured = productService
					.getProductsByCatalog(page, paging, catalogID);
			catalogID = CatalogName.NEW_PRODUCTS;
			List<ProductVO> productsNew = productService.getProductsByCatalog(
					page, paging, catalogID);
			catalogID = CatalogName.POPULAR_PRODUCTS;
			List<ProductVO> productsPopular = productService
					.getProductsByCatalog(page, paging, catalogID);
			List<Catalog> catalogsRoot = catalogService
					.getCatalogsByParent(null);

			logger.info(banners);
			logger.info(productsFeatured);
			logger.info(productsNew);
			logger.info(productsPopular);
			logger.info(catalogsRoot);
			systemInfo.addSession(session.getId());
			session.setAttribute("shopCart", shopCart);
			model.addAttribute("catalogsRoot", catalogsRoot);
			model.addAttribute("banners", banners);
			model.addAttribute("productsFeatured", productsFeatured);
			model.addAttribute("productsNew", productsNew);
			model.addAttribute("productsPopular", productsPopular);
			model.addAttribute("sizeCart", shopCart.numberProduct());
		} catch (DataAccessException e) {
			logger.error("getMain", e);
		}
		return "main_login";

	}

	@RequestMapping("admin/main")
	public String getMainAdmin(Model model, HttpServletResponse response,
			HttpSession session) {
		String result = "admin/login";
		if (session.getAttribute("admin") != null)
			result = "admin/mainadmin";
		return result;

	}
}
