<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title><spring:message code="title.main" />|<spring:message
		code="page.name.contact" /></title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/demo1.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript">
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 



</script>
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
			<span> <a href="getMain?lang=en"><img
					src="images/english.png" alt="" /></a> <a href="getMain?lang=vi"><img
					src="images/vietnam.png" alt="" /></a>
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
				<li><i class="cart"></i><a href="loadCheckout"> <spring:message
							code="link.cart" /> (${sizeCart})
				</a></li>

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
						<li><a href="index.html" data-hover="HOME">HOME</a></li>
						<c:forEach items="${catalogsRoot }" var="catalog">
							<li><a href="getProductByCatalog?catalogId=${ catalog.id}"
								data-hover="${ catalog.name}">${ catalog.name}</a></li>
						</c:forEach>
						<li><a class="active" href="contact.html">CONTACT</a></li>
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
		<div class="main">
			<div class="contact">
				<div class="contact_info">
					<h2>get in touch</h2>
					<div class="map">
						<iframe width="100%" height="250" frameborder="0" scrolling="no"
							marginheight="0" marginwidth="0"
							src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3918.2052722299854!2d106.79000551480158!3d10.871986192256692!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3174d89ef59be299%3A0x20d2d1eeb48ca154!2zVHLGsOG7nW5nIMSQ4bqhaSBo4buNYyBOw7RuZyBMw6JtIFRQLiBI4buTIENow60gTWluaA!5e0!3m2!1sen!2s!4v1466809365995"></iframe>
						<br> <small><a
							href="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3918.2052722299854!2d106.79000551480158!3d10.871986192256692!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3174d89ef59be299%3A0x20d2d1eeb48ca154!2zVHLGsOG7nW5nIMSQ4bqhaSBo4buNYyBOw7RuZyBMw6JtIFRQLiBI4buTIENow60gTWluaA!5e0!3m2!1sen!2s!4v1466809365995"
							style="color: #777777; text-align: left; font-size: 13px; font-family: 'Source Sans Pro', sans-serif;">View
								Larger Map</a></small>
					</div>
				</div>
				<div class="contact-form">
					<h2>Contact Us</h2>
					<form method="post" action="contact-post.html">
						<div>
							<span><label>Name</label></span> <span><input
								name="userName" type="text" class="textbox"></span>
						</div>
						<div>
							<span><label>E-mail</label></span> <span><input
								name="userEmail" type="text" class="textbox"></span>
						</div>
						<div>
							<span><label>Mobile</label></span> <span><input
								name="userPhone" type="text" class="textbox"></span>
						</div>
						<div>
							<span><label>Subject</label></span> <span><textarea
									name="userMsg"> </textarea></span>
						</div>
						<div>
							<span><input type="submit" class="" value="Submit us"></span>
						</div>
					</form>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	</div>
	</div>
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