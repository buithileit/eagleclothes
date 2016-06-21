package fashiontraditional.com.controller;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Banner;
import fashiontraditional.com.model.Catalog;
import fashiontraditional.com.model.Product;
import fashiontraditional.com.model.SystemInfo;
import fashiontraditional.com.services.BannerService;
import fashiontraditional.com.services.CatalogService;
import fashiontraditional.com.services.ProductService;
import fashiontraditional.com.session.ShoppingCart;
import fashiontraditional.com.util.CatalogName;
import fashiontraditional.com.util.DateUtils;
import fashiontraditional.com.util.Page;
import fashiontraditional.com.vo.ProductVO;

@Controller
public class ProductController {
	@Autowired
	private BannerService bannerService;
	@Autowired
	private ProductService productService;
	@Autowired
	private CatalogService catalogService;

	@Autowired
	private ShoppingCart shopCart;

	@Autowired
	private SystemInfo systemInfo;

	private static final Logger logger = Logger
			.getLogger(ProductController.class);

	// @RequestMapping(value = "/loadProducts")
	// public String loadPageProducts(Model model) {
	// logger.info(shopCart);
	// Date curentDate = DateUtils.now("dd-mm-yyyy");
	// Date dateDeliver = DateUtils.addDate(curentDate, 3);
	// model.addAttribute("dateDeliverMin",
	// DateUtils.format(dateDeliver, "dd-mm-yyyy"));
	// return "products";
	// }

	@RequestMapping("/getProduct")
	public String getProduct(Model model, @RequestParam Long productId,
			HttpServletResponse response, HttpSession session) {
		try {
			Product product = productService.findProductById(productId);
			List<Catalog> catalogsRoot = catalogService
					.getCatalogsByParent(null);
			logger.info(product);
			systemInfo.addSession(session.getId());
			session.setAttribute("shopCart", shopCart);

			model.addAttribute("catalogsRoot", catalogsRoot);
			model.addAttribute("product", product);
			model.addAttribute("sizeCart", shopCart.numberProduct());
		} catch (DataAccessException e) {
			logger.error("getMain", e);
		}
		return "single";

	}

	@RequestMapping("/getProductByCatalog")
	public String getProductByCatalog(Model model,
			@RequestParam(required = false) Integer page,
			@RequestParam(required = false) Integer numberRecord,
			@RequestParam Integer catalogId, HttpServletResponse response,
			HttpSession session) {
		try {
			if (page == null || page < 0) {
				page = 1;
			}
			if (numberRecord == null || numberRecord <= 0) {
				numberRecord = 10;
			}
			Page<ProductVO> paging = new Page<ProductVO>(numberRecord);
			List<ProductVO> products = productService.getProductsByCatalog(
					page, paging, catalogId);
			List<Catalog> catalogs = catalogService
					.getCatalogsByParent(catalogId);
			if (catalogs.isEmpty())
				catalogs = catalogService.getCatalogsEqualsParent(catalogId);
			List<Catalog> catalogsRoot = catalogService
					.getCatalogsByParent(null);
			logger.info(products);
			logger.info(catalogs);
			logger.info(paging.getNumberPages());
			model.addAttribute("catalogsRoot", catalogsRoot);
			model.addAttribute("catalogs", catalogs);
			model.addAttribute("products", products);
			model.addAttribute("numberPage", paging.getNumberPages());
			model.addAttribute("page", page);
			model.addAttribute("catalogId", catalogId);
		} catch (DataAccessException e) {
			logger.error("getProductByCatalog", e);
		}
		return "products";

	}
}
