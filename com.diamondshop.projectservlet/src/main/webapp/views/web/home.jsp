<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<script src="<:url value ="/template/assets/js/jquery.js"/>">
	
</script>
<script src="<:url value ="/template/assets/js/bootstrap.min.js"/>">
	
</script>
<script
	src="<:url value ="/template/assets/js/jquery.easing-1.3.min.js"/>">
	
</script>
<script
	src="<:url value ="/template/assets/js/jquery.scrollTo-1.4.3.1-min.js"/>"></script>
<script src="<:url value ="/template/assets/js/shop.js"/>">
	
</script>
</head>
<body>


	<div id="gototop"></div>
	<header id="header">
		<div class="row">
			<div class="span4">
				<h1>
					<a class="logo" href="index.html"><span>Twitter
							Bootstrap ecommerce template</span> <img
						src="<c:url value ="/template/assets/img/logo-bootstrap-shoping-cart.png"/>"
						alt="bootstrap sexy shop"> </a>
				</h1>
			</div>
			<div class="span4">
				<div class="offerNoteWrapper">
					<h1 class="dotmark">
						<i class="icon-cut"></i> Trang chưa có nyeu ở nhà tìm ngyeu đi rồi sang chú nhé =)) 
					</h1>
				</div>
			</div>
			<div class="span4 alignR">
				<p>
					<br> <strong> Support (24/7) : 0800 1234 678 </strong><br>
					<br>
				</p>
				<span class="btn btn-mini">[ 2 ] <span
					class="icon-shopping-cart"></span></span> <span
					class="btn btn-warning btn-mini">$</span> <span
					class="btn btn-mini">&pound;</span> <span class="btn btn-mini">&euro;</span>
			</div>
		</div>
	</header>

	<!--
Navigation Bar Section 
-->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container">
				<a data-target=".nav-collapse" data-toggle="collapse"
					class="btn btn-navbar"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a>
				<div class="nav-collapse">
					<ul class="nav">
						<li class="active"><a href="index.html">Trang ế </a></li>
						<li class=""><a href="list-view.html">trang dở hơi</a></li>
						<li class=""><a href="grid-view.html">trang ngu si</a></li>
						<li class=""><a href="three-col.html">Three Column</a></li>
						<li class=""><a href="four-col.html">Four Column</a></li>
						<li class=""><a href="general.html">General Content</a></li>
					</ul>
					<form action="#" class="navbar-search pull-left">
						<input type="text" placeholder="Search" class="search-query span2">
					</form>
					<ul class="nav pull-right">
						<li class="dropdown-1">
						<a data-toggle="dropdown-1"
						class="dropdown-toggle-1"
							href='<c:url value="/dang-nhap?action=login"/>'> <%-- '<c:url value="/dang-nhap?action=login"/>' --%>
					<%-- href='<c:url value="/dang-nhap?action=login"/>' --%>
								<span class="icon-lock"></span> Login <b class="caret"></b>
						</a>
						<%-- <c:if>
							
						</c:if> --%>
							<div class="dropdown-menu">
								<form class="form-horizontal loginFrm">
									<div class="control-group">
										<input type="text" class="span2" id="inputEmail"
											placeholder="Email">
									</div>
									<div class="control-group">
										<input type="password" class="span2" id="inputPassword"
											placeholder="Password">
									</div>
									<div class="control-group">
										<label class="checkbox"> <input type="checkbox">
											Remember me
										</label>
										<button type="submit" class="shopBtn btn-block">Sign
											in</button>
									</div>
								</form>
							</div></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<!-- 
