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
		<main>
			<div class="slider">
				<div class="container">
					<div class="wrapper">
						<div class="myslider swiper">
							<div class="swiper-wrapper">
								<div class="swiper-slide">
									<div class="item">
										<div class="image object-cover">

											<img
												src="<c:url value ="/template/web/assets/img/slider/slider0.jpg"/>"
												alt="">
										</div>
										<div class="text-content flexcol">
											<h4>Shoes Fashion</h4>
											<h2>
												<span>Come and Get it!</span> <br> <span>Brand
													New Shoes</span>
											</h2>
											<a href="#" class="primary-button">Shop Now</a>
										</div>
									</div>
								</div>

								<div class="swiper-slide">
									<div class="item">
										<div class="image object-cover">
											<img
												src="<c:url value ="/template/web/assets/img/slider/slider1.jpg"/>"
												alt="">
										</div>
										<div class="text-content flexcol">
											<h4>Shoes Fashion</h4>
											<h2>
												<span>Come and Get it!</span> <br> <span>Brand
													New Shoes</span>
											</h2>
											<a href="" class="primary-button">Shop Now</a>
										</div>
									</div>
									2
								</div>

								<div class="swiper-slide">
									<div class="item">
										<div class="image object-cover">
											<img
												src="<c:url value ="/template/web/assets/img/slider/slider2.jpg"/>"
												alt="">
										</div>
										<div class="text-content flexcol">
											<h4>Shoes Fashion</h4>
											<h2>
												<span>Come and Get it!</span> <br> <span>Brand
													New Shoes</span>
											</h2>
											<a href="" class="primary-button">Shop Now</a>
										</div>
									</div>
								</div>

								<div class="swiper-slide">
									<div class="item">
										<div class="image object-cover">
											<img
												src="<c:url value ="/template/web/assets/img/slider/slider3.jpg"/>"
												alt="">
										</div>
										<div class="text-content flexcol">
											<h4>Shoes Fashion</h4>
											<h2>
												<span>Come and Get it!</span> <br> <span>Brand
													New Shoes</span>
											</h2>
											<a href="" class="primary-button">Shop Now</a>
										</div>
									</div>
								</div>
							</div>
							<div class="swiper-pagination"></div>
						</div>
					</div>
				</div>
			</div>
			<!--end slider-->
			<c:forEach var="konkack" items="${ imgbrands }">
				<div class="brands">

					<div class="container">
						<div class="wrapper flexitem">

							<div class="item">
								<a href="#"> <img
									src="<c:url value ="/template/web/assets/img/brands/${ konkack.img }"/>"
									alt="">
								</a>
							</div>
							<%-- <div class="item">
							<a href="#"> <img
								src="<c:url value ="/template/web/assets/img/brands/samsung.png"/>"
								alt="">
							</a>
						</div>
						<div class="item">
							<a href="#"> <img
								src="<c:url value ="/template/web/assets/img/brands/oppo.png"/>"
								alt="">
							</a>
						</div>
						<div class="item">
							<a href="#"> <img
								src="<c:url value ="/template/web/assets/img/brands/asus.png"/>"
								alt="">
							</a>
						</div>
						<div class="item">
							<a href="#"> <img
								src="<c:url value ="/template/web/assets/img/brands/hurley.png"/>"
								alt="">
							</a>
						</div>
						<div class="item">
							<a href="#"> <img
								src="<c:url value ="/template/web/assets/img/brands/dng.png"/>"
								alt="">
							</a>
						</div> --%>
						</div>
					</div>
				</div>
			</c:forEach>
			<!--end brands-->

			<div class="trending">
				<div class="container">
					<div class="wrapper">
						<div class="sectop flexitem">
							<h2>
								<span class="circle"></span><span>Trending Products</span>
							</h2>
						</div>
						<div class="column">
							<div class="flexwrap">
								<div class="row products big">
									<div class="item">
										<div class="offer">
											<p>Offer ends at</p>
											<ul class="flexcenter">
												<li>1</li>
												<li>15</li>
												<li>27</li>
												<li>60</li>
											</ul>
										</div>
										<div class="media">
											<div class="image">
												<a href="#"> <img
													src="<c:url value ="/template/web/assets/img/products/apparel4.jpg"/>"
													alt="">
												</a>
											</div>
											<div class="hoverable">
												<ul>
													<li class="active"><a href="#"><i
															class="ri-heart-line"></i></a></li>
													<li><a href=""><i class="ri-eye-line"></i></a></li>
													<li><a href=""><i class="ri-shuffle-line"></i></a></li>
												</ul>
											</div>
											<div class="discount circle flexcenter">
												<span>31%</span>
											</div>
										</div>

										<div class="content">
											<div class="rating">
												<div class="stars"></div>
												<span class="mini-text">(2,548)</span>
											</div>
											<h3 class="main-links">
												<a href="#">Happy Sailed Womens Summer Boho Floral</a>
											</h3>
											<div class="price">
												<span class="current">$129.99</span> <span
													class="normal mini-text">$189.98</span>
											</div>
											<div class="stock mini-text">
												<div class="qty">
													<span>Stock:<strong class="qty-available">107</strong></span>
													<span>Sold:<strong class="qty-sold">3,459</strong></span>
												</div>
												<div class="bar">
													<div class="available"></div>
												</div>
											</div>
										</div>
									</div>
								</div>
								<!-- left image -->
								<div class="row products mini">
									<c:forEach var="vaicalon" items="${ products }">
										<div class="item">
											<div class="media">
												<div class="thumbnail object-cover">
													<a href="#"> <img
														src="<c:url value ="/template/web/assets/products/${ vaicalon.img }"/>"
														alt="">
													</a>
												</div>
												<div class="hoverable">
													<ul>
														<li class="active"><a href="#"><i
																class="ri-heart-line"></i></a></li>
														<li><a href=""><i class="ri-eye-line"></i></a></li>
														<li><a href=""><i class="ri-shuffle-line"></i></a></li>
													</ul>
												</div>
												<div class="discount circle flexcenter">
													<span>${ vaicalon.percent }</span>
												</div>
											</div>
											<div class="content">
												<h3 class="main-links">
													<a href="#">${ vaicalon.name } </a>
												</h3>
												<div class="rating">
													<div class="stars"></div>
													<span class="mini-text">(2,548)</span>
												</div>
												<div class="price">
													<span class="current">${vaicalon.sale }</span> <span
														class="normal mini-text">${vaicalon.price}</span>
												</div>
												<div class="mini-text">
													<p>${vaicalon.sold}</p>
													<p>Free Shipping</p>
												</div>
											</div>
										</div>
									</c:forEach>
									<!-- <div class="item">
										<div class="media">
											<div class="thumbnail object-cover">
												<a href="#"> <img src="assets/products/apparel1.jpg"
													alt="">
												</a>
											</div>
											<div class="hoverable">
												<ul>
													<li class="active"><a href="#"><i
															class="ri-heart-line"></i></a></li>
													<li><a href=""><i class="ri-eye-line"></i></a></li>
													<li><a href=""><i class="ri-shuffle-line"></i></a></li>
												</ul>
											</div>
											<div class="discount circle flexcenter">
												<span>25%</span>
											</div>
										</div>
										<div class="content">
											<h3 class="main-links">
												<a href="#">Black Women's Coat Dress </a>
											</h3>
											<div class="rating">
												<div class="stars"></div>
												<span class="mini-text">(1,955)</span>
											</div>
											<div class="price">
												<span class="current">$56.50</span> <span
													class="normal mini-text">$675.50</span>
											</div>
											<div class="mini-text">
												<p>2584 sold</p>
												<p>Free Shipping</p>
												<p class="stock-danger">Stock: 7 left!</p>
											</div>
										</div>
									</div>
 -->
									<!-- end image left -->
								</div>
								<div class="row products mini">

									<c:forEach var="vaicalon1" items="${ products1 }">
										<div class="item">
											<div class="media">
												<div class="thumbnail object-cover">
													<a href="#"> <img
														src="assets/products/${vaicalon1.img1 }" alt="">
													</a>
												</div>
												<div class="hoverable">
													<ul>
														<li class="active"><a href="#"><i
																class="ri-heart-line"></i></a></li>
														<li><a href=""><i class="ri-eye-line"></i></a></li>
														<li><a href=""><i class="ri-shuffle-line"></i></a></li>
													</ul>
												</div>
												<div class="discount circle flexcenter">
													<span>${vaicalone.percent1 }</span>
												</div>
											</div>
											<div class="content">
												<h3 class="main-links">
													<a href="#">${vaicalon1.name1 } </a>
												</h3>
												<div class="rating">
													<div class="stars"></div>
													<span class="mini-text">(2,548)</span>
												</div>
												<div class="price">
													<span class="current">${vaicalon1.sale}</span> <span
														class="normal mini-text">${vaicalon1.price}</span>
												</div>
												<div class="mini-text">
													<p>${vaicalon1.sold }p>
													<p>Free Shipping</p>
												</div>
											</div>
										</div>
									</c:forEach>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- end trending -->

			<div class="features">
				<div class="container">
					<div class="wrapper">
						<div class="column">
							<div class="sectop flexitem">
								<h2>
									<span class="circle"></span><span>Featured Products</span>
								</h2>
								<div class="second-links">
									<a href="#" class="view-all">View All<i
										class="ri-arrow-right-line"></i></a>
								</div>
							</div>

							<div class="products main flexwrap">

								<div class="item">
									<c:forEach var="vaicalon" items="${ products }">
										<div class="media">
											<div class="thumbnail object-cover">
												<a href="#"> <img src="assets/products/${vaicalon.img}"
													alt="">
												</a>
											</div>
											<div class="hoverable">
												<ul>
													<li class="active"><a href="#"><i
															class="ri-heart-line"></i></a></li>
													<li><a href="#"><i class="ri-eye-line"></i></a></li>
													<li><a href="#"><i class="ri-shuffle-line"></i></a></li>
												</ul>
											</div>
											<div class="discount circle flexcenter">
												<span>${vaicalon.percent}</span>
											</div>
										</div>
										<div class="content">
											<div class="rating">
												<div class="stars"></div>
												<span class="mini-text">${vaicalon.describe}</span>
											</div>
											<h3>
												<a href="#">${vaicalon.name}</a>
											</h3>
											<div class="price">
												<span class="current">${vaicalon.sale}</span> <span
													class="normal mini-text">${vaicalon.price}</span>
											</div>
											<!-- additional structure -->
											<div class="footer">
												<ul class="mini-text">
													<li>Polyester, Cotton</li>
													<li>Pull On Closure</li>
													<li>Fashion Persionality</li>
												</ul>
											</div>
										</div>
									</c:forEach>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- end features-->

			<div class="banners">
				<div class="container">
					<div class="wrapper">
						<div class="column">
							<div class="banner flexwrap">
								<div class="row">
									<div class="item">
										<div class="image">
											<img
												src="<c:url value ="/template/web/assets/img/banner/banner1.jpg"/>"
												alt="">
										</div>
										<div class="text-content flexcol">
											<h4>Brutal Sale!</h4>
											<h3>
												<span>Get the deal in here</span><br>Living Room Chair
											</h3>
											<a href="#" class="primary-button">Shop Now</a>
										</div>
										<a href="#" class="over-link"></a>
									</div>
								</div>

								<div class="row">
									<div class="item get-gray">
										<div class="image">
											<img
												src="<c:url value ="/template/web/assets/img/banner/banner2.jpg"/>"
												alt="">
										</div>
										<div class="text-content flexcol">
											<h4>Brutal Sale!</h4>
											<h3>
												<span>Discount everyday</span><br>Office Outfit
											</h3>
											<a href="#" class="primary-button">Shop Now</a>
										</div>
										<a href="#" class="over-link"></a>
									</div>
								</div>
							</div>
							<!--end banners-->

							<div class="product-categories flexwrap">
								<div class="row">
									<div class="item">
										<div class="image">
											<img
												src="<c:url value ="/template/web/assets/img/banner/procat1.jpg"/>"
												alt="">
										</div>

										<div class="content mini-links">
											<h4>Beauty</h4>
											<ul class="flexcol">
												<li><a href="#">Makeup</a></li>
												<li><a href="#">Skin Care</a></li>
												<li><a href="#">Hair Care</a></li>
												<li><a href="#">Fragrance</a></li>
												<li><a href="#">Foot & Hand Care</a></li>
											</ul>
											<div class="second-links">
												<a href="" class="view-all">View All<i
													class="ri-arrow-right-line"></i>
												</a>
											</div>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="item">
										<div class="image">
											<img
												src="<c:url value ="/template/web/assets/img/banner/procat2.jpg"/>"
												alt="">
										</div>

										<div class="content mini-links">
											<h4>Gatdets</h4>
											<ul class="flexcol">
												<li><a href="#">Camera</a></li>
												<li><a href="#">Cell Phones</a></li>
												<li><a href="#">Computers</a></li>
												<li><a href="#">GPS & Navigation</a></li>
												<li><a href="#">Headphones</a></li>
											</ul>
											<div class="second-links">
												<a href="" class="view-all">View All<i
													class="ri-arrow-right-line"></i>
												</a>
											</div>
										</div>
									</div>
								</div>


								<div class="row">
									<div class="item">
										<div class="image">
											<img
												src="<c:url value ="/template/web/assets/img/banner/procat3.jpg"/>"
												alt="">
										</div>

										<div class="content mini-links">
											<h4>Home Decor</h4>
											<ul class="flexcol">
												<li><a href="#">Kitchen</a></li>
												<li><a href="#">Dining Room</a></li>
												<li><a href="#">Pantry</a></li>
												<li><a href="#">Great Room</a></li>
												<li><a href="#">Breakfast Nook</a></li>
											</ul>
											<div class="second-links">
												<a href="" class="view-all">View All<i
													class="ri-arrow-right-line"></i>
												</a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</main>
	</div>
	<script src="https://unpkg.com/swiper@8/swiper-bundle.min.js"></script>
	<script src="<c:url value="/template/web/assets/js/script.js"/>"></script>
</body>
</html>