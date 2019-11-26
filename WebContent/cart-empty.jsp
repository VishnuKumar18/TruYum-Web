<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html>
<head>
<title>Menu Item List Customer</title>
<link rel="stylesheet" href="style/style.css">
</head>
<body>
	<section class="header container-fluid">
		<h1 class="header-itemleft">truYum</h1>
		<img src="image/vishnu.jfif"> <a class="header-itemright"
			href="ShowCartServlet">Cart</a> <a class="header-itemright"
			href="ShowMenuItemListCustomerServlet">Menu</a>
	</section>
	<br>
	<br>
	<section class="body-main">
		<h2>Cart</h2>
		<h2 style="color: grey">
			No items in cart.Use'Add to Cart'option in <a
				href="ShowMenuItemListCustomerServlet">Menu Item List</a>
		</h2>
	</section>
	<footer class="footer">
		<p>Copyright©2019</p>
	</footer>
</body>
</html>