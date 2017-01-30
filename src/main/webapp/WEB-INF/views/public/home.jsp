<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="blog-header">
	<h1 class="blog-title">Sklep internetowy</h1>
	<p class="lead blog-description">Szybko, tanio, dobrze...</p>
</div>

<div class="col-sm-8 blog-main">

</div>

<div class="col-sm-3 col-sm-offset-1 blog-sidebar">
	<div class="sidebar-module">
	<h4>Kategorie:</h4>
		<ol class="list-unstyled">
			<c:forEach var="category" items="${categories}">
				<li><a href="#">${category.name}</a></li>
				<c:if test="${ not empty category.subcategories }">
					<ul>
					<c:forEach var="subcategory" items="${category.subcategories}">
						<li><a href="#">${subcategory.name}</a></li>
					</c:forEach>
					</ul>
				</c:if>
			</c:forEach>
		</ol>
	</div>
</div>