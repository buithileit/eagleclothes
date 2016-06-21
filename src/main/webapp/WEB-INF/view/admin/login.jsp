<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>ADMIN</title>
<link href="../css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="../js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="../css/style.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="../css/demo1.css" rel="stylesheet" type="text/css"
	media="all" />
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
<script type="text/javascript" src="../js/move-top.js"></script>
<script type="text/javascript" src="../js/easing.js"></script>
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
			<!-- 			<ul> -->
			<%-- 				<c:choose> --%>
			<%-- 					<c:when test="${sessionScope.user !=null }"> --%>
			<!-- 						<li><i class="user" -->
			<%-- 							style="background:${sessionScope.user.imageThumbnail};"></i> <a --%>
			<%-- 							href="404.html">${sessionScope.user.name}</a></li> --%>
			<%-- 						<li><a href="logout.html">${appProperties["title.logout"] }</a></li> --%>
			<%-- 					</c:when> --%>
			<%-- 					<c:otherwise> --%>
			<%-- 						<li><a href="loadLogin">${appProperties["title.login"] }</a></li> --%>
			<%-- 						<li><a href="loadLogin">${appProperties["title.registry"] }</a></li> --%>
			<%-- 					</c:otherwise> --%>
			<%-- 				</c:choose> --%>
			<!-- 				<li><i class="cart"></i><a href="loadCheckout">Cart -->
			<%-- 						(${sizeCart})</a></li> --%>

			<!-- 			</ul> -->
		</div>
	</div>
	<!-- header-section-ends -->
	<!-- content-section-starts -->
	<!-- start registration -->
	<div class="container">
		<div class="registration">

			<div class="registration_left" align="center">
				<h2>LOGIN</h2>
				<!-- 		<a href="#"><div class="reg_fb"><img src="images/facebook.png" alt=""><i>sign in using Facebook</i><div class="clear"></div></div></a> -->
				<div class="registration_form" align="center">
					<!-- Form -->
					<form id="login_form" action="../loginAdmin" method="post">
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
						<!-- 						<div class="forget"> -->
						<!-- 							<a href="#">forgot your password</a> -->
						<!-- 						</div> -->
					</form>
					<!-- /Form -->
				</div>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>

	<!-- footer-section-ends -->
</body>
</html>