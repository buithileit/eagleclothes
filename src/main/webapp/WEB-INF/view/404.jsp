<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title><spring:message code="title.main" />|<spring:message
		code="page.name.404" /></title>
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
				<li><i class="cart"></i><a href="loadCheckout"><spring:message
							code="link.cart" /> (0)</a></li>

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
						<li><a href="index.html"
							data-hover="<spring:message
									code="menu.home" />"><spring:message
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
	</div>
	<!-- header-section-ends -->
	<!-- content-section-starts -->
	<div class="container">
		<div class="title">
			<h2>
				<spring:message code="message.404.fail" />
			</h2>
			<h3>
				<spring:message code="message.404.error" />
			</h3>
		</div>
		<div class="gray">
			<a href="getMain" class="ag-3d_button orange"><spring:message
					code="message.404.linkHome" /></a>
		</div>
	</div>
	<!-- content-section-ends -->
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