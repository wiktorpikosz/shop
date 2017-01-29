<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h3>Lista produktów</h3>

<a class="btn btn-default" href='<c:url value="/admin/product/add" />' role="button">Dodaj</a>

<table class="table table-bordered">
	<tr>
		<th>ID</th>
		<th>Nazwa</th>
		<th>Kategoria</th>
		<th>Cena</th>
		<th>Opcje</th>
	</tr>
	<c:forEach var="product" items="${products}"> 
		<tr>
			<td>${product.productId}</td>
			<td>${product.name}</td>
			<td>${product.category.name}</td>
			<td>${product.price}</td>
			<td></td>
		</tr>
	</c:forEach>
</table>