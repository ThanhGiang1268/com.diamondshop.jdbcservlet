<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ecommerce</title>

<link rel="stylesheet"
	href="<c:url value ="/template/web/assets/css/styles.css"/>">
<link rel="stylesheet"
	href="<c:url value ="/template/web/assets/css/main.css"/>">
<link
	href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://unpkg.com/swiper@8/swiper-bundle.min.css">
</head>

<body>
	<div id="page" class="site">

		<aside class="site-off desktop-hide">
			<div class="off-canvas">
				<div class="canvas-head flexitem">
					<div class="logo">
						<a href="/"><span class="circle"></span>.Store</a>
					</div>
					<a href="#" class="t-close flexcenter"><i class="ri-close-line"></i></a>
				</div>
				<div class="departments"></div>
				<nav></nav>
				<div class="thetop-nav"></div>
			</div>
		</aside>
		<header>
			<%@ include file="/common/web/header.jsp"%>
		</header>
		<!--end header-->
		<!--1:00:00-->
		<main>
			<dec:body />
		</main>
		<footer>
			<%@ include file="/common/web/footer.jsp"%>
		</footer>
		<!-- end footer-info -->

		<div class="menu-bottom desktop-hide">
			<div class="container">
				<div class="wrapper">
					<nav>
						<ul class="flexitem">
							<li><a href="#"> <i class="ri-bar-chart-line"> </i> <span>Trending</span>
							</a></li>
							<li><a href="#"> <i class="ri-user-6-line"> </i> <span>Account</span>
							</a></li>
							<li><a href="#"> <i class="ri-heart-line"> </i> <span>WishList</span>
							</a></li>
							<li><a href="#"> <i class="ri-search"> </i> <span>Search</span>
							</a></li>
							<li><a href="#"> <i class="ri-shopping-cart-line"> </i>
									<span>Cart</span>
									<div class="fly-item">
										<span class="item-number">0</span>
									</div>
							</a></li>
						</ul>
					</nav>
				</div>
			</div>
		</div>

		<!-- end menu - bottom-->

		<div class="search-bottom desktop-hide">
			<div class="container">
				<div class="wrapper">
					<form action="" class="search">
						<a href="#" class="t-close search-close flexcenter"><i
							class="ri-close-line"></i></a> <span class="icon-large"><i
							class="ri-mail-line"></i></span> <input type="search"
							placeholder="Your email address" required>
						<button type="submit">Search</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script src="https://unpkg.com/swiper@8/swiper-bundle.min.js"></script>
	<script src="<c:url value="/template/web/assets/js/script.js"/>"></script>

</body>

</html>