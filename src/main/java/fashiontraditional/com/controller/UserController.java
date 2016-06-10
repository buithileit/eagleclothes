package fashiontraditional.com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fashiontraditional.com.services.UserService;
import fashiontraditional.com.vo.UserLoginVO;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login")
	public ModelAndView login(Model model, HttpServletRequest request,
			@ModelAttribute UserLoginVO user) {
		return null;

	}
}
