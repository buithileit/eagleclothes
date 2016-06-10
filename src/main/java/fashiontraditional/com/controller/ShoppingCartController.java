package fashiontraditional.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fashiontraditional.com.model.Price;
import fashiontraditional.com.model.Product;
import fashiontraditional.com.model.ShoppingCart;
import fashiontraditional.com.services.PriceService;
import fashiontraditional.com.services.ProductService;
import fashiontraditional.com.util.SystemUtil;

@Controller
public class ShoppingCartController {
	@Autowired
	private ProductService productService;
	@Autowired
	private PriceService priceService;
	@Autowired
	private ShoppingCart shopCart;

	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public String addToCart(@RequestParam("productId") Long productId,
			@RequestParam("color") String color,
			@RequestParam("amount") Integer amount,
			@RequestParam("size") Integer size, Model model) {
		// @RequestHeader String referedForm
		String message = null;
		Product product = productService.findProductById(productId);
		if (product == null) {
			message = "error.402";
		}
		if (size != null)
			product.setSize(size);
		if (amount == null || amount <= 0)
			amount = 1;
		if (!SystemUtil.isNullOrEmpty(color))
			product.setColor(color);

		shopCart.addProduct(product, amount);
		System.out.println("Them san pham");
		model.addAttribute("message", message);
		// return "redirect:" + referedForm;
		return "redirect:/getMain";

	}
}
