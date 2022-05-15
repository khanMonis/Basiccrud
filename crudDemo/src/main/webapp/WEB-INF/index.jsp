<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<h1>Add New User</h1>
<form action="EmployeeController" method="post">
	<table>
		<tr>
			<td>Name:</td>
			<td><input type="text" name="name" /></td>
		</tr>
		<tr>
			<td>Address:</td>
			<td><input type="text" name="address" /></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><input type="email" name="email" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Add User" /></td>
		</tr>
	</table>
</form>
</html>