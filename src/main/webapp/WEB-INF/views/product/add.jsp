<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>

<h3>Dodaj produkt</h3>
<div class="col-sm-8">
	<form:form method="POST" class="form-horizontal">
		<div class="form-group">
		    <label class="col-sm-2 control-label">Nazwa</label>
		    <div class="col-sm-10">
		      <form:input path="name" type="text" class="form-control"/>
		    </div>
		    <form:errors path="name" class="control-label hasError" />
	  	</div>
		
		<div class="form-group">
		    <label class="col-sm-2 control-label">Opis</label>
		    <div class="col-sm-10">
		      <form:textarea path="description" type="text" class="form-control"/>
		    </div>
		    <form:errors path="description" class="control-label hasError" />
	  	</div>
	  	
	  	<div class="form-group">
		    <label class="col-sm-2 control-label">Producent</label>
		    <div class="col-sm-10">
		      <form:input path="manufacturer" type="text" class="form-control"/>
		    </div>
		    <form:errors path="manufacturer" class="control-label hasError" />
	  	</div>
	  	
	  	<div class="form-group">
		    <label class="col-sm-2 control-label">Obrazek</label>
		    <div class="col-sm-10">
		      <form:input path="image" type="text" class="form-control"/>
		    </div>
		    <form:errors path="image" class="control-label hasError" />
	  	</div>
	  	
	  	<div class="form-group">
		    <label class="col-sm-2 control-label">Cena</label>
		    <div class="col-sm-10">
		      <form:input path="price" type="number" step="0.01" min="0.00" class="form-control"/>
		    </div>
		    <form:errors path="price" class="control-label hasError" />
	  	</div>
	  	
	  	<div class="form-group">
		    <label class="col-sm-2 control-label">Ilosc</label>
		    <div class="col-sm-10">
		      <form:input path="quantity" type="integer" class="form-control"/>
		    </div>
		    <form:errors path="quantity" class="control-label hasError" />
	  	</div>
	  	
		<div class="form-group">
		    <label class="col-sm-2 control-label">Kategoria</label>
		    <div class="col-sm-10">
				<form:select path="category.categoryId" class="form-control">   
      				<option value="0">Select a type</option>
       				<c:forEach items="${categories}" var="category">
        				<option value="${category.categoryId}">${category.name}</option>
       				</c:forEach>
				</form:select>
		      	<form:errors path="category" class="control-label hasError" />
		    </div>
		    
	  	</div>
	  	
	  	<div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-default">Zapisz</button>
		    </div>
	 	</div>
	</form:form>
</div>