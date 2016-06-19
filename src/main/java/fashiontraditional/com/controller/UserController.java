package fashiontraditional.com.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fashiontraditional.com.bean.LoginBean;
import fashiontraditional.com.bean.RegisterBean;
import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.exception.ErrorCode;
import fashiontraditional.com.model.SystemInfo;
import fashiontraditional.com.model.User;
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

	private static final Logger logger = Logger.getLogger(UserController.class);

	@RequestMapping(value = "/login")
	public String login(Model model, HttpServletRequest request,
			HttpSession session, @ModelAttribute LoginBean login) {
		String result = null;
		String message = null;
		String username = login.getUsername();
		String password = login.getPassword();
		logger.info(username + " PasS: " + password);
		result = "redirect:loadLogin";
		try {

			if ((!SystemUtil.checkEmail(username) && !SystemUtil
					.checkPhoneNumber(username))
					|| SystemUtil.isNullOrEmpty(password)) {
				message = "Username or password is wrong";
				// return "";
			} else {
				UserVO user = userService.login(username, password);
				if (user != null) {
					systemInfo.addNuUserAccess();
					session.setAttribute("user", user);
					result = "redirect:/getMain";
				} else
					message = "Username or password is wrong";
			}
			model.addAttribute("message", message);
		} catch (DataAccessException e) {
			logger.error(e.getErrorCode(), e);
		}

		return result;

	}

	@RequestMapping(value = "/loadLogin")
	public String loadPageLogin(
			@ModelAttribute("register") RegisterBean register, Model model) {
		model.addAttribute("register", register);
		return "account";

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
		result = "redirect:account";

		try {
			// try {
			// // request.
			// request.setCharacterEncoding("UTF-8");
			// } catch (UnsupportedEncodingException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			// if (!register.getPassword().equals(register.getPrePassword()))
			// throw new DataAccessException(ErrorCode.PASSWORD_NOT_EQUAL,
			// "Retype password is not equal password");
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
		model.addAttribute("message", message);

		return result;

	}
}
