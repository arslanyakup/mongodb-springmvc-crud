<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- JSTL ve Spring form tagini ekleylelim.. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>person</title>

<!-- bootstrap ve jqery icin js ve css ekleme islemi.. -->

<link rel="stylesheet" type="text/css" media="screen"
	href="<c:url value="/resources/css/bootstrap.min.css" />" />
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/js/jquery.min.js" />"></script>

</head>
<body>


	<!-- butonun ismini ve url adresini dinamaik olarak degistirmek icin! -->

	<!-- http://www.layoutit.com/
https://datatables.net/examples/styling/bootstrap.html
-->

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-6">

						<!-- modelAttribute , form data bind  -->
						<!-- newPerson ismi ile Controller'daki newPerson attribute isminin ayni olduguna dikkat edelim!  -->
						<form:form modelAttribute="newEmployee" class="form-horizontal"
							method="post" action="employee.add">
							<fieldset>

								<!-- Form Name -->
								<legend>Employee Add</legend>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="name">Name</label>
									<div class="col-md-4">
										<form:input id="name" path="name" type="text"
											class="form-control input-md" />
									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="surname">Surname</label>
									<div class="col-md-4">
										<form:input id="surname" path="surname" type="text"
											class="form-control input-md" />
									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="salary">Salary</label>
									<div class="col-md-4">
										<form:input id="salary" path="salary" type="number"
											class="form-control input-md" />
									</div>
								</div>

								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="add"></label>
									<div class="col-md-4">
										<input type="submit" id="btnAdd" class="btn btn-primary"
											value="Add" />
									</div>
								</div>

							</fieldset>
						</form:form>
					</div>
					<div class="col-md-6"></div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
</html>