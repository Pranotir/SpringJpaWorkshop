<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
 
        <form:form action="success" method="post" >
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Welcome! Fill details for Applying</h2></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>Qualification:</td>
                    <td><form:input  path="qualification" /></td>
                </tr>
				<tr>
                    <td colspan="2" align="center"><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>    