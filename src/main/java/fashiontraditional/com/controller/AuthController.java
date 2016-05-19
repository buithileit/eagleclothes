package fashiontraditional.com.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthController {

	// public ModelAndView login(){
	//
	// }
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
		List<String> banners = new LinkedList<String>();
		banners.add("images/banner2.jpg");
		banners.add("images/details.png");
		banners.add("images/banner2.jpg");
		banners.add("images/details.png");
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
