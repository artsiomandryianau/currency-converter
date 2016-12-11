<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Lista uzytkownikow</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<table class="table table-bordered table-striped table-hover">
			<thead>
				<tr>
					<th>Id</th>
					<th>Imie</th>
					<th>Nazwisko</th>
					<th>Email</th>
					<th>Usun</th>
					<th>Edytuj</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listaUzytkownikow}" var="uzytkownikZmienna">
					<tr>
						<td>${uzytkownikZmienna.id}</td>
						<td>${uzytkownikZmienna.firstName}</td>
						<td>${uzytkownikZmienna.lastName}</td>
						<td>${uzytkownikZmienna.email}</td>
						<td>
							<form action="<c:url value="/delete-user"/>" method="post">
								<input type="hidden" name="id" value="${uzytkownikZmienna.id}" />
								<input type="submit" class="btn btn-danger" value="Usun" />
							</form>
						</td>
						<td>
							<c:url value="/edit-user" var="editUserUrl">
								<c:param name="id" value="${uzytkownikZmienna.id}"/>
							</c:url>
							<a class="btn btn-primary" href="${editUserUrl}">Edytuj</a>						
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="btn btn-info" href="<c:url value="/user-create"/>">Dodaj
				uzytkownika</a>
		</div>
		<div>
			<a class="btn btn-info" href="<c:url value="/index.jsp"/>">Strona
				glowna</a>
		</div>
	</div>
</body>
</html>




















