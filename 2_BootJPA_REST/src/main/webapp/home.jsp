<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="addItem">
		<input type="text" name = "itemID"><br>
		<input type="text" name = "itemName"><br>
		<input type="text" name = "itemCompany"><br>
		<input type="text" name = "itemCategory"><br>
		<input type="text" name = "itemPrice"><br>
		<input type="submit"><br>
	</form>
	
	<form action="getItem">
		<input type="text" name = "itemID"><br>
		<input type="submit"><br>
	</form>

</body>
</html>