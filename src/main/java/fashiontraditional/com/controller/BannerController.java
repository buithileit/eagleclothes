package fashiontraditional.com.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import fashiontraditional.com.model.Banner;
import fashiontraditional.com.services.BannerService;

@Controller
public class BannerController {
	@Autowired
	private BannerService bannerService;

	@RequestMapping("/banners")
	public @ResponseBody List<String> getBanner(Model model,
			HttpServletResponse response) {
		List<String> banners = new LinkedList<String>();
		banners.add("images/details.png");
		model.addAttribute("banners", banners);

		// response.setContentType("text/xml");
		// response.setHeader("Cache-Control", "no-cache");
		// response.getWriter().write("<valid>false</valid>");
		return banners;

	}

	@RequestMapping("/getMain")
	public String getMain(Model model, HttpServletResponse response) {
		List<Banner> banners = bannerService.getBanners();
		System.out.println(banners);
		// new LinkedList<String>();
		// banners.add("images/banner1.jpg");
		// banners.add("images/banner2.jpg");
		// banners.add("images/banner3.jpg");
		// banners.add("images/details.png");
		// banners.add("images/banner4.jpg");
		// banners.add("images/banner5.jpg");
		model.addAttribute("banners", banners);

		// response.setContentType("text/xml");
		// response.setHeader("Cache-Control", "no-cache");
		// response.getWriter().write("<valid>false</valid>");
		return "main";

	}

	@RequestMapping("admin/main")
	public String getMainAdmin(Model model, HttpServletResponse response) {
		// List<String> banners = new LinkedList<String>();
		// banners.add("images/banner2.jpg");
		// banners.add("images/details.png");
		// banners.add("images/banner2.jpg");
		// banners.add("images/details.png");
		// model.addAttribute("banners", banners);

		// response.setContentType("text/xml");
		// response.setHeader("Cache-Control", "no-cache");
		// response.getWriter().write("<valid>false</valid>");
		return "admin//mainadmin";

	}
}
