<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>EAGLECLOTHES Bootstarp responsive Website Template|
	Products :: w3layouts</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/component.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
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
							href="account.html">${sessionScope.user.name}</a></li>
						<li><a href="logout.html">${appProperties["title.logout"] }</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="account.html">${appProperties["title.login"] }</a></li>
						<li><a href="account.html">${appProperties["title.registry"] }</a></li>
					</c:otherwise>
				</c:choose>
				<li><i class="cart"></i><a href="loadCheckout">Cart
						(${sizeCart})</a></li>

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
						<li><a href="getMain">HOME</a></li>
						<c:forEach items="${catalogsRoot }" var="catalog">
							<li><c:choose>
									<c:when test="${catalogId ==catalog.id }">
										<a class="active"
											href="getProductByCatalog?catalogId=${ catalog.id}"
											data-hover="${ catalog.name}">${ catalog.name}</a>
									</c:when>
									<c:otherwise>
										<a href="getProductByCatalog?catalogId=${ catalog.id}"
											data-hover="${ catalog.name}">${ catalog.name}</a>
									</c:otherwise>
								</c:choose></li>
						</c:forEach>
						<li><a href="contact.html" data-hover="CONTACT">CONTACT</a></li>
					</ul>
				</div>
				<style>q
				
				</style>
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
		<div class="products-page">
			<div class="product">
				<div class="product-listy">
					<h3>our Products</h3>
					<ul class="product-list">
						<c:forEach items="${catalogs}" var="catalog">
							<li><a href="getProductByCatalog?catalogId=${catalog.id}">${catalog.name }</a></li>
						</c:forEach>
						<!-- 						<li><a href="account.html">Register</a></li> -->
					</ul>
				</div>
				<!-- 				<div class="latest-bis"> -->
				<!-- 					<img src="images/offer.jpg" class="img-responsive"> -->
				<!-- 					<div class="offer"> -->
				<!-- 						<p>40%</p> -->
				<!-- 						<small>Top Offer</small> -->
				<!-- 					</div> -->
				<!-- 				</div> -->
				<div class="tags">
					<h4 class="tag_head">Tags Widget</h4>
					<ul class="tags_links">
						<li><a href="#">Kitesurf</a></li>
						<li><a href="#">Super</a></li>
						<li><a href="#">Duper</a></li>
						<li><a href="#">Theme</a></li>
						<li><a href="#">Men</a></li>
						<li><a href="#">Women</a></li>
						<li><a href="#">Equipment</a></li>
						<li><a href="#">Best</a></li>
						<li><a href="#">Accessories</a></li>
						<li><a href="#">Men</a></li>
						<li><a href="#">Apparel</a></li>
						<li><a href="#">Super</a></li>
						<li><a href="#">Duper</a></li>
						<li><a href="#">Theme</a></li>
						<li><a href="#">Responsiv</a></li>
						<li><a href="#">Women</a></li>
						<li><a href="#">Equipment</a></li>
					</ul>

				</div>

			</div>
			<div class="new-product">
				<div class="new-product-top">
					<ul class="product-top-list">
						<li><a href="getMain">Home</a>&nbsp;<span>&gt;</span></li>
						<!-- 						<li><span class="act">Best Sales</span>&nbsp;</li> -->
					</ul>
					<!-- 					<p class="back"> -->
					<!-- 						<a href="getMain">Back to Previous</a> -->
					<!-- 					</p> -->
					<div class="clearfix"></div>
				</div>

				<div class="mens-toolbar">
					<div class="sort">
						<div class="sort-by">

							<!-- 							<label>Sort By</label> <select> -->
							<%-- 																<option value="">${ }</option> --%>
							<!-- 								<option value="">Name</option> -->
							<!-- 								<option value="">Price</option> -->
							<!-- 							</select> <a href=""><img src="images/arrow2.gif" alt="" -->
							<!-- 								class="v-middle"></a> -->
						</div>
					</div>
					<ul class="women_pagenation dc_paginationA dc_paginationA06">
						<li><a href="#" class="previous">Page:</a></li>
						<c:forEach begin="1" end="${numberPage}" var="i">
							<c:choose>
								<c:when test="${i == page }">
									<li class="active"><a href="#">${i }</a></li>
								</c:when>
								<c:otherwise>
									<li><a href="#">${i }</a></li>
								</c:otherwise>
							</c:choose>
						</c:forEach>

						<!-- 						<li><a href="#">2</a></li> -->
					</ul>
					<div class="clearfix"></div>
				</div>
				<div id="cbp-vm" class="cbp-vm-switcher cbp-vm-view-grid">
					<div class="cbp-vm-options">
						<a href="#" class="cbp-vm-icon cbp-vm-grid cbp-vm-selected"
							data-view="cbp-vm-view-grid" title="grid">Grid View</a> <a
							href="#" class="cbp-vm-icon cbp-vm-list"
							data-view="cbp-vm-view-list" title="list">List View</a>
					</div>
					<!-- 					<div class="pages"> -->
					<!-- 						<div class="limiter visible-desktop"> -->
					<!-- 							<label>Show</label> <select> -->
					<!-- 								<option value="" selected="selected">9</option> -->
					<!-- 								<option value="">15</option> -->
					<!-- 								<option value="">30</option> -->
					<!-- 							</select> per page -->
					<!-- 						</div> -->
					<!-- 					</div> -->
					<div class="clearfix"></div>
					<ul>
						<c:forEach items="${products }" var="product">
							<li><a class="cbp-vm-image"
								href="getProduct?productId=${product.id}">
									<div class="view view-first">
										<div class="inner_content clearfix">
											<div class="product_image">
												<img src="${product.image}" class="img-responsive" alt="" />
												<!-- 												<div class="mask"> -->
												<!-- 													<div class="info">Quick View</div> -->
												<!-- 												</div> -->
												<div class="product_container">
													<div class="cart-left">
														<p class="title">${product.name}</p>
													</div>
													<div class="pricey">${product.money}${appProperties["label.price"] }</div>
													<div class="clearfix"></div>
												</div>
											</div>
										</div>
									</div>
							</a> <%-- 								<div class="cbp-vm-details">${product.money}</div> --%>
								<a class="cbp-vm-icon cbp-vm-add"
								href="shop?productId=${product.id}&color=${product.color}&amount=1&size=${product.size}">Add
									to cart</a></li>
						</c:forEach>
					</ul>
				</div>

				<script src="js/cbpViewModeSwitch.js" type="text/javascript"></script>
				<script src="js/classie.js" type="text/javascript"></script>
			</div>
			<div class="clearfix"></div>
		</div>
		<div class="clearfix"></div>
	</div>
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