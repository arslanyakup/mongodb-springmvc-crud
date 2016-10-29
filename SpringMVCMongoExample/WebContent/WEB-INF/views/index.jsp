<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>employee</title>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script type="text/javascript" src="/resources/js/table-datatables-editable.min.js"></script>
<script type="text/javascript" src="/resources/js/datatable.min.js"></script>
<script type="text/javascript" src="/resources/js/datatables.bootstrap.js"></script>



</head>
<body>
<c:url var="url" value="employee.add"/>
<c:set var="buttonName" value="Add"/>
<c:if test="${!empty update}">
	<c:url var="url" value="employee.update"/>
	<c:set var="buttonName" value="Update"/>
</c:if>


	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-7">
						<form:form modelAttribute="newEmployee" class="form-horizontal"
							method="post" action="${url}">
							<fieldset>
								<legend style="color: #990000">Employee Add</legend>
								<div class="form-group">
									<label class="col-md-4 control-label" for="name">Name</label>
									<div class="col-md-4">
										<form:input id="name" path="name" type="text" />
									</div>
								</div>

								<div class="form-group">
									<label class="col-md-4 control-label" for="surname">Surname</label>
									<div class="col-md-4">
										<form:input id="surname" path="surname" type="text" />
									</div>
								</div>

								<div class="form-group">
									<label class="col-md-4 control-label" for="salary">Salary</label>
									<div class="col-md-4">
										<form:input id="salary" path="salary" type="number" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Department</label>
									<div class="col-md-4">
										<select name="department.id"
											style="height: 26px; width: 174px;">
											<c:forEach items="${deptList}" var="department">
												<option value="${department.id}">${department.dept_name}</option>
											</c:forEach>
										</select>
									</div>
								</div>

								<div class="form-group">
									<label class="col-md-4 control-label" for="add"></label>
									<div class="col-md-4">
										<input type="submit" id="btnAdd" class="btn btn-primary"
											value="${buttonName}" style="float: right" />
									</div>
								</div>
							</fieldset>
						</form:form>
					</div>
					<div class="col-md-6"></div>
				</div>


				<div class="col-md-7" style="padding: 0;">
					<table class="table table-striped table-hover table-bordered"
						id="sample_editable_1">
						<legend style="color: #990000">Employee List</legend>
						<thead>
							<tr>
								<th class="text-center">Id</th>
								<th class="text-center">Name</th>
								<th class="text-center">Surname</th>
								<th class="text-center">Salary</th>
								<th class="text-center">Department</th>
								<th class="text-center">İşlem</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${empList}" var="employee">
								<tr>
									<td>${employee.id}</td>
									<td>${employee.name}</td>
									<td>${employee.surname}</td>
									<td>${employee.salary}</td>
									<td>${employee.department.dept_name}</td>
									<td class="center">
										<a class="edit" href="employee.edit?empId=${employee.id}" style="padding-left: 25px;"> Edit</a> 
										<a class="delete" href="employee.delete?empId=${employee.id}" style="padding-right: 25px; float: right;">Delete</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>