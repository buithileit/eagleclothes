<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title><spring:message code="title.main" />|<spring:message
		code="page.name.404" /></title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<script src="js/validateRegistry.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/demo1.css" rel="stylesheet" type="text/css" media="all" />
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
			<span style="float: right"> <a href="getMain?lang=en">en</a> |
				<a href="getMain?lang=vi">vi</a>
			</span>
			<ul>
				<c:choose>
					<c:when test="${sessionScope.user !=null }">
						<li><i class="user"
							style="background:${sessionScope.user.imageThumbnail};"></i> <a
							href="loadAccount">${sessionScope.user.name}</a></li>
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
				<li><i class="cart"></i><a href="loadCheckout"><spring:message
							code="link.cart" /> (${sizeCart})</a></li>

			</ul>
		</div>
	</div>
	<div class="header">
		<div class="header-top">
			<div class="container">
				<div class="logo">
					<a href="getMain"><img src="images/logo.png" alt="" /></a>
				</div>
				<div class="top-menu">
					<span class="menu"> </span>
					<ul class="cl-effect-15">
						<li><a href="getMain"><spring:message code="menu.home" /></a></li>
						<c:forEach items="${catalogsRoot }" var="catalog">
							<li><a href="getProductByCatalog?catalogId=${ catalog.id}"
								data-hover="${ catalog.name}">${ catalog.name}</a></li>
						</c:forEach>
						<li><a href="contact.html"
							data-hover="<spring:message code='menu.contact'/>"><spring:message
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
	</div>
	<!-- header-section-ends -->
	<!-- content-section-starts -->
	<!-- start registration -->
	
		<div class="single">
		<!-- start span1_of_1 -->
		<div class="left_content">
			<div class="span_1_of_left">
				<div class="grid images_3_of_2">
					<ul id="etalage">
						<li><a href="optionallink.html"> <img
								class="etalage_thumb_image" src="${product.image }"
								class="img-responsive" /> <img class="etalage_source_image"
								src="${product.image }" class="img-responsive" title="" />
						</a></li>
						<li><img class="etalage_thumb_image" src="${product.image }"
							class="img-responsive" /> <img class="etalage_source_image"
							src="${product.image }" class="img-responsive" title="" /></li>
						<li><img class="etalage_thumb_image" src="${product.image }"
							class="img-responsive" /> <img class="etalage_source_image"
							src="${product.image }" class="img-responsive" /></li>
						<li><img class="etalage_thumb_image" src="${product.image }"
							class="img-responsive" /> <img class="etalage_source_image"
							src="${product.image }" class="img-responsive" /></li>
					</ul>
					<div class="clearfix"></div>
				</div>

				<!-- start span1_of_1 -->
				<div class="span1_of_1_des">
					<div class="desc1">
						<h3>${product.name }</h3>
						<p>${product.description }</p>
						<h5>
							<!-- 							Rs. 399 <a href="#">click for offer</a> -->
						</h5>
						<div class="available">
							<h4>Available Options :</h4>
							<ul>
								<li>Color: <!-- 								<select> --> <%-- 								<c:forEach items="${product.color }"></c:forEach> --%>
									<input type="color" value="#${product.color  }"> <%-- 										<option style="background:${product.color }" --%>
									<!-- 											selected="selected"></option> --> <!-- 																				<option>Black</option> -->
									<!-- 																				<option>Dark Black</option> --> <!-- 																				<option>Red</option> -->
									<!-- 								</select> -->
								</li>
								<li>Size: <select>
										<option>${product.size }</option>
										<!-- 										<option>XL</option> -->
										<!-- 										<option>S</option> -->
										<!-- 										<option>M</option> -->
								</select>
								</li>
								<li><div class="block">
									<div class="starbox small ghosting"> </div>
								</div>
								</li>
							</ul>
							<div class="btn_form">
								<form
									action="shop?productId=${product.id}&color=${product.color}&amount=1&size=${product.size}">
									<input type="submit" value="add to cart" title="" />
								</form>
							</div>
							<!-- 							<span class="span_right"><a href="#">login to save in -->
							<!-- 									wishlist </a></span> -->
							<div class="clearfix"></div>
						</div>
						<!-- 						<div class="filter-by-color"> -->
						<!-- 							<h3>Filter by Color</h3> -->
						<!-- 							<ul class="w_nav2"> -->
						<!-- 								<li><a class="color1" href="#"></a></li> -->
						<!-- 								<li><a class="color2" href="#"></a></li> -->
						<!-- 								<li><a class="color3" href="#"></a></li> -->
						<!-- 								<li><a class="color4" href="#"></a></li> -->
						<!-- 								<li><a class="color5" href="#"></a></li> -->
						<!-- 								<li><a class="color10" href="#"></a></li> -->
						<!-- 								<li><a class="color7" href="#"></a></li> -->
						<!-- 								<li><a class="color8" href="#"></a></li> -->
						<!-- 								<li><a class="color9" href="#"></a></li> -->
						<!-- 								<li><a class="color10" href="#"></a></li> -->
						<!-- 								<li><a class="color6" href="#"></a></li> -->
						<!-- 								<li><a class="color13" href="#"></a></li> -->
						<!-- 								<li><a class="color14" href="#"></a></li> -->
						<!-- 								<li><a class="color15" href="#"></a></li> -->
						<!-- 								<li><a class="color16" href="#"></a></li> -->
						<!-- 								<li><a class="color17" href="#"></a></li> -->
						<!-- 								<li><a class="color1" href="#"></a></li> -->
						<!-- 								<li><a class="color3" href="#"></a></li> -->
						<!-- 								<li><a class="color2" href="#"></a></li> -->
						<!-- 							</ul> -->

					</div>
				</div>
			</div>
			<div class="clearfix"></div>
		</div>

			<div class="clearfix"></div>
		</div>
	<!-- 	</div> -->
	<!-- 	</div> -->
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
					<li><a href="mail-to:info@premiumcoding.com"><spring:message
								code="contact.mail" />/a></li>
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