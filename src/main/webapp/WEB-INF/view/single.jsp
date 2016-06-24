<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title><spring:message code="title.main" />|<spring:message code="page.name.single" /></title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
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
<!--webfont-->
<script src="js/jquery.min.js"></script>
<link rel="stylesheet" href="css/etalage.css">
<script src="js/jquery.etalage.min.js"></script>
<script>
	jQuery(document)
			.ready(
					function($) {

						$('#etalage')
								.etalage(
										{
											thumb_image_width : 300,
											thumb_image_height : 400,
											source_image_width : 800,
											source_image_height : 1000,
											show_hint : true,
											click_callback : function(
													image_anchor, instance_id) {
												alert('Callback example:\nYou clicked on an image with the anchor: "'
														+ image_anchor
														+ '"\n(in Etalage instance: "'
														+ instance_id + '")');
											}
										});

					});
</script>
<link type="text/css" rel="stylesheet"
	href="css/easy-responsive-tabs.css" />
<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#horizontalTab').easyResponsiveTabs({
			type : 'default', //Types: default, vertical, accordion           
			width : 'auto', //auto or any width like 600px
			fit : true, // 100% fit in a container
			closed : 'accordion', // Start closed if in accordion view
			activate : function(event) { // Callback function if tab is switched
				var $tab = $(this);
				var $info = $('#tabInfo');
				var $name = $('span', $info);
				$name.text($tab.text());
				$info.show();
			}
		});

		$('#verticalTab').easyResponsiveTabs({
			type : 'vertical',
			width : 'auto',
			fit : true
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
<!--- start-rate---->
<script src="js/jstarbox.js"></script>
<link rel="stylesheet" href="css/jstarbox.css" type="text/css" media="screen" />
<script type="text/javascript">
			jQuery(function() {
			jQuery('.starbox').each(function() {
				var starbox = jQuery(this);
					starbox.starbox({
// 					average: starbox.attr('data-start-value'),
					average: 0.6,
// 					changeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,
					changeable:true,
// 					ghosting: starbox.hasClass('ghosting'),
					ghosting:true,
					autoUpdateAverage: starbox.hasClass('autoupdate'),
					buttons: starbox.hasClass('smooth') ? false : starbox.attr('data-button-count') || 5,
					stars: starbox.attr('data-star-count') || 5
					}).bind('starbox-value-changed', function(event, value) {
					if(starbox.hasClass('random')) {
					var val = Math.random();
					starbox.next().text(' '+val);
					return val;
					} 
				})
			});
		});
		</script>
<!---//End-rate---->
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
	<!-- start content -->

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

		<!-- start tabs -->
		<!--Horizontal Tab-->
		<div id="horizontalTab">
			<!-- 			<ul class="resp-tabs-list"> -->
			<!-- 				<li>More Information</li> -->
			<!-- 				<li>Specifications</li> -->
			<!-- 				<li>Reviews</li> -->
			<!-- 			</ul> -->
			<div class="resp-tabs-container">
				<div class="tab-content">
					<p>Maecenas mauris velit, consequat sit amet feugiat rit, elit
						vitaeert scelerisque elementum, turpis nisl accumsan ipsum Lorem
						Ipsum is simply dummy text of the printing and typesetting
						industry. and scrambled it to make a type specimen book. It has
						survived Auction your website on Flippa and you'll get the best
						price from serious buyers, dedicated support and a much better
						deal than you'll find with any website broker. Sell your site
						today I need a twitter bootstrap 3.0 theme for the full-calendar
						plugin. it would be great if the theme includes the add event;
						remove event, show event details. this must be RESPONSIVE and
						works on mobile devices. Also, I've seen so many bootstrap themes
						that comes up with the fullcalendar plugin. However these .</p>
					<ul>
						<li>Research</li>
						<li>Design and Development</li>
						<li>Porting and Optimization</li>
						<li>System integration</li>
						<li>Verification, Validation and Testing</li>
						<li>Maintenance and Support</li>
					</ul>
				</div>
				<div class="tab-content">
					<p class="para">
						<span>WELCOME </span> Contrary to popular belief, Lorem Ipsum is
						not simply random text. It has roots in a piece of classical Latin
						literature from 45 BC, making it over 2000 years old. Richard
						McClintock, a Latin professor at Hampden-Sydney College in
						Virginia, looked up one of the more obscure Latin words,
						consectetur, from a Lorem Ipsum passage, and going through the
						cites of the word in classical literature, discovered the
						undoubtable source. Lorem Ipsum comes from sections
					</p>
					<ul class="qua_nav">
						<li>Multimedia Systems</li>
						<li>Digital media adapters</li>
						<li>Set top boxes for HDTV and IPTV Player applications on
							various Operating Systems and Hardware Platforms</li>
					</ul>
				</div>
				<div class="tab-content">
					<p class="para top">
						<span>LOREM IPSUM</span> There are many variations of passages of
						Lorem Ipsum available, but the majority have suffered alteration
						in some form, by injected humour, or randomised words which don't
						look even slightly believable. If you are going to use a passage
						of Lorem Ipsum, you need to be sure there isn't anything
						embarrassing hidden in the middle of text. All the Lorem Ipsum
						generators on the Internet tend to repeat predefined chunks as
						necessary, making this the first true generator on the Internet.
						It uses a dictionary of over 200 Latin words, combined
					</p>
					<ul>
						<li>Research</li>
						<li>Design and Development</li>
						<li>Porting and Optimization</li>
						<li>System integration</li>
						<li>Verification, Validation and Testing</li>
						<li>Maintenance and Support</li>
					</ul>
				</div>
			</div>
		</div>

		<!-- end tabs -->
	</div>

	<div class="left_sidebar">
		<div class="sellers">
			<h4>Best Sellers</h4>
			<div class="single-nav">
				<ul>
					<li><a href="#">Always free from repetition</a></li>
					<li><a href="#">Always free from repetition</a></li>
					<li><a href="#">The standard chunk of Lorem Ipsum</a></li>
					<li><a href="#">The standard chunk of Lorem Ipsum</a></li>
					<li><a href="#">Always free from repetition</a></li>
					<li><a href="#">The standard chunk of Lorem Ipsum</a></li>
					<li><a href="#">Always free from repetition</a></li>
					<li><a href="#">Always free from repetition</a></li>
					<li><a href="#">Always free from repetition</a></li>
					<li><a href="#">The standard chunk of Lorem Ipsum</a></li>
					<li><a href="#">Always free from repetition</a></li>
					<li><a href="#">Always free from repetition</a></li>
					<li><a href="#">Always free from repetition</a></li>
				</ul>
			</div>
			<div class="banner-wrap bottom_banner color_link">
				<a href="#" class="main_link">
					<figure>
						<img src="images/delivery.png" alt="">
					</figure>
					<h5>
						<span>Free Shipping</span><br> on orders over $99.
					</h5>
					<p>This offer is valid on all our store items.</p>
				</a>
			</div>
			<div class="brands">
				<h1>Brands</h1>
				<div class="field">
					<select class="select1">
						<option>Please Select</option>
						<option>Lorem ipsum dolor sit amet</option>
						<option>Lorem ipsum dolor sit amet</option>
						<option>Lorem ipsum dolor sit amet</option>
					</select>
				</div>
			</div>
		</div>
	</div>
	<!-- end sidebar -->
	<div class="clearfix"></div>
	<!-- 	</div> -->
	<!-- 	</div> -->
	<!-- end content -->
<!-- 	</div> -->
<!-- 	</div> -->
<!-- 	</div> -->
	<!-- content-section-ends -->
	<!-- contact-section-starts -->
	<div class="content-section">
		<div class="container">
			<div class="col-md-3 about-us">
				<h4><spring:message code="label.introduteUs" /></h4>
				<p><spring:message code="content.introduteUs" />
				</p>
				<h4><spring:message code="label.followUs" /></h4>
				<div class="social-icons">
					<i class="facebook"></i> <i class="twitter"></i> <i class="rss"></i>
					<i class="vimeo"></i> <i class="dribble"></i> <i class="msn"></i>
				</div>
			</div>
			<div class="col-md-3 archives">
				<h4><spring:message code="label.archives" /></h4>
				<ul>
					<li><a href="#">March 2012</a></li>
					<li><a href="#">February 2012</a></li>
					<li><a href="#">January 2012</a></li>
					<li><a href="#">December 2011</a></li>
				</ul>
			</div>
			<div class="col-md-3 contact-us">
				<h4><spring:message code="label.contactUs" /></h4>
				<ul>
					<li><i class="message"></i></li>
					<li><a href="mail-to:info@premiumcoding.com"><spring:message code="contact.mail" />/a></li>
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
					&copy;<spring:message code="label.author" /><a href="http://traditionalfashion-fontal.rhcloud.com/"
						target="target_blank"><spring:message code="label.author.name" /></a>
				</p>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- footer-section-ends -->
</body>
</html>