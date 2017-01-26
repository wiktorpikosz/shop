<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>

<h3>Dodaj kategorie</h3>
<div class="col-sm-8">
	<form:form method="POST" class="form-horizontal" id="category">
		<div class="form-group">
		    <label class="col-sm-2 control-label">Nazwa</label>
		    <div class="col-sm-10">
		      <form:input path="name" type="text" class="form-control"/>
		    </div>
	  	</div>
	  	<div class="form-group">
		    <label class="col-sm-2 control-label">Podkategorie</label>
		    <div class="col-sm-10">
		      <form:input path="subcategory" type="text" class="form-control"/>
		    </div>
	  	</div>
	  	<div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-default">Zapisz</button>
		    </div>
	 	</div>
	</form:form>
</div>