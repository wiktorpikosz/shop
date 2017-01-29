<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h3>Lista kategorii</h3>

<a class="btn btn-default" href='<c:url value="/admin/category/add" />' role="button">Dodaj</a>

<table class="table table-bordered">
	<tr>
		<th>ID</th>
		<th>Nazwa</th>
		<th>Opcje</th>
	</tr>
	<c:forEach var="category" items="${categories}"> 
		<tr>
			<td>${category.categoryId}</td>
			<td>${category.name}</td>
			<td></td>
		</tr>
	</c:forEach>
</table>