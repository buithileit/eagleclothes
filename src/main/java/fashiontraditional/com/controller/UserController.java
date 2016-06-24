package fashiontraditional.com.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fashiontraditional.com.bean.LoginBean;
import fashiontraditional.com.bean.RegisterBean;
import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.exception.ErrorCode;
import fashiontraditional.com.model.Catalog;
import fashiontraditional.com.model.SystemInfo;
import fashiontraditional.com.model.User;
import fashiontraditional.com.services.CatalogService;
import fashiontraditional.com.services.UserService;
import fashiontraditional.com.util.SystemUtil;
import fashiontraditional.com.vo.UserLoginVO;
import fashiontraditional.com.vo.UserVO;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private SystemInfo systemInfo;
	@Autowired
	private CatalogService catalogService;

	private static final Logger logger = Logger.getLogger(UserController.class);

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model, HttpServletRequest request,
			HttpSession session, @ModelAttribute LoginBean login) {
		String result = null;
		String message = null;
		if (login == null || SystemUtil.isNullOrEmpty(login.getUsername())
				|| SystemUtil.isNullOrEmpty(login.getPassword())) {
			message = "you have not data";
			result = "redirect:loadLogin";
		} else {
			String username = login.getUsername();
			String password = login.getPassword();
			logger.info(username + " PasS: " + password);
			result = "redirect:/getMain";
			try {
				if ((!SystemUtil.checkEmail(username) && !SystemUtil
						.checkPhoneNumber(username))) {
					message = "Username or password is wrong";
				} else {
					UserVO user = userService.loginAdmin(username, password);
					if (user != null) {
						systemInfo.addNuUserAccess();
						session.setAttribute("user", user);
						result = "redirect:/getMain";
					} else
						message = "Username or password is wrong";
				}
			} catch (DataAccessException e) {
				logger.error(e.getErrorCode(), e);
			}
		}
		model.addAttribute("message", message);
		return result;

	}

	@RequestMapping(value = "/validateEmail", params = "email")
	public ModelAndView validateEmail(@RequestParam("email") String email,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		try {
			if ((email != null) && !SystemUtil.checkEmail(email)
					&& userService.checkEmail(email)) {
				response.setContentType("text/xml");
				response.setHeader("Cache-Control", "no-cache");
				response.getWriter().write("<valid>true</valid>");
			} else {
				response.setContentType("text/xml");
				response.setHeader("Cache-Control", "no-cache");
				response.getWriter().write("<valid>false</valid>");
			}
		} catch (DataAccessException e) {
			logger.error("validateEmail", e);
		}
		return null;
	}

	@RequestMapping(value = "/loginAdmin")
	public String loginAdmin(Model model, HttpServletRequest request,
			HttpSession session, @ModelAttribute LoginBean login) {
		String result = null;
		String message = null;
		if (login == null || SystemUtil.isNullOrEmpty(login.getUsername())
				|| SystemUtil.isNullOrEmpty(login.getPassword())) {
			message = "you have not data";
			result = "redirect:admin/main";
		} else {
			String username = login.getUsername();
			String password = login.getPassword();
			logger.info(username + " PasS: " + password);
			// result = "redirect:/loginAdmin";
			try {
				if ((!SystemUtil.checkEmail(username) && !SystemUtil
						.checkPhoneNumber(username))) {
					message = "Username or password is wrong";

				} else {
					UserVO user = userService.login(username, password);
					if (user != null) {
						logger.info(user);
						systemInfo.addNuUserAccess();
						session.setAttribute("admin", user);
						result = "redirect:admin/main";
					} else
						message = "Username or password is wrong";
				}
			} catch (DataAccessException e) {
				logger.error(e.getErrorCode(), e);
			}
		}
		model.addAttribute("message", message);
		return result;

	}

	@RequestMapping(value = "/loadLogin")
	public String loadPageLogin(
			@ModelAttribute("register") RegisterBean register, Model model) {
		try {
			List<Catalog> catalogsRoot = catalogService
					.getCatalogsByParent(null);
			model.addAttribute("register", register);
			model.addAttribute("catalogsRoot", catalogsRoot);
		} catch (DataAccessException e) {
			logger.error(e.getErrorCode(), e);
		}
		return "login";
	}

	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:getMain";

	}

	@RequestMapping(value = "/registry")
	public String registry(Model model, HttpServletRequest request,
			HttpSession session,
			@ModelAttribute("register") RegisterBean register) {
		String result = null;
		String message = null;

		result = "redirect:loadLogin";
		if (register == null || SystemUtil.isNullOrEmpty(register.getEmail())
				|| SystemUtil.isNullOrEmpty(register.getPassword())
				|| SystemUtil.isNullOrEmpty(register.getPrePassword())) {
			message = "you have not data";
		} else {

			try {
				boolean check = register.checkValues();
				logger.info(register.toString() + " " + check);
				if (!check) {
					message = "There is a wrong field";
				} else {
					UserVO userReceice = userService.registry(register);
					systemInfo.addNuUserAccess();
					session.setAttribute("user", userReceice);
					result = "redirect:/getMain";
				}
			} catch (DataAccessException e) {
				message = e.getMessage();
				logger.error(e.getErrorCode(), e);
			}
		}
		model.addAttribute("message", message);

		return result;

	}
}
