<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>output Validation and JDBC </title>
</head>
<body>


<h1><font color=blue size=5> Registered Successfully</font></h1>
<form:form method="POST" modelAttribute="userBean" action="/bank-spring-jdbctemplet/editBankInfo.do" >
		<font color="blue">You have registered successfully</font>
		<pre>
			First Name : <c:out value="${userBean.firstName}" />
			Middle Name : <c:out value="${userBean.middleName}" />
			Last Name  : <c:out value="${userBean.lastName}" />
			Gender     : <c:out value="${userBean.gender}" />
			Address    : <c:out value="${userBean.address}" />
			City	   : <c:out value="${userBean.city}" />
			State      : <c:out value="${userBean.state}" />
			Country	   : <c:out value="${userBean.country}" />
			Phone      : <c:out value="${userBean.phone}" />
			Bank Name  : <c:out value="${userBean.bankName}" />
			Account    : <c:out value="${userBean.accountNumber}" />
			SSN	       : <c:out value="${userBean.ssn}" />
			
		</br>	<button id="edit" name="btnedit" value="${bvo.fname}">Edit</button>
					
			
		</pre> 
	</form:form>


</body>
</html>