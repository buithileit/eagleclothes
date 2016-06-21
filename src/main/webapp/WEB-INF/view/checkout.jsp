<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>EAGLECLOTHES Bootstarp responsive Website Template|
	Checkout :: w3layouts</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/demo1.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--webfont-->
<link
	href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,200,300,700'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900,200italic,300italic,400italic,600italic,700italic,900italic'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Karla:400,400italic,700,700italic'
	rel='stylesheet' type='text/css'>
<!-- JavaScript includes -->
<script src="js/ipresenter.packed.js"></script>
<script>
	$(document).ready(function() {
		$('#ipresenter').iPresenter({
			timerPadding : -1,
			controlNav : true,
			controlNavThumbs : true,
			controlNavNextPrev : false
		});
	});
</script>
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate({
				scrollTop : $(this.hash).offset().top
			}, 1200);
		});
	});
</script>
</head>
<body>
	<!-- header-section-starts -->
	<div class="user-desc">
		<div class="container">
			<%-- 			<div id="message">${message}</div> --%>
			<ul>
				<c:choose>
					<c:when test="${sessionScope.user !=null }">
						<li><i class="user"
							style="background:${sessionScope.user.imageThumbnail};"></i> <a
							href="404.html">${sessionScope.user.name}</a></li>
						<li><a href="logout.html">${appProperties["title.logout"] }</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="loadLogin">${appProperties["title.login"] }</a></li>
						<li><a href="loadLogin">${appProperties["title.registry"] }</a></li>
					</c:otherwise>
				</c:choose>
				<li><i class="cart"></i><a href="loadCheckout">Cart
						(${sessionScope.size})</a></li>

			</ul>
		</div>
	</div>
	<div class="header">
		<div class="header-top">
			<div class="container">
				<div class="logo">
					<a href="index.html"><img src="images/logo.png" alt="" /></a>
				</div>
				<div class="top-menu">
					<span class="menu"> </span>
					<ul class="cl-effect-15">
						<li><a  href="getMain">HOME</a></li>
						<c:forEach items="${catalogsRoot }" var="catalog">
							<li><a href="getProductByCatalog?catalogId=${ catalog.id}"
								data-hover="${ catalog.name}">${ catalog.name}</a></li>
						</c:forEach>
						<li><a href="contact.html" data-hover="CONTACT">CONTACT</a></li>
					</ul>
				</div>
				<!--script-nav-->
				<script>
					$("span.menu").click(function() {
						$(".top-menu ul").slideToggle("slow", function() {
						});
					});
				</script>
				<!--script-nav-->
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- header-section-ends -->
	<!-- content-section-starts -->
	<div class="container">
		<div class="My-wish-section">
			<section id="wish">
				<div class="my-wish-content">
					<div class="pag-nav">
						<ul class="p-list">
							<li><a href="getMain">Home</a></li> &nbsp;&nbsp;/&nbsp;
							<li class="act">&nbsp;Bascket(${sessionScope.shopCart.size})</li>
						</ul>
					</div>
					<br>
					<!-- 					<div class="coats sing-c"> -->
					<!-- 						<div class="container"> -->
					<!-- 							<div class="check-out"> -->
					<!-- 								<div class="bs-example4" -->
					<!-- 									data-example-id="simple-responsive-table"> -->
					<c:choose>
						<c:when
							test="${sessionScope.shopCart !=null && sessionScope.shopCart.size > 0 }">
							<form action="checkout" method="get">
								<div class="deliver_info_left">
									<h2 class="title-text">Deliver Information</h2>
									<div class="registration_form">
										<div class="form-group">
											<label for="exampleInputPhone">Phone person receice</label> <input
												name="phoneReceice" type="text" required
												placeholder="Phone number of person receice">
										</div>
										<div class="form-group">
											<label for="exampleInputName">Name person receice</label> <input
												name="nameReceice" type="text" required
												placeholder="Name person receice">
										</div>
										<div class="form-group">
											<label for="exampleInputAddress">Address person
												receice</label> <input name="addressReceice" type="text" required
												placeholder="Address person receice">
										</div>
										<div class="form-group">
											${dateDeliverMin} <label for="exampleInputDate">Date
												receice</label> <input name="dateReceice" type="date"
												value="${dateDeliverMin}">
										</div>
										<button type="submit" class="btn btn-default"
											id="checkout_btn">Checkout</button>
									</div>
								</div>
							</form>

							<script type="text/javascript">
								$(document)
										.ready(
												function() {
													$("#checkout_btn")
															.click(
																	function() {
																		console
																				.info("run");
																		var today = new Date();
																		var dd = today
																				.getDate();
																		var mm = today
																				.getMonth() + 1; //January is 0!
																		var yyyy = today
																				.getFullYear();
																		if (dd < 10) {
																			dd = '0'
																					+ dd
																		}
																		if (mm < 10) {
																			mm = '0'
																					+ mm
																		}
																		today = mm
																				+ '/'
																				+ dd
																				+ '/'
																				+ yyyy;
																		var dateDeliver = new Date();
																		deliver
																		var dateDeliver = end_date
																				.setDate(date
																						.getDate()
																						+ days);

																		if ($(
																				"[name='dateReceice']")
																				.val() == ""
																				|| new Date(
																						$(
																								"[name='dateReceice']")
																								.val())
																						.getTime() < dateDeliver
																						.getTime()) {
																			$(
																					"[name='dateReceice']")
																					.val(
																							dateDeliver
																									.val());
																		}
																		$(
																				"#checkout_btn")
																				.submit();

																	});
												});
							</script>
							<div class="products_right">
								<div class="table-responsive" align="center"
									style="padding-left: 5%">
									<table class="table-heading ">
										<tr class="product-section-head-text">

											<th><h3>
													<span>Item</span>
												</h3></th>

											<th><h3>
													<span>Prices</span>
												</h3></th>
											<th><h3>
													<span>Amount</span>
												</h3></th>
											<th><h3>
													<span>Delivery</span>
												</h3></th>
											<th><h3>
													<span>Subtotal</span>
												</h3></th>

										</tr>
										<c:forEach items="${sessionScope.shopCart.orderBeans}"
											var="orderBean">
											<tr class="cart-header">
												<td><a href="single.html" class="at-in"><img
														src="${orderBean.imageThumbnail }" class="img-responsive"
														alt="Responsive image"></a>
													<div class="sed">
														<h5>
															<a href="single.html">${orderBean.name }</a>
														</h5>
														<input id="product_id" type="hidden"
															value="${orderBean.productId}">
													</div>
													<div class="color">
														<input id="color" type="color" disabled="disabled"
															value="#${orderBean.color}">
													</div>
													<div class="size">
														<input id="size" type="number" disabled="disabled"
															value="${orderBean.size}">
													</div></td>
												<td>${orderBean.price }</td>
												<td><form id="updateProductToCart"
														action="updateProductToCart?productId=${orderBean.productId}&color=${orderBean.color}&size=${orderBean.size}">
														<input type="number" id="updateCart" name="amount"
															onload="updateCart()" value="${orderBean.amount }"
															min="1">
													</form></td>
												<td>${appProperties["label.deliver"] }</td>
												<td class="item_price">${orderBean.sumMoney }</td>
												<td class="remove-check"><a
													href="removeProductToCart?productId=${orderBean.productId}&color=${orderBean.color}&size=${orderBean.size}">${appProperties["button.name.delete"] }</a></td>

											</tr>
										</c:forEach>

									</table>
									<!-- 									<script> -->
									<!--  // function updateCart(){ // // alert("change"); // // var
									url_update = "updateProductToCart?color=" +$("#color").val()
									+"productId="+$("#product_id").val()
									+"size="+$("#size").val()+"amount="+$("#updateCart").val() //
									// // } // $(document).ready(function() { //
									$("#updateCart").change(function() { // // alert("change"); //
									var url_update = "updateProductToCart?color="
									+$("#color").val() +"productId="+$("#product_id").val()
									+"size="+$("#size").val()+"amount="+$("#updateCart").val() //
									$.ajax({ // url : url_update, // success : function(data) { //
									$('#message').html(data); // } // }); // }); // });
-->
									<!-- 						</script> -->
								</div>
							</div>
							<!-- 							<div class="produced"> -->
							<%-- 								<a href="checkout" class="hvr-skew-backward">${appProperties["button.name.checkout"] }</a> --%>
							<!-- 							</div> -->
						</c:when>
						<c:otherwise>
							<div class="product-section-head-text">
								<h3 align="center">
									<span>Cart is empty</span>
								</h3>
							</div>
						</c:otherwise>
					</c:choose>
				</div>
		</div>
	</div>
	<!-- 					</div> -->

	<!-- 				</div> -->
	<!-- 		</div> -->
	<!-- 	</div> -->
	<!-- content-section-ends -->
	<!-- contact-section-starts -->
	<div class="content-section">
		<div class="container">
			<div class="col-md-3 about-us">
				<h4>LITTLE ABOUT US</h4>
				<p>
					<span>Sed posuere</span> consectetur est at. Nulla vitae elit
					libero, a pharetra. Lorem ipsum <span>dolor sit</span> amet,
					consectetuer adipiscing elit.
				</p>
				<h4>FOLLOW US</h4>
				<div class="social-icons">
					<i class="facebook"></i> <i class="twitter"></i> <i class="rss"></i>
					<i class="vimeo"></i> <i class="dribble"></i> <i class="msn"></i>
				</div>
			</div>
			<div class="col-md-3 archives">
				<h4>ARCHIVES</h4>
				<ul>
					<li><a href="#">March 2012</a></li>
					<li><a href="#">February 2012</a></li>
					<li><a href="#">January 2012</a></li>
					<li><a href="#">December 2011</a></li>
				</ul>
			</div>
			<div class="col-md-3 contact-us">
				<h4>CONTACT US</h4>
				<ul>
					<li><i class="message"></i></li>
					<li><a href="mail-to:info@premiumcoding.com">info@premiumcoding.com</a></li>
				</ul>
				<ul>
					<li><i class="land-phone"></i></li>
					<li>800 756 156</li>
				</ul>
				<ul>
					<li><i class="smart-phone"></i></li>
					<li>+386408007561</li>
				</ul>
			</div>
			<div class="col-md-3 about-us">
				<h4>SIGN TO NEWSLETTER</h4>
				<input type="text" class="text" value="Name"
					onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'Name';}"> <input
					type="text" class="text" value="Email" onfocus="this.value = '';"
					onblur="if (this.value == '') {this.value = 'Email';}"> <input
					type="submit" value="subscribe">
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- contact-section-ends -->
	<!-- footer-section-starts -->
	<div class="footer">
		<div class="container">
			<div class="col-md-6 bottom-menu">
				<ul>
					<li><a href="index.html">HOME</a></li>
					<li><a href="#">PORTFOLIO</a></li>
					<li><a href="#">SITEMAP</a></li>
					<li><a href="contact.html"> CONTACT</a></li>
				</ul>
			</div>
			<div class="col-md-6 copy-rights">
				<p>
					&copy; 2015 Template by <a href="http://w3layouts.com"
						target="target_blank">W3layouts</a>
				</p>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- footer-section-ends -->
</body>
</html>