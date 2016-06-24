<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title><spring:message code="title.main" /></title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/demo1.css" rel="stylesheet" type="text/css" media="all" />

<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <script type="application/x-javascript"> -->

<!--  	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); -->
<!-- 	 function hideURLbar(){ window.scrollTo(0,1); }  -->

<!-- </script> -->
<!--webfont-->
<link
	href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,200,300,700'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900,200italic,300italic,400italic,600italic,700italic,900italic'
	rel='stylesheet' type='text/css'>
<link href="css/owl.carousel.css" rel="stylesheet">
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
	<!-- 	<div class="header-menu"> -->
	<div class="user-desc">
		<div class="container">
			<%-- 			<div id="message">${message}</div> --%>
			<span style="color: #000000"> <a href="getMain?lang=en"><img
					src="images/english.png" alt="" /></a> <a href="getMain?lang=vi"><img
					src="images/vietnam.png" alt="" /></a>
			</span>
			<ul>
				<c:choose>
					<c:when test="${sessionScope.user !=null }">
						<li><i class="user"
							style="background:${sessionScope.user.imageThumbnail};"></i> <a
							href="account.html">${sessionScope.user.name}</a></li>
						<li><a href="logout.html"><spring:message
									code="title.logout" /></a></li>
					</c:when>
					<c:otherwise>
						<li><a href="loadLogin"><spring:message
									code="title.login" /></a></li>
						<li><a href="loadLogin"><spring:message
									code="title.registry" /></a></li>
					</c:otherwise>
				</c:choose>
				<li><i class="cart"></i><a href="loadCheckout">Cart
						(${sizeCart})</a></li>

			</ul>
		</div>
	</div>

	<!-- 	</div> -->
	<div class="header">
		<div class="header-top">
			<div class="container">
				<div class="logo">
					<a href="index.html"><img src="images/logo.png" alt="" /></a>
				</div>
				<div class="top-menu">
					<span class="menu"> </span>
					<ul class="cl-effect-15">
						<li><a class="active" href="getMain"><spring:message
									code="menu.home" /></a></li>
						<c:forEach items="${catalogsRoot }" var="catalog">
							<li><a href="getProductByCatalog?catalogId=${ catalog.id}"
								data-hover="${ catalog.name}">${ catalog.name}</a></li>
						</c:forEach>
						<li><a href="contact.html"
							data-hover="<spring:message
									code="menu.contact" />"><spring:message
									code="menu.contact" /></a></li>
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
		<div class="slider">
			<div id="ipresenter">
				<div id="intro" class="step" data-x="0" data-y="0"
					data-thumbnail="images/thumbnails/1.jpg">
					<img src="${banners[0].linkImage}" />
					<h2>${banners[0].name}</h2>
				</div>

				<div id="capture" class="step" data-x="1100" data-y="1200"
					data-scale="1.8" data-rotate="180"
					data-thumbnail="images/thumbnails/2.jpg">
					<img src="${banners[1].linkImage}" />
					<h2>${banners[1].name}</h2>
				</div>

				<div id="view" class="step" data-x="-300" data-y="600"
					data-scale="0.2" data-rotate="270"
					data-thumbnail="images/thumbnails/3.jpg">
					<img src="${banners[2].linkImage}" />
					<h2>${banners[2].name}</h2>
				</div>
				<div id="show" class="step" data-x="1000" data-y="-400"
					data-scale="1.2" data-rotate="90"
					data-thumbnail="images/thumbnails/3.jpg">
					<img src="${banners[3].linkImage}" />
					<h2>${banners[3].name}</h2>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var _gaq = _gaq || [];
		_gaq.push([ '_setAccount', 'UA-32024393-1' ]);
		_gaq.push([ '_trackPageview' ]);

		(function() {
			var ga = document.createElement('script');
			ga.type = 'text/javascript';
			ga.async = true;
			ga.src = ('https:' == document.location.protocol ? 'https://ssl'
					: 'http://www')
					+ '.google-analytics.com/ga.js';
			var s = document.getElementsByTagName('script')[0];
			s.parentNode.insertBefore(ga, s);
		})();
	</script>
	<!-- header-section-ends -->
	<!-- content-section-starts -->
	<div class="content">
		<div class="sales">
			<div class="container">
				<div class="sales-head text-center">
					<h3>
						<spring:message code="label.customerRights" />
						<span><spring:message code="label.customerRights.website" /></span>
					</h3>
				</div>
				<div class="sales-grids">
					<div class="col-md-4 sales-grid-a">
						<div class="discount">
							<h4>
								<spring:message code="label.discount.price" />
							</h4>
						</div>
						<div class="s-img">
							<img src="images/s1.png" alt="" />
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="col-md-4 sales-grid-b">
						<div class="discount">
							<h4>
								<spring:message code="label.discount.deliver" />
							</h4>
						</div>
						<div class="s-img">
							<img src="images/s2.png" alt="" />
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="col-md-4 sales-grid-c">
						<div class="discount">
							<h4>
								<spring:message code="label.discount.support" />
							</h4>
						</div>
						<div class="s-img">
							<img src="images/s3.png" alt="" />
						</div>
						<div class="clearfix"></div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
		<!-- products-section-starts -->
		<div class="products-section">
			<div class="container">
				<div class="product-section-head-text">
					<h3>
						<span><spring:message code="label.featuredProducts" /></span>
					</h3>
				</div>
				<div class="bottom-grids collections">
					<div class="bottom-grids-left">
						<div class="f-products">
							<!----sreen-gallery-cursual---->
							<div class="sreen-gallery-cursual">
								<!-- requried-jsfiles-for owl -->
								<script src="js/owl.carousel.js"></script>
								<script>
									$(document).ready(function() {
										$("#owl-demo").owlCarousel({
											items : 3,
											lazyLoad : true,
											autoPlay : true,
											navigation : true,
											navigationText : false,
											pagination : false,
										});
									});
								</script>
								<!-- //requried-jsfiles-for owl -->
								<!-- start content_slider -->
								<div id="owl-demo" class="owl-carousel text-center">
									<c:forEach items="${productsFeatured}" var="product">
										<div class="item">
											<div
												onclick="location.href='getProduct?productId=${product.id}';"
												class="product-grid">
												<div class="product-pic">
													<img src="${product.image}" title="${product.name}" />
												</div>
												<div class="product-pic-info">
													<h4>
														<a href="#">${product.name}</a>
													</h4>
													<div class="product-pic-info-price-cart">
														<div class="product-pic-info-price">
															<span>${product.money}</span>
														</div>
														<div class="product-pic-info-cart">
															<a class="p-btn"
																href="shop?productId=${product.id}&color=${product.color}&amount=1&size=${product.size}">
																<spring:message code="button.name.addCart" />
															</a>
														</div>
														<div class="clearfix"></div>
													</div>
												</div>
											</div>
										</div>
									</c:forEach>
								</div>
								<!--//sreen-gallery-cursual---->

							</div>
						</div>
						<div class="d-products product-section-head-text">
							<h3>
								<span><spring:message code="label.newProducts" /></span>
							</h3>
							<!----sreen-gallery-cursual---->
							<div class="sreen-gallery-cursual">
								<!-- requried-jsfiles-for owl -->

								<script src="js/owl.carousel.js"></script>
								<script>
									$(document).ready(function() {
										$("#owl-demo1").owlCarousel({
											items : 3,
											lazyLoad : true,
											autoPlay : true,
											navigation : true,
											navigationText : false,
											pagination : false,
										});
									});
								</script>
								<!-- //requried-jsfiles-for owl -->
								<!-- start content_slider -->
								<div id="owl-demo1" class="owl-carousel text-center">
									<c:forEach items="${productsNew}" var="product">
										<div class="item">
											<div
												onclick="location.href='getProduct?productId=${product.id}';"
												class="product-grid">
												<div class="product-pic">
													<img src="${product.image}" title="${product.name}" />
												</div>
												<div class="product-pic-info">
													<h4>
														<a href="#">${product.name}</a>
													</h4>
													<div class="product-pic-info-price-cart">
														<div class="product-pic-info-price">
															<span>${product.money}</span> <label> </label>
														</div>
														<div class="product-pic-info-cart">
															<a class="p-btn"
																href="shop?productId=${product.id}&color=${product.color}&amount=1&size=${product.size}">
																<spring:message code="button.name.addCart" />
															</a>
														</div>
														<div class="clearfix"></div>
													</div>
												</div>
											</div>
										</div>
									</c:forEach>

								</div>
								<!--//sreen-gallery-cursual---->

							</div>
						</div>
						<div class="d-products product-section-head-text">
							<h3>
								<span><spring:message code="label.popularProducts" /></span>
							</h3>
							<div class="product-section-head-text">
								<!----sreen-gallery-cursual---->
								<div class="sreen-gallery-cursual">
									<!-- requried-jsfiles-for owl -->
									<script src="js/owl.carousel.js"></script>
									<script>
										$(document).ready(function() {
											$("#owl-demo2").owlCarousel({
												items : 3,
												lazyLoad : true,
												autoPlay : true,
												navigation : false,
												navigationText : false,
												pagination : false,
											});
										});
									</script>
									<!-- //requried-jsfiles-for owl -->
									<!-- start content_slider -->
									<div id="owl-demo2" class="owl-carousel text-center">
										<c:forEach items="${productsPopular}" var="product">
											<div class="item">
												<div
													onclick="location.href='getProduct?productId=${product.id}';"
													class="product-grid">
													<div class="product-pic">
														<img src="${product.image }" title="${product.name }" />
													</div>
													<div class="product-pic-info">
														<h4>
															<a href="#">${product.name }</a>
														</h4>
														<div class="product-pic-info-price-cart">
															<div class="product-pic-info-price">
																<span>${product.money }</span> <label> </label>
															</div>
															<div class="product-pic-info-cart">
																<a class="p-btn"
																	href="shop?productId=${product.id}&color=${product.color}&amount=1&size=${product.size}">
																	<spring:message code="button.name.addCart" />
																</a>
															</div>
															<div class="clearfix"></div>
														</div>
													</div>
												</div>
											</div>
										</c:forEach>
									</div>
									<!--//sreen-gallery-cursual---->

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- products-section-ends -->

	<!-- brands-section-starts -->
	<div class="brands-section">
		<div class="container">
			<div class="brands-section-head">
				<h3>
					<span><spring:message code="label.majorBrands" /></span>
				</h3>
			</div>
			<ul class="sponsors">
				<li><img src="images/b1.png" alt="" /></li>
				<li><img src="images/b2.png" alt="" /></li>
				<li><img src="images/b3.png" alt="" /></li>
				<li><img src="images/b4.png" alt="" /></li>
				<li><img src="images/b5.png" alt="" /></li>
				<li><img src="images/b6.png" alt="" /></li>
			</ul>
		</div>
	</div>
	<!-- brands-section-ends -->
	<!-- 	</div> -->
	<!-- content-section-ends -->
	<!-- contact-section-starts -->
	<div class="content-section">
		<div class="container">
			<div class="col-md-3 about-us">
				<h4>
					<spring:message code="label.introduteUs" />
				</h4>
				<p>
					<spring:message code="content.introduteUs" />
				</p>
				<h4>
					<spring:message code="label.followUs" />
				</h4>
				<div class="social-icons">
					<i class="facebook"></i> <i class="twitter"></i> <i class="rss"></i>
					<i class="vimeo"></i> <i class="dribble"></i> <i class="msn"></i>
				</div>
			</div>
			<div class="col-md-3 archives">
				<h4>
					<spring:message code="label.archives" />
				</h4>
				<ul>
					<li><a href="#">March 2012</a></li>
					<li><a href="#">February 2012</a></li>
					<li><a href="#">January 2012</a></li>
					<li><a href="#">December 2011</a></li>
				</ul>
			</div>
			<div class="col-md-3 contact-us">
				<h4>
					<spring:message code="label.contactUs" />
				</h4>
				<ul>
					<li><i class="message"></i></li>
					<li><a href="mail-to:<spring:message code='contact.mail'/>"><spring:message
								code="contact.mail" /></a></li>
				</ul>
				<ul>
					<li><i class="land-phone"></i></li>
					<li><spring:message code="contact.phone" /></li>
				</ul>
				<ul>
					<li><i class="smart-phone"></i></li>
					<li><spring:message code="contact.homePhone" /></li>
				</ul>
			</div>
			<!-- 			<div class="col-md-3 about-us"> -->
			<!-- 				<h4>SIGN TO NEWSLETTER</h4> -->
			<!-- 				<input type="text" class="text" value="Name" -->
			<!-- 					onfocus="this.value = '';" -->
			<!-- 					onblur="if (this.value == '') {this.value = 'Name';}"> <input -->
			<!-- 					type="text" class="text" value="Email" onfocus="this.value = '';" -->
			<!-- 					onblur="if (this.value == '') {this.value = 'Email';}"> <input -->
			<!-- 					type="submit" value="subscribe"> -->
			<!-- 			</div> -->
			<div class="clearfix"></div>

		</div>
	</div>
	<!-- contact-section-ends -->
	<!-- footer-section-starts -->
	<div class="footer">
		<div class="container">
			<div class="col-md-6 bottom-menu">
				<!-- 				<ul> -->
				<!-- 					<li><a href="index.html">HOME</a></li> -->
				<!-- 					<li><a href="#">PORTFOLIO</a></li> -->
				<!-- 					<li><a href="#">SITEMAP</a></li> -->
				<!-- 					<li><a href="contact.html"> CONTACT</a></li> -->
				<!-- 				</ul> -->
			</div>
			<div class="col-md-6 copy-rights">
				<p>
					&copy;
					<spring:message code="label.author" />
					<a href="http://traditionalfashion-fontal.rhcloud.com/"
						target="target_blank"><spring:message code="label.author.name" /></a>
				</p>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- footer-section-ends -->

</body>
</html>