Body Section 
-->
	<div class="row">
		<div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Fashion</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Watches</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Fine Jewelry</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Fashion Jewelry</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Engagement & Wedding</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Men's Jewelry</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Vintage & Antique</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Loose Diamonds </a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Loose Beads</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>See All Jewelry & Watches</a></li>
					<li style="border: 0">&nbsp;</li>
					<li><a class="totalInCart" href="cart.html"><strong>Total
								Amount <span class="badge badge-warning pull-right"
								style="line-height: 18px;">$448.42</span>
						</strong></a></li>
				</ul>
			</div>

			<div class="well well-small alert alert-warning cntr">
				<h2>50% Discount</h2>
				<p>
					only valid for online order. <br> <br> <a
						class="defaultBtn" href="#">Click here </a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"><img
					src="<c:url value ="/template/assets/img/paypal.jpg"/>"
					alt="payment method paypal"></a>
			</div>

			<a class="shopBtn btn-block" href="#">Upcoming products <br>
				<small>Click to view</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img
							src="<c:url value ="/template/assets/img/bootstrap-ecommerce-templates.PNG"/>"
							alt="bootstrap ecommerce templates">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img
							src="<c:url value ="/template/assets/img/shopping-cart-template.PNG"/>"
							alt="shopping cart template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img
							src="<c:url value ="/template/assets/img/bootstrap-template.png"/>"
							alt="bootstrap template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
			</ul>
		</div>

		<div class="span9">
			<div class="well np">
				<div id="myCarousel" class="carousel slide homCar">

					<div class="carousel-inner">
	<!-- var item = ${slides} (List) 
	for(index : (List) item(slides) {
			if(index = index.first() -> item active
			else -> item 
			 -->
						<c:forEach var="item" items="${ slides }" varStatus="index">
							<c:if test="${index.first}">
								<div class="item active">
							</c:if>
							<c:if test="${not index.first}">
								<div class="item">
							</c:if>
							<img style="width: 100%"
								src="<c:url value ="/template/assets/img/ahihi/${ item.pic }"/>"
								alt="bootstrap ecommerce templates">
							<div class="carousel-caption">
								<h4>${ item.caption }</h4>
								<p>
									<span>${ item.content }</span>
								</p>
							</div>
					</div>
					</c:forEach>
				</div>
				<a class="left carousel-control" href="#myCarousel"
					data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
					href="#myCarousel" data-slide="next">&rsaquo;</a>
			</div>
		</div>
		<!--
New Products
-->
		<div class="well well-small">
			<h3>New Products</h3>
			<hr class="soften" />
			<div class="row-fluid">
				<div id="newProductCar" class="carousel slide">
					<div class="carousel-inner">
						<div class="item active">
							<ul class="thumbnails">
								<li class="span3">
									<div class="thumbnail">
										<a class="zoomTool" href="product_details.html"
											title="add to cart"><span class="icon-search"></span>
											QUICK VIEW</a> <a href="#" class="tag"></a> <a
											href="product_details.html"><img
											src="<c:url value ="/template/assets/img/bootstrap-ring.png"/>"
											alt="bootstrap-ring"></a>
									</div>
								</li>
								<li class="span3">
									<div class="thumbnail">
										<a class="zoomTool" href="product_details.html"
											title="add to cart"><span class="icon-search"></span>
											QUICK VIEW</a> <a href="#" class="tag"></a> <a
											href="product_details.html"><img
											src="<c:url value ="/template/assets/img/i.jpg"/>" alt=""></a>
									</div>
								</li>
								<li class="span3">
									<div class="thumbnail">
										<a class="zoomTool" href="product_details.html"
											title="add to cart"><span class="icon-search"></span>
											QUICK VIEW</a> <a href="#" class="tag"></a> <a
											href="product_details.html"><img
											src="<c:url value ="/template/assets/img/g.jpg"/>" alt=""></a>
									</div>
								</li>
								<li class="span3">
									<div class="thumbnail">
										<a class="zoomTool" href="product_details.html"
											title="add to cart"><span class="icon-search"></span>
											QUICK VIEW</a> <a href="product_details.html"><img
											src="<c:url value="/template/assets/img/s.png"/>" alt=""></a>
									</div>
								</li>
							</ul>
						</div>
						<div class="item">
							<ul class="thumbnails">
								<li class="span3">
									<div class="thumbnail">
										<a class="zoomTool" href="product_details.html"
											title="add to cart"><span class="icon-search"></span>
											QUICK VIEW</a> <a href="product_details.html"><img
											src="<c:url value="/template/assets/img/i.jpg"/>" alt=""></a>
									</div>
								</li>
								<li class="span3">
									<div class="thumbnail">
										<a class="zoomTool" href="product_details.html"
											title="add to cart"><span class="icon-search"></span>
											QUICK VIEW</a> <a href="product_details.html"><img
											src="<c:url value="/template/assets/img/f.jpg"/>" alt=""></a>
									</div>
								</li>
								<li class="span3">
									<div class="thumbnail">
										<a class="zoomTool" href="product_details.html"
											title="add to cart"><span class="icon-search"></span>
											QUICK VIEW</a> <a href="product_details.html"><img
											src="<c:url value ="/template/assets/img/h.jpg"/>" alt=""></a>
									</div>
								</li>
								<li class="span3">
									<div class="thumbnail">
										<a class="zoomTool" href="product_details.html"
											title="add to cart"><span class="icon-search"></span>
											QUICK VIEW</a> <a href="product_details.html"><img
											src="<c:url value ="/template/assets/img/j.jpg"/>" alt=""></a>
									</div>
								</li>
							</ul>
						</div>
					</div>
					<a class="left carousel-control" href="#newProductCar"
						data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
						href="#newProductCar" data-slide="next">&rsaquo;</a>
				</div>
			</div>
			<div class="row-fluid">
				<ul class="thumbnails">
					<li class="span4">
						<div class="thumbnail">

							<a class="zoomTool" href="product_details.html"
								title="add to cart"><span class="icon-search"></span> QUICK
								VIEW</a> <a href="product_details.html"><img
								src="<c:url value ="/template/assets/img/b.jpg"/>" alt=""></a>
							<div class="caption cntr">
								<p>Manicure & Pedicure</p>
								<p>
									<strong> $22.00</strong>
								</p>
								<h4>
									<a class="shopBtn" href="#" title="add to cart"> Add to
										cart </a>
								</h4>
								<div class="actionList">
									<a class="pull-left" href="#">Add to Wish List </a> <a
										class="pull-left" href="#"> Add to Compare </a>
								</div>
								<br class="clr">
							</div>
						</div>
					</li>
					<li class="span4">
						<div class="thumbnail">
							<a class="zoomTool" href="product_details.html"
								title="add to cart"><span class="icon-search"></span> QUICK
								VIEW</a> <a href="product_details.html"><img
								src="<c:url value ="/template/assets/img/c.jpg"/>" alt=""></a>
							<div class="caption cntr">
								<p>Manicure & Pedicure</p>
								<p>
									<strong> $22.00</strong>
								</p>
								<h4>
									<a class="shopBtn" href="#" title="add to cart"> Add to
										cart </a>
								</h4>
								<div class="actionList">
									<a class="pull-left" href="#">Add to Wish List </a> <a
										class="pull-left" href="#"> Add to Compare </a>
								</div>
								<br class="clr">
							</div>
						</div>
					</li>
					<li class="span4">
						<div class="thumbnail">
							<a class="zoomTool" href="product_details.html"
								title="add to cart"><span class="icon-search"></span> QUICK
								VIEW</a> <a href="product_details.html"><img
								src="<c:url value ="/template/assets/img/a.jpg"/>" alt=""></a>
							<div class="caption cntr">
								<p>Manicure & Pedicure</p>
								<p>
									<strong> $22.00</strong>
								</p>
								<h4>
									<a class="shopBtn" href="#" title="add to cart"> Add to
										cart </a>
								</h4>
								<div class="actionList">
									<a class="pull-left" href="#">Add to Wish List </a> <a
										class="pull-left" href="#"> Add to Compare </a>
								</div>
								<br class="clr">
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>
		<!--
	Featured Products
	-->
		<div class="well well-small">
			<h3>
				<a class="btn btn-mini pull-right" href="products.html"
					title="View more">VIew More<span class="icon-plus"></span></a>
				Featured Products
			</h3>
			<hr class="soften" />
			<div class="row-fluid">
				<ul class="thumbnails">
					<li class="span4">
						<div class="thumbnail">
							<a class="zoomTool" href="product_details.html"
								title="add to cart"><span class="icon-search"></span> QUICK
								VIEW</a> <a href="product_details.html"><img
								src="<c:url value ="/template/assets/img/d.jpg"/>" alt=""></a>
							<div class="caption">
								<h5>Manicure & Pedicure</h5>
								<h4>
									<a class="defaultBtn" href="product_details.html"
										title="Click to view"><span class="icon-zoom-in"></span></a> <a
										class="shopBtn" href="#" title="add to cart"><span
										class="icon-plus"></span></a> <span class="pull-right">$22.00</span>
								</h4>
							</div>
						</div>
					</li>
					<li class="span4">
						<div class="thumbnail">
							<a class="zoomTool" href="product_details.html"
								title="add to cart"><span class="icon-search"></span> QUICK
								VIEW</a> <a href="product_details.html"><img
								src="<c:url value ="/template/assets/img/e.jpg"/>" alt=""></a>
							<div class="caption">
								<h5>Manicure & Pedicure</h5>
								<h4>
									<a class="defaultBtn" href="product_details.html"
										title="Click to view"><span class="icon-zoom-in"></span></a> <a
										class="shopBtn" href="#" title="add to cart"><span
										class="icon-plus"></span></a> <span class="pull-right">$22.00</span>
								</h4>
							</div>
						</div>
					</li>
					<li class="span4">
						<div class="thumbnail">
							<a class="zoomTool" href="product_details.html"
								title="add to cart"><span class="icon-search"></span> QUICK
								VIEW</a> <a href="product_details.html"><img
								src="<c:url value ="/template/assets/img/f.jpg"/>" alt="" /></a>
							<div class="caption">
								<h5>Manicure & Pedicure</h5>
								<h4>
									<a class="defaultBtn" href="product_details.html"
										title="Click to view"><span class="icon-zoom-in"></span></a> <a
										class="shopBtn" href="#" title="add to cart"><span
										class="icon-plus"></span></a> <span class="pull-right">$22.00</span>
								</h4>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>

		<div class="well well-small">
			<a class="btn btn-mini pull-right" href="#">View more <span
				class="icon-plus"></span></a> Popular Products
		</div>
		<hr>
		<div class="well well-small">
			<a class="btn btn-mini pull-right" href="#">View more <span
				class="icon-plus"></span></a> Best selling Products
		</div>
	</div>
	</div>
	<!-- 
Clients 
-->
	<section class="our_client">
		<hr class="soften" />
		<h4 class="title cntr">
			<span class="text">Manufactures</span>
		</h4>
		<hr class="soften" />
		<div class="row">
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value ="/template/assets/img/1.png"/>"> </a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value ="/template/assets/img/2.png"/>"> </a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value ="/template/assets/img/3.png"/>"> </a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value ="/template/assets/img/4.png"/>"> </a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value ="/template/assets/img/5.png"/>"> </a>
			</div>
			<div class="span2">
				<a href="#"><img alt=""
					src="<c:url value ="/template/assets/img/6.png"/>"> </a>
			</div>
		</div>
	</section>

	<!--
Footer
-->

	<footer class="footer">
		<div class="row-fluid">
			<div class="span2">
				<h5>Your Account</h5>
				<a href="#">YOUR ACCOUNT</a><br> <a href="#">PERSONAL
					INFORMATION</a><br> <a href="#">ADDRESSES</a><br> <a href="#">DISCOUNT</a><br>
				<a href="#">ORDER HISTORY</a><br>
			</div>
			<div class="span2">
				<h5>Iinformation</h5>
				<a href="contact.html">CONTACT</a><br> <a href="#">SITEMAP</a><br>
				<a href="#">LEGAL NOTICE</a><br> <a href="#">TERMS AND
					CONDITIONS</a><br> <a href="#">ABOUT US</a><br>
			</div>
			<div class="span2">
				<h5>Our Offer</h5>
				<a href="#">NEW PRODUCTS</a> <br> <a href="#">TOP SELLERS</a><br>
				<a href="#">SPECIALS</a><br> <a href="#">MANUFACTURERS</a><br>
				<a href="#">SUPPLIERS</a> <br />
			</div>
			<div class="span6">
				<h5>The standard chunk of Lorem</h5>
				The standard chunk of Lorem Ipsum used since the 1500s is reproduced
				below for those interested. Sections 1.10.32 and 1.10.33 from "de
				Finibus Bonorum et Malorum" by Cicero are also reproduced in their
				exact original form, accompanied by English versions from the 1914
				translation by H. Rackham.
			</div>
		</div>
	</footer>

</body>
</html>
