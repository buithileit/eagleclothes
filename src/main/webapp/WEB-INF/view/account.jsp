<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>EAGLECLOTHES Bootstarp responsive Website Template|
	Account :: w3layouts</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
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
						<li><a class="active" href="getMain">HOME</a></li>
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
	<!-- start registration -->
	<div class="container">
		<div class="registration">
			<div class="registration_left">
				<h2>
					new user? <span> create An account </span>
				</h2>
				<!-- 				<a href="#"><div class="reg_fb"> -->
				<!-- 						<img src="images/facebook.png" alt=""><i>register using -->
				<!-- 							Facebook</i> -->
				<!-- 						<div class="clearfix"></div> -->
				<!-- 					</div></a> -->
				<!-- [if IE] 
		    < link rel='stylesheet' type='text/css' href='ie.css'/>  
		 [endif] -->

				<!-- [if lt IE 7]>  
		    < link rel='stylesheet' type='text/css' href='ie6.css'/>  
		<! [endif] -->
				<script>
					$(document).ready(function() {

						// Create input element for testing
						// 						var inputs = document.createElement('input');

						// Create the supports object
						// 						var supports = {};

						// 						supports.autofocus = 'autofocus' in inputs;
						// 						supports.required = 'required' in inputs;
						// 						supports.placeholder = 'placeholder' in inputs;

						// Fallback for autofocus attribute
						// 						if (!supports.autofocus) {

						// 						}

						// Fallback for required attribute
						// 						if (!supports.required) {

						// 						}

						// Fallback for placeholder attribute
						// 						if (!supports.placeholder) {

						// 						}
						// 						$("#register-submit").click(function() {
						// 							console.info(" Email: " + $("[name=email]").val());
						// 						});
						// Change text inside send button on submit
						// 						
						// 					var send = document.getElementById('register-submit');
						// 						if (send) {
						// 							send.onclick = function() {
						// 								this.innerHTML = '...Sending';
						// 							}
						// 						}

					});
				</script>
				<div class="registration_form">
					<!-- Form -->
					<form:form modelAttribute="register" id="registration_form"
						action="registry" method="POST">
						<!-- 					<form id="registration_form" action="registry" method="post"> -->
						<div>
							<label> <form:input path="name" placeholder="Name:" />
							</label>
						</div>
						<div>
							<label> <form:input id="phone" path="phoneNumber"
									placeholder="Phone number:" />
							</label>
						</div>
						<div>
							<label> <form:input id="email" path="email"
									placeholder="Email:" />
							</label>
						</div>
						<div>
							<label> <form:input path="address" placeholder="Address:" />
							</label>
						</div>
						<!-- 						<div class="sky-form"> -->
						<!-- 							<div class="sky_form1"> -->
						<!-- 								<ul> -->
						<!-- 									<li><label class="radio left"><input type="radio" -->
						<!-- 											name="radio" checked=""><i></i>Male</label></li> -->
						<!-- 									<li><label class="radio"><input type="radio" -->
						<!-- 											name="radio"><i></i>Female</label></li> -->
						<!-- 									<div class="clearfix"></div> -->
						<!-- 								</ul> -->
						<!-- 							</div> -->
						<!-- 						</div> -->
						<div>
							<label> <form:password path="password"
									placeholder="password" />
							</label>
						</div>
						<div>
							<label> <form:password path="prePassword"
									placeholder="retype password" /></label>
						</div>
						<div>
							<form:button value="create an account" id="register-submit">create an account</form:button>
						</div>
						<!-- 						<div class="sky-form"> -->
						<!-- 							<label class="checkbox"><input type="checkbox" -->
						<!-- 								name="checkbox"><i></i>i agree to shoppe.com &nbsp;<a -->
						<!-- 								class="terms" href="#"> terms of service</a> </label> -->
						<!-- 						</div> -->
					</form:form>
					<!-- /Form -->
				</div>
				<script>
					// 					$(document).re
					// 					ady(function() {
					// 						$("#register-submit").click(function() {
					// 							alert($("[name='email']").val());
					// 							console.info(" Email: " + $("[name='email']").val());
					// 							$("#registration_form").submit();
					// 						});
					// 					}
					var send = document.getElementById('register-submit');
					var email = document.getElementById('email');
					if (send) {
						send.onclick = function() {
							var sub = document
									.getElementById('registration_form');
							console.info(" Email: " + email.value);
							sub.submit();
							// 							this.innerHTML = '...Sending';
						}
					}
				</script>
			</div>
			<div class="registration_left">
				<h2>LOGIN</h2>
				<!-- 		<a href="#"><div class="reg_fb"><img src="images/facebook.png" alt=""><i>sign in using Facebook</i><div class="clear"></div></div></a> -->
				<div class="registration_form">
					<!-- Form -->
					<form id="login_form" action="login" method="post">
						<div>
							<label> <input name="username"
								placeholder="your email or phone number" type="email"
								tabindex="3" required>
							</label>
						</div>
						<div>
							<label> <input name="password" placeholder="password"
								type="password" tabindex="4" required>
							</label>
						</div>
						<div>
							<input type="submit" value="sign in" id="login-submit">
						</div>
						<div class="forget">
							<a href="#">forgot your password</a>
						</div>
					</form>
					<!-- /Form -->
				</div>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- 	</div> -->
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