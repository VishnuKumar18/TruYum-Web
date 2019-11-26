<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="com.cognizant.truyum.model.MenuItem"%>
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
		<h2>Menu Items</h2>
		<c:if test="${addCartStatus}">
			<h2 style="color: green">Item added to Cart Successfully</h2>
		</c:if>
		<table style="width: 100;" id="menuItems">
			<tr>
				<th class="th-text-align-left">Name</th>
				<th>Free Delivery</th>
				<th class="th-text-align-right">Price</th>
				<th>Category</th>
				<th>Action</th>
			</tr>
			<c:forEach var="item" items="${customerMenuItemList}">
				<tr>
					<td class="td-text-align-left">${item.name}</td>
					<td>${item.freeDelivery? 'Yes' : 'No'}</td>
					<td class="td-text-align-right"><fmt:setLocale value="en_IN" />
						<fmt:formatNumber type="currency" value="${item.price}" /></td>
					<td>${item.category}</td>
					<td><a href="AddToCartServlet?menuItemId=${item.id}">Add
							to cart</a></td>
				</tr>
			</c:forEach>
		</table>
	</section>
	<footer class="footer">
		<p>Copyright©2019</p>
	</footer>
</body>
</html>