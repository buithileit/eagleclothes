package fashiontraditional.com.controller;

import java.util.Date;
import java.util.LinkedList;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fashiontraditional.com.bean.OrderBean;
import fashiontraditional.com.bean.RegisterBean;
import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.exception.ErrorCode;
import fashiontraditional.com.model.Price;
import fashiontraditional.com.model.Product;
import fashiontraditional.com.services.OrderDetailService;
import fashiontraditional.com.services.OrderService;
import fashiontraditional.com.services.PriceService;
import fashiontraditional.com.services.ProductService;
import fashiontraditional.com.session.ShoppingCart;
import fashiontraditional.com.util.DateUtils;
import fashiontraditional.com.util.SystemUtil;
import fashiontraditional.com.vo.UserVO;

@Controller
public class ShoppingCartController {
	@Autowired
	private ProductService productService;

	@Autowired
	private OrderService orderService;
	@Autowired
	private PriceService priceService;
	@Autowired
	private ShoppingCart shopCart;

	private static final Logger logger = Logger
			.getLogger(ShoppingCartController.class);

	@RequestMapping(value = "/loadCheckout")
	public String loadPageCheckout(Model model) {
		logger.info(shopCart);
		Date curentDate = DateUtils.now("dd-mm-yyyy");
		Date dateDeliver = DateUtils.addDate(curentDate, 3);
		model.addAttribute("dateDeliverMin",
				DateUtils.format(dateDeliver, "dd-mm-yyyy"));
		return "checkout";
	}

	@RequestMapping(value = "/checkout", method = RequestMethod.GET, produces = "text/plain;charset=UTF-8")
	public String checkout(@RequestParam("nameReceice") String nameReceice,
			@RequestParam("addressReceice") String addressReceice,
			@RequestParam("phoneReceice") String phoneRecece,
			@RequestParam("dateReceice") String dateReceice, Model model,
			HttpSession session) {

		// @RequestHeader String referedForm
		String message = null;
		logger.info(nameReceice + addressReceice + phoneRecece + dateReceice);
		try {
			if (!SystemUtil.isNullOrEmpty(nameReceice)
					&& !SystemUtil.isNullOrEmpty(addressReceice)
					&& !SystemUtil.isNullOrEmpty(phoneRecece)
					&& !SystemUtil.isNullOrEmpty(dateReceice)) {
				UserVO user = (UserVO) session.getAttribute("user");
				logger.info(user);
				orderService.createOrder(nameReceice, addressReceice,
						phoneRecece, dateReceice, user);
				this.shopCart.setOrderBeans(new LinkedList<OrderBean>());
				this.shopCart.setSize(0);
			} else
				message = "There is the wrong field ";
			// System.out.println("Them san pham");
			// model.addAttribute("message", );
			// return "redirect:" + referedForm;

		} catch (DataAccessException e) {
			message = e.getMessage();
			logger.error(e.getMessage());
		}
		model.addAttribute("message", message);
		return "redirect:/getMain";
	}

	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public String addToCart(@RequestParam("productId") Long productId,
			@RequestParam("color") String color,
			@RequestParam("amount") Integer amount,
			@RequestParam("size") Integer size, Model model, HttpSession session) {
		// @RequestHeader String referedForm
		String message = null;
		try {
			Product product;
			product = productService.findProductById(productId);
			if (product == null) {
				message = "There is no product this";
			}
			if (size != null)
				product.setSize(size);
			if (amount == null || amount <= 0)
				amount = 1;
			if (!SystemUtil.isNullOrEmpty(color))
				product.setColor(color);
			session.setAttribute("shopCart", shopCart);
			// logger.info(shopCart.toString());
			shopCart.addProduct(product, amount);
			// System.out.println("Them san pham");
			// model.addAttribute("message", );
			// return "redirect:" + referedForm;

		} catch (DataAccessException e) {
			message = e.getMessage();
			logger.error(e.getMessage());
		}
		model.addAttribute("message", message);
		return "redirect:/getMain";
	}

	@RequestMapping(value = "/removeProductToCart", method = RequestMethod.GET)
	public String removeProductToCart(
			@RequestParam("productId") Long productId,
			@RequestParam("color") String color,
			@RequestParam("size") Integer size, Model model) {
		// @RequestHeader String referedForm
		String message = null;

		boolean result = shopCart.removeProduct(productId, color, size);
		if (result)
			message = "Cart got out this product";
		model.addAttribute("message", message);
		return "redirect:/loadCheckout";
	}

	@RequestMapping(value = "/updateProductToCart", method = RequestMethod.GET)
	public @ResponseBody String updateProductToCart(
			@RequestParam("productId") Long productId,
			@RequestParam("color") String color,
			@RequestParam("amount") Integer amount,
			@RequestParam("size") Integer size, Model model) {
		// @RequestHeader String referedForm
		logger.info("updateProductToCart" + amount);
		String message = "Cart is not updated this product";

		boolean result = shopCart.updateProduct(productId, amount, color, size);
		if (result)
			message = "Cart updated this product";

		// model.addAttribute("message", message);
		return message;
	}
}
