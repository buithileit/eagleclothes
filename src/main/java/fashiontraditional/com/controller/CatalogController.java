package fashiontraditional.com.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fashiontraditional.com.model.Banner;
import fashiontraditional.com.services.BannerService;
import fashiontraditional.com.services.CatalogService;
import fashiontraditional.com.session.ShoppingCart;

@Controller
public class CatalogController {
	@Autowired
	private CatalogService catalogService;
//	@Autowired
//	private ShoppingCart shopCart;

	private static final Logger logger = Logger
			.getLogger(CatalogController.class);

//	 @RequestMapping("/banners")
//	 public String getBanner(Model model,
//	 HttpServletRequest request, HttpServletResponse response) {
//	 System.out.println(request.getSession().getId());
//	 request.setAttribute(request.getSession().getId(), user);
//	 List<String> banners = new LinkedList<String>();
//	 banners.add("images/details.png");
//	 model.addAttribute("banners", banners);
//	
//	 // response.setContentType("text/xml");
//	 // response.setHeader("Cache-Control", "no-cache");
//	 // response.getWriter().write("<valid>false</valid>");
//	 return banners;
//	
//	 }

	// @RequestMapping("/getMain")
	// public String getMain(Model model, HttpServletResponse response) {
	// List<Banner> banners = bannerService.getBanners();
	// logger.info(banners);
	// model.addAttribute("banners", banners);
	// model.addAttribute("sizeCart", shopCart.numberProduct());
	// return "main_login";
	//
	// }

	// @RequestMapping("admin/main")
	// public String getMainAdmin(Model model, HttpServletResponse response) {
	// // List<String> banners = new LinkedList<String>();
	// // banners.add("images/banner2.jpg");
	// // banners.add("images/details.png");
	// // banners.add("images/banner2.jpg");
	// // banners.add("images/details.png");
	// // model.addAttribute("banners", banners);
	//
	// // response.setContentType("text/xml");
	// // response.setHeader("Cache-Control", "no-cache");
	// // response.getWriter().write("<valid>false</valid>");
	// return "admin/mainadmin";
	//
	// }
}
